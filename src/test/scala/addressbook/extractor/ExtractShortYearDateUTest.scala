package addressbook.extractor

import java.time.LocalDate

import org.scalatest.{FlatSpec, Matchers}

import scala.util.Success

class ExtractShortYearDateUTest extends FlatSpec with Matchers {


  "extracting a date from a valid date string" should "result in a new LocalDate with the year in the " +
    "twentieth century" in {

    ExtractShortYearDate("06/05/99") shouldBe Success(LocalDate.of(1999, 5, 6))
    ExtractShortYearDate("06/05/87") shouldBe Success(LocalDate.of(1987, 5, 6))
    ExtractShortYearDate("06/05/00") shouldBe Success(LocalDate.of(1900, 5, 6))

  }

  "attempting to extract an invalid date" should "result in a failure" in {

    ExtractShortYearDate("06/13/87") should be a 'failure
  }

}
