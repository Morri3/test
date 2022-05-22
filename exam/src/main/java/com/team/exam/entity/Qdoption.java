package com.team.exam.entity;

import javax.persistence.*;

@Entity
@Table(name = "qdoption")
public class Qdoption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qdo_id", nullable = false)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "qdq_id", nullable = false)
    private Qdquestion qdq;

    @Column(name = "content")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Qdquestion getQdq() {
        return qdq;
    }

    public void setQdq(Qdquestion qdq) {
        this.qdq = qdq;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}