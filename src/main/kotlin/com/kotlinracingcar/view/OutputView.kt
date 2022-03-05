package com.kotlinracingcar.view

import com.kotlinracingcar.domain.Car

private const val DISTANCE_VIEW = "-"

class OutputView {

    fun printInputCarNames(carNameRegex: String) {
        println("경주할 자동차 이름을 입력하세요.(이름은 쉼표($carNameRegex) 기준으로 구분)")
    }

    fun printInputRacingLap() {
        println("시도할 회수는 몇회인가요?")
    }

    fun printError(message: String?) {
        println("[ERROR] $message")
    }

    fun printRacingResult() {
        println("실행 결과")
    }

    fun printCurrentRace(cars: List<Car>) {
        for (car in cars) {
            val carName = car.name.value
            val carDistance = mapForDisplay(car.distance)

            println("$carName : $carDistance")
        }
    }

    private fun mapForDisplay(distance: Int): String {
        val stringBuilder = StringBuilder()

        for (i in 1..distance) {
            stringBuilder.append(DISTANCE_VIEW)
        }

        return stringBuilder.toString()
    }
}
