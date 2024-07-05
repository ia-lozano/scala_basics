package com.rockthejvm.playground.part1basics

object RecursionExercise {
  /**
   * Exercises
   *  1. concatenate a string a set number of times
   *  2. Fibonacci numbers
   */

  // 1. Concatenate N times
  def concatenateN(string:String, n: Int): String = {
    if (n <= 0) ""
    else string + concatenateN(string, n-1)
    }

  // 2. Fibonacci
  def fibonacci(n: Int): Int = {
    if (n <= 1) 1
    else if (n == 2) 2
    else fibonacci(n -1) + fibonacci(n - 2)
  }

  def main(args: Array[String]): Unit = {
    println(concatenateN("Scala", 3))
    println(fibonacci(6))
  }
}
