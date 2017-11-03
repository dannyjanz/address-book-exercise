package addressbook.extractor

import addressbook.person.{Female, Male}
import org.scalatest.{FlatSpec, Matchers}

import scala.util.Success

class ExtractGenderUTest extends FlatSpec with Matchers {

  "Extracting a Gender from a String" should "result in the corresponding Gender with the " +
    "name matching the given String" in {

    ExtractGender("Male") shouldBe Success(Male)
    ExtractGender("Female") shouldBe Success(Female)

  }

  "Attempting to extract a Gender from an unknown String" should "result in a Failure" in {

    ExtractGender("David Bowie") should be a 'failure

  }

}
