package com.trian.test_app.data.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.trian.test_app.data.entity.QuestionEntity;

import java.util.List;

@Dao
public interface QuestionDao {
    @Query("SELECT * FROM tb_question")
    List<QuestionEntity> getAll();
}
