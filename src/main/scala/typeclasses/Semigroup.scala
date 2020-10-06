package typeclasses

trait Semigroup[A] {
  def append(x: A, y: A): A
}

object Semigroup {
  def append[A](x: A, y: A)(implicit semigroup: Semigroup[A]): A = semigroup.append(x, y)
}
