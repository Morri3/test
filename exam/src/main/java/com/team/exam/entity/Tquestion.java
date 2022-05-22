package com.team.exam.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "tquestion")
public class Tquestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tq_id", nullable = false)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "t_id", nullable = false)
    private Test t;

    @Column(name = "type")
    private int type;

    @Column(name = "content")
    private String content;

    @Column(name = "required")
    private boolean required;

    @Column(name = "memo")
    private String memo;

    @Column(name = "trueanswer")
    private String trueanswer;

    @OneToMany(mappedBy = "tq")
    private Set<Toption> toptions = new LinkedHashSet<>();

    public Set<Toption> getToptions() {
        return toptions;
    }

    public void setToptions(Set<Toption> toptions) {
        this.toptions = toptions;
    }

    public String getTrueanswer() {
        return trueanswer;
    }

    public void setTrueanswer(String trueanswer) {
        this.trueanswer = trueanswer;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public boolean getRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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