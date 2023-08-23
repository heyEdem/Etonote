package com.edem.Etonote.Repository;

import com.edem.Etonote.Entities.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<TodoList,Long> {
}
