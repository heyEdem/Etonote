package com.edem.Etonote.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "todo_id")
    private Long todoId;
    private String title;
    private Status status;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime completedAt;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "list_id", referencedColumnName = "listId")
//    private TodoList todoList;


    public Todo(String title, String content, TodoList todoList) {
        this.title= title;
        this.content = content;
//        this.todoList= todoList;
    }

}
