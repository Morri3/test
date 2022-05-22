package com.team.exam.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "u_id", nullable = false)
    private long id;

    @Column(name = "category")
    private int category;

    @Column(name = "username")
    private String username;

    @Column(name = "userpwd")
    private String userpwd;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "unit")
    private String unit;

    @OneToMany(mappedBy = "stu")
    private Set<CourseStudent> courseStudents = new LinkedHashSet<>();

    @OneToMany(mappedBy = "tch")
    private Set<Questiondb> questiondbs = new LinkedHashSet<>();

    @OneToMany(mappedBy = "u")
    private Set<UserPermission> userPermissions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "tch")
    private Set<Course> courses = new LinkedHashSet<>();

    @OneToMany(mappedBy = "stu")
    private Set<Answersheet> answersheets = new LinkedHashSet<>();

    public Set<Answersheet> getAnswersheets() {
        return answersheets;
    }

    public void setAnswersheets(Set<Answersheet> answersheets) {
        this.answersheets = answersheets;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public Set<UserPermission> getUserPermissions() {
        return userPermissions;
    }

    public void setUserPermissions(Set<UserPermission> userPermissions) {
        this.userPermissions = userPermissions;
    }

    public Set<Questiondb> getQuestiondbs() {
        return questiondbs;
    }

    public void setQuestiondbs(Set<Questiondb> questiondbs) {
        this.questiondbs = questiondbs;
    }

    public Set<CourseStudent> getCourseStudents() {
        return courseStudents;
    }

    public void setCourseStudents(Set<CourseStudent> courseStudents) {
        this.courseStudents = courseStudents;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}