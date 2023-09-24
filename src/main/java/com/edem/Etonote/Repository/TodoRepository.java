package com.edem.Etonote.Repository;

import com.edem.Etonote.Entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findTodoByNameContains(String keyword);
}
