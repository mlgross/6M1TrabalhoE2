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
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * @author Marcelo
 */
@Entity
@Table(name = "caminhao")
public class Caminhao implements Serializable{

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "seq_caminhao", sequenceName = "seq_caminhao_id", 
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_caminhao")
    private Integer id;
    
    @Length(max = 50, message = "O nome não pode ultrapassar {max} caracteres")
    @NotEmpty(message = "O nome deve ser informado")
    @Column(name = "nome",length = 50, nullable = false, unique = true)      
    private String nome;
    
    @Length(max = 8, message = "A placa não pode ultrapassar {max} caracteres")
    @NotEmpty(message = "A placa deve ser informado")
    @Column(name = "placa",length = 8, nullable = false, unique = true)     
    private String placa;
    
    @NotNull(message = "A quilometragem deve ser informada")
    @Column(name = "kmrodados", length = 12, nullable = false, unique = true)         
    private Integer kmrodados;
    
    @NotNull(message = "A capacidade deve ser informada")
    @Column(name = "capacidade", nullable = false, columnDefinition = "decimal(12,2)")        
    private Double capacidade;
    
    //Gerated Code
    public Caminhao() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer Id) {
        this.id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String Placa) {
        this.placa = Placa;
    }

    public Integer getKmrodados() {
        return kmrodados;
    }

    public void setKmrodados(Integer Kmrodados) {
        this.kmrodados = Kmrodados;
    }

    public Double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Double Capacidade) {
        this.capacidade = Capacidade;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.id);
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Caminhao{" + "Id=" + id + ", Nome=" + nome + ", Placa=" + placa + ", Kmrodados=" + kmrodados + ", Capacidade=" + capacidade + '}';
    }
    
    
    
    
    
}
