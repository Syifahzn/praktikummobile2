import java.util.*

fun main(args:Array<String>){
    val input = Scanner(System.`in`)
    print("Input bilangan = ")
    var x = input.nextInt()
    var i = 1
    var hasil = 0

    while(i <= 5) {
        hasil += x
        if ((hasil % 2) == 0 || (hasil % 3) == 0) {
            print("$hasil ")
            i++
        }
    }
}