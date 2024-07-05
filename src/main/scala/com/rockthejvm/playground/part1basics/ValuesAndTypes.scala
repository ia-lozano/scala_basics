package com.rockthejvm.playground.part1basics

object ValuesAndTypes {

  val meaningOfLife: Int = 42
  // this is defining a constant const, int
  // values cannot be reassigned

  // Type inference
  val anInteger = 57 + 34

  // common types
  val aBoolean: Boolean = false // or true
  val aChar: Char = 'a'
  val anInt: Int = 45 // 4 bytes
  val aShort: Short = 5243 // 2 bytes
  val aLong: Long = 53627856327L // 8-bte integers
  val aFloat: Float = 2.4f // 4-byte decimal
  val aDouble: Double = 3.14 // 8-byte decimal

  // string type
  val aString: String = "this is a string"

  def main(args: Array[String]): Unit = {

  }
}
