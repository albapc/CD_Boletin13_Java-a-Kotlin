open class Seleccion(var id: Int=0, var edade: Int=0, var nome: String="", var apelido: String=""){

    //se ponen los valores por defecto para que el programa no nos de error al dejar campos en blanco

    init {

    }


    fun concentrarse() {
        println("Concéntrase a selección")
    }

    open fun viaxar() {
        println("Viaxa a selección...")
    }

    override fun toString(): String {
        return "Selección: id= $id, edade= $edade, nome= $nome, apelido= $apelido}"
    }
}
