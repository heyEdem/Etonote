package com.edem.Etonote.Service;

import com.edem.Etonote.Entities.Todo;
import com.edem.Etonote.Repository.TodoRepository;
import com.edem.Etonote.Service.Impl.TodoService;

import java.util.List;
import java.util.Optional;


public class TodoServiceImpl implements TodoService {

    private TodoRepository repository;

    public TodoServiceImpl(TodoRepository repository) {
        this.repository = repository;
    }


    @Override
    public Todo createTodo(Todo todo) {
        return repository.save(todo);
    }

    @Override
    public List<Todo> findAllTodos() {
        return repository.findAll();
    }

    @Override
    public Optional <Todo> findTodoById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteTodoById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Todo> findTodoByName(String keyword) {
        return repository.findTodoByNameContains(keyword);
    }
}
