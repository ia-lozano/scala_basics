package com.rockthejvm.playground.part1basics

object StringOperations {
  // string
  val aString = "Scala Rocks"
  // functions attached to them (methods)
  val length = aString.length
  val startsWithScala = aString.startsWith("Scala")
  val combine = aString + " very much!"
  val checkEmpty = aString.isEmpty
  val findIndex = aString.indexOf("Rocks")

  // interpolation - inject values or expressions inside a string
  val name = "Alice"
  val age = 12
  // val greeting = "Hi,, my name is " + name + " and i am " + age + " years old"
  val greeting = s"Hi, my name is $name and i am $age years old" // s-interpolation string
  val greetingRemaster = s"Hi, my name is $name and i am $age years old and im gonna turn ${age + 1} yo"

  def main(args: Array[String]): Unit = {
    println(aString.length)
    println(findIndex)
    println(greetingRemaster)
  }
}
