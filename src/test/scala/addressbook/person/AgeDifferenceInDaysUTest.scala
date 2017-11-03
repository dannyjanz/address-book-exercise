package addressbook.person

import java.time.LocalDate

import org.scalatest.{FlatSpec, Matchers}

class AgeDifferenceInDaysUTest extends FlatSpec with Matchers {

  val mrYoung = Person("Mr", "Young", Male, LocalDate.of(1987, 5, 1))
  val msOld = Person("Ms", "Old", Female, LocalDate.of(1987, 5, 16))

  "The age difference in days" should "return the difference between two persons birthdays in days " in {

    AgeDifferenceInDays(mrYoung, msOld) shouldBe 15
    AgeDifferenceInDays(mrYoung, mrYoung) shouldBe 0

  }

  it should "return the same result regardless of order of the two persons" in {

    AgeDifferenceInDays(msOld, mrYoung) shouldBe AgeDifferenceInDays(mrYoung, msOld)

  }

}
