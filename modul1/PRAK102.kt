fun hitung(){
    print("Nilai x = ")
    val x = readLine()
    val konversi =  ((2 * (x?.toInt() ?: 0) * (x?.toInt() ?: 0)) + (5 * (x?.toInt() ?: 0)) - 8)
    println(konversi)
}

fun main(args: Array<String>){
    hitung()
}

