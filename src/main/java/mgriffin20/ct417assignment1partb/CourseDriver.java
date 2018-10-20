package mgriffin20.ct417assignment1partb;

/**
 *
 * @author Meadhbh
 */
import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import mgriffin20.ct417assignment1partA.CourseProgramme;
import mgriffin20.ct417assignment1partA.Student;
import mgriffin20.ct417assignment1partA.Module;

public class CourseDriver {

    public static void main(String args[]) {
        DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/mm/yyyy");
        DateTime start = dtf.parseDateTime("10/09/2018");
        DateTime finish = dtf.parseDateTime("10/05/2019");

        ArrayList<Student> allStudents = new ArrayList<>();
        ArrayList<Student> eceStudents = new ArrayList<>();
        ArrayList<Student> eeeStudents = new ArrayList<>();
        ArrayList<Student> csStudents = new ArrayList<>();

        ArrayList<Module> eceModules = new ArrayList<>();
        ArrayList<Module> eeeModules = new ArrayList<>();
        ArrayList<Module> csModules = new ArrayList<>();

        ArrayList<CourseProgramme> allCourses = new ArrayList<>();

        Student student1 = new Student("Meadhbh Griffin", "21", dtf.parseDateTime("30/07/1997"), "15366976");
        Student student2 = new Student("Rumhann de Burca", "22", dtf.parseDateTime("23/12/1996"), "15508016");
        Student student3 = new Student("Lisa Barrow", "22", dtf.parseDateTime("09/03/1996"), "14400234");
        Student student4 = new Student("Marissa Britton", "23", dtf.parseDateTime("29/10/1996"), "14400019");
        Student student5 = new Student("Niall Greaney", "20", dtf.parseDateTime("05/11/1997"), "15122222");
        Student student6 = new Student("Niamh Fitzgerald", "23", dtf.parseDateTime("16/04/1995"), "14409999");

        allStudents.add(student1);
        allStudents.add(student2);
        allStudents.add(student3);
        allStudents.add(student4);
        allStudents.add(student5);
        allStudents.add(student6);

        eceStudents.add(student1);
        eceStudents.add(student2);

        eeeStudents.add(student3);
        eeeStudents.add(student4);

        csStudents.add(student5);
        csStudents.add(student6);

        Module CT417 = new Module("Software Engineering III", "CT417", allStudents);
        Module CT475 = new Module("Machine Learning and Data Mining", "CT475", csStudents);
        Module EE445 = new Module("Digital Signal Processing", "EE445", eeeStudents);
        Module EE451 = new Module("System on Chip Design I", "EE451", eceStudents);
        Module EE453 = new Module("Telecommunications Software Applications", "EE453", eceStudents);

        eceModules.add(EE451);
        eceModules.add(EE453);
        eceModules.add(CT417);

        eeeModules.add(CT417);
        eeeModules.add(EE445);

        csModules.add(CT417);
        csModules.add(CT475);

        CourseProgramme bp = new CourseProgramme("Electronic & Computer Engineering", eceModules, start, finish);
        CourseProgramme ble = new CourseProgramme("Electrical & Electronic Engineering", eeeModules, start, finish);
        CourseProgramme bct = new CourseProgramme("Computer Science & Information Technology", csModules, start, finish);

        allCourses.add(bp);
        allCourses.add(ble);
        allCourses.add(bct);

        for (int i = 0; i < allCourses.size(); i++) {
            System.out.print("\n" + allCourses.get(i).toString());
        }

    }
}
