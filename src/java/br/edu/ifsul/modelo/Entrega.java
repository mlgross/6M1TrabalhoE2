package br.edu.ifsul.modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author Marcelo
 */
@Entity
@Table(name = "entrega")
public class Entrega implements Serializable{
    
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "seq_entrega", sequenceName = "seq_entrega_id", 
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_entrega")    
    private Integer manifesto;
    
    @NotNull(message = "A quantia de volumes deve ser informada")
    @Column(name = "volumes", length = 12, nullable = false, unique = true)      
    private Integer volumes;

    @NotNull(message = "O campo de verificação de entrega deve ser informado")
    @Column(name = "foientregue", nullable = false)    
    private Boolean foientregue;
    
    @NotNull(message = "A data da emissao deve ser informada")
    @Column(name = "dataemissao", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataEmissao;
    
    @NotNull(message = "A data da entrega deve ser informada")
    @Column(name = "dataentrega", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataEntrega;    
    
    @NotNull(message = "O valor deve ser informada")
    @Column(name = "valor", nullable = false, columnDefinition = "decimal(12,2)")    
    private Double valor;
    
    //Gerated Code
    public Entrega() {
    }

    public Integer getVolumes() {
        return volumes;
    }

    public void setVolumes(Integer Volumes) {
        this.volumes = Volumes;
    }

    public Boolean isFoientregue() {
        return foientregue;
    }

    public void setFoientregue(Boolean Foientregue) {
        this.foientregue = Foientregue;
    }

    public Calendar getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Calendar DataEmissao) {
        this.dataEmissao = DataEmissao;
    }

    public Calendar getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Calendar DataEntrega) {
        this.dataEntrega = DataEntrega;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double Valor) {
        this.valor = Valor;
    }

    public Integer getManifesto() {
        return manifesto;
    }

    public void setManifesto(Integer manifesto) {
        this.manifesto = manifesto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.manifesto);
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
        final Entrega other = (Entrega) obj;
        if (!Objects.equals(this.manifesto, other.manifesto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entrega{" + "manifesto=" + manifesto + ", Volumes=" + volumes + ", Foientregue=" + foientregue + ", DataEmissao=" + dataEmissao + ", DataEntrega=" + dataEntrega + ", Valor=" + valor + '}';
    }
    
}
