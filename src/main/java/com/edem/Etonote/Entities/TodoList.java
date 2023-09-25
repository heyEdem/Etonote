package com.edem.Etonote.Entities;

import jakarta.persistence.*;
import lombok.*;


import java.util.HashSet;
import java.util.Set;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "todo_list")
@Entity
public class TodoList {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

     private Long listId;

     private String listTitle;

     @OneToMany(mappedBy = "todoList",fetch = FetchType.LAZY)
     private Set<Todo> todos = new HashSet<>();

}
