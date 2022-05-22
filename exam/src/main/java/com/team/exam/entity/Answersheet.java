package com.team.exam.entity;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "answersheet")
public class Answersheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "as_id", nullable = false)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "t_id", nullable = false)
    private Test t;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "stu_id", nullable = false)
    private User stu;

    @Column(name = "starttime")
    private Date starttime;

    @Column(name = "submittime")
    private Date submittime;

    @Column(name = "asstatus")
    private String asstatus;

    @Column(name = "score")
    private int score;

    @OneToMany(mappedBy = "as")
    private Set<Answer> answers = new LinkedHashSet<>();

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAsstatus() {
        return asstatus;
    }

    public void setAsstatus(String asstatus) {
        this.asstatus = asstatus;
    }

    public Date getSubmittime() {
        return submittime;
    }

    public void setSubmittime(Date submittime) {
        this.submittime = submittime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public User getStu() {
        return stu;
    }

    public void setStu(User stu) {
        this.stu = stu;
    }

    public Test getT() {
        return t;
    }

    public void setT(Test t) {
        this.t = t;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}