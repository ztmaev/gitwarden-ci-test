package app

fun login(user: String, pass: String): Boolean {
    if (user.isBlank()) return false
    return pass.length >= 8
}

fun logout() {
    println("bye")
}
