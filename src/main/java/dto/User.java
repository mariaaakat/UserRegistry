package dto;

import java.util.Objects;

public class User {
    //Позволяет обращатся только через геттеры и сеттеры, или вообще скрыть в других классах и пакетах
    private int id;
    private String name;
    //Позволяет видеть и обращаться к переменной внутри пакета
    protected Integer age;


    //Позволяет видеть и обращаться к переменной внутри пакета
    String lastName;

    public User(String name, Integer age, String lastName) {
        //this.id = id;
        this.name = name;
        this.age = age;
        this.lastName = lastName;
    }

    public User() {
    }

    //public int getId() {
    //    return id;
    //}

    //public void setId(int id) {
       // this.id = id;
   // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age < 14){
            throw new IllegalArgumentException("Регистрация невозможна!");
        }
        if (age > 100){
            throw new IllegalArgumentException("Регистрация самостоятельно не возможна!");
        }
        if (age == null){
            throw new IllegalArgumentException("Поле не может быть пустым!");
        }
        this.age = age;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}
