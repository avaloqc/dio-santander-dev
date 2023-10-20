package me.dio.santanderDevBackend.domain.models;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "tb_languages")
public class Languages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;
    @Column(unique = true, length = 12)
    private String name;
    @Column(unique = true, length = 6)
    private String code;
    private String icon;

}
