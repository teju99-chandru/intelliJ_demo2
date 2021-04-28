class Car1 {

    // Class variables
    var make: String = "BMW"
    var model: String = "X7"
    var fuel: Int = 40
    // Class method
    def Display()
    {
      println("Make of the Car : " + make)
      println("Model of the Car : " + model)
      println("Fuel capacity of the Car : " + fuel)
    }
  }
  object Main
  {
    // Main method
    def main(args: Array[String])
    {
      // Class object
      var obj = new Car1()
      obj.Display()
    }

}
