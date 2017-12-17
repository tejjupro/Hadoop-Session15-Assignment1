/*
 * Parent class called Vehicle.
 */

package inheritanceDemo

class Vehicle(speed:Int) {
  val mph :Int = speed
  
  def race() = println("Racing")
}