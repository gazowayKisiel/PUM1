//  Znajdowanie duplikatów
//  - funkcja znajdująca duplikaty w liście liczb całkowitych -

fun findDuplicates(list: List<Int>): List<Int> {
    val seen = mutableSetOf<Int>()       // zbiór do śledzenia unikalnych wartości
    val duplicates = mutableSetOf<Int>() // zbiór do przechowywania duplikatów

    for (num in list) {
        if (!seen.add(num)) {
            // jeśli nie dało się dodać do "seen", to znaczy -> dublikat
            duplicates.add(num)
        }
    }

    return duplicates.sorted() // zwracamy posortowaną listę duplikatów
}

fun main() {
    println("--- Lista 3 zad 2 ---")

    val lst = listOf(0, 1, 1, 1, 4, 4, 4, 9, 3, 3, 3, 3, 3, 3)
    println(findDuplicates(lst))  //    oczekiwane: [1, 3, 4]
}

