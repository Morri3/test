package com.team.exam.repository;

import com.team.exam.entity.Answersheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.Date;

public interface StuExamRepository extends JpaRepository<Answersheet, Long>, JpaSpecificationExecutor<Answersheet> {
    Answersheet findById(long id);

    @Transactional
    @Modifying
    @Query(value = "insert into answersheet(t_id,stu_id,starttime,submittime,asstatus,score)" +
            " values(?1,?2,?3,null,'未提交',0)", nativeQuery = true)
    void createAnswersheet(long test_id, long stu_id, Date starttime);

    @Query(value = "select as_id from answersheet where t_id = ?1 and stu_id = ?2", nativeQuery = true)
    long findAnswersheetId(long test_id, long stu_id);
}
