package com.amanmehara.algorithms

import org.scalatest.FunSuite

/**
  * Created by @amanmehara on 04-06-2017.
  */
class SequencesSuite extends FunSuite {

  test("Sum") {
    assertResult(28) {
      val numbers = 4 :: 1 :: 6 :: 8 :: 7 :: 2 :: Nil
      Sequences.sum(numbers)
    }
  }

  test("Sum by Reduction") {
    assertResult(28) {
      val numbers = 4 :: 1 :: 6 :: 8 :: 7 :: 2 :: Nil
      Sequences.sumByReduction(numbers)
    }
  }

  test("Maximum") {
    assertResult(8) {
      val numbers = 4 :: 1 :: 6 :: 8 :: 7 :: 2 :: Nil
      Sequences.maximum(numbers)
    }
  }

  test("Maximum by Reduction") {
    assertResult(8) {
      val numbers = 4 :: 1 :: 6 :: 8 :: 7 :: 2 :: Nil
      Sequences.maximumByReduction(numbers)
    }
  }

  test("Minimum") {
    assertResult(1) {
      val numbers = 4 :: 1 :: 6 :: 8 :: 7 :: 2 :: Nil
      Sequences.minimum(numbers)
    }
  }

  test("Minimum by Reduction") {
    assertResult(1) {
      val numbers = 4 :: 1 :: 6 :: 8 :: 7 :: 2 :: Nil
      Sequences.minimumByReduction(numbers)
    }
  }

}
