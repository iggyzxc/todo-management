package com.iggyzxc.todomanagement.service.impl;

import com.iggyzxc.todomanagement.entity.Todo;
import com.iggyzxc.todomanagement.repository.TodoRepository;
import com.iggyzxc.todomanagement.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    @Override
    public Todo addTodo(Todo todoDTO) {
        return null;
    }

    @Override
    public Todo getTodo(Long id) {
        return null;
    }

    @Override
    public List<Todo> getTodos() {
        return List.of();
    }

    @Override
    public Todo updateTodo(Long id, Todo todoDTO) {
        return null;
    }

    @Override
    public void deleteTodo(Long id) {

    }

    @Override
    public Todo completeTodo(Long id) {
        return null;
    }

    @Override
    public Todo incompleteTodo(Long id) {
        return null;
    }
}
