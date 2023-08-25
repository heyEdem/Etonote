package com.edem.Etonote.Entities;

import jakarta.persistence.*;
import lombok.*;


import java.util.List;
import java.util.Set;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Table(name ="TodoList")
@Entity
public class TodoList {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

     private Long listId;

     private String listTitle;

     @OneToMany(mappedBy = "todoList")
     private Set<Todo> todos ;

}
