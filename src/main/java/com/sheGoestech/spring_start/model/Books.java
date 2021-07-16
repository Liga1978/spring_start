package com.sheGoestech.spring_start.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Table(name = "book")
@Entity(name = "book")

@Data
public class Books {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @NotNull(groups = UpdateValidation.class)
    private Long id;
    @NotBlank(message = "Bookname is required", groups = {CreateValidation.class, UpdateValidation.class})
    private String bookName;
    @NotBlank(message = "author is required", groups = {CreateValidation.class, UpdateValidation.class})
    private String author;
    @NotBlank(message = "genre is required", groups = {CreateValidation.class, UpdateValidation.class})
    private String genre;


}
