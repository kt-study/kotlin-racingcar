package com.kotlinracingcar.domain

import kotlin.random.Random

class Cars(
    val values: List<Car>
) {

    fun raceAllCars() {
        for (car in values) {
            car.racing(Random.nextInt(0, 9))
        }
    }
}
