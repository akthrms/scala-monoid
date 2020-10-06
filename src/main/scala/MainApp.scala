import typeclasses._

object MainApp extends App {
  implicit def intMonoid: Monoid[Int] = new Monoid[Int] {
    override def empty: Int = 0

    override def append(x: Int, y: Int): Int = x + y
  }

  assert(Monoid.concat(1, 2, 3) == 6)
}
