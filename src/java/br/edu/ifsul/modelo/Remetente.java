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
import org.hibernate.validator.constraints.br.CPF;

/**
 * 
 * @author Marcelo
 */
@Entity
@Table(name = "remetente")
public class Remetente implements Serializable{
    
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "seq_remetente", sequenceName = "seq_remetente_id", 
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_remetente")
    private Integer id;
    
    @CPF(message = "CPF inválido")
    @Length(min = 14,max = 14,message = "CPF inválido")
    @NotEmpty(message = "O CPF deve ser informado")
    @Column(name = "cpf", length = 14,nullable = false)    
    private String cpf;

    @NotEmpty(message = "O nome deve ser informado")
    @Length(max = 50, message = "O  nome não deve ultrapassar {max} caracteres")
    @Column(name = "nome",length = 50, nullable = false)
    private String nome;
    
    @Length(max = 14,message = "O telefone não deve ter mais que {max} caracteres")
    @NotEmpty(message = "O telefone deve ser informado")
    @Column(name = "telefone",length = 14, nullable = false)  
    private String telefone;
    
    @NotEmpty(message = "O endereço deve ser informado")
    @Length(max = 50, message = "O  endereço não deve ultrapassar {max} caracteres")
    @Column(name = "endereco",length = 50, nullable = false) 
    private String endereco;

    @NotEmpty(message = "O CEP deve ser informado")
    @Length(max = 9, message = "O  CEP não deve ultrapassar {max} caracteres")
    @Column(name = "cep",length = 9, nullable = false)      
    private String cep;

    public Remetente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final Remetente other = (Remetente) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Remetente{" + "id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + ", cep=" + cep + '}';
    }
    
    
}
