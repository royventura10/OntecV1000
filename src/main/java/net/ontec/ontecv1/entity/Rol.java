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

@Entity(name = "Rol")
@Table(name = "TBL_ROL")
public class Rol {
    @Id
    @Column(name = "CODROL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqRol")
    @SequenceGenerator(sequenceName = "SEQ_ROL",allocationSize = 1,name = "seqRol")
    private Long cod_rol;

    @Column(name = "NOMROL")
    private String nom_rol;

}
