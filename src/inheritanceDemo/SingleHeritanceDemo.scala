/*
 * Driver class which has the main method,
 * We create a Car object and a Bike object and we then access there property mph and method race.
 * 
 */
package inheritanceDemo

object SingleHeritanceDemo {
  def main(args: Array[String]) {
    
    //creating object of Car
   val vehicle1 = new Car(150)
    println(vehicle1.mph )
    vehicle1.race()
    
     //creating object of Bike
    val vehicle2 = new Bike(100)
    println(vehicle2.mph )
    vehicle2.race()
  }
}