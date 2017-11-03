package addressbook.person

object CountMales {

  def apply(persons: Seq[Person]): Int = persons.count(_.gender == Male)

}
