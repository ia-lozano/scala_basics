package com.rockthejvm.playground.part3fp

object ForComprehension {

  // example
  val numbers = List(1, 2, 3, 4)
  val colors = List("black", "white", "blue")

  val combinations = numbers.flatMap(n => colors.map(c => s"$n-$c"))
  // for comprehensions
  val combinations_v2 = for {
    n <- numbers
    c <- colors
  } yield s"$n-$c" // exactly the same as the above

  // for comprehensions are not loops, they are expressions

  // Generate a "chessboard" from the numbers 1 to 8 and the letters A-H

  val chessboard = for {
    letter <- List('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H')
    number <- List(1, 2, 3, 4, 5, 6, 7, 8)
  } yield s"$letter-$number"

  def main(args: Array[String]): Unit = {
    // for comprehensions
    println(combinations)
    println(combinations_v2)
    println(chessboard)
  }

}
