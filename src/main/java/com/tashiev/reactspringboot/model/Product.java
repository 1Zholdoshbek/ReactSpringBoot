package com.tashiev.reactspringboot.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products") // Укажите имя таблицы
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Double price;
}
