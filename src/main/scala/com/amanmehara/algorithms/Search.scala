package com.amanmehara.algorithms

/**
  * Created by @amanmehara on 28-05-2017.
  */
object Search {

  def linearSearch[A](numbers: List[A], key: A): Option[A] = {
    def search(numbers: List[A]): Option[A] =
      if (numbers.isEmpty) None
      else if (numbers.head == key) Option(numbers.head)
      else search(numbers.tail)
    search(numbers)
  }

}
