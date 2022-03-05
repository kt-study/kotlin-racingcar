package com.kotlinracingcar.domain

class CarNames(
    val values: List<CarName>
) {

    companion object {
        const val REGEX = ","

        fun from(value: String): CarNames {
            return CarNames(
                value.split(REGEX)
                .map { CarName(it) }
            )
        }
    }
}
