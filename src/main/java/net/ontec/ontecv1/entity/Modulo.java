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



@Entity(name = "Modulo")
@Table(name = "TBL_MODULO")
public class Modulo {

    @Id
    @Column(name = "CODMODU")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqModulo")
    @SequenceGenerator(sequenceName = "SEQ_MODULO",allocationSize = 1,name = "seqModulo")
    private Long cod_modu;

    @Column(name = "NOMMODU")
    private String nommodu;
}
