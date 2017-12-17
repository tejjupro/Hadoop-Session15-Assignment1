/*
 *  Child classes  Bike that inherit the Vehicle class.
 */
package inheritanceDemo

class Bike(speed:Int) extends Vehicle(speed){
  
  //override the mph and race() methods .
  override val mph : Int=speed
  override def race() = println("Racing Bike")
}