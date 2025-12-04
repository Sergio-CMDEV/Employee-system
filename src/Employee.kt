abstract class Employee (var name: String, var salary: Double) {
    /*
        Parte 1, crear las clases abstractas y concretas
     */
    // Abstractos
    abstract fun work()
    abstract fun calculateAnnualBonus(): Double
    // concreto
    fun details() {
        println("Name: $name, Salary: $salary")
    }
}