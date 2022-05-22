package com.team.exam.exception;

public class ExamServiceException extends RuntimeException{
    public ExamServiceException(){};

    public ExamServiceException(String msg){
        super(msg);
    };
}
