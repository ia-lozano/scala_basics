package com.rockthejvm.playground.part2oop

object Inheritance {

  class VideoGame {
    val gameType = "interactive"
    def play(): Unit = println("game running!")
  }

  // single-class inheritance
  class Shooter extends VideoGame {
    // can define my own fields/methods
    def multiplayer(): Unit= {
      play()
      println("Connecting to the server....")
    }
  }

  // inherit constructor
  class Person(val name: String, age: Int)
  class Adult(name:String, age: Int) extends Person(name, age) // MUST Specify constructor arguments

  val daniel = new Adult("Daniel", 0)

  val postal2 = new Shooter

  // overriding = provide a new impl for methods in derived classes
  class RPG extends VideoGame {
    override val gameType = "role-playing"
    override def play(): Unit = println("Level Up")
  }

  val fearAndHunger = new RPG

  // subtype polymorphism
  val darkSouls: VideoGame = new RPG // declare a value of a parent type,, provide an instance of a derived type

  // anonymous classes
  val psychonauts = new VideoGame {
    override val gameType = "Platformer"
  }

  /*
  * class AnnonClass$123 extends VideoGame {
      override val gameTYpe = "platformer"
   */

  def main(Args: Array[String]): Unit = {
    println(postal2.gameType)
    postal2.multiplayer()
    println(daniel.name)

    println(fearAndHunger.gameType)
    fearAndHunger.play()


    println(darkSouls.gameType)
    darkSouls.play()
  }
}
