package com.kotlinracingcar.domain

import com.kotlinracingcar.view.InputView
import com.kotlinracingcar.view.OutputView

class Racingcar(
    private val inputView: InputView = InputView(),
    private val outputView: OutputView = OutputView()
) {

    fun play() {
        outputView.printInputCarNames(CarNames.REGEX)

        val carNames = initCarNames(inputView.inputCarNames())
    }

    private fun initCarNames(carNames: String): CarNames {
        while (true) {
            try {
                return CarNames.from(carNames)
            } catch (e: IllegalArgumentException) {
                outputView.printError(e.message)
            }
        }
    }
}
