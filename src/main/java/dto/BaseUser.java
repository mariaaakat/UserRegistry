package dto;

public abstract class BaseUser {
    private int id;
    private String name;
    private Integer age;
    private String lastName;
    private String role;

    public BaseUser(int id, String name, Integer age, String lastName, String role) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        this.role = role;
    }

    public BaseUser() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setRole(String role) {
        this.role = role;
    }

    public abstract Integer updateAge(Integer age);

    public abstract String getRole();

    public abstract String updateName(String name, String lastName);


}
