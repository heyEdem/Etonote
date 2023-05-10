package com.edem.Etonote.Entities;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Entity

public class todos {
    @Id
    private  long id;
    private boolean status;
    private long listId;
    private String note;
    private String title;

    public todos(long id, boolean status, long listId, String note, String title) {
        this.id = id;
        this.status = status;
        this.listId = listId;
        this.note = note;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getListId() {
        return listId;
    }

    public void setListId(long listId) {
        this.listId = listId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "todos{" +
                "id=" + id +
                ", status=" + status +
                ", listId=" + listId +
                ", note='" + note + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof todos todos)) return false;
        return id == todos.id && status == todos.status && listId == todos.listId && note.equals(todos.note) && title.equals(todos.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, listId, note, title);
    }
}
