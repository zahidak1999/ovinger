public class Student {

    private String name;
    private int numberOfTasks;
    
    /**
     * Constructor for student
     * @param name
     * @param numberOfTasks
     */
    public Student(String name, int numberOfTasks) {
        this.name = name;
        this.numberOfTasks = numberOfTasks;
    }

    /**
     * Method to get Students name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Method to get number of tasks
     * @return number of tasks
     */
    public int getNumberOfTasks() {
        return numberOfTasks;
    }

    /**
     * Method to increase the number of tasks.
     * @param increase
     */
    public void increaseNumberOftasks(int increase) {
        this.numberOfTasks = numberOfTasks + increase;
    }
}