package vvashkolup;

public class Employee {
    private String name;
    private String surname;
    private String fathersName;
    private String position;
    private String email;
    private String telephone;
    private int age;

    public Employee(String name, String surname, String fathersName, String position, String email, String telephone, int age) {
        this.name = name;
        this.surname = surname;
        this.fathersName = fathersName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
