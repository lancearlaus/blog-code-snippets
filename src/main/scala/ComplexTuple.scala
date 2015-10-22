

object ComplexTuple {

  type Complex[T] = (T, T)

  implicit class ComplexOps[T](val tuple: (T, T)) extends AnyVal {
    def real = tuple._1
    def imag = tuple._2
  }

}
