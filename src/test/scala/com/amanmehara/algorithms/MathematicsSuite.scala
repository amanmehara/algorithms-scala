package com.amanmehara.algorithms

import org.scalatest.FunSuite

/**
  * Created by @amanmehara on 04-06-2017.
  */
class MathematicsSuite extends FunSuite {

  test("Factorial") {
    assertResult(2) {
      Mathematics.factorial(2)
    }
    assertResult(120) {
      Mathematics.factorial(5)
    }
  }

  test("nth Fibonacci") {
    assertResult(0) {
      Mathematics.nthFibonacci(0)
    }
    assertResult(3) {
      Mathematics.nthFibonacci(4)
    }
  }


}
