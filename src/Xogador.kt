class Xogador : Seleccion {

    var dorsal: Int = 0
    var demarcacion: String? = null

    constructor() {

    }

    constructor(dorsal: Int, demarcacion: String) : super() {
        this.dorsal = dorsal
        this.demarcacion = demarcacion
    }

    constructor (
        dorsal: Int,
        demarcacion: String,
        id: Int,
        edade: Int,
        nome: String,
        apelido: String
    ) : super(id, edade, nome, apelido) {
        this.dorsal = dorsal
        this.demarcacion = demarcacion
    }

    override fun viaxar() {
        println("Viaxan os xogadores...")
    }

    fun xogarPartido() {}

    fun entrenar() {}

    override fun toString(): String {
        return "Xogador: " + "dorsal= " + dorsal + ", demarcacion= " + demarcacion + " " + super.toString() + '}';
    }


    }

