def upperString(value: String): Option[String] = {
  if (value.isEmpty) None
  else Some(value.upper)
}