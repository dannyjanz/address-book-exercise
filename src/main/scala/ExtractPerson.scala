
import scala.util.{Failure, Success, Try}

object ExtractPerson {

  def apply(person: String): Try[Person] = {

    person split ',' match {
      case Array(name, gender, birthday) =>
        for {
          (firstName, lastName) <- extractName(name)
          birthdayDate <- ExtractDate(birthday.trim)
        } yield {
          Person(firstName, lastName, gender.trim, birthdayDate)
        }

      case _ => Failure(new IllegalArgumentException(s"'$person' does not match the expected format"))
    }
  }

  private def extractName(name: String) = name split ' ' match {
    case Array(firstName, lastName) => Success((firstName.trim, lastName.trim))
    case _ => Failure(new IllegalArgumentException(s"The name '$name' does not match the expected format"))
  }


}
