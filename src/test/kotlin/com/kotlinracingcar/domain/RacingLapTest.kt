package com.kotlinracingcar.domain

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class RacingLapTest : StringSpec({

    "자동차 경주를 시도할 회수가 1보다 작으면 예외가 발생한다." {
        // given
        val tooLowRacingLap = 0

        // when
        val exception = shouldThrow<IllegalArgumentException> { RacingLap(tooLowRacingLap) }

        // then
        exception.message shouldBe "시도할 회수는 최소 ${RacingLap.MIN_RACING_LAP} 회 이상이어야 합니다."
    }
})
