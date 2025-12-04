package clases

import Employee
import Evaluable

class Manager (name: String, salary: Double) : Employee (name, salary), Evaluable {
    override fun work() {
        println("Supervising the team and planning projects")
    }
    override fun calculateAnnualBonus() : Double {
        return salary * 0.20
    }
}