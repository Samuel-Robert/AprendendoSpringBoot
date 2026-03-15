package dev.java10x.AprendendoSpringBoot.Pessoas;

import dev.java10x.AprendendoSpringBoot.Carros.CarroModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//  Entity ele transforma uma classe em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // OnetoMany - uma pessoa pode ter vários carros
    @OneToMany(mappedBy = "pessoa")
    private CarroModel carro;
}