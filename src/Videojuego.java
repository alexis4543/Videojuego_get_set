public class Videojuego {
    //Atributos
    private String nombre;
    private String genero;

    //Acceso por defecto

     private String version;
     private boolean activo;

   //DEFINIMOS LOS METODOS SET
    public void setNombre(String nombre){
        if (nombre == null || nombre.isBlank()){
            System.out.println("El nombre no puede ser nulo ni un espacio en blaco");

        }else{
            this.nombre=nombre;
        }
    }

    public void setGenero(String genero){
        this.genero=genero;
    }

    public void setVersion(String version){
        if (version == null || version.isBlank()){
            System.out.println("El version no puede ser nulo ni un espacio en blaco");

        }else{
            this.version=version;
        }
    }
    public void setActivo(boolean  activo){
        this.activo=activo;
    }

    //DEFINIMOS LOS METODOS GET


    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getVersion() {
        return version;
    }

    public boolean isActivo() {
        return activo;
    }

    //metodos
    public void mostrarInformacion(){
        System.out.println("El nombre del videojuego es: "+nombre);
        System.out.println("El genero del videojuego es: "+genero);
        System.out.println("La version del videojuego es: "+version);
        System.out.println("El estado del videojuego es: " + (activo ? "encendido" : "apagado"));
    }
    public void iniciar(){
        this.activo = true;
        System.out.println("---Encendiendo videojuego---");
        //System.out.println("El videojuego " +nombre+ " se ha encendido correctamente");
    }

    void cerrar(){
        this.activo = false;
        System.out.println("---Apagando videojuego---");
        //System.out.println("El videojuego " +nombre+ " se ha apagado correctamente");
    }
    void mostrarVersion(){
        System.out.println("La version  es: "+version);
    }
}
