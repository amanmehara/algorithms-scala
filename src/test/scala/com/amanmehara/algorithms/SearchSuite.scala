package com.amanmehara.algorithms

import org.scalatest.FunSuite

/**
  * Created by @amanmehara on 04-06-2017.
  */
class SearchSuite extends FunSuite {

  test("Linear Search") {
    assertResult(Option(7)) {
      val numbers = 4 :: 1 :: 6 :: 8 :: 7 :: 2 :: Nil
      Search.linearSearch(numbers,7)
    }
    assertResult(None) {
      val numbers = 4 :: 1 :: 6 :: 8 :: 7 :: 2 :: Nil
      Search.linearSearch(numbers,5)
    }
  }

}
