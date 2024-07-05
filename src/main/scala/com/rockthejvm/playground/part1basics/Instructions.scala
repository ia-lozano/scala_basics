package com.rockthejvm.playground.part1basics

object Instructions {
  // instructions are executed vs expressions are evaluated
  // do this, do that, repeat(10) { ... } - imperative programming
  // 2 + 3, IO effects, map, flatMap, filter - functional programming

  val printing: Unit = println(("This is an instruction")) // side effect
  val theUnit: Unit = () // only possible value of type Unit

  // instructions - code blocks returning Unit
  val aCodeBlock = {
    val aLocalValue = 45
    println("instruction 1")
    println("instruction 2")
  }

  // variables in Scala
  var aVariable = 10
  var reassingnment: Unit = aVariable += 1

  def main(args: Array[String]): Unit = {
    // loops ins Scala
    var theNumber = 1
    while(theNumber <= 10){
      println(theNumber)
      theNumber += 1
    }
  }
}
