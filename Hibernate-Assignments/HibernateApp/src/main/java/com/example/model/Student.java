package com.example.model;

import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
// if we will not use table then it will use the name of the entity as the name
// of the table, therefore we use it to customize the name of the table
public class Student {
    // field
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name="student_name",length=100)
    private String name;

    @Column(name="student_college",length=200,nullable=true)
    private String college;

    @Column(name="student_phone",length=20,nullable=true)
    private String phone;

    @Column(name="student_fathername",length=100,nullable=false)
    private String fathername;

    @Lob
    private String about;

    private boolean isActive;

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    @OneToMany(mappedBy = "student",fetch=FetchType.LAZY,cascade=CascadeType.ALL,orphanRemoval = true)
    private List<Certificate> certificates=new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

}
