package com.example.todoservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    private Integer todoId;
    private String desc;
    @JsonProperty
    private boolean isCompleted;
    
    public Todo() {
    	super();
    }

    public Todo(Integer todoId, String desc, boolean isCompleted) {
    	this.todoId = todoId;
        this.desc = desc;
        this.isCompleted = isCompleted;
    }

    public Integer getTodoId() {
        return todoId;
    }

    public void setTodoId(Integer todoId) {
        this.todoId = todoId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}