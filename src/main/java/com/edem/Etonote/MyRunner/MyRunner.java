//package com.edem.Etonote.MyRunner;
//
//import com.edem.Etonote.Entities.Todo;
//import com.edem.Etonote.Entities.TodoList;
//import com.edem.Etonote.Service.TodoListServiceImpl;
//import com.edem.Etonote.Service.TodoServiceImpl;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import static com.edem.Etonote.Entities.Status.COMPLETE;
//import static com.edem.Etonote.Entities.Status.UNCOMPLETED;
//
//@Component
//public class MyRunner implements CommandLineRunner {
//    private TodoServiceImpl todoService;
//    private TodoListServiceImpl todoListService;
//
//    public MyRunner(TodoServiceImpl todoService, TodoListServiceImpl todoListService) {
//        this.todoService = todoService;
//        this.todoListService = todoListService;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        TodoList list1 = todoListService.createList("KOD");
//        TodoList list2 = todoListService.createList("4YEO");
//        TodoList list3= todoListService.createList("TOS");
//
//        Todo todo1 = todoService.createTodo("Photograph","Fell in love through photograph",list1.getListId());
//        Todo todo2 = todoService.createTodo("FIENDS","Gimme drinks, Gimme smoke",list1.getListId());
//        Todo todo3 = todoService.createTodo("Vile mentality","Nigga play me, never",list2.getListId());
//        Todo todo4 = todoService.createTodo("Amari","I never fall out with the bros",list3.getListId());
//        Todo todo5 = todoService.createTodo("My Life","It's my life now, my life",list3.getListId());
//    }
//}
