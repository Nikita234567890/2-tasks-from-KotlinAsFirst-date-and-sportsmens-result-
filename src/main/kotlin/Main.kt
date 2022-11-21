

operator fun Boolean.invoke(value: () -> Any): Boolean {


    return TODO("Provide the return value")
}

operator fun <T> Array<T>.get(intRange: IntRange): T {

    return TODO("Provide the return value")
}









/**
 * Средняя (4 балла)
 *
 * Дата представлена строкой вида "15 июля 2016".
 * Перевести её в цифровой формат "15.07.2016".
 * День и месяц всегда представлять двумя цифрами, например: 03.04.2011.
 * При неверном формате входной строки вернуть пустую строку.
 *
 * Обратите внимание: некорректная с точки зрения календаря дата (например, 30.02.2009) считается неверными
 * входными данными.
 */
fun main() {
    //initial data
    val dataArrn = arrayOf('1','2','3','4','5','6','7','8','9','.')
    val dataArrw = arrayOf("january",
        "february","march","april","may","june","july","august","september","october","november","december")
    //input data
    print("Enter the date:")
    var input = readLine()
    input = input!!.trim()
    var wasStringCorrect: Boolean?= null

    if ((input[0] == dataArrn[0..10] ))

        {
             checkString(input, 0,dataArrn,dataArrw)
    }
        else
    {

    }
    if ((input[1]== dataArrn[0..10]))
    {
        checkString(input, 1,dataArrn,dataArrw)
    }
    else
    {

    }


    return TODO("Provide the return value")
}