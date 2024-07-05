package com.rockthejvm.playground.part1basics

object Expressions {

  // Everything in Scala is an expression

  // structures that evaluate to a value
  val number = 40 + 2
  //            ^^^ expression

  // expressions that compose + - * / , bitwise | & >> <<
  val mathExpression = 2 + 3 * 4 // 14

  // boolean expressions
  val equalityTest = 1 == 2 // expression returns true or false

  // if expressions
  val anIfExpression = if (equalityTest) 45 else 99
  val anIfExpression_v2 = if equalityTest then 45 else 99

  // code blocks are also expressions
  val aCodeBlock = {
    // can define local values
    val localValue = 78
    // a bunch of expressions

    // last value = the value of the ENTIRE BLOCK
    localValue + 99
    }

  // pattern matching - "switch" on steroids
  val someValue = 42
  val description = someValue match {
    case 1 => "the first"
    case 2 => "the second"
    case 3 => "the third"
    case _ => "something else"
  }

  def main(args: Array[String]): Unit = {
    println(mathExpression)
    println(equalityTest)
    println(anIfExpression)

    // Code block
    println(aCodeBlock)

    // pattern matching
    println(description)
  }
}
