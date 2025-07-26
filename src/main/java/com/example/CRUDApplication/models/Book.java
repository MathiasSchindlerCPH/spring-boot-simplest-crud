package com.example.CRUDApplication.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Books")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String author;
    private int publicationYear;
    private String genre;

}
