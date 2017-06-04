package com.amanmehara.algorithms

/**
  * Created by @amanmehara on 04-06-2017.
  */
object Sequences {

  def sum (numbers: List[Int]): Int = {
    numbers.sum
  }

  def sumByReduction (numbers: List[Int]): Int = {
    numbers.reduceLeft(_ + _)
  }

  def maximum (numbers: List[Int]): Int = {
    numbers.max
  }

  def maximumByReduction (numbers: List[Int]): Int = {
    numbers.reduceLeft(_ max _)
  }

  def minimum (numbers: List[Int]): Int = {
    numbers.min
  }

  def minimumByReduction (numbers: List[Int]): Int = {
    numbers.reduceLeft(_ min _)
  }

}
