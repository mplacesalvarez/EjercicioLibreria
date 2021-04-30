package com.codigomain;
import libreriaIN_OUT.*;
public class Main {

    public static void main(String[] args) {
  /*
       Consola objetoConsloa = new Consola();
       objetoConsloa.visualizar("Hola");
       Ventana objetoVentana = new Ventana();
       objetoVentana.visualizar("Adios");
    */
        InterfaceMetodosComunes miSalida,misalida2,misalida3,miEntrada1,miEntrada2;
        miSalida=FactoriaDeSalidas.getProductoSalida(FactoriaDeSalidas.CONSOLA);
        miSalida.visualizar("Hola");
        misalida2=FactoriaDeSalidas.getProductoSalida(FactoriaDeSalidas.VENTANA);
        misalida2.visualizar("Adios");
        misalida3=FactoriaDeSalidas.getProductoSalida(FactoriaDeSalidas.IMPRESORA);
        misalida3.visualizar("Imprimiendo por impresora");
        miEntrada1= FactoriadeEntradas.getProductoEntrada(FactoriadeEntradas.CONSOLA);
        miEntrada1.introducirDatos();
        miEntrada2=FactoriadeEntradas.getProductoEntrada(FactoriadeEntradas.VENTANA);
        miEntrada2.introducirDatos();
    }
}
