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
 * @author Marelo
 */
@Entity
@Table(name = "motorista")
public class Motorista implements Serializable {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "seq_motorista", sequenceName = "seq_motorista_id", 
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_motorista")
    private Integer id;

    @Length(max = 50, message = "O nome não pode ultrapassar {max} caracteres")
    @NotEmpty(message = "O nome deve ser informado")
    @Column(name = "nome", length = 50, nullable = false)
    private String Nome;

    @NotNull(message = "O salário deve ser informado")
    @Column(name = "salario", nullable = false, columnDefinition = "decimal(12,2)")
    private Double Salario;

    @Column(name = "cnh", length = 2,nullable = false)    
    private Character CNH;

    @NotNull(message = "A permição deve deve ser informado")
    @Column(name = "cargaperigosas", nullable = false)
    private Boolean CargasPerigosas;
    

    /**
     * Gerated Code 
     */
    public Motorista() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }

    public Character getCNH() {
        return CNH;
    }

    public void setCNH(Character CNH) {
        this.CNH = CNH;
    }

    public Boolean isCargasPerigosas() {
        return CargasPerigosas;
    }

    public void setCargasPerigosas(Boolean CargasPerigosas) {
        this.CargasPerigosas = CargasPerigosas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final Motorista other = (Motorista) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Motorista{" + "id=" + id + ", Nome=" + Nome + ", Salario=" + Salario + ", CNH=" + CNH + ", CargasPerigosas=" + CargasPerigosas + '}';
    }
    

}
