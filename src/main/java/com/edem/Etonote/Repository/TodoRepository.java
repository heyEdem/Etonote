package com.edem.Etonote.Repository;

import com.edem.Etonote.Entities.Status;
import com.edem.Etonote.Entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findTodoByTitleContains(String keyword);

    List <Todo> findByStatusOrderByCreatedAt(Status status);

    @Query(value ="select * from todos as t where t.todo_id in (select e.todo_id from todo_lists as e where e.todo_list_id=:todoListId)", nativeQuery = true)
    List<Todo> findTodoByTodoListId(@Param("todoListId") Long todoListId);
}
