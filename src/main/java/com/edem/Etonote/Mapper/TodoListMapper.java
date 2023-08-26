package com.edem.Etonote.Mapper;

import com.edem.Etonote.Dto.TodoListDto;
import com.edem.Etonote.Entities.TodoList;
import org.springframework.stereotype.Component;

@Component
public class TodoListMapper {

    public TodoList TodoListDtoToTodoList(TodoListDto listDto){
        return new TodoList();
    }

    public TodoListDto TodoListToTodoListDto (TodoList todoList){
        return new TodoListDto(
                todoList.getListId(),
                todoList.getListTitle(),
                todoList.getTodos()
        );
    }
}
