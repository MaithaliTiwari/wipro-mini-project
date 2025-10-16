package StreamAPI;

import java.util.ArrayList;

public class CountStudents {
    public static void main(String[] args) {
        // 1. To add five Student objects into and ArrayList
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Aarav", 85));
        students.add(new Student(2, "Bhavna", 45));
        students.add(new Student(3, "Chirag", 92));
        students.add(new Student(4, "Divya", 49));
        students.add(new Student(5, "Eshan", 60));

        // 2. Filter the Student objects who have cleared the test with minimum 50 marks
        // 3. Get the count of how many have cleared and print it.
        long passedCount = students.stream()
                .filter(student -> student.getMark() >= 50)
                .count();

        System.out.println("Total number of students who cleared the test: " + passedCount);
    }
}
