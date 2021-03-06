/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adiaz.classroster.controller;

import com.adiaz.classroster.ui.UserIO;
import com.adiaz.classroster.ui.UserIOConsoleImpl;
import com.adiaz.classroster.ui.ClassRosterView;
import com.adiaz.classroster.dao.ClassRosterDao;
import com.adiaz.classroster.dao.ClassRosterPersistenceException;
import com.adiaz.classroster.dao.ClassRosterDaoFileImpl;
import com.adiaz.classroster.dto.Student;
import com.adiaz.classroster.service.ClassRosterDataValidationException;
import com.adiaz.classroster.service.ClassRosterDuplicateIdException;
import com.adiaz.classroster.service.ClassRosterServiceLayer;
import java.util.List;

/**
 *
 * @author Anthony Diaz
 */
public class ClassRosterController {
    
    private ClassRosterView view;
//    private ClassRosterDao dao;
    private ClassRosterServiceLayer service;
    
    public ClassRosterController(ClassRosterServiceLayer service, ClassRosterView view) {
//        this.dao = dao;
        this.service = service;
        this.view = view;
    }

    public void run() throws ClassRosterDuplicateIdException, ClassRosterDataValidationException {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        listStudents();
                        break;
                    case 2:
                        createStudent();
                        break;
                    case 3:
                        viewStudent();
                        break;
                    case 4:
                        removeStudent();
                        break;
                    case 5:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }

            }
            exitMessage();
        }
        catch(ClassRosterPersistenceException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }
    
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
     
    private void createStudent() throws ClassRosterPersistenceException, ClassRosterDuplicateIdException, ClassRosterDataValidationException {
//        view.displayCreateStudentBanner();
//        Student newStudent = view.getNewStudentInfo();
//        dao.addStudent(newStudent.getStudentId(), newStudent);
//        view.displayCreateSuccessBanner();
        view.displayCreateStudentBanner();
        boolean hasErrors = false;
        do {
            Student currentStudent = view.getNewStudentInfo();
            try {
                service.createStudent(currentStudent);
                view.displayCreateSuccessBanner();
                hasErrors = false;
            } catch (ClassRosterDuplicateIdException | ClassRosterDataValidationException e) {
                hasErrors = true;
                view.displayErrorMessage(e.getMessage());
            }
        } while (hasErrors);
    }
    
    private void listStudents() throws ClassRosterPersistenceException {
        view.displayDisplayAllBanner();
//        List<Student> studentList = dao.getAllStudents();
        List<Student> studentList = service.getAllStudents();
        view.displayStudentList(studentList);
    }
    
    private void viewStudent() throws ClassRosterPersistenceException {
        view.displayDisplayStudentBanner();
        String studentId = view.getStudentIdChoice();
//        Student student = dao.getStudent(studentId);
        Student student = service.getStudent(studentId) ;
        view.displayStudent(student);
    }
    
    private void removeStudent() throws ClassRosterPersistenceException {
        view.displayRemoveStudentBanner();
        String studentId = view.getStudentIdChoice();
//        Student removedStudent = dao.removeStudent(studentId);
        Student removedStudent = service.removeStudent(studentId);
        view.displayRemoveResult(removedStudent);
    }
    
    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }
}
