var estadoGlobal = "Estado 1"

fun funcion1(a: Boolean, b: Boolean) {
    if (a && estadoGlobal == "Estado 1") {
        println("Estado actual: $estadoGlobal")
        estadoGlobal = "Estado 2"
        println("Estado actual: $estadoGlobal")
    } else {
        estadoGlobal = "Estado 1"
        println("Estado actual: $estadoGlobal")
    }
}

fun funcion2(a: Boolean, b: Boolean) {
    if (estadoGlobal == "Estado 2") {
        if (b) {
            estadoGlobal = "Estado 3 (FIN)"
            val fin = 0
            println("Estado actual: $estadoGlobal codigo: $fin")
        } else {
            estadoGlobal = "Estado 4"
            println("Estado actual: $estadoGlobal")
            estadoGlobal = "Estado 1"
            println("Estado actual: $estadoGlobal")
        }
    } else {
        estadoGlobal = "Estado 1"
        println("Estado actual: $estadoGlobal")
    }
}

fun main() {
    println("--- Test 1: ---")
    funcion1(true, true)
    funcion2(true, false)

    println("\n--- Test 2: ---")
    estadoGlobal = "Estado 1" // Reiniciamos el estado para el siguiente test
    funcion1(true, true)
    funcion2(false, false)

    println("\n--- Test 3:---")
    estadoGlobal = "Estado 1" // Reiniciamos el estado para el siguiente test
    funcion1(true, false)
    funcion2(false, true)

    println("\n--- Test 4:---")
    estadoGlobal = "Estado 1" // Reiniciamos el estado para el siguiente test
    funcion1(false, true)

    println("\n--- Test 5:---")
    estadoGlobal = "Estado 1" // Reiniciamos el estado para el siguiente test
    funcion1(true, true)
    funcion2(true, true)


}