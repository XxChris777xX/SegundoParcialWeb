package org.gerdoc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "LOGIN")
public class Login
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name = "pASWORD")
    private Long pasword;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "EDAD")
    private Integer edad;
}