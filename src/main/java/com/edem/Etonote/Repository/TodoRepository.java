package com.edem.Etonote.Repository;

import com.edem.Etonote.Entities.List;
import com.edem.Etonote.Entities.Todos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todos, Long> {

}
