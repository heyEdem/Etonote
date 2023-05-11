package com.edem.Etonote.Entities;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Entity
public class List {

    @Id
     Long id;
     String title;
     Todos todos;

    public List(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof List list)) return false;
        return id == list.id && title.equals(list.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public String toString() {
        return "list{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
