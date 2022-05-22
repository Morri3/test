package com.team.exam.service.impl;

import com.team.exam.exception.ExamServiceException;
import com.team.exam.form.AnswerDto;
import com.team.exam.form.AnswersheetDto;
import com.team.exam.form.TakeExamDto;
import com.team.exam.form.TestDto;
import com.team.exam.repository.AnswerRepository;
import com.team.exam.repository.StuExamRepository;
import com.team.exam.service.StuExamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class StuExamServiceImpl implements StuExamService {
    private final Logger logger = LoggerFactory.getLogger(StuExamServiceImpl.class);

    @Autowired
    private StuExamRepository stuExamRepository;
    @Autowired
    private AnswerRepository answerRepository;

    //学生提交试卷
    @Override
    public AnswersheetDto submitTest(long test_id, TakeExamDto takeExamDto) throws ExamServiceException {

        return null;
    }

    //学生参加考试【获取试卷，这里创建答卷】
    @Override
    public TestDto searchTest(long test_id, long stu_id) throws ExamServiceException{
        //TODO 根据学生id验证该学生身份是否是学生，查看该学生是否有参加该考试的权限
        //。。。

        //—————————学生有参加该考试的权限—————————
        if(true){//有权限
            //从数据库查找指定考卷


            //学生一进入到考试界面时，就创建一份答卷
            Date curTime = new Date();//开始进入考试的时间
            stuExamRepository.createAnswersheet(test_id, stu_id, curTime);//数据库添加答卷


//            //—————————获取学生对考题写的回答，添加到数据库—————————
//            long as_id=stuExamRepository.findAnswersheetId(test_id,stu_id);//根据考试id和学生id查找刚才创建的答卷
//            List<AnswerDto> answers=takeExamDto.getAnswer_list();//获得dto中的回答列表
//            //遍历dto中的回答列表
//            for(AnswerDto answer:answers){
//                int qtypes=answer.getQtypes();//获得对应题目的类型
//                String content=answer.getContent();//获得该题目的回答
//                answerRepository.addAnswer(as_id,qtypes,content);//数据库添加某题的回答
//            }

            //

        }

        return null;
    }


}
