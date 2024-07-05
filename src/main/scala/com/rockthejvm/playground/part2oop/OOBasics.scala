package com.rockthejvm.playground.part2oop

object OOBasics {
  // classes and instances
  class Person(val name: String, age: Int) {
    // inside, we can define val, var, def
    // fields
    val allCaps: String = name.toUpperCase()

    // methods = functions
    def greet(someone: String): String =
      s"$name says: Hi $someone"

    // define multiple methods with the same name (overloading)
    def greet(): String =
      s"Hi everyone, I'm $name"
  }
  // class definition also contains the definition of its CONSTRUCTOR

  val daniel = new Person("daniel",99) // daniel is an instance of Person (instantiation)
  val danielName = daniel.name // constructor arg is not (necessarily) a field
  def main(args: Array[String]): Unit = {
    println(daniel.allCaps)
    println(daniel.greet("alex"))
    println(daniel.greet())
  }

}
