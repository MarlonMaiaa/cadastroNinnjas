package estudosjava.cadastroninjas.ninjas;

import estudosjava.cadastroninjas.missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int idade;
    private String email;

    // @manytoone - um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key ou chave estrangeira
    private MissoesModel missoes;




}

