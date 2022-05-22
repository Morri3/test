package com.team.exam.entity;

import javax.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_id", nullable = false)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "as_id", nullable = false)
    private Answersheet as;

    @Column(name = "qtype")
    private int qtype;

    @Column(name = "content")
    private String content;

    @Column(name = "correct")
    private boolean correct;

    public boolean getCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getQtype() {
        return qtype;
    }

    public void setQtype(int qtype) {
        this.qtype = qtype;
    }

    public Answersheet getAs() {
        return as;
    }

    public void setAs(Answersheet as) {
        this.as = as;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}