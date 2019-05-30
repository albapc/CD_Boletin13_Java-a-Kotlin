open class Seleccion {

    var id: Int = 0
    var edade: Int = 0
    var nome: String? = null
    var apelido: String? = null

    constructor() {}

    constructor(id: Int, edade: Int, nome: String, apelido: String) {
        this.id = id
        this.edade = edade
        this.nome = nome
        this.apelido = apelido
    }

    fun concentrarse() {
        println("Concéntrase a selección")
    }

    open fun viaxar() {
        println("Viaxa a selección")
    }

    override fun toString(): String {
        return "Selección: id= $id, edade= $edade, nome= $nome, apelido= $apelido}"
    }
}
