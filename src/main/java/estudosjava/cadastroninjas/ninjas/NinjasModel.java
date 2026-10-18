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
    @Column (name = "id")
    private long id;
    @Column (name = "name")
    private String nome;
    @Column (name = "idade")
    private int idade;

    @Column(name = "email",unique = true)
    private String email;

    // @manytoone - um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key ou chave estrangeira
    private MissoesModel missoes;




}

