package com.kotlinracingcar.domain

import com.kotlinracingcar.view.InputView
import com.kotlinracingcar.view.OutputView

class RacingcarGame(
    private val inputView: InputView = InputView(),
    private val outputView: OutputView = OutputView()
) {

    fun play() {
        val carNames = initCarNames(inputView.inputCarNames())
        val racingLap = initRacingLap(inputView.inputRacingLap())
    }

    private fun initCarNames(carNames: String): CarNames {
        while (true) {
            try {
                outputView.printInputCarNames(CarNames.REGEX)
                return CarNames.from(carNames)
            } catch (e: IllegalArgumentException) {
                outputView.printError(e.message)
            }
        }
    }

    private fun initRacingLap(racingLap: String): RacingLap {
        while (true) {
            try {
                outputView.printInputRacingLap()
                return RacingLap.from(racingLap)
            } catch (e: IllegalArgumentException) {
                outputView.printError(e.message)
            }
        }
    }
}
