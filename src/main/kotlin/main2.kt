
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
fun main () {
//initial data
    var dataArrn: Array<Char> = arrayOf('1','2','3','4','5','6','7','8','9','.')
    var dataArrw: Array<String> = arrayOf("january",
        "february","march","april","may","june","july","august","september","october","november","december")
    //input data
    print("Enter the date:")
    var input = readLine()
    try {
        if (input!![0] == dataArrn[0]) {
            println("The first figure is valid ")
        } else if (input!![0] == dataArrn[1]) {
            println("The first figure is valid")
        } else if (input!![0] == dataArrn[2]) {
            println("The first figure is valid")
        } else if (input!![0] == dataArrn[3]) {
            println("The first figure is valid")
        } else if (input!![0] == dataArrn[4]) {
            println("The first figure is valid")
        } else if (input!![0] == dataArrn[5]) {
            println("The first figure is valid")
        } else if (input!![0] == dataArrn[6]) {
            println("The first figure is valid")
        } else if (input!![0] == dataArrn[7]) {
            println("The first figure is valid")
        } else if (input!![0] == dataArrn[8]) {
            println("The first figure is valid")
        }
        else {
            println("The first figure is not valid")
        }

               if (input!![1] == dataArrn[0]) {
                   println("The second figure is valid")
               } else if (input!![1] == dataArrn[1]) {
                   println("The second figure is valid")
               } else if (input!![1] == dataArrn[2]) {
                   println("The second figure is valid")
               } else if (input!![1] == dataArrn[3]) {
                   println("The second figure is valid")
               } else if (input!![1] == dataArrn[3]) {
                   println("The second figure is valid")
               } else if (input!![1] == dataArrn[4]) {
                   println("The second figure is valid")
               } else if (input!![1] == dataArrn[5]) {
                   println("The second figure is valid")
               } else if (input!![1] == dataArrn[6]) {
                   println("The second figure is valid")
               } else if (input!![1] == dataArrn[7]) {
                   println("The second figure is valid")
               } else if (input!![1] == dataArrn[8]) {
                   println("The second figure is valid")
               } else {
                   println("The second figure is not valid")
               }
        run {
            println(input.replace(' ', '.',).replace("january", "01")
                .replace("february","02").replace("march","03").replace("april","04")
                    .replace("may","05").replace("june","06").replace("july","07")
                    .replace("august","08").replace("september","09").replace("october","10")
                    .replace("november","11").replace("december","12"))


        }






        } catch (e: Exception) {
            println("Exception")
            println(e.message)
        }

    }



fun checkString (input: String, i : Int, dataArrn : Array<Char>,dataArrw: Array<String> ): Boolean{
for (i in i  .. input.length){
    if (dataArrn.contains(input[i])) {
        continue
    }
      else
    {
        return false
    }
}
    return true
}