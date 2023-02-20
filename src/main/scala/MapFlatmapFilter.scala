object MapFlatmapFilter extends App {
  val list = List(1, 2, 3)
  println(list.head)
  println(list.tail)

//   map
  println(list.map(_ + 1))
  println(list.map(_ + " is a number"))

//  filter
  println(list.filter(_ % 2 == 0))

//   flatmap
  val toPair = (x: Int) => List(x, x + 1)
  println(list.flatMap(toPair))

// iterating in functional programming
  val numbers = List(1, 2, 3, 4)
  val chars = List('a', 'b', 'c', 'd')
  val colors = List("black", "white")

  val combinations = numbers.flatMap(number =>
    chars.flatMap(char => colors.map(color => "" + char + number + color))
  )
  println(combinations)

  // foreach
  numbers.foreach(println)

//   for-Comprehensions
  val forCombinations = for {
    n <- numbers if n % 2 == 0
    c <- chars
    color <- colors
  } yield "" + c + n + "-" + color

  println(forCombinations)

//   syntax overload
  println(list.map { x => x * 2 })

}
