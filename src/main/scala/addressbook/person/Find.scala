package addressbook.person

import scala.util.{Failure, Success, Try}

object Find {

  def byFirstName(persons: Seq[Person], firstName: String): Try[Person] =
    persons.find(_.firstName == firstName) match {
      case Some(person) => Success(person)
      case None => Failure(new IllegalArgumentException(s"There is no '$firstName' in the address Book"))
    }

  def oldestPerson(persons: Seq[Person]): Person = persons.sortWith { (person_1, person_2) =>
    person_1.birthday isBefore person_2.birthday
  }.head

}
