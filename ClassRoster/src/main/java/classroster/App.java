package classroster;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.adiaz.classroster.controller.ClassRosterController;
import com.adiaz.classroster.dao.ClassRosterDao;
import com.adiaz.classroster.dao.ClassRosterDaoFileImpl;
import com.adiaz.classroster.ui.ClassRosterView;
import com.adiaz.classroster.ui.UserIO;
import com.adiaz.classroster.ui.UserIOConsoleImpl;

/**
 *
 * @author Anthony Diaz
 */
public class App {
    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterController controller = new ClassRosterController(myDao, myView);
        controller.run();
    }
}
