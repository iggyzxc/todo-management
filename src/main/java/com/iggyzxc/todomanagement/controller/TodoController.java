package com.iggyzxc.todomanagement.controller;

import com.iggyzxc.todomanagement.dto.TodoDTO;
import com.iggyzxc.todomanagement.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todos")
@AllArgsConstructor
public class TodoController {

    private TodoService todoService;

    @PostMapping
    public ResponseEntity<TodoDTO> addTodo(@RequestBody TodoDTO todoDTO) {
        TodoDTO savedTodo = todoService.addTodo(todoDTO);
        return new ResponseEntity<>(savedTodo, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoDTO> getTodo(@PathVariable Long id) {
        TodoDTO savedTodo = todoService.getTodo(id);
        return ResponseEntity.ok(savedTodo);
    }
}
