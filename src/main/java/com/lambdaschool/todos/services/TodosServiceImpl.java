package com.lambdaschool.todos.services;


import com.lambdaschool.todos.models.Todos;
import com.lambdaschool.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service(value = "todosService")
public class TodosServiceImpl implements TodosService {
    @Autowired
    private TodoRepository todorepos;


    @Override
    public void markComplete(long todoid) {
       if(todorepos.findById(todoid).isPresent()){
           Todos todo = findTodoById(todoid);
           todo.setCompleted(true);
       }
    }

    @Override
    public Todos findTodoById(long id) {
        return null;
    }
}
