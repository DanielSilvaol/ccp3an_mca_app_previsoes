package br.usjt.edu.previsaotempo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PERIODO")
public class Periodo implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "ID_PERIODO")
    private Long id;
    @Column(name = "DIADASEMANA")
    private String diaDaSemana;
    @Column(name = "TEMPERATURAMIN")
    private Double temperaturaMin;
    @Column(name = "TEMPERATURAMAX")
    private Double temperaturaMax;
    @Column(name = "HUMIDADE")
    private Double humidade;
    @Column(name = "DISCRICAO")
    private String discricao;
    @Column(name = "LONGETUDE")
    private Double longetude;
    @Column(name = "LATETUDE")
    private Double latetude;
    @Column(name = "DATAHORA")
    private String dataHora;

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public double getLongetude() {
        return longetude;
    }

    public void setLongetude(double longetude) {
        this.longetude = longetude;
    }

    public double getLatetude() {
        return latetude;
    }

    public void setLatetude(double latetude) {
        this.latetude = latetude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public Double getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(Double temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

    public Double getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(Double temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public Double getHumidade() {
        return humidade;
    }

    public void setHumidade(Double humidade) {
        this.humidade = humidade;
    }

    public String getDiscricao() {
        return toString();
    }

    public void setDiscricao(String discricao) {
        this.discricao = discricao;
    }

    @Override
    public String toString() {
        return "Periodo{" +
                " diaDaSemana='" + diaDaSemana + '\'' +
                ", temperaturaMin=" + temperaturaMin +
                ", temperaturaMax=" + temperaturaMax +
                ", humidade=" + humidade +
                ", discricao='" + discricao + '\'' +
                ", longetude=" + longetude +
                ", latetude=" + latetude +
                ", dataHora='" + dataHora + '\'' +
                '}';
    }
}
