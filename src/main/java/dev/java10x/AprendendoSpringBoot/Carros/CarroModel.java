package dev.java10x.AprendendoSpringBoot.Carros;

import dev.java10x.AprendendoSpringBoot.Pessoas.PessoasModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_carro")
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

    public CarroModel() {
    }

    public CarroModel(String modelo, String marca, String placa, int ano, int valor) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.ano = ano;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
