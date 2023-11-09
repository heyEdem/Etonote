package com.edem.Etonote.Service;

import com.edem.Etonote.Entities.Todo;
import com.edem.Etonote.Entities.TodoList;
import com.edem.Etonote.Repository.TodoListRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
@Slf4j
public class TodoListServiceImpl implements TodoListService {
    private final TodoListRepository repository;
    private TodoServiceImpl todoService;

    public TodoListServiceImpl(TodoListRepository repository, TodoServiceImpl todoService) {
        this.repository = repository;
        this.todoService = todoService;
    }


    @Override
    public TodoList createList(String title) {
        return repository.save(new TodoList(title));
    }

    @Override
    public List<TodoList> findAllLists() {
        return repository.findAll();
    }


    @Override
    public void deleteListById(Long listId) {
        Optional<TodoList> list = findListById(listId);

//        for(Todo todo: list.get().getTodos()){
//            todoService.deleteTodoById(todo.getTodoId());
//        }
        repository.deleteById(listId);
    }

    @Override
    public Optional<TodoList> findListById(Long listId) {
       return repository.findById(listId);
    }

    @Override
    public List<TodoList> findTodoListByName(String keyword) {
        return repository.findTodoListsByListTitleContains(keyword);
    }

}
