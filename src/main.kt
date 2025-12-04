import clases.*

fun main() {
    val lista = listOf(Developer("Sergio", 30000.0),
                       Manager("Ana", 50000.0),
                       Designer("Luis", 40000.0))

    println("-----------------")
    for (empleado in lista) {
        empleado.work()
        empleado.details()
        println("${empleado.calculateAnnualBonus()}")
        println("-----------------")

        if (empleado is Evaluable) {
            empleado.evaluatePerformance()
        }
    }
}