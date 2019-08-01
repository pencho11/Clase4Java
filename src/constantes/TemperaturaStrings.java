package constantes;

public enum TemperaturaStrings
{
    MENSAJE_PETICION_GRADOS("Ingrese termperatura en Centigrados a convertir en Farenheit"),
    MENSAJE_CONVERSION(" La conversion de "),
    MENSAJE_CENTIGRADOS_FARENHEIG("°C a Farenheig es "),
    FARENHEIG("°F");


    private String mensaje;

    TemperaturaStrings(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
