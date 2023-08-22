def upperString(value: String): Either[String, String] = {
  if (value.isEmpty) Left("Value cannot be empty")
  else Right(value.upper)
}