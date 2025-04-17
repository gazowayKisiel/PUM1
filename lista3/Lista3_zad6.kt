// Generowanie permutacji
// - generuje wszystkie możliwe permutacje listy liczb -
fun perm(list: List<Int>): List<List<Int>> {
    // warunek końca rekurencji: lista jednoelementowa -> zwracamy ją samą
    if (list.size == 1) return listOf(list)

    // lista permutacji
    val permutations = mutableListOf<List<Int>>()

    // iterowanie po każdym elemencie
    for (i in 0..<list.size) {
        val first = list[i]
        val remaining = list.filterIndexed { index, _ -> index != i }  // tworzy podlistę bez 'first'

        // dla pozostałych elementów rekurencyjnie generuje permutacje
        val subPermutations = perm(remaining)

        // dodaje 'first' na początek każdej permutacji
        subPermutations.forEach {
            permutations.add(listOf(first) + it)
        }
    }

    return permutations
}

fun main() {
    println("--- Lista 3 zad 6 ---")

    println(perm(listOf(1, 2, 3)))
    // oczekiwane: [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
}
