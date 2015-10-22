import org.scalatest.{Matchers, WordSpec}

class ComplexTupleSpec extends WordSpec with Matchers {

    import ComplexTuple._

  "ComplexTuple" should {

    "add real/imag to Tuples" in {

      val complex = (1, 2)

      complex.real shouldBe 1
      complex.imag shouldBe 2

      val N = 8
      val seq = for (real <- 1 to N; imag <- 1 to N) yield (real, imag)
      val mapped = seq.map(c => c.real + c.imag)

      mapped.sum shouldBe (2 * N * (((N + 1) * N) / 2))
    }
  }

}
