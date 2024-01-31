package com.edem.Etonote.Service;

import com.edem.Etonote.Entities.Status;
import com.edem.Etonote.Entities.Todo;
import com.edem.Etonote.Entities.TodoList;
import com.edem.Etonote.Repository.TodoListRepository;
import com.edem.Etonote.Repository.TodoRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static com.edem.Etonote.Entities.Status.UNCOMPLETED;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository repository;
    private final TodoListRepository todoListRepository;


    @Override
    public Todo createTodo(Todo todo, Long listId) {
        var list  = todoListRepository.findById(listId);
        list.get().getTodos().add(todo);
        todo.setCreatedAt(LocalDateTime.now());
        return repository.save(todo);
    }

    @Override
    public List<Todo> findAllTodos() {
        log.info("fetching all Todos");
        return repository.findAll();
    }

    @Override
    public Optional <Todo> findTodoById(Long id) {
        log.info("found Todo with id {}:", id);
        return repository.findById(id);
    }

    @Override
    public void deleteTodo(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void markAsCompleted(Long todoId) {
        Todo completedTodo = repository.findById(todoId).orElseThrow(()->new EntityNotFoundException("Todo Not Found"));
        completedTodo.setStatus(Status.COMPLETE);
    }

    @Override
    public List<Todo> findTodoByName(String keyword) {
        return repository.findTodoByTitleContains(keyword);
    }

    @Override
    public List<Todo> findTodoByTodoListId(Long todoListId) {
        return repository.findTodoByTodoListId(todoListId);
    }

    @Override
    public Todo updateTodo(Todo todoDto, Long id) {
        Optional<Todo> result = repository.findById(id);
        Todo todo = null;

        if (result.isPresent()){
            todo.setTodoId(id);
            todo.setTitle(todoDto.getTitle());
            todo.setStatus(UNCOMPLETED);
            todo.setCreatedAt(LocalDateTime.now());
            todo.setContent(todoDto.getContent());
        }
        return null;
    }

}
