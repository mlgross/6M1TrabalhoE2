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
    private Integer Id;
    
    @Length(max = 50, message = "O nome não pode ultrapassar {max} caracteres")
    @NotEmpty(message = "O nome deve ser informado")
    @Column(name = "nome",length = 50, nullable = false, unique = true)      
    private String Nome;
    
    @Length(max = 8, message = "A placa não pode ultrapassar {max} caracteres")
    @NotEmpty(message = "A placa deve ser informado")
    @Column(name = "placa",length = 8, nullable = false, unique = true)     
    private String Placa;
    
    @NotNull(message = "A quilometragem deve ser informada")
    @Column(name = "kmrodados", length = 12, nullable = false, unique = true)         
    private Integer Kmrodados;
    
    @NotNull(message = "A capacidade deve ser informada")
    @Column(name = "capacidade", nullable = false, columnDefinition = "decimal(12,2)")        
    private Double Capacidade;
    
    //Gerated Code
    public Caminhao() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
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
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.Id);
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
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Caminhao{" + "Id=" + Id + ", Nome=" + Nome + ", Placa=" + Placa + ", Kmrodados=" + Kmrodados + ", Capacidade=" + Capacidade + '}';
    }
    
    
    
    
    
}
