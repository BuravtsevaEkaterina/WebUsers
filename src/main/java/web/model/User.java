package web.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column
    @GeneratedValue
    private Integer id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private int age;

    public User() {}

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User" +
                "\nID = " + id +
                "\nFirstName = " + firstName +
                "\nLastName = " + lastName +
                "\nAge = " + age +
                '\n';
    }
}
