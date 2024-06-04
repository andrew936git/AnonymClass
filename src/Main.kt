import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    val  array = arrayOf("яблоко", "груша", "апельсин",
        "банан", "арбуз", "дыня", "виноград")
    var num = array[0].length
    var word = array[0]
    for (i in 0 .. array.size - 1){
        when{
            num <= array[i].length -> {
                num = array[i].length
                word = array[i]
            }
        }
    }
    println("Самое длинное слово: \"$word\", число букв в нем: $num")
    println("----------------------------------------------------------")
//2
    var random = Random
    val arrayInt: Array<Array<Int>> = Array(4) { Array(4) { random.nextInt(0,10) } }
    var count = 0
    for (i in arrayInt.indices){
        for (j in arrayInt.indices){
            print("${arrayInt[i][j]}\t")
        }
        println()
    }
    for (i in arrayInt.indices){
        for (j in arrayInt.size-1 downTo 0)
            if (i + j == arrayInt.size-1){
                count += arrayInt[i][j]
            }
    }
    println()
    println("Сумма элементов побочной диагонали = $count")
    println("----------------------------------------------")
//3
    val hp135 = object : Printer("HP", "HP Laser 135a", false,20){
        override fun printInfo(){
            println("Производитель $manufacturer, модель $model, " +
                    "двусторонняя печать - ${if(haveDuplex)"да" else "нет"}, скорость печати $speed стр/мин")
        }

        override fun printProcessing(): String {
            return if (haveDuplex) "идет двусторонняя печать"
            else "идет печать"
        }
    }
    hp135.printInfo()
    println(hp135.printProcessing())

    val lex812 = object :Printer("Lexmark", "MS812", true, 60){
        override fun printInfo() {
            println("Производитель $manufacturer, модель $model, " +
                    "двусторонняя печать - ${if(haveDuplex)"да" else "нет"}, скорость печати $speed стр/мин")
        }

        override fun printProcessing(): String {
            return if (haveDuplex) "идет двусторонняя печать"
            else "идет печать"
        }
    }
    lex812.printInfo()
    println(lex812.printProcessing())
    println("-------------------------------------------------------------")
//4 переделанное последнее задание из предыдущей домашней работы
    val name = "Шумоизоляция".lowercase().toCharArray()
    val charCount = mutableMapOf<Char, Int>()
    for (i in name){
        val count = charCount.getOrDefault(i, 0)
        charCount[i] = count + 1
    }
    val newChar = charCount.filter { it.value > 1 }
    println(newChar)
}