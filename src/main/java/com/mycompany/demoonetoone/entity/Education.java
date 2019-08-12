package com.mycompany.demoonetoone.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author bhumika
 */
@Entity
@Table(name = "education")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "degree_type")
    private String degreeType;

    @Column(name = "degree_description")
    private String degreeDescription;

    @Column(name = "graduation_year")
    private String graduationYear;

    @Column(name = "school")
    private String school;

    @OneToOne(mappedBy = "education", cascade = CascadeType.ALL)
    private Student student;

    public Education() {
    }

    public Education(String degreeType, String degreeDescription, String school,String graduationYear) {
        this.degreeType = degreeType;
        this.degreeDescription = degreeDescription;
        this.school = school;
        this.graduationYear = graduationYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getDegreeDescription() {
        return degreeDescription;
    }

    public void setDegreeDescription(String degreeDescription) {
        this.degreeDescription = degreeDescription;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
