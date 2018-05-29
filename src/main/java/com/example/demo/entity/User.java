package com.example.demo.entity;

import javax.persistence.*;

/**
 * Created by Lucem on 26/05/2018.
 */

@Entity
@Table(name="user")
public class User {

    //PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "fName")
    private String fName;
    @Column(name = "lName")
    private String lName;

    public User(){}

    public User(int id,String username, String password, String fName, String lName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fName = fName;
        this.lName = lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
