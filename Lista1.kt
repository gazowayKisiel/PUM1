fun zad1(num:Int){

    for(i in 1..num){
        var s = ""
        if(i%3==0)
            s += "trzy"
        if(i%5==0)
            s += "piec"
        if(i%7==0)
            s += "siedem"
        if(i%11==0)
            s += "jedenascie"
        if(i%13==0)
            s += "trzynascie"
        if (s.isNotEmpty()) {
            println(s)
        }else {
            println(i)
        }
    }
}
//-----------------------------------------------------------
fun zad2(s :String): Boolean {
    val s2 = s.reversed();
    return s == s2;
}
//-----------------------------------------------------------
fun zad3(num:Int){
    var x =num-1
    var y = 1
    for(i in 1..num) {
        for (j in 1..x) {
            print("  ")
        }
        for (k in 1..y) {
            print(i)
            print("   ")
        }
        for (m in 1..x) {
            print("  ")
        }
        x--
        y++
        println("")
    }
}
//-----------------------------------------------------------
fun zad4(num:Int):String {
    var suma = 0
    for (i in 1..<num) {
        if(num%i==0)
            suma+=i
    }
    if(suma == num)
        return "perfect"
    if(suma > num)
        return "abundant"
    return "deficient"
}
//-----------------------------------------------------------
fun zad5(num:String):Boolean {
    var suma = 0
    var x = 0
    var n  = num.toInt()
    while (n>0) {
        x = 1
        for(i in 1..num.length)
            x *= n%10
        suma += x
        n /= 10
    }
    return suma.toString() == num
}

fun main() {
//  --- zad 1 ---
    print("\n--- Zad 1 ---\nPodaj wartość do którzej chcesz iterować: ")
    val x = readln().toInt()
    zad1(x)

// --- zad 2 ---
    print("\n--- Zad 2 ---\nPodaj słowo do sprawdzenia czy palindrom: ")
    val word = readln()
    println(zad2(word))


// --- zad 3 ---
    print("\n--- Zad 3 ---\nPodaj rozmiar pascala: ")
    val height = readln().toInt()
    zad3(height)

// --- zad 4 ---
    print("\n--- Zad 4 ---\nPodaj liczbę do sprawdzenia (czy doskonała/obfita/niedomiarowa): ")
    val m = readln().toInt()
    println(zad4(m))

// --- zad 5 ---
    print("\n--- Zad 5 ---\nPodaj liczbę do sprawdzenia (czy armstronga): ")
    val k = readln()
    println(zad5(k))
}