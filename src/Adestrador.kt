//parametros de la clase Adestrador y de qué clase hereda el resto

/* Kotlin: class NombreDeLaClase(var parametro1: TipoParametro, var parametroN: TipoParametro, parametroHeredado: TipoParametro)
: NombreSuperClase(p1SuperClase, pNSuperClase) {}
 * Java: public class NombreDeLaClase extends NombreSuperClase {} (los parámetros irían en un constructor dentro de la clase)
 */

class Adestrador(var idFederacion: String, id: Int, edade: Int, nome: String, apelido: String) : Seleccion(id, edade, nome, apelido) {

    //constructor por defecto
    /* Kotlin: init {}
     * Java: public nombreClase() {} (después si fuera necesario, añadiria otro constructor con los parametros dentro, en Kotlin ya
     * estaría hecho, por defecto y parametrizado, en una única línea de código)
     * En Java también sería necesario hacer uso de los getters y los setters, cosa que en Kotlin no lo es
     */
    init {

    }


    //método heredado y sobreescrito de la clase Selección
    /* Kotlin: override fun  nombreMétodo(parametros, si fuese necesario) {}
     * Java: @Override (debajo estaría el método)
     */
    override fun viaxar() {
        println("Viaxa o adestrador...")
    }


    //métodos propios de la clase
    /* Kotlin: fun nombreMetodo(parametros si fuese necesario) {}
    * Java: tipoDeacceso TipoQueDevuelve nombreMétodo(parametros si fuese necesario) {}
    */
    fun dirixirPartido() {}

    fun dirixirAdestramento() {}


    //método toString que imprime las variables propias y heredadas de la superclase Selección
    /* Kotlin: override fun  nombreMétodo(parametros, si fuese necesario) {}
     * Java: @Override (debajo estaría el método)
     */
    override fun toString(): String {
        return "Adestrador: " + "idFederacion= " + idFederacion + " " + super.toString() + '}'
    }
}