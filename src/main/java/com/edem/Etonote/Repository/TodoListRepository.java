package com.edem.Etonote.Repository;

import com.edem.Etonote.Entities.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoListRepository extends JpaRepository<TodoList,Long> {
    List<TodoList> findTodoListByNameContains(String keyword);
}
