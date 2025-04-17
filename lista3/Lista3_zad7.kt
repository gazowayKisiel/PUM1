// Grupowanie stringów
//  - funkcja grupuje stringi o parzystej długości według ich pierwszej litery -

fun srt(list: List<String>): List<Pair<String, List<String>>> {
    return list.filter { it.length % 2 == 0 } // Filtruje stringi parzystej długości
        .groupBy { it.first().toString() }   // Grupuje po pierwszej literze
        .toList()                            // Konwertuje mapę do listy par
        .sortedBy { it.first }               // Sortuje wyniki po pierwszej literze
}

fun main() {
    println("--- Lista 3 zad 7 ---")

    val fruits = listOf("cherry", "blueberry", "citrus", "apple", "apricot", "banana", "coconut")
    println(srt(fruits))    //  oczekiwane: [(b, [banana]), (c, [cherry, citrus])]
}