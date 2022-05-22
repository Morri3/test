package com.team.exam.form;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AnswersheetDto implements Serializable {
    private long as_id;//答卷id
    private long test_id;//考试id
    private long stu_id;//考生id
    private Date starttime;//考生进入考试的时间
    private Date submittime;//考生提交考卷的时间
    private String asstatus;//答卷状态（未批阅、已批阅）
}
