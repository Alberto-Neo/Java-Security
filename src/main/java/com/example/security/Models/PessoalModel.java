package com.example.security.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity(name = "Pessoa")
@Table(name = "Pessoa_TBL")



@Data
public class PessoalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    @OneToMany
    private List<JobModel> jobs;


}
