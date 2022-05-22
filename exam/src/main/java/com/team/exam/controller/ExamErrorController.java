//package com.team.exam.controller;
//
//import com.team.exam.exception.EchoServiceException;
//import com.team.exam.mq.ExamMessage;
//import com.team.exam.mq.MQRequestDto;
//import com.team.exam.result.ResponseData;
//import com.team.exam.result.ResponseMsg;
//import com.team.exam.utils.Constants;
//import org.apache.commons.lang3.RandomStringUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.amqp.core.DirectExchange;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.HashMap;
//import java.util.Map;
//
//@ControllerAdvice
//public class ExamErrorController {
//    private final Logger logger = LoggerFactory.getLogger(ExamErrorController.class);
//
//    @Autowired
//    private AmqpTemplate mqService;
//    @Qualifier("direct")
//    @Autowired
//    private DirectExchange directExchange;
//
//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    public Map<String, Object> handleGlobleError(HttpServletRequest request, Exception ex) {
//        //用Map容器返回信息
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("code", 500);
//        map.put("msg", "应用程序错误:" + ex.getMessage());
//        ex.printStackTrace();
//        return map;
//    }
//
//    @ExceptionHandler(EchoServiceException.class)
//    @ResponseBody
//    public Map<String, Object> handleEchoError(HttpServletRequest request, EchoServiceException ex) {
//        //用Map容器返回信息
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("code", 500);
//        map.put("msg", ex.getMessage());
//        ex.printStackTrace();
//        return map;
//    }
//
//    @RequestMapping(value = "/issueError", method = RequestMethod.POST)
//    public ResponseData issueError(@RequestBody MQRequestDto requestDto){
//        logger.warn("dosomething create error");
//
//        //模拟产生不同级别错误
//        ExamMessage msg = new ExamMessage(ExamMessage.CATEGORY_ERROR);
//        msg.appendContent("error", RandomStringUtils.randomNumeric(6));
//        msg.appendContent("msg", "warning hanppend.");
//        mqService.convertAndSend(directExchange.getName(), Constants.KEY_WARN, msg);
//
//        ExamMessage msgFatal = new ExamMessage(ExamMessage.CATEGORY_ERROR);
//        msgFatal.appendContent("error", RandomStringUtils.randomNumeric(6));
//        msgFatal.appendContent("msg", "fatal error hanppend.");
//        mqService.convertAndSend(directExchange.getName(), Constants.KEY_FATAL, msgFatal);
//        return new ResponseData(ResponseMsg.SUCCESS);
//    }
//}