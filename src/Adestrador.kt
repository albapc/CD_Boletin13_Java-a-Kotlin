class Adestrador(var idFederacion: String, id: Int, edade: Int, nome: String, apelido: String) : Seleccion(id, edade, nome, apelido) {


    init {

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