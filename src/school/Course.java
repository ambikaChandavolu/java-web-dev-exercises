package school;

import java.util.ArrayList;
import java.util.HashMap;

/* This course call will setup all the coourse information
like course ID and course name
This class will set the course id and name and will allow the users to get the id and name
SET: if the user want to set the ID and name, they need to send both the parameters to setSourceName function
GET : If the user passes the ID , you will get the corresponding course name
All the dat we store is in HASHMAP which has ID as key and NAME as value of the key
Sample Hashmap Data :
<1234 , "Java">
<3323 , "Java Script">
<322,"Python">
 */
public class Course {
    private int courseID;
    private String courseName;
    private int studentId;

    //Data Structure Definition.
    HashMap<Integer, String> courseList = new HashMap<>();

    /* putCourseName
    Always sets the values of courseID and courseName
     */
    public void putCourseName(int id, String name){
        courseList.put(id, name);
    }

    /* getCourseName
    This will check in HashMap return the CourseName when user passes the ID
     */
    public String getCourseName(int id){
        return courseList.get(id);
    }

    /* This function returns all the available course ID and Names from HashMap */
    public HashMap getAllCourseList(){
        return courseList;
    }


    //In the school package, create a class Course with at least three fields.
    // Before diving into IntelliJ, try using pen and paper to work through what these might be.
    // At least one of your fields should be an ArrayList or HashMap, and you should use your Student class.
}
