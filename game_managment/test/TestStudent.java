import java.util.*;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("An", 8.5f));
        list.add(new Student("Binh", 7.2f));
        list.add(new Student("Cuong", 9.0f));

        System.out.println("Before sorting:");
        for (Student s : list) {
            System.out.println(s);
        }

        Collections.sort(list); // Uses compareTo

        System.out.println("\nAfter sorting (by GPA ascending):");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
