class Hewan(nama: String, kaki: Int, makanan: String){
    val namaHewan: String = nama
    val jumlahKaki: Int = kaki
    val jenisMakanan: String = makanan

    fun cetak(){
        println("Hewan " + namaHewan + ", berkaki " + jumlahKaki + " dan suka makan " + jenisMakanan + "." )
    }
}

fun main(args: Array<String>){
    val hewan1 = Hewan("Sapi", 4, "Rumput")
    val hewan2 = Hewan("Kucing", 4, "Daging")
    hewan1.cetak()
    hewan2.cetak()
}