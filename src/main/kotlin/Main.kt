fun main() {
    print(solution("qqq"))
}

fun solution(inputString: String): Boolean {
    val map = HashMap<Char, Int>()

    for (i in inputString.indices) {
        map[inputString[i]] = (map[inputString[i]] ?: 0) + 1
    }

    map.forEach {
        if (it.value % 2 != 0)
            return false
    }

    return true
}
