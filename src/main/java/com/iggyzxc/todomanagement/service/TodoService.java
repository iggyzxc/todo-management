package com.iggyzxc.todomanagement.service;

import com.iggyzxc.todomanagement.entity.Todo;

import java.util.List;

public interface TodoService {

    Todo addTodo(Todo todoDTO);

    Todo getTodo(Long id);

    List<Todo> getTodos();

    Todo updateTodo(Long id, Todo todoDTO);

    void deleteTodo(Long id);

    Todo completeTodo(Long id);

    Todo incompleteTodo(Long id);
}
