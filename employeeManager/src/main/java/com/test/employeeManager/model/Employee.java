package com.test.employeeManager.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageURL;
    @Column(nullable = false, updatable = false)
    private String emplyeeCode;

    public Employee() {
    }

    public Employee(Long id, String name, String email, String jobTitle, String phone, String imageURL, String emplyeeCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageURL = imageURL;
        this.emplyeeCode = emplyeeCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getEmplyeeCode() {
        return emplyeeCode;
    }

    public void setEmplyeeCode(String emplyeeCode) {
        this.emplyeeCode = emplyeeCode;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id" + id +
                "name" + name + '\'' +
                "email" + email + '\'' +
                "jobTitle" + jobTitle + '\'' +
                "phone" + phone +
                "imageURL" + imageURL + '\''+
                "}";
    }
}
