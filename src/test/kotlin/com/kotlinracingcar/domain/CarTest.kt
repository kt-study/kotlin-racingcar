package com.kotlinracingcar.domain

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class CarTest : StringSpec({

    "자동차에 주어진 값이 ${Car.CONDITION_VALUE} 이상이면 전진거리가 ${Car.FORWARD_DISTANCE} 만큼 증가한다." {
        // given
        val car = Car(CarName("구막"))
        val value = Car.CONDITION_VALUE

        // when
        car.racing(value)

        // then
        car.distance shouldBe (0 + Car.FORWARD_DISTANCE)
    }

    "자동차에 주어진 값이 ${Car.CONDITION_VALUE} 미만이면 거리가 변화하지 않는다." {
        // given
        val car = Car(CarName("너잘"))
        val value = Car.CONDITION_VALUE - 1

        // when
        car.racing(value)

        // then
        car.distance shouldBe 0
    }
})
