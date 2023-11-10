package com.edem.Etonote.Controller;

import com.edem.Etonote.Entities.Todo;
import com.edem.Etonote.Entities.TodoList;
import com.edem.Etonote.Service.TodoListServiceImpl;
import com.edem.Etonote.Service.TodoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;


@Controller
public class TodoController {

    private final TodoServiceImpl todoService;
    private final TodoListServiceImpl listService;

    public TodoController(TodoServiceImpl todoService, TodoListServiceImpl listService) {
        this.todoService = todoService;
        this.listService = listService;
    }

    @GetMapping("/")
    public String getAllTodos(Model model){
        List<TodoList> lists = listService.findAllLists();
        model.addAttribute("allLists",lists);
        return "index";
    }


    @GetMapping("/view/{listId}")
    public String getById(@PathVariable("listId") Long listId, Model model){
        Optional<TodoList> list = listService.findListById(listId);
        List<Todo> todos = todoService.findTodoByTodoListId(listId);
        model.addAttribute("todos",todos);
        return "listview";
    }

    @DeleteMapping("/view/{listId}/{todoId}")
    public String deleteTodo(@PathVariable("todoId") Long todoId){
        todoService.deleteTodo(todoService.findTodoById(todoId).get());
        return "redirect:/view/{listId}";
    }
    //TODO: Controller methods
}
