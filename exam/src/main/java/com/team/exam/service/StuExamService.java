package com.team.exam.service;

import com.team.exam.exception.ExamServiceException;
import com.team.exam.form.AnswersheetDto;
import com.team.exam.form.TakeExamDto;
import com.team.exam.form.TestDto;
import org.springframework.stereotype.Service;

@Service
public interface StuExamService {
    /**
     * 学生提交试卷
     *
     * @param test_id,takeExamDto
     * @return
     * @throws ExamServiceException
     */
    AnswersheetDto submitTest(long test_id, TakeExamDto takeExamDto) throws ExamServiceException;

    /**
     * 学生参加考试【获取试卷，这里创建答卷】
     *
     * @param test_id,stu_id
     * @return
     * @throws ExamServiceException
     */
    TestDto searchTest(long test_id, long stu_id) throws ExamServiceException;

}
