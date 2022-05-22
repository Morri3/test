package com.team.exam.entity;

import javax.persistence.*;

@Entity
@Table(name = "toption")
public class Toption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "to_id", nullable = false)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tq_id", nullable = false)
    private Tquestion tq;

    @Column(name = "content")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Tquestion getTq() {
        return tq;
    }

    public void setTq(Tquestion tq) {
        this.tq = tq;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}