package com.team.exam.controller;

import com.team.exam.form.AnswersheetDto;
import com.team.exam.form.TakeExamDto;
import com.team.exam.result.ExceptionMsg;
import com.team.exam.result.ResponseData;
import com.team.exam.service.StuExamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/answersheet")
public class StuExamController {
    private final Logger logger = LoggerFactory.getLogger(StuExamController.class);//日志类

    @Autowired
    private StuExamService stuExamService;

    //TODO 学生提交试卷
    @RequestMapping(value = "/write/{test_id}", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData submitTest(@PathVariable("test_id") long test_id, @RequestBody TakeExamDto takeExamDto) {
        AnswersheetDto answersheetDto = stuExamService.submitTest(test_id, takeExamDto);
        return new ResponseData(ExceptionMsg.SUCCESS, answersheetDto);
    }


}
