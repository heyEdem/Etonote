package com.edem.Etonote.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NoteList {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

     private Long listId;

     private String listTitle;

     private List <Todo> todos = new ArrayList<>();

}
