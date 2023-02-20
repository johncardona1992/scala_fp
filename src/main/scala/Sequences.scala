object Sequences extends App {
  // seq
  val aSequence = Seq(1, 2, 3, 4)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2))
  println(aSequence ++ Seq(7, 5, 6))
  println(aSequence.sorted)

  // ranges
  val aRange: Seq[Int] = 1 until 10
  aRange.foreach(println)

  (1 to 10).foreach(x => println("Hello"))

  // lists
  val aList = List(1, 2, 3)
  val prepended = 42 :: aList
  println(prepended)
  val append = 41 +: aList :+ 11
  println(append)
  println(aList.mkString("-|-"))

  // fill
  val apples5 = List.fill(5)("apple")
  println(apples5)

  // arrays
  val numbers = Array(1, 2, 3, 4)
  val threeElements = Array.ofDim[String](3)
  threeElements.foreach(println)

  // mutation
  numbers(2) = 0 // syntax sugar for numbers.update(2,0)
  println(numbers.mkString)
}
