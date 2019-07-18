package com.icode.testspringboot.repository;

import com.icode.testspringboot.model.ToDo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository {

    List<ToDo> findAll();

    ToDo findById(int id);

}
