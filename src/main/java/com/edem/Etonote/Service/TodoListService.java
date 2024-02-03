package com.edem.Etonote.Service;

import com.edem.Etonote.Entities.TodoList;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TodoListService {
    TodoList createList (TodoList list);

    List<TodoList> findAllLists();

    void deleteListById(Long listId);

    Optional<TodoList> findListById(Long listId);

    List<TodoList> findTodoListByName(String keyword);

}
