//package com.team.exam.mq;
//
//import com.team.exam.utils.ExamUtils;
//
//import java.io.Serializable;
//import java.util.HashMap;
//import java.util.Map;
//
//public class ExamMessage implements Serializable {
//    //1.基础模式
//    public static final String CATEGORY_MODEL_PUB = "m_publish";
//    public static final String CATEGORY_MODEL_DEL = "m_delete";
//    //2.工作队列模式
//    public static final String CATEGORY_ANSWER = "m_answer";
//    //3.发布订阅模式
//    public static final String CATEGORY_PAPER = "m_paper";
//    //4.路由模式
//    public static final String CATEGORY_ERROR= "m_error";
//    //5.主题模式
//    public static final String CATEGORY_STAT= "m_stat";
//    //6.RPC模式
//    public static final String CATEGORY_RPC= "m_rpc";
//    private String category;
//    private Map<String, Object> content = new HashMap<>();
//
//    public ExamMessage() {}
//
//    public ExamMessage(String category) {
//        this.category = category;
//    }
//
//    //添加msg内容
//    public void appendContent(String key, Object value){
//        content.put(key, value);
//    }
//
//    //转json的方法
//    public String stringfy(){
//        return ExamUtils.beanToJson(this);
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public Map<String, Object> getContent() {
//        return content;
//    }
//
//    public void setContent(Map<String, Object> content) {
//        this.content = content;
//    }
//}
