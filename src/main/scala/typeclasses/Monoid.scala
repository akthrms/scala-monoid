package typeclasses

trait Monoid[A] extends Semigroup[A] {
  def empty: A
}

object Monoid {
  def append[A](x: A, y: A)(implicit monoid: Monoid[A]): A = monoid.append(x, y)

  def empty[A](implicit monoid: Monoid[A]): A = monoid.empty

  def concat[A](xs: A*)(implicit monoid: Monoid[A]): A = xs.fold(monoid.empty)(monoid.append)
}
