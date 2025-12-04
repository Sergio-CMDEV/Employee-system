package clases

import Employee

class Designer (name: String, salary: Double) : Employee (name, salary) {
    override fun work() {
        println("Creating and optimizing visual design")
    }
    override fun calculateAnnualBonus() : Double {
        return salary * 0.15
    }
}