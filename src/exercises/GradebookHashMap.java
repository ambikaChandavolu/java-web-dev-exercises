package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradebookHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        //String studentName;
        Integer newStudentID;

        System.out.println("Enter your students (or ENTER to finish):");

        do {

            System.out.print("Student ID: ");
            newStudentID = input.nextInt();

            if (newStudentID != 0) {
                System.out.print("Student Name: ");
                String studentName = input.next();
                //System.out.println(studentName);
                students.put(newStudentID, studentName);

                input.nextLine();
            }

        } while(newStudentID !=0);

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue()+ ")");

        }

    }
}