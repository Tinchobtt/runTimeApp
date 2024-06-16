package ar.edu.unsam.algo2

import java.time.LocalDate
import java.time.Period

class User(
    var name: String,
    var surname: String,
    var birthDate: LocalDate,
    var restingheartRate: Int,
){
    fun age() = Period.between(birthDate, LocalDate.now()).years
    fun maxHeartRate():Int = 220 - age()
    fun heartRateReserve() = maxHeartRate() - restingheartRate
}

class UserConstructor{
    fun built(): User = User(
        name = "name",
        surname = "surename",
        birthDate = LocalDate.of(2000, 7, 16),
        restingheartRate = 60
    )
}