package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name="student_certificate")
public class Certificate {
    public long getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(long certificateId) {
        this.certificateId = certificateId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long certificateId;

    private String title;
    private String about;
    private String link;
    
    @ManyToOne
    @JoinColumn(name="student_id") // this is the foreign key column
    private Student student;
    
}
