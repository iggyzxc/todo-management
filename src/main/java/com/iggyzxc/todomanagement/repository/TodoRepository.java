package com.iggyzxc.todomanagement.repository;

import com.iggyzxc.todomanagement.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
