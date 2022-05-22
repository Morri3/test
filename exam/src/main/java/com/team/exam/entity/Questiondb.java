package com.team.exam.entity;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "questiondb")
public class Questiondb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qd_id", nullable = false)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tch_id", nullable = false)
    private User tch;

    @Column(name = "createtime")
    private Date createtime;

    @Column(name = "title")
    private String title;

    @Column(name = "memo")
    private String memo;

    @OneToMany(mappedBy = "qd")
    private Set<Qdquestion> qdquestions = new LinkedHashSet<>();

    public Set<Qdquestion> getQdquestions() {
        return qdquestions;
    }

    public void setQdquestions(Set<Qdquestion> qdquestions) {
        this.qdquestions = qdquestions;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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