
package Main;

import Classes.Student;

public class StudentManagment2 {


    public static void main(String[] args) {
        Student stud1 = new Student();
        Student stud2 = new Student();
        
        stud1.name="Chrille";
        stud1.studid=1;
        
        stud2.name="Johan";
        stud2.studid=2;

        System.out.println(stud1);
        System.out.println(stud2.name+" "+stud2.schoolname+ " "+stud2.studid);

    }
    
}
