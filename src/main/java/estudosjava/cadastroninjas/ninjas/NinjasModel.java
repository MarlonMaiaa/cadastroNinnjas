package estudosjava.cadastroninjas.ninjas;

import estudosjava.cadastroninjas.missoes.MissoesModel;
import jakarta.persistence.*;

@Entity
@Table (name = "tb_cadastro")
public class NinjasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int idade;
    private String email;

    // @manytoone - um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn (name = "missoes_id") // Foreing Key ou chave estrangeira
    private MissoesModel missoes;

    public NinjasModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
