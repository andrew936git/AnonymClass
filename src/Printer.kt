abstract class Printer(
    val manufacturer: String,
    val model: String,
    val haveDuplex: Boolean,
    val speed: Int
) {
    abstract fun printInfo()
    abstract fun printProcessing():String
}