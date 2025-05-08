
import kotlin.random.*
import java.time.LocalDate // Dla Local Date
import java.time.Month

enum class CostType(val costType: String) {
    REFUELING("Tankowanie"),
    SERVICE("Serwis"),
    PARKING("Parking"),
    INSURANCE("Ubezpieczenie"),
    TICKET("Mandat")
}

data class Cost (
    val type: CostType,
    val date: LocalDate,
    val amount: Int
)

data class Car (
    val name: String,
    val brand: String,
    val model: String,
    val yearOfProduction: Int,
    val costs: List<Cost>
)

object DataProvider {

    private fun generalCosts(size: Int) = List(size) {
        Cost(
            CostType.values()[Random.nextInt(CostType.values().size)],
            LocalDate.of(
                2025,
                Random.nextInt(1,13),
                Random.nextInt(1,28)),
            Random.nextInt(5000)
        )
    }

    val cars = listOf(
        Car("Domowy", "Skoda", "Fabia", 2002, generalCosts(100)),
        Car("Służbowy", "BMW", "Coupe", 2015, generalCosts(50)),
        Car("Kolekcjonerski", "Fiat", "125p", 1985, generalCosts(10))
    )

}
// Zadanie 1 grupuje koszty wg miesiąca i zwraca je w postaci mapy posortowanej po miesiącach
fun groupedCostMap(costs: List<Cost>): Map<Month, List<Cost>> {
    return costs
        .groupBy { it.date.month }
        .toSortedMap()
}

// Zadanie 2 wypisuje koszty w podziale na miesiące i posortowane według dnia
fun printGroupedCosts(costs: List<Cost>) {
    costs
        .groupBy { it.date.month }
        .toSortedMap()
        .forEach { (month, monthlyCosts) ->
            println(month)
            monthlyCosts
                .sortedBy { it.date }
                .forEach { cost ->
                    println("${cost.date.dayOfMonth} ${cost.type.name} ${cost.amount} zł")
                }
        }
}
// Zadanie 3 podsumowuje wydatki danego samochodu  wg typu kosztu i zwraca posortowaną listę (najdroższe typy na górze)
fun getCarCosts(carName: String): List<Pair<CostType, Int>> {
    val car = DataProvider.cars.find { it.name == carName } ?: return emptyList()
    return CostType.entries
        .map { type ->
            val total = car.costs.filter { it.type == type }.sumOf { it.amount }
            Pair(type, total)
        }
        .sortedByDescending { it.second }
}
// wypisuje wynik getCarCosts w czytelnej formie
fun printCarCosts(costs: List<Pair<CostType, Int>>) {
    costs.forEach { (type, amount) ->
        println("${type.name} ${amount} zł")
    }
}

// Zadanie 4 sumuje wszystkie koszty ze wszystkich aut i grupuje je wg typu kosztu
fun getFullCosts(cars: List<Car>): Map<CostType, Int> {
    return cars
        .flatMap { it.costs }
        .groupBy { it.type }
        .mapValues { it.value.sumOf { cost -> cost.amount } }
}
// wypisuje wynik getFullCosts w czytelnej formie
fun printFullCosts(costs: Map<CostType, Int>) {
    costs.forEach { (type, amount) ->
        println("${type.name} ${amount} zł")
    }
}

fun main() {

    //Przechowuje wynik dla pierwszych pięciu pierwszego auta (Car("Domowy", "Skoda", "Fabia", 2002, generalCosts(100)))
    val ExampleCosts = DataProvider.cars[0].costs.take(5)

    println("\n --- Zadanie 1 --- ")
    println(groupedCostMap(ExampleCosts))

    println("\n --- Zadanie 2 --- ")
    printGroupedCosts(ExampleCosts)

    println("\n --- Zadanie 3 --- ")
    printCarCosts(getCarCosts("Domowy"))


    println("\n --- Zadanie 4 --- ")
    printFullCosts(getFullCosts(DataProvider.cars))

}


