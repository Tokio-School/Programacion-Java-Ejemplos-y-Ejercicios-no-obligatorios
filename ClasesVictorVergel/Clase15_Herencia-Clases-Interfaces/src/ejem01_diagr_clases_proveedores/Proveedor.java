package ejem01_diagr_clases_proveedores;
/***********************************************************************

 * Module:  Proveedor.java
 * Author:  victor
 * Purpose: Defines the Class Proveedor
 ***********************************************************************/

import java.util.*;


public class Proveedor {

   private String nombre;
   private String nif;
   private String telefono;
   public Pieza[] piezas;
   

   public String gettelefono() {
      return telefono;
   }
   

   public void settelefono(String newTelefono) {
      telefono = newTelefono;
   }
   
   public String getnombre() {
      return nombre;
   }
   
   public void setnombre(String newNombre) {
      nombre = newNombre;
   }
   
   public String getnif() {
      return nif;
   }
   
   public void setnif(String newNif) {
      nif = newNif;
   }
   
   public Proveedor() {
      // TODO: implement
   }
   
   

  /* public java.util.Collection<Pieza> getVende() {
      if (vende == null)
         vende = new java.util.HashSet<Pieza>();
      return vende;
   }
   
   /** @pdGenerated default iterator getter */
  /* public java.util.Iterator getIteratorVende() {
      if (vende == null)
         vende = new java.util.HashSet<Pieza>();
      return vende.iterator();
   }*/
   
   /** @pdGenerated default setter
     * @param newVende */
 /*  public void setVende(java.util.Collection<Pieza> newVende) {
      removeAllVende();
      for (java.util.Iterator iter = newVende.iterator(); iter.hasNext();)
         addVende((Pieza)iter.next());
   }-*/
   
   /** @pdGenerated default add
     * @param newPieza */
  /* public void addVende(Pieza newPieza) {
      if (newPieza == null)
         return;
      if (this.vende == null)
         this.vende = new java.util.HashSet<Pieza>();
      if (!this.vende.contains(newPieza))
         this.vende.add(newPieza);
   }*/
   
   /** @pdGenerated default remove
     * @param oldPieza */
  /* public void removeVende(Pieza oldPieza) {
      if (oldPieza == null)
         return;
      if (this.vende != null)
         if (this.vende.contains(oldPieza))
            this.vende.remove(oldPieza);
   }*/
   
   /** @pdGenerated default removeAll */
  /* public void removeAllVende() {
      if (vende != null)
         vende.clear();
   }*/

}