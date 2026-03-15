package dev.java10x.AprendendoSpringBoot.Carros;

import dev.java10x.AprendendoSpringBoot.Pessoas.PessoasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_carro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String placa;
    private String modelo;
    private String marca;
    private int ano;
    private int valor;

    // Many to One - um carro só pode ter uma pessoa(dono)
    @ManyToOne
    @JoinColumn(name = "pessoa_id")// foreign key/chave estrangeira
    private PessoasModel pessoa;

}
