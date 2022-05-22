package com.team.exam.utils;

public class Constants {
    //时间
    public static final String TOPIC_TIME = "*.time.*";
    public static final String TOPIC_COLLEGE = "*.college.*";

    //与rabbitmq相关
    public static final String QUE_SIMPLE = "simple";
    public static final String QUE_SIMPLE2 = "simple2";
    public static final String QUE_WORK_QUEUE= "work-queue";
    public static final String QUE_RPC_QUEUE= "rpc-queue";

    public static final String EX_FANOUT = "ex-fanout";
    public static final String EX_DIRECT = "ex-direct";
    public static final String EX_TOPIC = "ex-topic";
    public static final String EX_RPC = "ex-rpc";

    public static final String KEY_FATAL = "fatal";
    public static final String KEY_WARN = "warn";
    public static final String KEY_RPC = "rpc";
}