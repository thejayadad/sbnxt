package com.todo.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.todoapp.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
