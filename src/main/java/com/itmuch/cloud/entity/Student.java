package com.itmuch.cloud.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * ClassName: Student <br/>
 * Description: Student 实体类<br/>
 * date: 2019/7/6 14:30<br/>
 *
 * @author yugan<br />
 * @since JDK 1.8
 */
@Entity
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private float balance;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }



}
