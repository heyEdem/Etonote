package com.edem.Etonote.Service;

import com.edem.Etonote.Entities.Todo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TodoService {

    Todo createTodo(String title, String note, Long todoListId);

    List <Todo> findAllTodos ();

    Optional<Todo> findTodoById(Long id);

    void deleteTodo(Todo todo);

    void markAsCompleted(Long todoId);

    List<Todo> findTodoByName(String keyword);

    List<Todo> findTodoByTodoListId(Long todoListId);

    Todo updateTodo(Todo todoDto, Long id);
}
