package com.kotlinracingcar.domain

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class CarNameTest : StringSpec({

    "자동차 이름에 공백이 포함된 경우 예외가 발생한다." {
        // given
        val containBlankName = "안 녕"

        // when
        val exception = shouldThrow<IllegalArgumentException> { CarName(containBlankName) }

        // then
        exception.message shouldBe "자동차 이름에 공백이 포함될 수 없습니다."
    }

    "자동차 이름의 길이가 ${CarName.MIN_LENGTH}자 미만이면 예외가 발생한다." {
        // given
        val tooShortCarName = ""

        // when
        val exception = shouldThrow<IllegalArgumentException> { CarName(tooShortCarName) }

        // then
        exception.message shouldBe "자동차 이름의 길이는 ${CarName.MIN_LENGTH}~${CarName.MAX_LENGTH} 사이어야 합니다."
    }

    "자동차 이름의 길이가 ${CarName.MIN_LENGTH}자를 초과하면 예외가 발생한다." {
        // given
        val tooLongCarName = "123456"

        // when
        val exception = shouldThrow<IllegalArgumentException> { CarName(tooLongCarName) }

        // then
        exception.message shouldBe "자동차 이름의 길이는 ${CarName.MIN_LENGTH}~${CarName.MAX_LENGTH} 사이어야 합니다."
    }
})
