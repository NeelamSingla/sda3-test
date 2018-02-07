
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.text.*;
import java.time.*;
public class Student
{
    // instance variables - replace the example below with your own
    private int age;
    private Date dob;
    public String name;
    public int id;
    
    
    

    /**
     * Constructor for objects of class Student
     */
    public Student(String name,int age,int id)
    {
        // initialise instance variables
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        this.name= name;
        this.age= age;
        this.id= id;
        
        //this.dob=myFormat.parse(dob);
         
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getAge() {
        // LocalDate currentDate = LocalDate.now();
        // if ((birthDate != null) && (currentDate != null)) {
            // return Period.between(birthDate, currentDate).getYears();
        // } else {
            // return 0;
        // }
        return age;
    }
    public void getStudentDetail()
    {
        System.out.println("Student id:" +id);
    }
    
    public void enrolledCourse(String course)
    {
        //Course course1= new Course();
    }
    
}
