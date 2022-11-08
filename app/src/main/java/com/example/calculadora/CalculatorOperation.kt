package com.example.calculadora

sealed class CalculatorOperation(val symbol: String){
    object Add: CalculatorOperation("+")
    object Subtraction: CalculatorOperation("-")
    object Multiplication: CalculatorOperation("x")
    object Division: CalculatorOperation("/")
}
