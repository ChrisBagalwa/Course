import java.util.*;

public class TestCourse {
    public static void main(String[] args) {
        // Create the first course ArrayList
        ArrayList<Course> courses1 = new ArrayList<>();
        // Add courses into list
        courses1.add(new Course("Course1", 10, "Lecturer1"));
        courses1.add(new Course("Course2", 50, "Lecturer2"));
        courses1.add(new Course("Course3", 20, "Lecturer3"));
        courses1.add(new Course("Course4", 40, "Lecturer4"));
        courses1.add(new Course("Course5", 30, "Lecturer5"));
        System.out.println("\n Printing the Course Details of First List(Courses1):\n");
        // Call the print method to display the list
        printList(courses1);
        courses1.sort(new Comparator<Course>() {
            // Sort the list based on the numberOfStudents
            @Override
            public int compare(Course o1, Course o2) {
                return o1.getNumberOfStudents()-o2.getNumberOfStudents();
            }
        });
        System.out.println("\nAfter Sorting The Course Details of First List(Courses1):\n");
        // Call the print method to display the list
        printList(courses1);
        /*
        Swap the first and second Elements
         */
        Course firstElement = courses1.get(0);  // Store the First Course
        courses1.set(0,courses1.get(1));  // Place second one into First place
        courses1.set(1,firstElement); // Place the first course into second place
        System.out.println("\nList After Swapping:");
        printList(courses1); // Call the print method to display the list
        ArrayList<Course> courses2 = (ArrayList<Course>) courses1.clone(); // Copy the contents of course1 into courses2
        System.out.println("\nAfter Copying Courses1 into Courses2:\n");
        printList(courses2); // Print the list
        courses2.add(new Course("Java 101",55,"Dr. P Green"));
        courses2.add(new Course("Advanced Programming",93,"Prof. M Milton"));
        System.out.println("\nAfter Adding Two Given Courses:\n");
        printList(courses2);
        courses2.sort(new Comparator<Course>() {
            // Sort the second list based on the name
            @Override
            public int compare(Course o1, Course o2) {
                return o1.getCourseName().compareTo(o2.getCourseName());
            }
        });
        System.out.println("\nAfter Sorting the Courses2 List:\n");
        printList(courses2);
        for (Course c:courses2) {
            if (c.getCourseName().compareTo("Java 101")==0){
                System.out.println("Index of JAVA 101 is :"+courses2.indexOf(c));
                break;  // Break the iteration
            }
        }
        /*
        Print the Dis-joint of two Lists
         */
        System.out.println("\nDisjoint Courses:\n");
        for (Course c1:courses1) {
            for (Course c2:courses2) {
                if (c1.equals(c2)){
                    System.out.println(c1);
                    break;
                }
            }
        }
        courses2.sort(new Comparator<Course>() {
            @Override
            public int compare(Course o1, Course o2) {
                return o1.getNumberOfStudents()-o2.getNumberOfStudents();
            }
        });

        System.out.println("\nMinimum and Maximum students Count In Courses2 List:\n");
        System.out.println("Maximum Students in Courses2 List:"+courses2.get(courses2.size()-1));
        System.out.println("Minimum Students in Courses2 List:"+courses2.get(0));
    }
    public static void printList(ArrayList<Course> courses1){
        // Print the courses in the list
        for (Course c:courses1) {
            System.out.println(c);
        }
    }
}
