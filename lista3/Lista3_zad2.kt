//  Mapa parzystości
//  - tworzy mapę określającą parzystość liczb od 1 do 20 -
fun addToBoolean(): Map<Int, Boolean> {
    return (1..20)                    // tworzy zakres liczb 1..20
        .associateWith { it % 2 == 0 }      // dla każdej liczby określa czy jest parzysta
    // tworzy mapę gdzie kluczami są liczby od 1 do 20 a wartościami false albo true
}

fun main() {
    println("--- Lista 3 zad 2 ---")
    println(addToBoolean()) //  oczekiwane:  {1=false, 2=true, 3=false, 4=true, 5=false, 6=true, ...}
}