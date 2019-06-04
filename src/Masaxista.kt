class Masaxista(var titulacion: String, var anosExperiencia: Int, id: Int, edade: Int, nome: String, apelido: String) : Seleccion(id, edade, nome, apelido) {

    init {

    }

    override fun viaxar() {
        println("Viaxan os xogadores...")
    }

    fun darMasaxes() {}

    override fun toString(): String {
        return "Masaxista: " + "titulacion= " + titulacion + ", anosExperiencia= " + anosExperiencia + " " + super.toString() + '}'.toString()
    }
}
