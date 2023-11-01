package ejem01_diagr_clases_proveedores;

/***********************************************************************
 * Module:  Taller.java
 * Author:  victor
 * Purpose: Defines the Class Taller
 ***********************************************************************/

import java.util.*;


public class Taller {

   private String nombre;

   private String telefono;

   private String direccion;
   
   /** @pdRoleInfo migr=no name=Pieza assc=Association_2 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Pieza> compra;
   
   /** @pdOid 31bab41f-5a88-4fc0-b813-9eb28bc5e1fc */
   public String getnombre() {
      return nombre;
   }
   
   /** @param newNombre
    * @pdOid 2126d5f9-9206-424f-83a9-825fe9f9d304 */
   public void setnombre(String newNombre) {
      nombre = newNombre;
   }
   
   /** @pdOid fe19c2e8-9610-4678-b8f6-5e0c092b5c09 */
   public String gettelefono() {
      return telefono;
   }
   
   /** @param newTelefono
    * @pdOid 0c67eb6b-d849-4ed0-8b41-c10846b3b4df */
   public void settelefono(String newTelefono) {
      telefono = newTelefono;
   }
   
   /** @pdOid 9d6f1836-2184-4166-b2b8-71c7f88eb38e */
   public String getdireccion() {
      return direccion;
   }
   
   /** @param newDireccion
    * @pdOid 1b6d5c31-d504-4fac-b3b9-3fbb8ca0e95b */
   public void setdireccion(String newDireccion) {
      direccion = newDireccion;
   }
   
   /** @pdOid a8280e59-e602-4647-bc95-288799ed09d4 */
   public Taller() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Pieza> getCompra() {
      if (compra == null)
         compra = new java.util.HashSet<Pieza>();
      return compra;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCompra() {
      if (compra == null)
         compra = new java.util.HashSet<Pieza>();
      return compra.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCompra */
   public void setCompra(java.util.Collection<Pieza> newCompra) {
      removeAllCompra();
      for (java.util.Iterator iter = newCompra.iterator(); iter.hasNext();)
         addCompra((Pieza)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPieza */
   public void addCompra(Pieza newPieza) {
      if (newPieza == null)
         return;
      if (this.compra == null)
         this.compra = new java.util.HashSet<Pieza>();
      if (!this.compra.contains(newPieza))
         this.compra.add(newPieza);
   }
   
   /** @pdGenerated default remove
     * @param oldPieza */
   public void removeCompra(Pieza oldPieza) {
      if (oldPieza == null)
         return;
      if (this.compra != null)
         if (this.compra.contains(oldPieza))
            this.compra.remove(oldPieza);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCompra() {
      if (compra != null)
         compra.clear();
   }

}