package com.edem.Etonote.Dto;

import com.edem.Etonote.Entities.Status;
import com.edem.Etonote.Entities.TodoList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TodoDto {
    private Long todoId;

    private Status status;

//    private TodoList todoList;

    private String note;

    private String title;
}
