fun check(N: Int, lst: List<Int>): Int {
    // iterujemy od pierwszego indeksu poza preambułą
    for (i in N .. lst.size) {
        val sprawdzanyElement = lst[i]
        var jest = false

        // sprawdzanie wszystkich par w aktualnej preambule
        for (j in i - N .. i) {
            for (k in j + 1 .. i) {
                if (lst[j] + lst[k] == sprawdzanyElement) {
                    jest = true     // znaloziono dwie których suma == elementowi sprawdzanemu
                    break
                }
            }
            if (jest == true)   // jak false to pętla sprawdza kolejne elementy
                break // wracamy do pierwszej pętli
        }
        if (jest == false)  // jeśli po pętla się skończy i nie znajdzie sumy
            return sprawdzanyElement   // zwraca sprawdzany element
    }
    return -1 // pętla głóna się skończyła i nie znalazła nie pasującej - zwraca -1
}



fun main() {
    print("--- Lista 2 zad 7 ---\n")

    println(check(2, listOf(1, 2, 3, 4, 5, 6)))
    // -> 4
    println(check(5, listOf(35, 25, 15, 25, 47, 40, 62, 55, 65, 95, 102, 117, 150, 182, 127, 219, 299, 277, 309, 576)))
    // -> 127
}