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

@Entity(name = "Usuario")
@Table(name = "TBL_USUARIO")
class Usuario {
    @Id
    @Column(name = "CODUSU")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqUsuario")
    @SequenceGenerator(sequenceName = "SEQ_USUARIO",allocationSize = 1,name = "seqUsuario")
    private Long cod_usu;

    @Column(name = "NOMUSU")
    private String nom_usu;

    @Column(name = "CLAVEUSU")
    private String clave_usu;

    @Column(name = "ESTADOUSU")
    private String estado_usu;



}
