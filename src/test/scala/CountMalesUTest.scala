import org.scalatest.{FlatSpec, Matchers}

class CountMalesUTest extends FlatSpec with Matchers {

  "counting males in a sequence of Person" should "return the number of Person where gender is equals 'Male'" in {

    CountMales(MockData.persons) shouldBe 3

  }

}
