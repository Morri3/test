package com.team.exam.entity;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "t_id", nullable = false)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "c_id", nullable = false)
    private Course c;

    @Column(name = "title")
    private String title;

    @Column(name = "creatorid")
    private long creatorid;

    @Column(name = "createtime")
    private Date createtime;

    @Column(name = "starttime")
    private Date starttime;

    @Column(name = "finishtime")
    private Date finishtime;

    @Column(name = "tstatus")
    private String tstatus;

    @Column(name = "memo")
    private String memo;

    @Column(name = "invigilatorid")
    private long invigilatorid;

    @Column(name = "college")
    private String college;

    @OneToMany(mappedBy = "t")
    private Set<Tquestion> tquestions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "t")
    private Set<Answersheet> answersheets = new LinkedHashSet<>();

    public Set<Answersheet> getAnswersheets() {
        return answersheets;
    }

    public void setAnswersheets(Set<Answersheet> answersheets) {
        this.answersheets = answersheets;
    }

    public Set<Tquestion> getTquestions() {
        return tquestions;
    }

    public void setTquestions(Set<Tquestion> tquestions) {
        this.tquestions = tquestions;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public long getInvigilatorid() {
        return invigilatorid;
    }

    public void setInvigilatorid(long invigilatorid) {
        this.invigilatorid = invigilatorid;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getTstatus() {
        return tstatus;
    }

    public void setTstatus(String tstatus) {
        this.tstatus = tstatus;
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public long getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(long creatorid) {
        this.creatorid = creatorid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Course getC() {
        return c;
    }

    public void setC(Course c) {
        this.c = c;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}