package com.ThopTv.MovieInfo.Entites;

import org.springframework.boot.context.properties.bind.Name;
import javax.persistence.Id;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@Access(value=AccessType.FIELD)
public class EntityUser {
    @Id
    @Column(name = "ID",nullable=false)
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "Location")
    private String location;

    public EntityUser() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "Password")
    private String password;
    @Column(name = "Email")
    private String email;

    public EntityUser(Integer id, String lastName, String firstName, String location, String password, String email) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.location = location;
        this.password = password;
        this.email = email;
    }
}
