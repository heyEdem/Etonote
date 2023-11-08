package com.edem.Etonote.Service;

import com.edem.Etonote.Entities.Status;
import com.edem.Etonote.Entities.Todo;
import com.edem.Etonote.Entities.TodoList;
import com.edem.Etonote.Repository.TodoListRepository;
import com.edem.Etonote.Repository.TodoRepository;
import com.edem.Etonote.Service.Impl.TodoService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
    public Todo createTodo(String title, String note, Long todoListId) {
        TodoList todoList = todoListRepository.findById(todoListId).orElseThrow(()->new EntityNotFoundException("TodoList {} not found"));
        Todo todo = new Todo(title,note,todoListId);
        todo.setStatus(UNCOMPLETED);
        return repository.save(todo);
//        return repository.save(new Todo(title,status,note,todoList));
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
    public void deleteTodoById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Todo> findTodoByName(String keyword) {
        return repository.findTodoByTitleContains(keyword);
    }

    @Override
    public List<Todo> findTodoByTodoListId(Long todoListId) {
        return repository.findTodoByTodoListId(todoListId);
    }


}
