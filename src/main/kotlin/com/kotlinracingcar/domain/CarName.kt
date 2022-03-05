package com.kotlinracingcar.domain

data class CarName(
    val value: String
) {

    init {
        validateBlank(value)
        validateLength(value)
    }

    private fun validateLength(value: String) {
        if (value.length < MIN_LENGTH || MAX_LENGTH < value.length) {
            throw IllegalArgumentException("자동차 이름의 길이는 $MIN_LENGTH~$MAX_LENGTH 사이어야 합니다.")
        }
    }

    private fun validateBlank(value: String) {
        if (value.contains(" ")) {
            throw IllegalArgumentException("자동차 이름에 공백이 포함될 수 없습니다.")
        }
    }

    companion object {
        const val MIN_LENGTH = 1
        const val MAX_LENGTH = 5
    }
}
