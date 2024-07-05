package com.rockthejvm.playground.part2oop

object OOPExercises {
  /*
  * Imagine we are doing an app for car registration
  * Create a Car and a Driver class
  *
  * Car: make, model, year of release, owner
  *    - method ownerAge
       - method isOwnedBy(driver:Driver) - boolean if the driver is the same as the owner
  *    - copy (newYearOfRelease - returns a new Car instance with the same data except the new year of release
  *
  * Driver: first name, last name, year of birth
  *   - method full name
   */
  class Driver(fName: String, lName: String, val yearOfBirth: Int){
    def fullName(): String =
      f"$fName $lName"
  }

  class Car(make: String, model: String, yearOfRelease: Int, owner: Driver){
    def ownerAge(): Int = yearOfRelease - owner.yearOfBirth

    def isOwnedBy(driver: Driver): Boolean = driver == owner

    def copy(newYearOfRelease: Int): Car =
    new Car(make, model, newYearOfRelease, owner)
  }

  def main(Args: Array[String]): Unit = {
    val driver1 = new Driver("driver1", "default", 2000)
    val driver2 = new Driver("driverDummy", "default", 2001 )

    val car = new Car("Toyota", "Supra", 1998, driver1)

    println(driver1.fullName())
    println(car.ownerAge())
    println(car.isOwnedBy(driver1))
    println(car.isOwnedBy(driver2))
    println(car.copy(2005))

  }
}
