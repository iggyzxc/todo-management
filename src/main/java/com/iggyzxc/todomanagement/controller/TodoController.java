package com.iggyzxc.todomanagement.controller;

import com.iggyzxc.todomanagement.dto.TodoDTO;
import com.iggyzxc.todomanagement.exception.ResourceNotFoundException;
import com.iggyzxc.todomanagement.repository.TodoRepository;
import com.iggyzxc.todomanagement.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@AllArgsConstructor
public class TodoController {

    private final TodoRepository todoRepository;
    private TodoService todoService;

    @PostMapping
    public ResponseEntity<TodoDTO> addTodo(@RequestBody TodoDTO todoDTO) {
        TodoDTO savedTodo = todoService.addTodo(todoDTO);
        return new ResponseEntity<>(savedTodo, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoDTO> getTodo(@PathVariable Long id) {
        TodoDTO todo = todoService.getTodo(id);
        return ResponseEntity.ok(todo);
    }

    @GetMapping
    public ResponseEntity<List<TodoDTO>> getAllTodos() {
        List<TodoDTO> todos = todoService.getAllTodos();
        return ResponseEntity.ok(todos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TodoDTO> updateTodo(@PathVariable Long id, @RequestBody TodoDTO todoDTO) {
        TodoDTO updatedTodo = todoService.updateTodo(id, todoDTO);
        return ResponseEntity.ok(updatedTodo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return ResponseEntity.ok("Todo successfully deleted!");
    }

    @PatchMapping("/{id}/complete")
    public ResponseEntity<TodoDTO> completeTodo(@PathVariable Long id) {
        TodoDTO patchedTodo = todoService.completeTodo(id);
        return ResponseEntity.ok(patchedTodo);
    }

    @PatchMapping("/{id}/incomplete")
    public ResponseEntity<TodoDTO> incompleteTodo(@PathVariable Long id) {
        TodoDTO patchedTodo = todoService.incompleteTodo(id);
        return ResponseEntity.ok(patchedTodo);
    }
}
