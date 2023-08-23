package com.edem.Etonote.Repository;

import com.edem.Etonote.Entities.NoteList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListRepository extends JpaRepository<NoteList,Long> {
}
