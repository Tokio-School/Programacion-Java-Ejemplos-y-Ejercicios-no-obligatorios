/***********************************************************************
 * Module:  Pieza.java
 * Author:  victor
 * Purpose: Defines the Class Pieza
 ***********************************************************************/

import java.util.*;

/** @pdOid db2ede6d-d4ac-4b8d-988d-311614a484fa */
public class Pieza {
   /** @pdOid 4c438627-80b7-4e71-9397-7c20ad35dde8 */
   private int codigo;
   /** @pdOid bbbe5385-f326-4e7b-a03e-b31d3d622755 */
   private int precio_compra;
   /** @pdOid a80f5efa-9136-4f11-a487-e34358a7518c */
   private int precio_venta;
   
   /** @pdOid f943e99f-a1fe-4133-a6d5-9d377c909f62 */
   public int getcodigo() {
      return codigo;
   }
   
   /** @param newCodigo
    * @pdOid 4d316f79-5d09-46a8-9c50-beb91c7a17d8 */
   public void setcodigo(int newCodigo) {
      codigo = newCodigo;
   }
   
   /** @pdOid 8152a323-92e7-46b3-969f-2301961bd4d0 */
   public int getprecio_compra() {
      return precio_compra;
   }
   
   /** @param newPrecio_compra
    * @pdOid 7c919d7e-454d-410c-879b-6c400dd7609b */
   public void setprecio_compra(int newPrecio_compra) {
      precio_compra = newPrecio_compra;
   }
   
   /** @pdOid 3dd9e6ef-0a52-4d00-8f49-8e2d0cd5e8dc */
   public int getprecio_venta() {
      return precio_venta;
   }
   
   /** @param newPrecio_venta
    * @pdOid f0c6c82f-6247-4f71-a3ea-fa49267dbe2b */
   public void setprecio_venta(int newPrecio_venta) {
      precio_venta = newPrecio_venta;
   }
   
   /** @pdOid 1bd5604b-ed7d-4903-99c0-6eccc8eb7892 */
   public Pieza() {
      // TODO: implement
   }

}