import java.time.LocalDate

import org.scalatest.{FlatSpec, Matchers}

import scala.util.Success

class ExtractPersonUTest extends FlatSpec with Matchers {

  "extracting a Person from a correctly formatted String" should "result in a Success of a Person with " +
    "the corresponding values" in {

    ExtractPerson("Bill McKnight, Male, 16/03/77") shouldBe Success(
      Person("Bill", "McKnight", Male, LocalDate.of(1977, 3, 16))
    )
  }

  "attempting to extract a Person from an invalid String" should "result in a Failure" in {

    ExtractPerson("Bill, Male, 16/03/77") should be a 'failure
    ExtractPerson("Bill McKnight, Alien, 16/03/77") should be a 'failure
    ExtractPerson("Bill, Male, 16/15/77") should be a 'failure
  }

}
