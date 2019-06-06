class Adestrador(var idFederacion: String, id: Int, edade: Int, nome: String, apelido: String) : Seleccion(id, edade, nome, apelido) {
//parametros de la clase Adestrador y de qué clase hereda el resto

    init { //constructor por defecto

    }


    override fun viaxar() { //método heredado
        println("Viaxa o adestrador...")
    }

    fun dirixirPartido() {} //método propio de la clase

    fun dirixirAdestramento() {} //método propio de la clase

    override fun toString(): String { //método toString que imprime las variables propias y heredadas de la superclase Selección
        return "Adestrador: " + "idFederacion= " + idFederacion + " " + super.toString() + '}'
    }
}