package net.ontec.ontecv1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "Operacion")
@Table(name = "TBL_OPERACION")
public class Operacion {

    @Id
    @Column(name = "CODOPE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqOperacion")
    @SequenceGenerator(sequenceName = "SEQ_OPERACION",allocationSize = 1,name = "seqOperacion")
    private  Long cod_ope;

    @Column(name = "NOMOPE")
    private  String nom_ope;
}
