import java.util.ArrayList;

// Student class definition
class Student 
{
    private String name;
    private int id;

    // Constructor
    public Student(String name, int id) 
    {
        this.name = name;
        this.id = id;
    }

    // Getter for name
    public String getName() 
    {
        return name;
    }

    // Getter for id
    public int getId() 
    {
        return id;
    }

    // Override toString method for easy printing
    @Override
    public String toString()
    {
        return "Student ID: " + id + ", Name: " + name;
    }
}

public class StudentDemo
{
 public static void main(String[] args) 
 {
     // Create an ArrayList to hold Student objects
     ArrayList<Student> students = new ArrayList<>();

     // Add 10 Student objects to the ArrayList
     students.add(new Student("Sanghavi", 1));
     students.add(new Student("Bhargavi", 2));
     students.add(new Student("Sai Krishna", 3));
     students.add(new Student("Sowmya", 4));
     students.add(new Student("Vaishnavi", 5));
     students.add(new Student("Sowmya", 6));
     students.add(new Student("Harsha", 7));
     students.add(new Student("Manisha", 8));
     students.add(new Student("Sai", 9));
     students.add(new Student("Rohith", 10));

     // Print each Student object using a for-each loop
     for (Student student : students) 
     {
         System.out.println(student);
     }
 }
}