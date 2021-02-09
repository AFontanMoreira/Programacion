/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam1a
 */
public class Circulo {
    private final double PI = 3.14;
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularLonxitude() {
        return 2 * PI * radio;
    }

    public double calcularArea() {
        return (PI * Math.pow(radio, 2));
    }
}
