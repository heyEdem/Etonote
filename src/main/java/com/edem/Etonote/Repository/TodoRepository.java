package com.edem.Etonote.Repository;

import com.edem.Etonote.Entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findTodoByNameContains(String keyword);

//    @Query(value ="select * from courses as c where c.course_id in (select e.course_id from enrolled_in as e where e.student_id=:studentId)", nativeQuery = true)
//    List<Todo> findTodoByTodoListId(@Param("studentId") Long todoListId);
    @Query(value ="select * from todos as t where t.todo_id in (select e.todo_id from todo_lists as e where e.todo_list_id=:todoListId)", nativeQuery = true)
    List<Todo> findTodoByTodoListId(@Param("todoListId") Long todoListId);
}
