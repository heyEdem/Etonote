package com.edem.Etonote.Mapper;

import com.edem.Etonote.Dto.TodoListDto;
import com.edem.Etonote.Entities.TodoList;
import org.springframework.stereotype.Component;

@Component
public class TodoListMapper {

    public TodoList todoListDtoToTodoList(TodoListDto listDto){
        return null;
    }

    public TodoListDto todoListToTodoListDto (TodoList todoList){
        return TodoListDto.builder()
                .listId(todoList.getListId())
                .listTitle(todoList.getListTitle())
                .build();
    }
}
