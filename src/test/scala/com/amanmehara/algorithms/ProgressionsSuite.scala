package com.amanmehara.algorithms

import org.scalatest.FunSuite

/**
  * Created by @amanmehara on 04-06-2017.
  */
class ProgressionsSuite extends FunSuite {

  test("Arithmetic Progression") {
    assertResult((2 :: 7 :: 12 :: Nil).map(BigDecimal(_))) {
      Progressions.arithmeticProgression(3)(2D,5D)
    }
  }

  test("Arithmetic Progression Sum") {
    assertResult(BigDecimal(21)) {
      Progressions.arithmeticProgressionSum(3)(2D,5D)
    }
  }

  test("Arithmetic Progression Sum Formula") {
    assertResult(BigDecimal(21)) {
      Progressions.arithmeticProgressionSumFormula(3)(2D,5D)
    }
  }

  test("Geometric Progression") {
    assertResult(Option((2.0 :: 2.40 :: 2.880 :: Nil).map(BigDecimal(_)))) {
      Progressions.geometricProgression(3)(2D,1.2D)
    }
    assertResult(None) {
      Progressions.geometricProgression(3)(2D,0D)
    }
  }

  test("Geometric Progression Sum") {
    assertResult(Option(BigDecimal(7.280))) {
      Progressions.geometricProgressionSum(3)(2D,1.2D)
    }
    assertResult(None) {
      Progressions.geometricProgressionSum(3)(2D,0D)
    }
  }

  test("Geometric Progression Sum Formula") {
    assertResult(Option(BigDecimal(7.280))) {
      Progressions.geometricProgressionSumFormula(3)(2D,1.2D)
    }
    assertResult(Option(BigDecimal(20))) {
      Progressions.geometricProgressionSumFormula(10)(2D,1D)
    }
    assertResult(None) {
      Progressions.geometricProgressionSumFormula(3)(2D,0D)
    }
  }

  test("Geometric Progression Infinite Sum Formula") {
    assertResult(Option(BigDecimal(4))) {
      Progressions.geometricProgressionInfiniteSumFormula(2D,0.5D)
    }
    assertResult(None) {
      Progressions.geometricProgressionInfiniteSumFormula(2D,10D)
    }
    assertResult(None) {
      Progressions.geometricProgressionInfiniteSumFormula(2D,1D)
    }
  }

}
