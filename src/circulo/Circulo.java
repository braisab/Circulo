package circulo;
/*
 * Clase Circulo para probas en NetBeans 
 */
public class Circulo {
    private int x;
    private int y;
    private double radio;

    /*
     * Constructor para a clase Circulo que asigna valores das
     * coordenadas x, y así como valor do radio
     */
    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    public void establecerX(int valorX) {
        x=valorX;
    }

    public int obterX() {
        return x;
    }

    public void establecerY(int valorY) {
        y=valorY;
    }

    public int obterY() {
        return y;
    }

    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < 0.0 ? 0.0 : valorRadio);
    }

    public double obterRadio() {
        return radio;
    }

    public double obterDiametro() {
        return radio * 2;
    }

    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    public double obterArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}
