package school;

public class Teacher {
    /*In the school package, create a class Teacher with four fields: firstName, lastName, subject, and yearsTeaching.
    Add getters and setters to the class and add the access level to each field and method in the class. When adding your
    getters and setters, think about what we read about in the section on Encapsulation.
What access modifier restricts access the most for what we need?
If it is a field, could we restrict the access to private and use getters and setters?
If we do set fields to private, what access level do we have to give our getters and setters? */

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsOfTeaching;

    // set methods...
    public void setFirstName(String fName){ this.firstName =fName; }
    public void setLastName(String lName){ this.lastName = lName;}
    public void setSubject(String sub){this.subject = sub;}
    public void setYearsOfTeching (int teachingYears){this.yearsOfTeaching = teachingYears;}

    //public void setFName(String fname){ setFirstName(fname);}

    //get functions..
    private String getFirstName() { return firstName; }
    private String getLastName() {return lastName;}
    protected String getSubject() {return subject;}
    public int getYearsOfTeaching() {return yearsOfTeaching;}

    public String getName(){
        return firstName + lastName;
    }
}
