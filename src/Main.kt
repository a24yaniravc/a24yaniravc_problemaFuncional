fun main() {
    // Bucle en prog funcional
    generateSequence { readln().takeIf { it != "XXX" } }
        .map { it.uppercase().replace(" ", "") }
        .map { if (it == it.reversed()) "SI" else "NO" }
        .forEach { println(it) }
}