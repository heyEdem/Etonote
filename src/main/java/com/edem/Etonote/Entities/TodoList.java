package com.edem.Etonote.Entities;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
     @OneToMany(cascade = CascadeType.PERSIST)
     private List<Todo> todos = new ArrayList<>();

     public TodoList(String listTitle, List<Todo> todos) {
          this.listTitle = listTitle;
          this.todos = todos;
     }
}
