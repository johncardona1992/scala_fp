object Options extends App {
  val myFirstOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None

  println(myFirstOption)

  // unsafe APIs

  def unsafeMethod(): String = null
//   vall result =  Some(unsafeMethod) // WRONG!
// instead use the option conatins apply
  val result = Option(unsafeMethod()) // Some or None
  println(result)

//   chained methods
  def backUpMethod(): String = "A valid result"
  val chainedResult = Option(unsafeMethod()).orElse(Option(backUpMethod()))

//   DESIGN unsafe APIs
  def betterUnsafeMethod(): Option[String] = None
  def betterBackupMethod(): Option[String] = Some("A valid result")

  val betterChainedResult = betterUnsafeMethod() orElse betterBackupMethod()

//   functions on Options
  println(myFirstOption.isEmpty)
  println(myFirstOption.get)

//   map, flatMap, filter
  println(myFirstOption.map(_ * 2))
  println(myFirstOption.filter(x => x > 10))
  println(myFirstOption.flatMap(x => Option(x * 10)))

}
