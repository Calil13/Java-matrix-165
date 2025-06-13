package lesson22.FactoryPattern;

public class SchoolFactory {
    public School createSchool(String type) {

        if (type.equalsIgnoreCase("student")) {
            return new Student();
        } else if (type.equalsIgnoreCase("teacher")) {
            return new Teacher();
        } else {
            return null;
        }
    }
}
