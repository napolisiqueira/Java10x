package br.com.felipenapolisiqueira.SistemaDeNinjas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "table_ninja")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ninja_id")
    private UUID id;
    @Column(name = "ninja_name", length = 50, nullable = false)
    private String name;
    @Column(name = "ninja_mail", length = 50, nullable = false)
    private String email;
    @Column(name = "ninja_year", length = 3, nullable = false)
    private int years;

}
