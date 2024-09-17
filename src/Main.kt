fun main() {
    print("Введите первое число: ")
    val num1 = readLine()!!.toInt()

    print("Введите второе число: ")
    val num2 = readLine()!!.toInt()

    print("Введите третье число: ")
    val num3 = readLine()!!.toInt()

    if (num1 > num2 && num1 > num3) {
        println("Самое большое число: $num1")
    } else if (num2 > num1 && num2 > num3) {
        println("Самое большое число: $num2")
    } else {
        println("Самое большое число: $num3")
    }
}
