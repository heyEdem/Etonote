package com.edem.Etonote.Dto;

import com.edem.Etonote.Entities.Todo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TodoListDto {
    private Long listId;
    private String listTitle;
    private Set<Todo> todoSet;
}
