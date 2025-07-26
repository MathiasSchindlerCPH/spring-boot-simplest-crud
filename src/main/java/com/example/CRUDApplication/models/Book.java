package com.example.CRUDApplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="Books")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Book {

    private Long id;
    private String title;
    private String author;

}
