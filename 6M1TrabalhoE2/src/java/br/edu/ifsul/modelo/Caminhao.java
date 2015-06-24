package br.edu.ifsul.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 * @author Marcelo Luis Gross
 */
@Entity
@Table(name = "caminhao")
public class Caminhao implements Serializable{

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "seq_caminhao", sequenceName = "seq_caminhao_id", 
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_caminhao")
    
    private String Nome;
    
    private String Placa;
    
    private Integer Kmrodados;
    
    private Double Capacidade;
    
    //Gerated Code
    public Caminhao() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public Integer getKmrodados() {
        return Kmrodados;
    }

    public void setKmrodados(Integer Kmrodados) {
        this.Kmrodados = Kmrodados;
    }

    public Double getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(Double Capacidade) {
        this.Capacidade = Capacidade;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.Nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caminhao other = (Caminhao) obj;
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Caminhao{" + "Nome=" + Nome + ", Placa=" + Placa + ", Kmrodados=" + Kmrodados + ", Capacidade=" + Capacidade + '}';
    }
    
    
    
    
}
