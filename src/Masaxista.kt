class Masaxista(var titulacion: String, var anosExperiencia: Int, id: Int, edade: Int, nome: String, apelido: String) : Seleccion(id, edade, nome, apelido) {
    //parametros de la clase Masaxista y de qué clase hereda el resto


    init { //constructor por defecto

    }

    override fun viaxar() { //método heredado
        println("Viaxan os xogadores...")
    }

    fun darMasaxes() {} //método propio de la clase

    override fun toString(): String { //método toString que imprime las variables propias y heredadas de la superclase Selección
        return "Masaxista: " + "titulacion= " + titulacion + ", anosExperiencia= " + anosExperiencia + " " + super.toString() + '}'.toString()
    }
}
