//parametros de la clase Xogador y de qué clase hereda el resto
//var = variables de clase, el resto son heredados de la superclase

/* Kotlin: class NombreDeLaClase(var parametro1: TipoParametro, var parametroN: TipoParametro, parametroHeredado: TipoParametro)
: NombreSuperClase(p1SuperClase, pNSuperClase) {}
 * Java: public class NombreDeLaClase extends NombreSuperClase {} (los parámetros irían en un constructor dentro de la clase)
 */
class Xogador(var dorsal: Int, var demarcacion: String, id: Int, edade: Int, nome: String, apelido: String) : Seleccion(id, edade, nome, apelido) {


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
        println("Viaxan os xogadores...")
    }


    //métodos propios de la clase
    /* Kotlin: fun nombreMetodo(parametros si fuese necesario) {}
    * Java: tipoDeacceso TipoQueDevuelve nombreMétodo(parametros si fuese necesario) {}
    */
    fun xogarPartido() {}

    fun entrenar() {}


    //método toString que imprime las variables propias y heredadas de la superclase Selección
    /* Kotlin: override fun  nombreMétodo(parametros, si fuese necesario) {}
     * Java: @Override (debajo estaría el método)
     */
    override fun toString(): String {
        return "Xogador: " + "dorsal= " + dorsal + ", demarcacion= " + demarcacion + " " + super.toString() + '}'
    }


    }

