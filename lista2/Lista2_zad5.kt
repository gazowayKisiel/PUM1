// Funkcja zamieniająca pierwszy element (head)
fun <A> setHead(lst: List<A>, item: A): List<A> {
    val resztalisty = lst.drop(1)
    return listOf(item) + resztalisty
}

fun main() {
    print("--- Lista 2 zad 5 ---\n")

    // Przykładowa lista od 1 do 5
    val lista = List(5) {it+1}      // 'it' reprezentuje indeks danego elementu
    println(setHead(lista,'x'))     // -> x,2,3,4,5

    val pustaLista = listOf<Int>()       // pusta lista
    println(setHead(pustaLista,1))  // -> 1
}