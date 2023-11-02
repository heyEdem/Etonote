package com.edem.Etonote.Controller;

import com.edem.Etonote.Entities.Todo;
import com.edem.Etonote.Service.TodoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/home")
@RequiredArgsConstructor
public class TodoController {

    private final TodoServiceImpl service;

    @GetMapping
    public String getAllTodos(Model model){
        List<Todo> todos  = service.findAllTodos();
        model.addAttribute("todos",todos);
        return "index.";
    }


    @GetMapping("/{id}")
    public String getById(@PathVariable Long id){
        Todo todo = service.findTodoById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Todo not found"));
        return "single-todo";
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
