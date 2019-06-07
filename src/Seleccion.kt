open class Seleccion(var id: Int=0, var edade: Int=0, var nome: String="", var apelido: String=""){

    /*se ponen los valores por defecto para que el programa no nos de error al dejar campos en blanco, ya que queremos crear un
    objeto de esta clase sin que sea imprescindible asignarle valores a ninguna variable, asimismo es preferible asignarle a la
    String un valor inicial de comillas en blanco, en vez de null, ya que es recomendable no */

    /* Kotlin: open class NombreClase(parametros) {}
    * Java: public class NombreClase {} (los parámetros irían en un constructor dentro de la clase)
    * */



    //constructor por defecto
    /* Kotlin: init {}
     * Java: public nombreClase() {} (después si fuera necesario, añadiria otro constructor con los parametros dentro, en Kotlin ya
     * estaría hecho, por defecto y parametrizado, en una única línea de código)
     * En Java también sería necesario hacer uso de los getters y los setters, cosa que en Kotlin no lo es
     */
    init {

    }


    //método propio de la clase

    /* Kotlin: fun nombreMétodo(parametros, si fuese necesario) {}
     * Java: public TipoQueDevuelve nombreMétodo(parametros, si fuese necesario) {}
     */

    fun concentrarse() {
        println("Concéntrase a selección")
    }

    //método propio de la clase y que se extenderá a las subclases que hereden de esta (de ahí lo de "open")

    /* Kotlin: open fun nombreMétodo(parametros, si fuese necesario) {} -> Por defecto, en Kotlin da error si se intenta utilizar un
     * método originario de una clase en otra, hay que decir explícitamente que es una clase pública (open)
     * Java: igual que en el punto anterior, no varía
     */
    open fun viaxar() {
        println("Viaxa a selección...")
    }

    //método toString que muestra los parámetros de la clase y que se sobreescribe

    /* Kotlin: override fun  nombreMétodo(parametros, si fuese necesario) {}
     * Java: @Override (debajo estaría el método)
     */
    override fun toString(): String {
        return "Selección: id= $id, edade= $edade, nome= $nome, apelido= $apelido}"
    }
}
