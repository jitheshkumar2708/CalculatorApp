package com.teamb.calculator

import com.example.calculatorapp.actions.CalculatorOperation


data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)
