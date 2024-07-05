package com.rockthejvm.playground.part2oop

object Objects {

  // Singleton pattern
  // MySingleton type AND the ONLY possible instance of that type
  object MySingleton {
    // can define fields and methods
    val aField = 45
    def aMethod(x: Int) = x + 1
  }

  val theSingleton = MySingleton
  val anotherSingleton = MySingleton

  // combo of class + object of the same name in the same file = companions
  class Person(name: String){
    def sayHi(): String = s"Hi $name"
  }

  object Person { // object with the same name = companion object
    // define "static" fields and methods = don't depend on a particular instance of the class
    val N_EYES = 2
    def canFly(): Boolean = false
  }

  // objects can extend classes/traits
  object BigFoot extends Person("Big Foot")


  def main(args: Array[String]): Unit = {
    println(theSingleton == anotherSingleton)
    println(MySingleton.aField)
    println(MySingleton.aMethod(1))
  }
}
