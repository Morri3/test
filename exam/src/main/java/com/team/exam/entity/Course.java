package com.team.exam.entity;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id", nullable = false)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tch_id", nullable = false)
    private User tch;

    @Column(name = "codenum")
    private String codenum;

    @Column(name = "cname")
    private String cname;

    @Column(name = "area")
    private String area;

    @Column(name = "term")
    private String term;

    @Column(name = "cstatus")
    private String cstatus;

    @Column(name = "createtime")
    private Date createtime;

    @Column(name = "closetime")
    private Date closetime;

    @Column(name = "canceltime")
    private Date canceltime;

    @Column(name = "modifytime")
    private Date modifytime;

    @OneToMany(mappedBy = "c")
    private Set<CourseStudent> courseStudents = new LinkedHashSet<>();

    @OneToMany(mappedBy = "c")
    private Set<Test> tests = new LinkedHashSet<>();

    public Set<Test> getTests() {
        return tests;
    }

    public void setTests(Set<Test> tests) {
        this.tests = tests;
    }

    public Set<CourseStudent> getCourseStudents() {
        return courseStudents;
    }

    public void setCourseStudents(Set<CourseStudent> courseStudents) {
        this.courseStudents = courseStudents;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Date getCanceltime() {
        return canceltime;
    }

    public void setCanceltime(Date canceltime) {
        this.canceltime = canceltime;
    }

    public Date getClosetime() {
        return closetime;
    }

    public void setClosetime(Date closetime) {
        this.closetime = closetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCstatus() {
        return cstatus;
    }

    public void setCstatus(String cstatus) {
        this.cstatus = cstatus;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCodenum() {
        return codenum;
    }

    public void setCodenum(String codenum) {
        this.codenum = codenum;
    }

    public User getTch() {
        return tch;
    }

    public void setTch(User tch) {
        this.tch = tch;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}