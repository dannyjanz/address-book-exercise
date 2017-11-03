package addressbook.extractor

import addressbook.person.Person

import scala.util.{Failure, Success, Try}

object ExtractPerson extends (String => Try[Person]) {

  def apply(person: String): Try[Person] = person split ',' match {
    case Array(nameString, genderString, birthdayString) =>
      for {
        (firstName, lastName) <- extractName(nameString.trim)
        birthdayDate <- ExtractShortYearDate(birthdayString.trim)
        gender <- ExtractGender(genderString.trim)
      } yield {
        Person(firstName, lastName, gender, birthdayDate)
      }

    case _ => Failure(new IllegalArgumentException(s"'$person' does not match the expected format"))
  }

  private def extractName(name: String) = name split ' ' match {
    case Array(firstName, lastName) => Success((firstName.trim, lastName.trim))
    case _ => Failure(new IllegalArgumentException(s"The name '$name' does not match the expected format"))
  }


}
