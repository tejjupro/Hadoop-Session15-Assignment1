/*
 * Child classes Car  that inherit the Vehicle class.
 */

package inheritanceDemo

class Car(speed:Int) extends Vehicle(speed){
  
  //override the mph and race() methods .
  override val mph : Int=speed
  override def race() = println("Racing Car")
}