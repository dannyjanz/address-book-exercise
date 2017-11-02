sealed trait Gender {
  def name: String
}

case object Male extends Gender {
  val name = "Male"
}

case object Female extends Gender {
  val name = "Female"
}