package lesson25.Task1;

public class Students {
    String name;
    int age;
    double averageScore;
    int course;

    public Students(String name, int age, double averageScore, int course) {
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", averageScore=" + averageScore +
                ", course=" + course +
                '}';
    }
}
