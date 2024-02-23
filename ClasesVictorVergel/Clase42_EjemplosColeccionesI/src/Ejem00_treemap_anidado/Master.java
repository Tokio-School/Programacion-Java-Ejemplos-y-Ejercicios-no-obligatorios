package Ejem00_treemap_anidado;
public enum Master {

    JAVA("JAVA", "Máster en programación con Java"),
    ANDROID("ANDROID", "Máster en programación con Android");    

    private String nombre;
    private String abreviatura;  
  
    Master(String abreviatura, String nombre) {
        this.abreviatura = abreviatura;
        this.nombre = nombre;
    }
    public String getAbreviatura() {
        return abreviatura;
    }
    public String getNombre() {
        return nombre;
    }

    
}
