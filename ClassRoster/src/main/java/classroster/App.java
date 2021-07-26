package classroster;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.adiaz.classroster.controller.ClassRosterController;
import com.adiaz.classroster.dao.ClassRosterAuditDao;
import com.adiaz.classroster.dao.ClassRosterAuditDaoFileImpl;
import com.adiaz.classroster.dao.ClassRosterDao;
import com.adiaz.classroster.dao.ClassRosterDaoFileImpl;
import com.adiaz.classroster.service.ClassRosterDataValidationException;
import com.adiaz.classroster.service.ClassRosterDuplicateIdException;
import com.adiaz.classroster.service.ClassRosterServiceLayer;
import com.adiaz.classroster.service.ClassRosterServiceLayerImpl;
import com.adiaz.classroster.ui.ClassRosterView;
import com.adiaz.classroster.ui.UserIO;
import com.adiaz.classroster.ui.UserIOConsoleImpl;

/**
 *
 * @author Anthony Diaz
 */
public class App {
    public static void main(String[] args) throws ClassRosterDuplicateIdException, ClassRosterDataValidationException {
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        // Instantiate the Audit DAO
        ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
        ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDao);
        ClassRosterController controller = new ClassRosterController(myService, myView);
        controller.run();
    }
}
