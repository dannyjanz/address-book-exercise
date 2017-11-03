package addressbook.person

import addressbook.MockData
import addressbook.MockData.WesJackson
import org.scalatest.{FlatSpec, Matchers}

import scala.util.Success

class FindUTest extends FlatSpec with Matchers {

  "Finding the oldest person in a sequence or Person" should "return the Person where the birthday " +
    "is the earliest date of all" in {

    Find.oldestPerson(MockData.persons) shouldBe WesJackson

  }

  it should "return the first person with the lowest date in the sequence if there are several Persons " +
    "with that same date as the birthday present" in {

    val WizJocksen = WesJackson.copy(firstName = "Wiz", lastName = "Jocksen")

    Find.oldestPerson(MockData.persons :+ WizJocksen) shouldBe WesJackson

  }

  "Finding a person by first name" should "return a Success of a Person if the sequence contains a Person " +
    "where the first name matches" in {

    Find.byFirstName(MockData.persons, WesJackson.firstName) shouldBe Success(WesJackson)

  }

  it should "result in a Failure when no Person with the given first name is in the sequence" in {

    Find.byFirstName(MockData.persons, "Waldo") should be a 'failure
  }

}
