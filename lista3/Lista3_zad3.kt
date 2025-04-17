//  Suma dodatnich
//  - oblicza sumę dodatnich liczb w liście -
fun suma(lst: List<Int>): Int {
    return lst.filter { it > 0 }  // filtruje tylko liczby większe od 0
        .sum()                  // sumuje pozostałe elementy
}


fun main() {
    println("--- Lista 3 zad 3 ---")
    println(suma(listOf(1, -4, 12, 0, -3, 29, -150))) // oczekiwane: 42
}