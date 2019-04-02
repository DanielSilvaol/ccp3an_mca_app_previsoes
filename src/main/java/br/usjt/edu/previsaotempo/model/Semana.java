package br.usjt.edu.previsaotempo.model;

import javax.persistence.*;


@Entity
@Table(name = "SEMANA")
public class Semana {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SEM")
    private Long id;
    @Column(name = "DIA")
    private String dia;

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
