package com.example.clientservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;



public class TodoDto {

    private Integer todoId;
    private String desc;
    private boolean isCompleted;

    public TodoDto() {
        super();
    }

    public TodoDto(Integer todoId, String desc, boolean isCompleted) {
        super();
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

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

}