package com.edem.Etonote.Controller;

import com.edem.Etonote.Entities.Todo;
import com.edem.Etonote.Service.TodoServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoRestController {
    private final TodoServiceImpl service;

    public TodoRestController(TodoServiceImpl service) {
        this.service = service;
    }


    @GetMapping("/todo")
    public List<Todo> getTodos(){
        return service.findAllTodos();
    }

    @PostMapping("/todo")
    public Todo createNew(String title, String note, Long todoListId){
        return service.createTodo(title,note,todoListId);
    }

    @PutMapping("/todo/{id}")
    public Todo updateNew(@RequestBody Todo todoDto,@PathVariable("id") Long id){
        return service.updateTodo(todoDto,id);
    }
}
