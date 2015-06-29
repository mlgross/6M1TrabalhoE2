package br.edu.ifsul.modelo;

import java.io.Serializable;
import java.util.Calendar;
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
    Integer Volumes;

    @NotNull(message = "O campo de verificação de entrega deve ser informado")
    @Column(name = "foientregue", nullable = false)    
    Boolean Foientregue;
    
    @NotNull(message = "A data da emissao deve ser informada")
    @Column(name = "dataemissao", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    Calendar DataEmissao;
    
    @NotNull(message = "A data da entrega deve ser informada")
    @Column(name = "dataentrega", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    Calendar DataEntrega;    
    
    @NotNull(message = "O valor deve ser informada")
    @Column(name = "valor", nullable = false, columnDefinition = "decimal(12,2)")    
    Double Valor;
    
    
    
    
    
}
