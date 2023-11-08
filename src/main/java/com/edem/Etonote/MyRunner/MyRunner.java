package com.edem.Etonote.MyRunner;

import com.edem.Etonote.Entities.Todo;
import com.edem.Etonote.Entities.TodoList;
import com.edem.Etonote.Service.TodoListServiceImpl;
import com.edem.Etonote.Service.TodoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static com.edem.Etonote.Entities.Status.COMPLETE;

@Component
public class MyRunner implements CommandLineRunner {
    private TodoServiceImpl todoService;
    private TodoListServiceImpl todoListService;

    public MyRunner(TodoServiceImpl todoService, TodoListServiceImpl todoListService) {
        this.todoService = todoService;
        this.todoListService = todoListService;
    }

    @Override
    public void run(String... args) throws Exception {

        TodoList list1 = todoListService.createList("Urgent");
        TodoList list2 = todoListService.createList("Urgent");
        TodoList list3= todoListService.createList("Urgent");

        Todo todo1 = todoService.createTodo("DIY","Do it yourself",COMPLETE,list1.getListId());
        Todo todo2 = todoService.createTodo("DIY","Do it yourself",COMPLETE,list2.getListId());
        Todo todo3 = todoService.createTodo("DIY","Do it yourself",COMPLETE,list3.getListId());
    }
}
