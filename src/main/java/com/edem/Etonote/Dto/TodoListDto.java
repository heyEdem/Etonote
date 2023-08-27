package com.edem.Etonote.Dto;

import com.edem.Etonote.Entities.Todo;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoListDto {
    private Long listId;
    private String listTitle;
    private Set<Todo> todoSet;
}
