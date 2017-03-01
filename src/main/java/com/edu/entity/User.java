package com.edu.entity;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Created by wuxiaolong on 2017/2/27.
 */
@Entity
@Table(name="test_user")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name="user_name")
    private String name;

    @Column
    private Integer gender; //1:male 2:famale

    @Column
    private Integer age;

    @Column
    private String comment;

    public User() {
    }

    public User(String name, Integer gender, Integer age, String comment) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id.equals(user.id);
    }

    public int hashCode() {
        return id.hashCode();
    }

    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", comment='" + comment + '\'' +
                '}';
    }
}



