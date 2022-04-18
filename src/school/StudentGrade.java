package school;

import java.util.HashMap;

public class StudentGrade {
    public static void main(String[] args){
        Student myStudent = new Student();
        myStudent.setName("Ambika");
        myStudent.setStudentId(2004);
        myStudent.setNumberOfCredits(1);
        myStudent.setGpa(4.0);
       // myStudent.getName();
        System.out.println("Name: " +myStudent.getName()+ "\nID: " +myStudent.getStudentId()+ "\nNOC: " +myStudent.getNumberOfCredits()+ "GPA: " +myStudent.getGpa());

        /* I want to setup my coursed for my students */
        Course newCourse = new Course();
        newCourse.putCourseName(1233,"Java");
        newCourse.putCourseName(2432,"Java Script");
        newCourse.putCourseName(4444,"Python");

        /* How can i get the courseName based on my id 4444 */
        System.out.println( " Course name for id :4444 is " + newCourse.getCourseName(4444));

        /* If i want all the courses offering to students */
        HashMap<Integer, String> allList = newCourse.getAllCourseList();

        for(int i:allList.keySet()){
            System.out.println("key" +i + " value :"+allList.get(i));
        }

        //System.out.print(allList);
        //System.out.println(newCourse.getAllCourseList());

        //Testing the teacher class
        Teacher myTeacher = new Teacher();
        myTeacher.setFirstName("Ambika");
        myTeacher.setLastName("Mulpuru");

//        System.out.println("My Teacher Name is " + myTeacher.getFirstName());

        System.out.println("My Teacher Full Name is " + myTeacher.getName());
    }

}
