package com.rockthejvm.playground.part3fp

object ListsDemo {

  // singly linked list
  val aList: List[Int] = List.apply(1, 2, 3)
  // first element (head), rest of the list (tail)
  val firstElement: Int = aList.head
  val rest = aList.tail
  // add (prepend) an element to a list
  val biggerList = 0 :: aList // [0, 1, 2, 3] - returns a new list
  // add (append) an element at the end of the list
  val biggerList_v2 = aList :+ 4 // [1, 2, 3, 4] - new list

  // utility methods
  // fill
  val scalax5 = List.fill(4)("Scala") // ["Scala, Scala, Scala, Scala]
  // reverse a list
  val reversedList = aList.reverse // new list [3, 2, 1]
  // concatenate with another list
  val concatenation = aList ++ List(4,5,6) // new list [1, 2, 3, 4, 5, 6]
  // format the collection
  val stringRep = aList.mkString("|") // "1|2|3"
  val stringRep_v2 = aList.mkString("[", ",", "]") // "[1, 2, 3]"
  // combine all elements in a list
  val total = aList.reduce((a,b) => a + b) // [6]

  //map - transforms a list by applying a function on every element of that list
  /**
   * val anArray = [1,2,3]
   * val result = Array[3]
   * for (int i=0; i < anArray.size; i++)
   *     result[i] = anArray[i]*3
   * return result
   */
  val tenxList = aList.map(x => x*10) // [10, 20, 30]
  val scalaList = aList.map(x => s"Scala $x")

  // filter - transform a list by just keeping the items satisfying a boolean function
  /**
   * val result = Array[3]
   * for(int i = 0; i < array.length; i++
   *     if (array[i] % 2 == 0
   *         result[index] = array[i]
   * return result
   */
  val evenNumbers = aList.filter(x => x % 2 == 0) // [2] - a new list, the old one is intact

  // higher-order functions = take other functions as arguments/return functions as results
  // flatMap - transforms a list by applying the function to every element
  val expandedList = aList.flatMap(x => List(x, x + 1)) // [1, 2, 3, 4, 5, 6]
  //  applying map, the result would be: [[1, 2], [2, 3], [3, 4]]


  def main(args: Array[String]): Unit = {
    println(aList.toString)
    println(biggerList)
    println(biggerList_v2)
    println(stringRep_v2)
    println(total)
    println(scalaList)
    println(evenNumbers)

  }

}
