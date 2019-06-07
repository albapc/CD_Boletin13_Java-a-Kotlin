
object Boletin13 { //clase main
    @JvmStatic
    fun main(args: Array<String>) {
        //PARA KOTLIN NO ES NECESARIO TERMINAR CADA SENTENCIA CON PUNTO Y COMA (;), AL CONTRARIO QUE EN JAVA QUE ES IMPRESCINDIBLE

        //creamos los objetos de cada clase

        /* Kotlin: val nombreObjeto = nombreClase(parametros, si tiene)
        * Java: nombreClase nombreObjeto = nombreClase(parametros, si tiene);
        */
        val xog1 = Xogador(15, "30", 120, 30, "Pepe", "Garcia")
        val adest = Adestrador("A50", 40, 25, "Manolo", "Pérez")
        val masax = Masaxista("Fisioterapeuta", 10, 39, 45, "María", "Rodríguez")
        val xog2 = Seleccion()

        //mostramos el toString en pantalla

        /* Kotlin: println(contenidoAMostrarEnPantalla)
        * Java: System.out.println(contenidoAMostrarEnPantalla)
        */
        println(xog1.toString())
        println(adest.toString())
        println(masax.toString())

        //llamamos a los métodos de las clases de cada objeto (aquí sería igual que en Java, excepto el primer punto que se comenta)
        xog1.viaxar()
        adest.viaxar()
        masax.viaxar()
        xog2.viaxar()
    }
}
