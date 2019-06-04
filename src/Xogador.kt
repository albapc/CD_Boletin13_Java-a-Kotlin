class Xogador(var dorsal: Int, var demarcacion: String, id: Int, edade: Int, nome: String, apelido: String) : Seleccion(id, edade, nome, apelido) {

    //var = variables de clase, el resto son heredados de la superclase

    init {

    }


    override fun viaxar() {
        println("Viaxan os xogadores...")
    }

    fun xogarPartido() {}

    fun entrenar() {}

    override fun toString(): String {
        return "Xogador: " + "dorsal= " + dorsal + ", demarcacion= " + demarcacion + " " + super.toString() + '}'
    }


    }

