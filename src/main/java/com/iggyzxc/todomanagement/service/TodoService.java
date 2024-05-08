package com.iggyzxc.todomanagement.service;

import com.iggyzxc.todomanagement.dto.TodoDTO;

import java.util.List;

public interface TodoService {

    TodoDTO addTodo(TodoDTO todoDTO);

    TodoDTO getTodo(Long id);

    List<TodoDTO> getTodos();

    TodoDTO updateTodo(Long id, TodoDTO todoDTO);

    void deleteTodo(Long id);

    TodoDTO completeTodo(Long id);

    TodoDTO incompleteTodo(Long id);
}
