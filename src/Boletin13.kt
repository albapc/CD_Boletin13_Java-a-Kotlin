
object Boletin13 { //clase main
    @JvmStatic
    fun main(args: Array<String>) {
        val xog1 = Xogador(15, "30", 120, 30, "Pepe", "Garcia")
        val adest = Adestrador("A50", 40, 25, "Manolo", "Pérez")
        val masax = Masaxista("Fisioterapeuta", 10, 39, 45, "María", "Rodríguez")
        val xog2 = Seleccion()

        println(xog1.toString())
        println(adest.toString())
        println(masax.toString())

        xog1.viaxar()
        adest.viaxar()
        masax.viaxar()
        xog2.viaxar()
    }
}
