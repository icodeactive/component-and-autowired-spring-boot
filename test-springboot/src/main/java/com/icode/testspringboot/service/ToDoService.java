package com.icode.testspringboot.service;

import com.icode.testspringboot.model.ToDo;
import com.icode.testspringboot.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public int countToDo(){
        return toDoRepository.findAll().size();
    }

    public ToDo getTodo(int id){
        return toDoRepository.findById(id);
    }

    public List<ToDo> getAll(){
        return toDoRepository.findAll();
    }

}
