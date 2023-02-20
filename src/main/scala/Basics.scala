object Basics extends App {
  //  ALL SCALA FUNCTIONS ARE OBJECTS
  //  use functions as first class elements
  // problem: OOP
  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }
  println(doubler(2))

//   Functions supported in Scala
// Function1 receives 1 parameter
  val stringToIntConverter = new Function1[String, Int] {
    override def apply(value: String): Int = value.toInt
  }

  println(stringToIntConverter("3") + 4)

// Function2 receives 2 parameters
//   val adder: Function2[Int,Int,Int] = new Function2[Int, Int, Int] {
// syntactic sugar
  val adder: ((Int, Int) => Int) = new Function2[Int, Int, Int] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }

  println(adder(1, 2))

}
trait MyFunction[A, B] {
  def apply(element: A): B
}
