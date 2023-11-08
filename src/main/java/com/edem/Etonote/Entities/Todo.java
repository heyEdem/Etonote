package com.edem.Etonote.Entities;

import jakarta.persistence.*;
import lombok.*;


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
    //Todo set default value for the status on creation
    private Status status;
    private String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "list_id", referencedColumnName = "listId")
    private TodoList todoList;

    public Todo(String title, String note, Long todoListId) {
        this.title= title;
        this.note = note;
        this.todoList=todoList;
    }


}
