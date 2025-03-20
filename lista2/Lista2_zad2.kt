// Właściwości rozszerzające

// zwraca ogon (wszystko oprócz pierwszego elementu)
val <T> List<T>.tail: List<T>
    get() = this.drop(1)
// zwraca głowę (pierwszy element)
val <T> List<T>.head: T
    get() = this.first()    // można użyć take(1) zamiast first jeśli zamiast T zwracamy List<T>

fun main(){
    print("--- Lista 2 zad 2 ---\n")

    // Przykładowa lista od 1 do 5
    val lista = List(5) {it+1}      // 'it' reprezentuje indeks danego elementu

    println(lista.tail)     // zwraca: 2,3,...,8
    println(lista.head)     // zwraca: 1
}