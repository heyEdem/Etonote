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
    private String note;
    private LocalDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "list_id", referencedColumnName = "listId")
    private TodoList todoList;

    public Todo(String title, String note, TodoList todoList) {
        this.title= title;
        this.note = note;
        this.todoList= todoList;
    }

}
