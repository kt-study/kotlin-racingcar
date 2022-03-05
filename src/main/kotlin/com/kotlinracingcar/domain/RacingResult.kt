package com.kotlinracingcar.domain

class RacingResult(
    val cars: Cars
) {

    fun getWinners(): List<Car> {
        val maxDistance = cars.values.maxOf { it.distance }

        return cars.values.filter { it.distance == maxDistance }
    }
}
