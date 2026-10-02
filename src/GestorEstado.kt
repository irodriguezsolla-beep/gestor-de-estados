

var estado = "Estado 1"

fun gestor_Estados(a: Boolean, b: Boolean) {
    if (a && estado=="Estado 1") {
        println("Estado actual: $estado")
        estado = "Estado 2"
        println("Estado actual: $estado")
        if (b && estado=="Estado 2") {
            estado = "Estado 3 (FIN)"
            var fin = 0
            println("Estado actual: $estado codigo: $fin")
        }else {
            estado = "Estado 4"
            println("Estado actual: $estado")
            estado = "Estado 1"
            println("Estado actual: $estado")
            }
        } else {
            estado = "Estado 1"
            println("Estado actual: $estado")
        }
    }
fun main(){
    gestor_Estados(true,false)
    println("-----------")
    gestor_Estados(false,true)
    println("-----------")
    gestor_Estados(true,true)
    println("-----------")
    gestor_Estados(false,false)
}

