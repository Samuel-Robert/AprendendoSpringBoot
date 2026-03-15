package dev.java10x.AprendendoSpringBoot.Pessoas;

import dev.java10x.AprendendoSpringBoot.Carros.CarroModel;
import jakarta.persistence.*;

//  Entity ele transforma uma classe em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
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

    public PessoasModel() {
    }

    public PessoasModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}