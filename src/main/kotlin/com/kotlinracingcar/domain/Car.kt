package com.kotlinracingcar.domain

class Car(
    val name: CarName,
    var distance: Int = 0
) {

    fun racing(value: Int) {
        if (value >= CONDITION_VALUE) {
            distance += FORWARD_DISTANCE
        }
    }

    companion object {
        const val CONDITION_VALUE = 4
        const val FORWARD_DISTANCE = 1
    }
}
