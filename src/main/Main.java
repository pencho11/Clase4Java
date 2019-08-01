package main ;

import conversion.TemperaturaLogica;

import javax.swing.*;

import static constantes.TemperaturaStrings.*;

public class Main
{
    public static void main(String[] args)
    {
        TemperaturaLogica temperaturaLogica = new TemperaturaLogica() ;

        String valorTemperatura = JOptionPane.showInputDialog(null, MENSAJE_PETICION_GRADOS.getMensaje() );
        temperaturaLogica.setCentigrados(Double.parseDouble(valorTemperatura)) ;

        JOptionPane.showMessageDialog(null, MENSAJE_CONVERSION.getMensaje() + temperaturaLogica.getCentigrados() +
                        MENSAJE_CENTIGRADOS_FARENHEIG.getMensaje()+ temperaturaLogica.calcularTemperaturaFarenheit()
                + FARENHEIG.getMensaje());

    }
}
