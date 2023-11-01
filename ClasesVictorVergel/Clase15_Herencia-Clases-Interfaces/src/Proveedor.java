/***********************************************************************
 * Module:  Proveedor.java
 * Author:  victor
 * Purpose: Defines the Class Proveedor
 ***********************************************************************/

import java.util.*;

/** @pdOid 66d37732-04f2-4f74-b3e2-15594bdc45e9 */
public class Proveedor {
   /** @pdOid e7bfde30-e735-4a8f-990f-258c83c82971 */
   private String nombre;
   /** @pdOid 0be4c9d1-b9a0-41a7-88cb-37daff99adb9 */
   private String nif;
   /** @pdOid 1738a590-c0bf-466e-95e2-5ec4e093462a */
   private String telefono;
   
   /** @pdRoleInfo migr=no name=Pieza assc=Association_1 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Pieza> vende;
   
   /** @pdOid 0df8137b-a9a1-4f38-8b96-8fc015e3dc69 */
   public String gettelefono() {
      return telefono;
   }
   
   /** @param newTelefono
    * @pdOid 6a85f55f-47dd-43dc-b52c-2688cf6b8fac */
   public void settelefono(String newTelefono) {
      telefono = newTelefono;
   }
   
   /** @pdOid c4fe4106-7b0b-4620-a547-5322e61de943 */
   public String getnombre() {
      return nombre;
   }
   
   /** @param newNombre
    * @pdOid c37b8f99-02fd-4f3e-a47e-ffdae94ba6dc */
   public void setnombre(String newNombre) {
      nombre = newNombre;
   }
   
   /** @pdOid 2924bfc1-5cf6-46be-b9f2-85d8178ff1d5 */
   public String getnif() {
      return nif;
   }
   
   /** @param newNif
    * @pdOid e243d249-5464-49d9-a7c4-12df9014f00c */
   public void setnif(String newNif) {
      nif = newNif;
   }
   
   /** @pdOid becafec5-82d6-48af-9825-6260baa0eb3a */
   public Proveedor() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Pieza> getVende() {
      if (vende == null)
         vende = new java.util.HashSet<Pieza>();
      return vende;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorVende() {
      if (vende == null)
         vende = new java.util.HashSet<Pieza>();
      return vende.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newVende */
   public void setVende(java.util.Collection<Pieza> newVende) {
      removeAllVende();
      for (java.util.Iterator iter = newVende.iterator(); iter.hasNext();)
         addVende((Pieza)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPieza */
   public void addVende(Pieza newPieza) {
      if (newPieza == null)
         return;
      if (this.vende == null)
         this.vende = new java.util.HashSet<Pieza>();
      if (!this.vende.contains(newPieza))
         this.vende.add(newPieza);
   }
   
   /** @pdGenerated default remove
     * @param oldPieza */
   public void removeVende(Pieza oldPieza) {
      if (oldPieza == null)
         return;
      if (this.vende != null)
         if (this.vende.contains(oldPieza))
            this.vende.remove(oldPieza);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllVende() {
      if (vende != null)
         vende.clear();
   }

}