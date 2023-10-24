/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
public class Smartphone implements Camara,ReproductorDeMusica,NavegadorDeInternet {
    
    public String marca;
    public String modelo;
    public Smartphone(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    @Override
    public void grabarVideo(){
        System.out.print("grabar el video");
    }
    @Override
    public void tomarFoto(){
        System.out.print("tomar la foto");
    }
    @Override
    public void Reproducir(){
       System.out.print("reproducir");
    }

    @Override
    public void Detener() {
        System.out.print("detener");
    }

    @Override
    public void buscar() {
        System.out.print("buscar");
    }

    @Override
    public void actualizar() {
        System.out.print("actualizar ventana");
    }
}
