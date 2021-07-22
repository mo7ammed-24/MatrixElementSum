fun main() {
    println(matrixElementsSum(mutableListOf(mutableListOf(0,1,1,2), mutableListOf(0,5,0,0), mutableListOf(2,0,3,3))))
}

fun matrixElementsSum(matrix: MutableList<MutableList<Int>>): Int {
    var summation = 0
    for (j in 0 until matrix[0].size)
        for (i in 0 until matrix.size)
            summation += if (matrix[i][j] > 0) matrix[i][j] else break
    return summation
}
