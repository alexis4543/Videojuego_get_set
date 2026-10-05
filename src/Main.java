//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Videojuego vj1 = new Videojuego();
    Videojuego vj2 = new Videojuego();
    Videojuego vj3 = new Videojuego();

    vj1.nombre="FIFA";
    vj1.genero="Deportes";
    vj1.version="12.3.1";
    vj1.activo = false;

    vj2.nombre="Csgo";
    vj2.genero="Shooter";
    vj2.version="8.2";
    vj2.activo = true;


    vj3.nombre="Dying Light";
    vj3.genero="Miedo";
    vj3.version="12.0.2";
    vj3.activo = true;


    System.out.println("----DATOS VIDEOJUEGO1----");
    vj1.mostrarInformacion();
    //vj1.mostrarVersion();
    System.out.println();
    vj1.iniciar();
    vj1.mostrarInformacion();
    System.out.println();


    System.out.println("----DATOS VIDEOJUEGO2----");
    vj2.mostrarInformacion();
    //vj2.mostrarVersion();
    System.out.println();
    vj2.cerrar();
    vj2.mostrarInformacion();
    System.out.println();


    System.out.println("----DATOS VIDEOJUEGO3----");
    vj3.mostrarInformacion();
    //vj3.mostrarVersion();
    //vj3.iniciar();
    System.out.println();


}
