data class Point(var x: Int, var y: Int) {

    // dodawanie punktów
    operator fun plus(other: Point) = Point(x + other.x, y + other.y)

    // dodawanie i przypisanie liczby (+= Int)
    operator fun plusAssign(value: Int) {
        x += value
        y += value
    }

    // odejmowanie punktów
    operator fun minus(other: Point) = Point(x - other.x, y - other.y)

    // mnożenie punktów (mnożenie współrzędnych)
    operator fun times(other: Point) = Point(x * other.x, y * other.y)

    // inkrementacja (p1++)
    operator fun inc() = Point(x + 1, y + 1)

    // dekrementacja (p1--)
    operator fun dec() = Point(x - 1, y - 1)

    // negacja (!p1)
    operator fun not() = Point(-x, -y)
}

fun main() {
    println("--- Lista 3 zad 10 ---")

    var p1 = Point(1, 1)
    val p2 = Point(2, 2)

    println(p1 + p2)  // (3, 3)
    p1 += 1           // (2, 2)
    println(p1)
    println(p1 - p2)  // (0, 0)
    println(p1 * p2)  // (4, 4)
    p1++              // (3, 3)
    println(p1)
    p1--              // (2, 2)
    println(p1)
    println(!p1)      // (-2, -2)
}
