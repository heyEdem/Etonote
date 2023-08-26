package com.edem.Etonote.Service;

import com.edem.Etonote.Entities.TodoList;
import com.edem.Etonote.Repository.TodoListRepository;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;
@Slf4j
public class TodoListServiceImpl implements TodoListService{
    private final TodoListRepository repository;

    public TodoListServiceImpl(TodoListRepository repository) {
        this.repository = repository;
    }

    @Override
    public TodoList createList(TodoList todoList) {
        return repository.save(todoList);
    }

    @Override
    public List<TodoList> findAllLists() {
        return repository.findAll();
    }

    @Override
    public void deleteListById(Long listId) {
        repository.deleteById(listId);
    }

    @Override
    public Optional<TodoList> findListById(Long listId) {
        return repository.findById(listId);
    }
}
