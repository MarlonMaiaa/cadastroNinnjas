package estudosjava.cadastroninjas.missoes;

import estudosjava.cadastroninjas.ninjas.NinjasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
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





}


