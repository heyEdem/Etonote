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
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "todo_id")
    private Long todoId;

    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "todo_lists" , joinColumns = {@JoinColumn(name = "todo_list_id", nullable = false)})
    private TodoList todoList;


    private String note;

    private String title;




}
