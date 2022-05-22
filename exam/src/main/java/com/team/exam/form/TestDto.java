package com.team.exam.form;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TestDto implements Serializable {
    private long id;//试卷id
    private String title;//试卷名称
    private long creatorid;//创建者id
    private Date createtime;//创建时间
    private Date starttime;//考试开始时间
    private Date finishtime;//考试结束时间
    private String tstatus;//试卷状态
    private String memo;//描述
    private long invigilatorid;//监考老师id
    private String college;//学院
}
