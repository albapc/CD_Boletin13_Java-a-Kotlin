class Xogador(var dorsal: Int, var demarcacion: String, id: Int, edade: Int, nome: String, apelido: String) : Seleccion(id, edade, nome, apelido) {
    //parametros de la clase Xogador y de qué clase hereda el resto
    //var = variables de clase, el resto son heredados de la superclase

    init { //constructor por defecto

    }


    override fun viaxar() { //método heredado
        println("Viaxan os xogadores...")
    }

    fun xogarPartido() {} //método propio de la clase

    fun entrenar() {} //método propio de la clase

    override fun toString(): String { //método toString que imprime las variables propias y heredadas de la superclase Selección
        return "Xogador: " + "dorsal= " + dorsal + ", demarcacion= " + demarcacion + " " + super.toString() + '}'
    }


    }

