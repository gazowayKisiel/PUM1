// Kwadraty liczb na nieparzystych indeksach
// - funkcja zwraca kwadraty dodatnich liczb znajdujących się na nieparzystych indeksach -

fun evenPositiveSquare(list: List<Int>): List<Int> {
    return list.filterIndexed { index, value -> //  przegląda listę i pozwala używać indeksu orazwartości elementu do filtrowania
        index % 2 != 0 && value > 0  // warunek: nieparzysty indeks ORAZ wartość dodatnia
    }.map { it * it }                // podnosi wartość do kwadratu
}

fun main() {
    println("--- Lista 3 zad 5 ---")
    val input = listOf(1, 2, 3, 5, -6, -1, -1, 2, 3)
    println(evenPositiveSquare(input)) // oczekiwane: [4, 25, 4]
}