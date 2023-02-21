import scala.collection.immutable.Stream.Cons
object Pattern_matching extends App {
  val x: Any = "Scala"

  val constants = x match {
    case 1                => "a number"
    case "Scala"          => "The Scala"
    case true             => "The truth"
    case Pattern_matching => "A singleton object"
  }

//    match anything
  val matchAnything = x match
    case _ => "anything"

    // variable

  val matchVariable = x match {
    case something => s"I have found $something"
  }

//   list patterns

  val list1 = List(1, 2, 3, 5)

  val matchList = list1 match {
    case List(1, _, _, _)    => "match first element"
    case List(1, _*)         => "match first and arbitrary length"
    case 1 :: List(_)        => "infix pattern"
    case List(1, 2, 3) :+ 42 => "infix pattern with appended number at the end"
  }

//   type specifics

  val unKnown: Any = 2
  val unKnownMatch = unKnown match {
    case list: List[Int] => "explicit type specifier"
    case _               => "Anything"
  }

//   multi-Pattern
  val specialElement = List(1, 2)
  val secondElementSpecial = list1 match {
    case Cons(_, Cons(specialElement, _)) if specialElement % 2 == 0 =>
      "multi pattern matching"
  }
}
