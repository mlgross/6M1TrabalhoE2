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
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CNPJ;

/**
 * 
 * @author Marcelo
 */
@Entity
@Table(name = "destinatario")
public class Destinatario implements Serializable {
    
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "seq_destinatario", sequenceName = "seq_destinatario_id", 
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_destinatario")    
    private Integer id;
    
    @CNPJ(message = "CNPJ inválido")
    @NotEmpty(message = "CNPJ não pode ser nulo")    
    @Column(name = "cnpj", length = 18, nullable = false)      
    private String Cnpj ;
    
    @Length(max = 50, message = "O nome não pode ultrapassar {max} caracteres")
    @NotEmpty(message = "O nome deve ser informado")
    @Column(name = "nome",length = 50, nullable = false, unique = true)          
    private String Nome;
    
    @NotEmpty(message = "O endereço deve ser informado")
    @Length(max = 50, message = "O  endereço não deve ultrapassar {max} caracteres")
    @Column(name = "endereco",length = 50, nullable = false)    
    private String Endereco;
    
    @Length(max = 14,message = "O telefone não deve ter mais que {max} caracteres")
    @NotEmpty(message = "O telefone deve ser informado")
    @Column(name = "telefone",length = 14, nullable = false)        
    private String Telefone;
    
    @NotEmpty(message = "O cep deve ser informado")
    @Length(max = 9, message = "O  cep não deve ultrapassar {max} caracteres")
    @Column(name = "cep",length = 9, nullable = false)  
    private String Cep;
    
    //Gerated Code
    public Destinatario() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Destinatario other = (Destinatario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Destinatario{" + "id=" + id + ", Cnpj=" + Cnpj + ", Nome=" + Nome + ", Endereco=" + Endereco + ", Telefone=" + Telefone + ", Cep=" + Cep + '}';
    }
    
    
            
}
