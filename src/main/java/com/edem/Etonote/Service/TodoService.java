package com.edem.Etonote.Service;

import com.edem.Etonote.Entities.Todo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TodoService {

    Todo createTodo(Todo todo);

    List<Todo> findAllTodos ();

    Optional<Todo> findTodoById(Long id);

    void deleteTodoById(Long id);
}
