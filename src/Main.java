//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Videojuego vj1 = new Videojuego();
    Videojuego vj2 = new Videojuego();
    Videojuego vj3 = new Videojuego();

    vj1.setNombre("FIFA");
    vj1.setGenero("Deportes");
    vj1.setVersion("12.3.1");
    vj1.setActivo(false);

    vj2.setNombre("Csgo");
    vj2.setGenero("Shooter");
    vj2.setVersion("8.2");
    vj2.setActivo(true);//no lleva comillas


    vj3.setNombre("Dying Light");
    vj3.setGenero("Miedo");
    vj3.setVersion("12.0.2");
    vj3.setActivo(true);


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
