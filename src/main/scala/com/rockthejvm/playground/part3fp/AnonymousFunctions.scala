package com.rockthejvm.playground.part3fp

object AnonymousFunctions {

  // apply
  // FunctionN
  val doubler: Function1[Int, Int] = new Function1[Int, Int]{
    override def apply(n: Int) = n * 2
  }

  // function types
  val doubler_v2: Int => Int = (n:Int) => n * 2 // lambda, equivalent to above

  // more complex function types
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b // lambda equivalent to new Function2[Int, Int, Int]

  // zero arg functions Function0[A]
  val justDoSomething: Function0[Int] = new Function0[Int] {
    override def apply() = 42
  }

  val justDoSomething_v2: () => Int = () => 42

  // alt syntax with curly braces
  val stringToInt = { (string: String) =>
    // block of code
    val stringLength = string.length
    stringLength + 45
  }

  // type interference
  val doubler_v3: Int => Int = n => n*2 // type of arg is inferred
  val adder_v2: (Int, Int) => Int = (a,b) => a + b // (Int, Int) => Int = _ + _ // each argument is an argument

  // shortest notation possible
  val doubler_v4: Int => Int = _ * 2 // same as Int = n => n*2

  def main(args: Array[String]): Unit = {
    println(doubler(4))
    println(doubler_v2(4))
  }
}
