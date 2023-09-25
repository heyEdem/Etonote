package com.edem.Etonote.Controller;
import com.edem.Etonote.Entities.Todo;
import com.edem.Etonote.Repository.TodoRepository;
import com.edem.Etonote.Service.TodoListServiceImpl;
import com.edem.Etonote.Service.TodoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/home")
public class TodoController {
    private TodoServiceImpl service;

    public TodoController(TodoServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    public List <Todo> getAllTodos(){
        return service.findAllTodos();
    }


    @GetMapping("/{id}")
    public Todo getById(@PathVariable Long id){
        return service.findTodoById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Todo not found"));
    }


    @PostMapping
    public Todo create(@RequestBody Todo todo ){
        return service.createTodo(todo);
    }


    @PutMapping("/{id}")
    public void update (@RequestBody Todo todo, @PathVariable Long id ){
        service.createTodo(todo);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id, @RequestBody Todo todo){
         service.deleteTodoById(id);
    }

}
