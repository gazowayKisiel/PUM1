//  Liczenie wystąpień elementów
//  - zlicza wystąpienia każdego elementu w liście list -

fun countElements(lists: List<List<String>>): Map<String, Int> {
    return lists.flatMap { it }       // łączy wszystkie listy w jedną 'płaską' listę (zamienia w pojedynczą liste)
        .groupingBy { it }          // grupuje elementy po ich wartościach
        .eachCount()                // zlicza liczbę wystąpień każdego elementu
}

fun main() {
    println("--- Lista 3 zad 4 ---")
    println(countElements(listOf(listOf("a", "b", "c"), listOf("c", "d", "f"), listOf("d", "f", "g"))))
        // oczekiwane:  {a=1, b=1, c=2, d=2, f=2, g=1}
}