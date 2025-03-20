// Funkcja sprawdzająca, czy lista jest posortowana zgodnie z podanym porządkiem
fun <A> isSorted(lst: List<A>, order: (A, A) -> Boolean): Boolean {
    // przechodzenie przez liste i sprawdzanie każdej sąsiadującej pary
    for (i in 0 until lst.size - 1) {
        if (!order(lst[i], lst[i + 1])) {
            return false
        }
    }
    return true
}

fun main() {
    print("--- Lista 2 zad 3 ---\n")

    println(isSorted(listOf(1, 2, 3, 4)) { i: Int, j: Int -> i < j })   // true

    println(isSorted(listOf(1, 1, 1, 1)) { i: Int, j: Int -> i == j })  // true

    println(isSorted(listOf("ahyyhh", "bkjn", "cnn", "duu")) { i: String, j: String -> i.first() < j.first() })
    // sortowanie po pierwszej literze -> true, bo 'a' < 'b' < 'c' < 'd'
}
