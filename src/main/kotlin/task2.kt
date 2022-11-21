

/**
 * Средняя (5 баллов)
 *
 * Результаты спортсмена на соревнованиях в прыжках в длину представлены строкой вида
 * "706 - % 717 % 703".
 * В строке могут присутствовать числа, черточки - и знаки процента %, разделённые пробелами;
 * число соответствует удачному прыжку, - пропущенной попытке, % заступу.
 * Прочитать строку и вернуть максимальное присутствующее в ней число (717 в примере).
 * При нарушении формата входной строки или при отсутствии в ней чисел, вернуть -1.
 */
fun main() {
    var ArrRes = arrayOf('1','2','3','4','5','6','7','8','9','0','%','-',' ')
    var wasStringcorrect: Boolean? = null
    print("Enter the sportsmens result:")
    var input = readLine()
input = input!!.trim()
    if (input!![0] == '7')
    {
        wasStringcorrect=checkString(input,1,ArrRes)
    }
    else
    {
        wasStringcorrect=checkString(input,0,ArrRes)
    }
    println(wasStringcorrect)
    var a = input.substring(0,3)
    var b = input.substring(8,11)
    var c = input.substring(14,17)
    if (input[0] > input[9]){

    }
    else if (input[0] > input[13]){

    }
    else if (input[1]> input[9]){
    }
    else if (input[1]> input[15]){

    }
    else (input[9] > input[0])
    run {
        println(maxOf(input.substring(a, b, c)))
    }




}

private fun String.substring(a: String, b: String, c: String): String {
    return maxOf(a,b,c)

}


fun checkString(input: String, i: Int,ArrRes : Array<Char>): Boolean {
    for (i in i until input.length) {
        if (ArrRes.contains(input[i]))
        {
            continue
        }
        else
        {
            return false
        }
    }
    return true
}