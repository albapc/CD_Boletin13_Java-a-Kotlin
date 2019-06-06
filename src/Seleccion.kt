open class Seleccion(var id: Int=0, var edade: Int=0, var nome: String="", var apelido: String=""){

    /*se ponen los valores por defecto para que el programa no nos de error al dejar campos en blanco, ya que queremos crear un
    objeto de esta clase sin que sea imprescindible asignarle valores a ninguna variable, asimismo es preferible asignarle a la
    String un valor inicial de comillas en blanco, en vez de null, ya que es recomendable no */

    init { //constructor por defecto

    }


    fun concentrarse() { //método propio de la clase
        println("Concéntrase a selección")
    }

    open fun viaxar() { //método propio de la clase y que se extenderá a las subclases que hereden de esta (de ahí lo de "open")
        println("Viaxa a selección...")
    }

    override fun toString(): String { //método toString que muestra los parámetros de la clase
        return "Selección: id= $id, edade= $edade, nome= $nome, apelido= $apelido}"
    }
}
