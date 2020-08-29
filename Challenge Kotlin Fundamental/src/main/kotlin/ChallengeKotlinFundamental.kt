import java.util.*
import kotlin.math.ceil
fun main() {
//Identitas
    val inputUser = Scanner(System.`in`);
    print("Nama : ")
    val nama = inputUser.nextLine()

    print("Kelas : ")
    val kelas = inputUser.nextLine()

    print("No Absen : ")
    val absen = inputUser.nextInt()
    println("----------------------------")
//Hitung Bangun Ruang
    val kerucut = Kerucut()
    val tabung = Tabung()

    println("Hitung Volume Bangun Ruang :")
    println("1. Volume Kerucut")
    println("2. Volume Tabung")
    print("Silahkan pilih No yang ingin Anda Hitung : ")
    when {
        inputUser.nextInt() == 1 -> {
            println("----------------------------")
            //Volume Kerucut
            print("Masukkan Tinggi:  ")
            kerucut.Tinggi = inputUser.nextFloat()
            print("Masukkan Jari-Jari : ")
            kerucut.JariJari = inputUser.nextFloat()
            println("Tinggi yang anda masukkan : ${kerucut.Tinggi} \nJari - Jari yang anda masukkan : ${kerucut.JariJari}")
            val vKerucut = volumeKerucut(kerucut.JariJari!!, kerucut.Tinggi!!)
            val volumeBulatkan = ceil(vKerucut)
            println("----------------------------")
            println("Jadi hasil perhitungan volume kerucut : "
                    + String.format("%.2f", vKerucut )
                    + "\n Setelah hasilnya dibulatkan : $volumeBulatkan")
            println("----------------------------")
        }
        inputUser.nextInt() == 2 -> {
            println("----------------------------")
            //Volume Tabung
            print("Masukkan Tinggi : ")
            tabung.Tinggi = inputUser.nextFloat()
            print("Masukkan Jari - Jari : ")
            tabung.JariJari = inputUser.nextFloat()
            println("Jari - Jari yang anda masukkan : ${tabung.JariJari} \nTinggi yang anda masukkan : ${tabung.Tinggi}")
            val vTabung = volumeTabung(tabung.JariJari!!, tabung.Tinggi!!)
            val volumeBulatkan = ceil(vTabung)
            println("----------------------------")
            println("Jadi hasil perhitungan volume tabung : "
                    + String.format("%.2f", vTabung )
                    + "\nSetelah hasilnya dibulatkan : $volumeBulatkan")
        }
        else -> {
            println("Nomor yang anda masukkan tidak tersedia")
        }
    }

}

class Kerucut {

    var Tinggi : Float? = null
    var JariJari : Float? = null

}
class Tabung {

    var Tinggi : Float? = null
    var JariJari : Float? = null

}


fun volumeKerucut(r : Float, t : Float) : Double{
    return (Math.PI * r * r) * t / 3
}
fun volumeTabung(r : Float, t : Float) : Double {
    return (Math.PI * r * r) * t
}