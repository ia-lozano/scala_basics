package com.rockthejvm.playground.part1basics

object Recursion {

  // sum(3) = 1 + 2 + 3 = 6
  // sum(10) = 1 + 2 + ... + 10 = 55
  // sum(10) + sum(9) // sum(9) + sum(8)

  def sum(n: Int): Int =
    if (n <= 0) 0
    else n + sum(n-1)

  // thinking in recursion
  def printN(string: String, n: Int): Unit =
    if (n <= 0) ()
    else {
      println(string)
      printN(string, n-1)
    }

  def isPrime(n: Int): Boolean = {
    // test all numbers from 2 to n / 2,, test whether n % d == 0
    def testDivisors(d: Int): Boolean =
      if (d > n / 2) true
      else if (n % d == 0) false
      else testDivisors(d+1)

    // last expression is the final thing
    // more complex example
    if (n <= 0) false // don't support negative numbers
    else if (n == 1) false // 1 is not a prime (not a composed number)
    else testDivisors(2)

  }

  def main(args: Array[String]): Unit = {
    println(sum(10))
    printN("Scala is awesome", 5)
  }

}
