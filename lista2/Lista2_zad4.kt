// Funkcja przesuwająca ostatni element na początek listy
fun <A> tailToHead(lst: List<A>): List<A> {
    if (lst.isEmpty())              // wyjątek - lista jest pusta
        throw Error("Pusta lista")  // przerywa program i wyrzyca błąd

    val ostatni = lst.last()
    val resztaListy = lst.dropLast(1)
    return listOf(ostatni) + resztaListy
}

fun main() {
    print("--- Lista 2 zad 4 ---\n")

    // Przykładowa lista od 1 do 5
    val lista = List(5) {it+1}      // 'it' reprezentuje indeks danego elementu
    println(tailToHead(lista))           // -> 5,1,2,3,4

    val pustaLista = listOf<Int>()       // sprawdzanie wyjątku - pusta lista
    println(tailToHead(pustaLista))      // -> error
}