package com.example.composition.domain.entity

import java.io.Serializable

data class GameSettings(
    val maxSumValue: Int,
    val minCountOfRightAnswers: Int,
    val minPersentOfRightAnswers: Int,
    val gameTimeInSeconds: Int,
) : Serializable