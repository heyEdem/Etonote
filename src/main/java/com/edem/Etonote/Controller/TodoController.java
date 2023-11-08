package com.edem.Etonote.Controller;

import com.edem.Etonote.Entities.Todo;
import com.edem.Etonote.Entities.TodoList;
import com.edem.Etonote.Service.TodoListServiceImpl;
import com.edem.Etonote.Service.TodoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
public class TodoController {

    private final TodoServiceImpl todoService;
    private final TodoListServiceImpl listService;

    public TodoController(TodoServiceImpl todoService, TodoListServiceImpl listService) {
        this.todoService = todoService;
        this.listService = listService;
    }

    @GetMapping("/")
    public String getAllTodos(Model model){
        listService.findAllLists();
        return "index";
    }


    @GetMapping("/{listId}")
    public String getById(@PathVariable("listId") Long listId, Model model){
        Optional<TodoList> list = listService.findListById(listId);
        List<Todo> todos = todoService.findTodoByTodoListId(list.get().getListId());
        model.addAttribute("todos",todos);
        return "single-list";
    }
    //TODO: Controller methods
}
