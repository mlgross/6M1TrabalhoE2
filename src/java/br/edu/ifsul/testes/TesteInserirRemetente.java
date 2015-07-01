
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Remetente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Marcelo
 */
public class TesteInserirRemetente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("TrabalhoPULocal");
        EntityManager em = emf.createEntityManager();
        Remetente r = new Remetente();
//        r.setId(1);
        r.setNome("teste");
        r.setCpf("001.253.600-88");
        r.setCep("99060-380");
        r.setEndereco("Av Brasil 68");
        r.setTelefone("(55) 3123-8794");
        em.getTransaction().begin();
        em.persist(r);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}
