package lessonMentor5$9and12;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;
    private String email;

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

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(boolean gender){
        this.gender = gender;
    }

    public boolean getGender(){
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    void printInfo(int i) {
        System.out.println(i + "." +
                "\nName : " + this.name +
                "\nSurname : " + this.surname +
                "\nAge  : " + this.age +
                "\nGender : " + (this.gender ? "Male" : "Female"));
        System.out.println("--------------");
    }
}

