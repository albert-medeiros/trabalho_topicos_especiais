package trabalho.teii.trabalho.model.entity.ponto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Ponto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date data;
    private double horario;

    public Ponto() {}

    public Ponto(Date data, double horario) {
        this.data = data;
        this.horario = horario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }
}
