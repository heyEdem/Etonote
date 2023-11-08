package com.edem.Etonote.Service.Impl;

import com.edem.Etonote.Entities.Status;
import com.edem.Etonote.Entities.Todo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TodoService {

    Todo createTodo(String title, String note, Long todoListId);

    List<Todo> findAllTodos ();

    Optional<Todo> findTodoById(Long id);

    void deleteTodoById(Long id);

    List<Todo> findTodoByName(String keyword);

    List<Todo> findTodoByTodoListId(Long todoListId);

}
