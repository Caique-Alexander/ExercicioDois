fun main (args: Array<String>) {

    var arrayNum: Array<Int> = arrayOf(6, 3, 10, 8, 5, 2, 4, 7, 9, 1)

    //println(arrayNum.size)

    for (item in arrayNum) {
        println(item)
    }
    print("\nNúmeros Ímpares: ")
    for (item in arrayNum) {
        if (item % 2 != 0) print(item)

    }
    print("\n\nNúmeros Pares: ")
    for (item in arrayNum) {
        if (item % 2 != 1) print(item)

    }
    print("\n")
}