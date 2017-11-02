object FindOldestPerson {

  def apply(persons: Seq[Person]): Person = persons.sortWith { (person_1, person_2) =>
    person_1.birthday isBefore person_2.birthday
  }.head

}
