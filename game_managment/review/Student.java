public class Student implements Comparable<Student> {
    private String name;
    private float gpa;

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public Student() {}

    public String getName() {
        return name;
    }

    public float getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student o) {
        if (this.gpa < o.gpa) return -1;
        else if (this.gpa > o.gpa) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return name + " - GPA: " + gpa;
    }
}
