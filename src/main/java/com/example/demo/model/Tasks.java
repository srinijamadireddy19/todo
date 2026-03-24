package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.CreatedDate;
import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "tasks")
public class Tasks {
    @Id
    private String id;

    private String title;
    private String description;
    private boolean completed;

    @CreatedDate 
    private Date createdAt;

}