package com.team.exam.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "qdquestion")
public class Qdquestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qdq_id", nullable = false)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "qd_id", nullable = false)
    private Questiondb qd;

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

    @OneToMany(mappedBy = "qdq")
    private Set<Qdoption> qdoptions = new LinkedHashSet<>();

    public Set<Qdoption> getQdoptions() {
        return qdoptions;
    }

    public void setQdoptions(Set<Qdoption> qdoptions) {
        this.qdoptions = qdoptions;
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

    public Questiondb getQd() {
        return qd;
    }

    public void setQd(Questiondb qd) {
        this.qd = qd;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}