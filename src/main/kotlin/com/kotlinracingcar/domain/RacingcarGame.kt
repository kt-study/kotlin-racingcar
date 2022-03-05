package com.kotlinracingcar.domain

import com.kotlinracingcar.view.InputView
import com.kotlinracingcar.view.OutputView

class RacingcarGame(
    private val inputView: InputView = InputView(),
    private val outputView: OutputView = OutputView()
) {

    fun play() {
        val cars = initCars()
        val racingLap = initRacingLap()

        outputView.printRacingResult()
        while (racingLap.isContinueRacing()) {
            cars.raceAllCars()
            outputView.printCurrentRace(cars.values)
            racingLap.passOneLap()
        }
    }

    private fun initCars(): Cars {
        return Cars(
            initCarNames().values
            .map { Car(it) }
        )
    }

    private fun initCarNames(): CarNames {
        while (true) {
            try {
                outputView.printInputCarNames(CarNames.REGEX)
                return CarNames.from(inputView.inputCarNames())
            } catch (e: IllegalArgumentException) {
                outputView.printError(e.message)
            }
        }
    }

    private fun initRacingLap(): RacingLap {
        while (true) {
            try {
                outputView.printInputRacingLap()
                return RacingLap.from(inputView.inputRacingLap())
            } catch (e: IllegalArgumentException) {
                outputView.printError(e.message)
            }
        }
    }
}
