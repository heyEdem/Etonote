package com.edem.Etonote.Service;

import com.edem.Etonote.Entities.TodoList;
import com.edem.Etonote.Repository.TodoListRepository;

import java.util.List;

public class TodoListServiceImpl implements TodoListService{
    private TodoListRepository repository;

    public TodoListServiceImpl(TodoListRepository repository) {
        this.repository = repository;
    }

    @Override
    public TodoList createList(TodoList todoList) {
        return null;
    }

    @Override
    public List<TodoList> findAllLists() {
        return null;
    }

    @Override
    public void deleteListById(Long listId) {

    }

    @Override
    public TodoList findListById(Long listId) {
        return null;
    }
}
