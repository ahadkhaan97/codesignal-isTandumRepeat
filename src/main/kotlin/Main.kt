fun main() {
    print(solution("AAAAAA"))
}

fun solution(inputString: String): Boolean {

    val map = HashMap<Char, Int>()

    var count = 0

    for (i in inputString.indices) {
        if (inputString[i].isUpperCase())
            count++
        map[inputString[i]] = (map[inputString[i]] ?: 0) + 1
    }

    if (count != inputString.length && inputString[0].isUpperCase() && inputString[inputString.length - 1].isUpperCase())
        return false

    map.forEach {
        if (it.value % 2 != 0)
            return false
    }

    return true
}
