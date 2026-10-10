package estudosjava.cadastroninjas.missoes;

import estudosjava.cadastroninjas.ninjas.NinjasModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeDamissao;
    private int idade;
    private String rank;

    // @OneToMany - uma missao pode ter varios ninjas
    @OneToMany (mappedBy = "missoes")
    private List <NinjasModel> ninjas;


    public MissoesModel(long id, String nome, int idade, String rank) {
        this.id = id;
        this.nomeDamissao = nome;
        this.idade = idade;
        this.rank = rank;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeDamissao() {
        return nomeDamissao;
    }

    public void setNomeDamissao(String nomeDamissao) {
        this.nomeDamissao = nomeDamissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}


