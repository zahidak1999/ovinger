import java.util.ArrayList;

/**
 * Class creates overview of students
 */
public class TaskOverview {

    private ArrayList<Student> students;
    private int numberOfStudents = 0;
    
    /**
     * Constructor initializes arraylist
     */
    public TaskOverview() {
        students = new ArrayList<Student>();
    }
    
    /**
     * Method to find out the size of arraylist
     * @return size of the arraylist
     */
    public int getAllStudents() {
        return students.size();
    }

    /**
     * Method to get out tasks, for each student
     * @param name
     * @return number of tasks, for specified student
     */
    public int getTasksStudent(String name){
        for(Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student.getNumberOfTasks();
            }
        }
        throw new IllegalArgumentException("Studenten eksisterer ikke. ");
    }

    /**
     * Method to increase the value of tasks for specified student.
     * @param name
     * @param increase
     */
    public void setTasksStudent(String name, int increase) {
        for(Student student : students) {
            if(student.getName().equalsIgnoreCase(name)) {
                student.increaseNumberOftasks(increase);
            }
        }
    }   

    /**
     * Method to register a new student.
     * @param name
     * @param numberOfTasks
     */
    public void newStudent(String name, int numberOfTasks) {
        for(Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                throw new IllegalArgumentException("Navnet er i bruk, be foreldre gi dæ nytt.");
            }
        }
        students.add(new Student(name, numberOfTasks));
    }

    /**
     * toString method to gather the names and tasks for each student.
     * @return overview of students
     */
    @Override
    public String toString() {
        String overviewOfStudents = "";
        for(Student student : students) {
            overviewOfStudents += student.getName() + ", " + student.getNumberOfTasks() + " oppgaver" + "\n";
        }
        return overviewOfStudents;
    }
}
