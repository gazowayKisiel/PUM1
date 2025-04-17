// Zamiansa słowa na numer
// - funkcja zamienia słowo na numer (klawiatura telefonu)

fun convert(word: String): String {
    // mapa przypisująca każdej literze jej odpowiednik z klawiatury (wciśnięcia)
    val keypad = mapOf(
        'a' to "2",    'b' to "22",   'c' to "222",
        'd' to "3",    'e' to "33",   'f' to "333",
        'g' to "4",    'h' to "44",   'i' to "444",
        'j' to "5",    'k' to "55",   'l' to "555",
        'm' to "6",    'n' to "66",   'o' to "666",
        'p' to "7",    'q' to "77",   'r' to "777",   's' to "7777",
        't' to "8",    'u' to "88",   'v' to "888",
        'w' to "9",    'x' to "99",   'y' to "999",   'z' to "9999"
    )

    // zamiana słowa na ciąg cyfr zgodnie z mapą
    return word.map { keypad[it] ?: "" }    // dla każdej litery pobieramy jej kod z mapy
        .joinToString("")          // łączymy wszystko w jeden string
}

fun main() {
    println("--- Lista 3 zad 8 ---")

    val word = "franek"
    println(convert(word))  // oczekiwane: 3337772663355
}
