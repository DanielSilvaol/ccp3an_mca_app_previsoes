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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false,name = "ID_SEM",foreignKey = @ForeignKey(name="FK_SEMANA_PERIODO"))
    private Semana diaDaSemana;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false,name = "id_cidade",foreignKey = @ForeignKey(name = "FK_tb_periodo_tb_cidade"))
    private Cidade cidade;
    @Column(name = "TEMPERATURAMIN")
    private Double temperaturaMin;
    @Column(name = "TEMPERATURAMAX")
    private Double temperaturaMax;
    @Column(name = "HUMIDADE")
    private Double humidade;
    @Column(name = "DISCRICAO")
    private String discricao;
    @Column(name = "DATAHORA")
    private String dataHora;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Semana getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(Semana diaDaSemana) {
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
                " diaDaSemana='" + diaDaSemana.getDia() + '\'' +
                ", temperaturaMin=" + temperaturaMin +
                ", temperaturaMax=" + temperaturaMax +
                ", humidade=" + humidade +
                ", discricao='" + discricao + '\'' +
                ", longetude=" + cidade.getLongitude() +
                ", latetude=" + cidade.getLatitude() +
                ", dataHora='" + dataHora + '\'' +
                '}';
    }
}
