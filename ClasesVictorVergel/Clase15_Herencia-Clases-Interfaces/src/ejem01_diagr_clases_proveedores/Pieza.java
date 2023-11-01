package ejem01_diagr_clases_proveedores;

/***********************************************************************

 * Module:  Pieza.java
 * Author:  victor
 * Purpose: Defines the Class Pieza
 ***********************************************************************/

import java.util.*;


public class Pieza {

   private int codigo;

   private int precio_compra;

   private int precio_venta;
   

   public int getcodigo() {
      return codigo;
   }
   

   public void setcodigo(int newCodigo) {
      codigo = newCodigo;
   }
   

   public int getprecio_compra() {
      return precio_compra;
   }
   

   public void setprecio_compra(int newPrecio_compra) {
      precio_compra = newPrecio_compra;
   }
   

   public int getprecio_venta() {
      return precio_venta;
   }
   

   public void setprecio_venta(int newPrecio_venta) {
      precio_venta = newPrecio_venta;
   }
   

   public Pieza() {
      // TODO: implement
   }

}