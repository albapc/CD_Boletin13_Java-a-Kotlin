class Masaxista : Seleccion {

    var titulacion: String? = null
    var anosExperiencia: Int = 0

    constructor() {}

    constructor(titulacion: String, anosExperiencia: Int) : super() {
        this.titulacion = titulacion
        this.anosExperiencia = anosExperiencia
    }

    constructor(
        titulacion: String,
        anosExperiencia: Int,
        id: Int,
        edade: Int,
        nome: String,
        apelido: String
    ) : super(id, edade, nome, apelido) {
        this.titulacion = titulacion
        this.anosExperiencia = anosExperiencia
    }

    override fun viaxar() {
        println("Viaxan os xogadores...")
    }

    fun darMasaxes() {}

    override fun toString(): String {
        return "Masaxista: " + "titulacion= " + titulacion + ", anosExperiencia= " + anosExperiencia + " " + super.toString() + '}'.toString()
    }
}
