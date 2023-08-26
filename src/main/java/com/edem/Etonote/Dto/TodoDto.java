package com.edem.Etonote.Dto;

import com.edem.Etonote.Entities.Status;
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
    private String note;
    private String title;
}
