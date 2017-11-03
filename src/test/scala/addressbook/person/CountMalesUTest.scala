package addressbook.person

import addressbook.MockData
import org.scalatest.{FlatSpec, Matchers}

class CountMalesUTest extends FlatSpec with Matchers {

  "counting males in a sequence of Person" should "return the number of Person where gender is equals 'Male'" in {

    CountMales(MockData.persons) shouldBe 3
    CountMales(Seq.empty) shouldBe 0

  }

}
