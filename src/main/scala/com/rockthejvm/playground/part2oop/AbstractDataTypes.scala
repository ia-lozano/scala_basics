package com.rockthejvm.playground.part2oop

object AbstractDataTypes {

  // Abstract classes

  abstract class VideoGame {
    val gameType: String
    def play(): Unit

    // can provide "normal" fields or methods
    def runningPlatform: String = "PS5"
  }

  // * Cannot be instantiated
  // val VideoGame: VideoGame = new VideoGame

  // derived classes must be either abstract or with an impl for gameType
  class Shooter extends VideoGame {
    override val gameType: String = "FPS"
    override def play(): Unit = println("connecting to the server...")
  }

  // Traits
  trait ThirdPerson {
    def showPerspective(game: VideoGame): Unit
}

  // traits can be extend other traits
  trait OpenWorld extends ThirdPerson {
    override def showPerspective(game: VideoGame): Unit =
      println("Open World, third person shooter")
  }

  trait StoryLine {
    def mainCharacter: String
  }


  // abstract classes vs traits
  // a class can extend ONE class, but multiple traits
  class MassEffect extends VideoGame with OpenWorld with StoryLine {
    // gameType, play, mainCharacter
    override val gameType = "open-world / story"
    override def play(): Unit = println("something")
    override def mainCharacter: String = "commander Shephard"
  }

  def main(args: Array[String]): Unit = {
    val CSGO = new Shooter
    println(CSGO.runningPlatform)
  }

}
