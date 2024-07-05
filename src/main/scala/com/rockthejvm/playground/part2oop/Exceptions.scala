package com.rockthejvm.playground.part2oop

object Exceptions {

  /**
   * Hierarchy
   * Throwable
   * - Error - JVM-related crashes (out of memory, stack overflow
   * - Exception - user-facing crashes
   * - Runtime Exception
   *   ^^  can define new exceptions
   */

  class MyException extends RuntimeException("Too big of a number")

  def sumN(n: Int): Int =
    if (n < 0) throw new IllegalStateException("Negative numbers unsupported!")
    else if (n >= 50000) throw new MyException
    else if (n <= 0) 0
    else n + sumN(n - 1)

    // try-catch
   val attempt = try {
     // block of code that can crash
     println(sumN(500000))
   } catch {
      case e: IllegalStateException => -1
      case e: RuntimeException => Int.MaxValue
    }

  def main(args: Array[String]): Unit = {
    println(sumN(500000))
  }

}
