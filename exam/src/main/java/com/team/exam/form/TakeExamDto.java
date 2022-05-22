package com.team.exam.form;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TakeExamDto implements Serializable {
    private long stu_id;//考生id
    private List<AnswerDto> answer_list;//考生在考卷上回答的内容

}
