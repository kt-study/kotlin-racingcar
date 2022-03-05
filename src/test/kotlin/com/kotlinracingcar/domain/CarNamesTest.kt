package com.kotlinracingcar.domain

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldContain

internal class CarNamesTest : StringSpec({

    "${CarNames.REGEX}를 통해 자동차의 이름을 나누고 컬렉션으로 만들 수 있다." {
        // given
        val 빙허 = "빙허"
        val 피카 = "피카"

        // when
        val carNames = CarNames.from("$빙허,$피카")

        // then
        carNames.values shouldContain CarName(빙허)
        carNames.values shouldContain CarName(피카)
    }
})
