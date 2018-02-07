
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Course
{
    // instance variables - replace the example below with your own
    private int x;
    public ArrayList<Student> students;
    int capacity;
    /**
     * Constructor for objects of class Course
     */
    public Course(int capacity)
    {
        // initialise instance variables
       this.capacity= capacity;
       students = new ArrayList<Student>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void enrollStudent()
    {
     if(students.size() == capacity) {
            System.out.println("The class is full, you cannot enrol.");
        }
        else {
            students.add(new Student("Neil",20,1234));
       
     
    }
}
    
    public void printResult()
    {
        for(int i=0;i<students.size();i++)
        {
            System.out.println(i);
        }
        
    }
}
