package circulo;
/**
 *Clase Circulo para probas en NetBeans 
 * representa un círculo almacenando o radio e as coordenadas
 * @author uadmin
 * @version 1.0.0
 */

public class Circulo {
    private int x;
    private int y;
    private double radio;


    /**
     *Constructor para a clase Circulo que asigna valores das
     * coordenadas x, y así como valor do radio
     * @param valorX coordenada x, enteiro
     * @param valorY coordenada y, enteiro
     * @param valorRadio radio, decimal
     */

    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    /**
     * Método que permite establecer coordenada X
     * @param valorX
     */
    public void establecerX(int valorX) {
        x=valorX;
    }

    /**
     * Método que permite obter coordenadas X 
     * @return
     */
    public int obterX() {
        return x;
    }

    /**
     * Método que permite establecer coordenada Y
     * @param valorY
     */
    public void establecerY(int valorY) {
        y=valorY;
    }

    /**
     * Método que permite obter coordenadas Y
     * @return
     */
    public int obterY() {
        return y;
    }

    /**
     * Método que permite establecer o valor do radio
     * @param valorRadio
     */
    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < 0.0 ? 0.0 : valorRadio);
    }

    /**
     * Método que permite obter o radio
     * @return
     */
    public double obterRadio() {
        return radio;
    }

    /**
     * Método que calcula op diametro
     * @return
     */
    public double obterDiametro() {
        return radio * 2;
    }

    /**
     * Método que calcula o perímetro do círculo
     * @return
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * Método que calcula a área do círculo
     * @return
     */
    public double obterArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}
