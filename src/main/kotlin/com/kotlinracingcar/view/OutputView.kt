package com.kotlinracingcar.view

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
}
