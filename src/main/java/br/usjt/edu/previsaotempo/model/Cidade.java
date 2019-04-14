package br.usjt.edu.previsaotempo.model;

import javax.persistence.*;

@Entity
@Table(name = "CIDADE")
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CIDADE")
    private Long id;
    @Column(name = "NOME_CIDADE")
    private String nome;
    @Column(name = "LAT_CIDADE")
    private Double latitude;
    @Column(name = "LON_CIDADE")
    private Double longitude;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}
