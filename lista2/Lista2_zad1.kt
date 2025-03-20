//val r: (String, Int) -> String = { s, i -> s.repeat(i) }

fun main(){
    print("--- Lista 2 zad 1 ---\n")

    val r = {s:String, i:Int -> println(s.repeat(i))
//        for (iter in  1..i)
//            print(s)
//        println()
    }

// Przykład użycia
    r("abc", 2) // -> abcabc
    r("a", 3)   // -> aaa

}