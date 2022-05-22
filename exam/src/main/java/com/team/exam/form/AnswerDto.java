package com.team.exam.form;

import lombok.Data;

import java.io.Serializable;

@Data
public class AnswerDto implements Serializable {
    private long a_id;//回答的编号
    private int qtypes;//该 回答 所属题目的类型
    private String content;//回答的内容
    private boolean correct;//回答是否正确
}
