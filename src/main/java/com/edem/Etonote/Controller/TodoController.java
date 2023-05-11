package com.edem.Etonote.Controller;

import com.edem.Etonote.Entities.Todo;
import com.edem.Etonote.Repository.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/#/home")
public class TodoController {
    private final TodoRepository todoRepository;
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(" ")
    public List <Todo> getAllTodos(){
        return todoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Todo getById(@PathVariable Long id){
        return todoRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Todo not found"));
    }


    @PostMapping("")
    public void create (@Validated @RequestBody Todo todo ){
        todoRepository.save(todo);
    }


}
