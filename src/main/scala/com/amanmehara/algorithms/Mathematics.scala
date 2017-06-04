package com.amanmehara.algorithms

/**
  * Created by @amanmehara on 28-05-2017.
  */
object Mathematics {

  def factorial (number: Int, accumulator: BigInt = 1): BigInt = {
    if(number > 0) factorial(number - 1, accumulator * number) else accumulator
  }

  def nthFibonacci(number: Int, x: BigInt = 0, y: BigInt = 1): BigInt = number match {
    case 0 => x
    case 1 => y
    case _ => nthFibonacci(number - 1, y, x + y)
  }

}
