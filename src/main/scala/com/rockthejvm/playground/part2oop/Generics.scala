package com.rockthejvm.playground.part2oop

object Generics {

  // A link list is an element with a pointer to the rest of the list
  // 1 -> 2 -> 3 -> 4 -> 5

  /*
  abstract class IntList {
    def first: Int
    def rest: IntList
  }
  class EmptyList extends IntList{
    def first: Int = throw new NoSuchElementException()
      def rest: IntList = throw new NoSuchElementException()
  }

  case class NonEmptyIntList(a: Int, r: IntList) extends IntList {
    def first: Int = a
    def rest: IntList = r
  }

  // reuse this logic on Strings
  // 1 - copy everything - impossible
  // 2 - move the type safety, use Any - defeats the porpuse
  abstract class AnyList {
    def first: Any
    def rest: AnyList
  }

  class EmptyAnyList extends AnyList {
    def first: Any = throw new NoSuchElementException()
    def rest: AnyList = throw new NoSuchElementException()
  }

  case class NonEmptyAnyIntList(a: Any, r: AnyList) extends AnyList {
    def first: Any = a
    def rest: AnyList = r
  }
  */


  // Type parameters = generics
  abstract class AnyList[A] {
    def first: A
    def rest: AnyList[A]
    def isEmpty: Boolean
  }

  class EmptyAnyList[A] extends AnyList[A] {
    def first: A = throw new NoSuchElementException()
    def rest: AnyList[A] = throw new NoSuchElementException()
    def isEmpty = true
  }

  case class NonEmptyAnyIntList[A](a: A, r: AnyList[A]) extends AnyList[A] {
    def first: A = a
    def rest: AnyList[A] = r
    def isEmpty = false
  }

  // can add type arguments/generics to traits, abstract classes, case classes, normal clases

  // can add multiple type arguments to classes/traits/...
  trait MyMap[K, V]

  // can add type args for methods
  def second[A](list: AnyList[A]) =
    if (list.isEmpty) throw new NoSuchElementException()
    else if (list.rest.isEmpty) throw new NoSuchElementException()
    else list.rest.first

  def main(args: Array[String]): Unit = {
    val numbers = NonEmptyAnyIntList(1, NonEmptyAnyIntList(2, NonEmptyAnyIntList(3, new EmptyAnyList)))
    val firstNumber = numbers.first

    val strings = NonEmptyAnyIntList("Scala", NonEmptyAnyIntList("Rocks", new EmptyAnyList))
    val firstString = strings.first

    println(second(numbers)) // 2
    println(second(strings)) // Rocks
  }

}
