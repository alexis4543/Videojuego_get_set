public class Videojuego {
    //Atributos
    public String nombre;
    public String genero;

    //Acceso por defecto

    String version;
    boolean activo;

    //metodos
    public void mostrarInformacion(){
        System.out.println("El nombre del videojuego es: "+nombre);
        System.out.println("El genero del videojuego es: "+genero);
        System.out.println("La version del videojuego es: "+version);
        System.out.println("El estado del videojuego es: " + (activo ? "encendido" : "apagado"));
    }
    public void iniciar(){
        activo = true;
        System.out.println("---Encendiendo videojuego---");
        //System.out.println("El videojuego " +nombre+ " se ha encendido correctamente");
    }

    void cerrar(){
        activo = false;
        System.out.println("---Apagando videojuego---");
        //System.out.println("El videojuego " +nombre+ " se ha apagado correctamente");
    }
    void mostrarVersion(){
        System.out.println("La version  es: "+version);
    }
}
