package com.kotlinracingcar.domain

import java.lang.IllegalArgumentException

data class RacingLap(
    val value: Int
) {

    init {
        validateNegative(value)
    }

    private fun validateNegative(value: Int) {
        if (value < MIN_RACING_LAP) {
            throw IllegalArgumentException("시도할 회수는 최소 $MIN_RACING_LAP 회 이상이어야 합니다.")
        }
    }

    companion object {

        const val MIN_RACING_LAP = 1

        fun from(value: String): RacingLap {
            return RacingLap(Integer.parseInt(value))
        }
    }
}
