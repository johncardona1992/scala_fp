object Anonymous_Functions extends App {
  // Lambda function
  val doubler = (x: Int) => x * 2
  println(doubler(2))

  // same function with types
  val doubler2: Int => Int = (x: Int) => x * 2
  println(doubler2(2))

  //   multiple parameters
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b
  println(adder(2, 3))

  // no Params
  val justDoSomething = () => 11
  println(justDoSomething())
  // with types
  val justDoSomething2: () => Int = () => 11
  println(justDoSomething2())

// curly braces with lambdas, common style
  val stringToInt = { (str: String) => str.toInt }
  println("2")

  val niceIncrementer: Int => Int = (x: Int) => x + 1
  //   MOAR syntactic sugar
  val niceIncrementer2: Int => Int = _ + 1
  // another example with 2 parameters
  val niceAdder: (Int, Int) => Int = _ + _ // equivalent to (a,b) => a + b

}
