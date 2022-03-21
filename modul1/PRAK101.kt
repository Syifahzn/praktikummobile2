fun main(args: Array<String>){
    print("Waktu Sekarang: ")
    val waktu = readLine()
    print("Nama Anda: ")
    val nama = readLine()
    print("Umur Anda: ")
    val umur = readLine()
    print("Suhu Tubuh Anda: ")
    val suhu = readLine()

    val cetak = """
        Selamat $waktu, $nama. 
        Umur anda $umur tahun.
        Suhu Tubuh anda $suhu derajat Celcius.
    """.trimIndent()
    println(cetak)
}