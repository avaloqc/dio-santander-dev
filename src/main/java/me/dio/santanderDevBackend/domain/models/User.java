package me.dio.santanderDevBackend.domain.models;

import java.util.List;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; 
    
    @Column(name="email", nullable = false, unique = true, length = 45)
    private String email;
    private String date_of_birth;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Follow> follows;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Stat> stats;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Achievement> achievements;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Languages> languages;

}