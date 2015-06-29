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
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * @author Marcelo
 */
@Entity
@Table(name = "viagem")
public class Viagem implements Serializable{
    
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "seq_viagem", sequenceName = "seq_viagem_id", 
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_viagem")
    private Integer id;
    
    @NotEmpty(message = "O nome da rota  deve ser informado")
    @Length(max = 50, message = "O  nome da rota não deve ultrapassar {max} caracteres")
    @Column(name = "nome",length = 50, nullable = false)
    private String nomeRota;
    
    @NotNull(message = "O valor deve ser informada")
    @Column(name = "valor", nullable = true, columnDefinition = "decimal(12,2)")    
    private Double despesasAdicionais;

    @NotNull(message = "A data de saida deve ser informada")
    @Column(name = "datasaida", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)    
    private Calendar dataSaida;
    
    @NotNull(message = "A data de retorno deve ser informada")
    @Column(name = "dataretorno", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)    
    private Calendar dataRetorno;
    
    @NotNull(message = "Deve ser informado o status da viagem ser informado")
    @Column(name = "emtransito", nullable = false)
    private Boolean emTransito;
    
    //gerated code
    public Viagem() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeRota() {
        return nomeRota;
    }

    public void setNomeRota(String nomeRota) {
        this.nomeRota = nomeRota;
    }

    public Double getDespesasAdicionais() {
        return despesasAdicionais;
    }

    public void setDespesasAdicionais(Double despesasAdicionais) {
        this.despesasAdicionais = despesasAdicionais;
    }

    public Calendar getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Calendar dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Calendar getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Calendar dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public Boolean isEmTransito() {
        return emTransito;
    }

    public void setEmTransito(Boolean emTransito) {
        this.emTransito = emTransito;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
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
        final Viagem other = (Viagem) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Viagem{" + "id=" + id + ", nomeRota=" + nomeRota + ", despesasAdicionais=" + despesasAdicionais + ", dataSaida=" + dataSaida + ", dataRetorno=" + dataRetorno + ", emTransito=" + emTransito + '}';
    }
    
    
    
    
}
