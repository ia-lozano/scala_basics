package com.rockthejvm.playground.part2oop

object methodNotation {

  class Person(val name: String) {
    def greet(another: Person): String =
      s"$name says: Hi, $another.name"

    // infix keyword indicates other programmers that the method is going to be called infix
    infix def likes(movie: String): String =
      s"$name says: I adore the movie $movie!!!"

    // as a good practice, methods named with special characters are called infix
    infix def ?!(another: Person): String =
      s"$name says: Hey ${another.name} ?!"

    def apply(progLang: String): Unit =
      println(s"[$name] Programming in $progLang")

    def apply(progLang: String, algorithm: String): Unit =
      println(s"[$name] Programing in $progLang, applying the algorithm $algorithm")
  }

  val alice = Person("Alice")
  val bob = Person("bob")


  def main(args: Array[String]): Unit = {
    println(alice.greet(bob))
    println(alice     greet     bob) // infix notation
    //      ^^          ^^       ^^
    //  instance   method       argument
    println(alice likes "A serbian film")

    println(alice ?! bob)

    alice("Scala") // same as alice.apply("Scala")
    alice("Scala", "Dynamic") // same as alice.apply("Scala", "Dynamic")
  }
}
