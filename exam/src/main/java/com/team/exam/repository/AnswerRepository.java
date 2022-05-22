package com.team.exam.repository;

import com.team.exam.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface AnswerRepository extends JpaRepository<Answer,Long>, JpaSpecificationExecutor<Answer> {
    @Transactional
    @Modifying
    @Query(value = "insert into answer(as_id,qtypes,content) values(?1,?2,?3)",nativeQuery = true)
    void addAnswer(long as_id,int qtypes,String content);
}
