public class Ventana {
    private double alto;
    private double ancho;
    private double porcentajeApertura;

    public Ventana() {
    }

    public Ventana(double alto, double ancho, double porcentajeApertura) {
        this.alto = alto;
        this.ancho = ancho;
        this.porcentajeApertura = porcentajeApertura;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        if (alto >= 50 && alto <= 300) {
            this.alto = alto;
        } else {
            System.out.println("La altura es invalida");
        }
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (ancho >= 50 && ancho <= 250) {
            this.ancho = ancho;
        } else {
            System.out.println("El ancho es invalido");
        }
    }

    public double getPorcentajeApertura() {
        return porcentajeApertura;
    }

    public void setPorcentajeApertura(double porcentajeApertura) {
        if (porcentajeApertura >= 0 && porcentajeApertura <= 100) {
            this.porcentajeApertura = porcentajeApertura;
        } else {
            System.out.println("La apertura no es valida");
        }
    }

    @Override
    public String toString() {
        return "Ventana{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", porcentajeApertura=" + porcentajeApertura +
                '}';
    }

    public void abrir(double porcentaje) {
        this.porcentajeApertura = porcentajeApertura;
    }

    public boolean cerrar(double porcentajeCerrado) {

        boolean resultado;
        double Resta = porcentajeApertura-porcentajeCerrado;
        porcentajeApertura = Resta;
        if(Resta >0){
            resultado=true;
        }else {
            resultado=false;
        }

        if(resultado==true){
        System.out.println("El porcentaje de apertura es de " +Resta+"%");
        } else{
        System.out.println("La ventana está cerrada");
        }
        return resultado;

    }
}


