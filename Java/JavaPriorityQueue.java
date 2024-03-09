package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student implements Comparable<Student>{

    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getCgpa(){
        return cgpa;
    }


    @Override
    public int compareTo(Student student) {

        // First compare by CGPA in descending order
        if (Double.compare(student.cgpa, this.cgpa) != 0) {
            return Double.compare(student.cgpa, this.cgpa);
        }
        // Then compare by name in alphabetical order
        int nameComparison = this.name.compareTo(student.name);
        if (nameComparison != 0) {
            return nameComparison;
        }
        // Finally, compare by ID in ascending order
        return Integer.compare(this.id, student.id);
    }
};

class Priorities{
    private PriorityQueue<Student> priorityQueue;

    public List<Student> getStudents(List<String> events){

        this.priorityQueue = new PriorityQueue<Student>();

        for (String event : events){
            String[] eventArray = event.split(" ");

            if(eventArray[0].equals("ENTER")){
                Student student = new Student(
                    Integer.parseInt(eventArray[3]), // Assuming ID is the last part
                    eventArray[1], // Assuming name is the second part
                    Double.parseDouble(eventArray[2]) // Assuming CGPA is the third part
                );
                priorityQueue.add(student);
            }
            else if(eventArray[0].equals("SERVED")){
                // remove the student with the highest priority
                priorityQueue.poll();
            }
        }

        List<Student> studentsList = new ArrayList<>();
        while (!priorityQueue.isEmpty()) {
            studentsList.add(priorityQueue.poll());
        }
        return studentsList;
    }
};

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorites = new Priorities();

    public static void main(String[] args){
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while(totalEvents-- != 0){
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorites.getStudents(events);

        if(students.isEmpty()){
            System.out.println("EMPTY");
        } else {
            for(Student st: students){
                System.out.println(st.getName());
            }
        }
    }

}