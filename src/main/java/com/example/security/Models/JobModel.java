package com.example.security.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "Job")
@Table(name="Job_table")
@Data
public class JobModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;



}
