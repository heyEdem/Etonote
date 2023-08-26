package com.edem.Etonote.Entities;

import jakarta.persistence.*;
import lombok.*;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long todoId;

    private Status status;

    @ManyToOne
    @JoinColumn(name = "TodoList_Id", nullable = false)
    private TodoList todoList;


    private String note;

    private String title;




}
