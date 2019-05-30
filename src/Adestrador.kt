class Adestrador : Seleccion {

    var idFederacion: String? = null

    constructor() {

    }

    constructor(idFederacion: String) : super() {
        this.idFederacion = idFederacion
    }

    constructor(
        idFederacion: String,
        id: Int,
        edade: Int,
        nome: String,
        apelido: String
    ) : super(id, edade, nome, apelido) {
        this.idFederacion = idFederacion
    }

    override fun viaxar() {
        println("Viaxa o adestrador...")
    }

    fun dirixirPartido() {}

    fun dirixirAdestramento() {}

    override fun toString(): String {
        return "Adestrador: " + "idFederacion= " + idFederacion + " " + super.toString() + '}'
    }
}