package ar.edu.unsam.algo2

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class UserSpec : DescribeSpec({
    describe("Creacion de usuario"){
        val user = UserConstructor().built()
        it("Obtener edad del usuario"){
            user.age() shouldBe 23
        }
        it("Obtener la maxima frecuencia cardiaca del usuario"){
            user.maxHeartRate() shouldBe 197
        }
        it("Obtener la frecuencia cardiaca reserva"){
            user.heartRateReserve() shouldBe 137
        }
    }
})