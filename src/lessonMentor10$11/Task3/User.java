package lessonMentor10$11.Task3;

public class User {
    private String name;
    private String surname;

    public User(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void printInfo(){
        System.out.println("User name : " + getName() +
                "User surname : " + getSurname());
    }
}
