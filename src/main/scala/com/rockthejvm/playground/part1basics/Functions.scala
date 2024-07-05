package com.rockthejvm.playground.part1basics

object Functions {

  // function = mini-program / reusable piece of code that you can parameterize
  def aFunction(a: String, b: Int): String = {
    // always a single instruction
    a + " " + b }

  // invocation
  val anInvocation = aFunction("Scala", 999) // "Scala 999"

  // functions returning Unit
  def aVoidFunction(aString: String): Unit=
    println(aString)

  def functionWithSideEffect(aString: String): String = {
    println(aString) // side effects
    aString + " " + aString
  }

  // can define smaller functions inside bigger ones
  def aBigFunction(n: Int): Int = {
    // can define smaller functions
    def aSmallerFunction(a: Int, b: Int) = a + b

    // can call smaller functions just inside this code block
    aSmallerFunction(n, n + 1)
  }

    def main(args: Array[String]): Unit = {
      println(anInvocation)
      println(aBigFunction(1))
    }

}
