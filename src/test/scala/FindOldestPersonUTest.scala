import MockData._
import org.scalatest.{FlatSpec, Matchers}

class FindOldestPersonUTest extends FlatSpec with Matchers {

  "Finding the oldest person in a sequence or Person" should "return the Person where the birthday " +
    "is the earliest date of all" in {

    FindOldestPerson(MockData.persons) shouldBe WesJackson

  }

  it should "return the first person with the lowest date in the sequence if there are several Persons " +
    "with that same date as the birthday present" in {

    val WizJocksen = WesJackson.copy(firstName = "Wiz", lastName = "Jocksen")

    FindOldestPerson(MockData.persons :+ WizJocksen) shouldBe WesJackson

  }

}
