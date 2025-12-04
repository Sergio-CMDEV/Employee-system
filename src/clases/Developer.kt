package clases

import Employee

class Developer (name: String, salary: Double) : Employee (name, salary) {
    override fun work() {
        println("Writing and reviewing code")
    }
    override fun calculateAnnualBonus() : Double {
        return salary * 0.10
    }
}