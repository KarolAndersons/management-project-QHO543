
class DataStore(
    val students: MutableList<Student> = mutableListOf(),
    val administrators: MutableList<Administrator> = mutableListOf(),
    val events: MutableList<CommunityEvent> = mutableListOf(),
    val reservations: MutableList<Reservation> = mutableListOf()
)
