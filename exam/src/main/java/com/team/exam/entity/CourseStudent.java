package com.team.exam.entity;

import javax.persistence.*;

@Entity
@Table(name = "course_student")
public class CourseStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cs_id", nullable = false)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "stu_id", nullable = false)
    private User stu;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "c_id", nullable = false)
    private Course c;

    public Course getC() {
        return c;
    }

    public void setC(Course c) {
        this.c = c;
    }

    public User getStu() {
        return stu;
    }

    public void setStu(User stu) {
        this.stu = stu;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}