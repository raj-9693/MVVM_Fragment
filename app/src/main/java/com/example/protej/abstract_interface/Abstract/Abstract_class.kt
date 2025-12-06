package com.example.protej.abstract_interface.Abstract

abstract class Abstract_class {

    abstract fun calculate(num1:Int,num2:Int):Int


}


class Addition: Abstract_class() {
    override fun calculate(num1: Int, num2: Int): Int {
       val sum=num1+num2
        return sum
    }

}
class Subtraction: Abstract_class(){
    override fun calculate(num1: Int, num2: Int): Int {
        val Sub=num1-num2
        return Sub
    }

}
class Multiply: Abstract_class(){
    override fun calculate(num1: Int, num2: Int): Int {
        val Mul=num1*num2
        return Mul
    }

}
class Division: Abstract_class(){
    override fun calculate(num1: Int, num2: Int): Int {
        val Div=num1/num2
        return Div
    }

}

