package com.rockthejvm.playground.part3fp

object ListExercises {

  /**
   * 1. Take a list of numbers, return a list of "scala" repeated that many times
   * e. g. [1, 2, 3] -> ["scala", "scalscala", "scalascalascala"]
   * 2. Generate the first n numbers in a list with a recursive function
   * 3. From that list, return just the prime numbers
   * 4. Take a list of numbers and return a list of all the digits
   * e.g. [12, 24] -> [1, 2, 3, 4]
   */


  // 1.
  def concatenateN(string: String, n: Int): String =
    if (n <= 0) ""
    else string + concatenateN(string, n-1)

  def repeatScala(numbers: List[Int]): List[String] =
    numbers.map(n => concatenateN("Scala", n))

  // 2.
  def generateN(n: Int): List[Int] =
    if (n <= 0) List()
    else generateN(n - 1) :+ n

  // 3.
  def isPrime(n: Int): Boolean = {
    def testDivisors(d: Int): Boolean =
      if (d > n/2) true
      else if (n % d == 0) false
      else testDivisors(d + 1)

      // last expression is the final thing
    if (n <= 0) false
    else if (n == 1) false
    else testDivisors(2)
  }

  // 4.
  def digits(n: Int): List[Int] = {
    def getDigits(number: Int): List[Int] =
      if (number <= 0) List()
      else {
        val lastDigit = number % 10
        val quotient = number / 10
        lastDigit :: getDigits(quotient)
      }
    // 123 => [1, 2, 3]
    if (n < 0) List()
    else if (n == 0) List(0)
    else getDigits(n).reverse // [1, 2, 3]
  }

  def listOfDigits(numbers: List[Int]): List[Int] =
    numbers.flatMap(n => digits(n))

  def primesOutOfFirstNumbers(n: Int): List[Int] =
    generateN(n).filter(x => isPrime(x))

  def main(args: Array[String]): Unit = {
    println(repeatScala((List(1, 2, 5))))
    println(generateN(100))
    println(primesOutOfFirstNumbers(10))
    println(digits(123))
    println(listOfDigits(List(12, 987)))
  }
}
