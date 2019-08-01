package conversion ;

import static constantes.TemperaturaEntero.CERO;

public class Temperatura
{
    private double centigrados;

    public Temperatura() {
        this.centigrados = CERO.getValor();
    }

    public double getCentigrados() {
        return centigrados;
    }

    public void setCentigrados(double centigrados) {
        this.centigrados = centigrados;
    }
}
