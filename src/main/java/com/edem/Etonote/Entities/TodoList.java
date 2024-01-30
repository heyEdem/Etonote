package com.edem.Etonote.Entities;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TodoList {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long listId;

     private String listTitle;

     private LocalDateTime createdAt;
     @OneToMany
     private Set<Todo> todos = new HashSet<>();

     public TodoList(String listTitle, Set<Todo> todos) {
          this.listTitle = listTitle;
          this.todos = todos;
     }
}
