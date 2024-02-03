package com.edem.Etonote.Controller;

import com.edem.Etonote.Entities.Todo;
import com.edem.Etonote.Entities.TodoList;
import com.edem.Etonote.Service.TodoListServiceImpl;
import com.edem.Etonote.Service.TodoServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etonote")
public class TodoRestController {
    private final TodoServiceImpl service;
    private final TodoListServiceImpl listService;

    public TodoRestController(TodoServiceImpl service, TodoListServiceImpl listService) {
        this.service = service;
        this.listService = listService;
    }

    @GetMapping("/list")
    public List<TodoList> getTodoLists(){
        return listService.findAllLists();
    }

    @PostMapping("/list/save")
    public TodoList createTodo(@RequestBody TodoList list){
        return listService.createList(list);
    }

    @DeleteMapping("/list/{id}/delete")
    public void deleteList(@PathVariable("id") Long id){
        listService.deleteListById(id);
    }

    /** TODOS **/
    @GetMapping("/todo")
    public List<Todo> getTodos(){
        return service.findAllTodos();
    }

    @PostMapping("/todo/{listId}/save")
    public Todo createNew(@RequestBody Todo todo, @PathVariable("listId")Long listId){
        return service.createTodo(todo,listId);
    }

    @PutMapping("/todo/{id}")
    public Todo updateNew(@RequestBody Todo todoDto,@PathVariable("id") Long id){
        return service.updateTodo(todoDto,id);
    }

    @PutMapping("/{todoId}/complete")
    public void markAsCompleted(@PathVariable("todoId") Long todoId){
        service.markAsCompleted(todoId);
    }


}
