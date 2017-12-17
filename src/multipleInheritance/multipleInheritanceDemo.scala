/*
 * Driver program which creates an object of Dog, for showing how multiple inheritance works
 */

package multipleInheritance

object multipleInheritanceDemo extends App {
  val zeus = new Dog("Zeus") //create object
  zeus.ownerIsHome//calling method of abstract class Pet
  zeus.wagTail //calling method of trait Tail
  zeus.speak  //calling method of Dog
}