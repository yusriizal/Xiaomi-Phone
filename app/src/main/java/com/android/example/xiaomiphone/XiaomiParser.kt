package com.android.example.xiaomiphone

import android.app.Activity
import android.widget.ImageView
import android.widget.TextView
import java.lang.IllegalArgumentException

class XiaomiParser (val context: Activity){
    fun setXiaomiBasedTitle(XiaomiText: TextView, imgXiaomi: ImageView, TitleXiaomi: TextView, title: String?) {
        var type: String = ""
        var xiaomiDetail: String? = null
        var xiaomiImage: Int = 0

        when(title){
            "9T" -> {
                xiaomiDetail = "Redmi 9T menjadi hp Xiaomi yang paling terbaru rilis di 2021. Berada di lini hp Redmi 9 series, hp ini menawarkan spesifikasi yang lebih meningkat dari generasi sebelumnya.\n" +
                        "\n" +
                        "Lihat saja baterainya yang kini sudah berkapasitas 6000 mAh sehingga punya daya tahan yang lebih lama. Baterai ini juga didukung pengisian cepat 18W dengan charger output 22W.\n" +
                        "\n" +
                        "\n" +
                        " \n" +
                        "Dari sisi performa Redmi 9T ditenagai prosesor Snapdragon 662 dengan kapasitas memori RAM 4 GB dan ROM 64 GB serta RAM 6 GB dan ROM 128 GB.\n" +
                        "\n" +
                        "Untuk kamera, Redmi 9T hadir dengan 4 kamera belakang dan 1 kamera depan. Kamera belakangnya terdiri dari sensor utama beresolusi 48 MP, lensa ultra wide 8 MP, lensa makro 2 MP dan sensor depth 2 MP. Sedangkan kamera depannya beresolusi 8 MP.\n" +
                        "\n" +
                        "Layar juga menjadi daya tarik dari Redmi 9T, pasalnya sudah menggunakan resolusi FulHD+ 1080 x 2340p dengan bentang seluas 6,53 inci. Oiya, layar ini juga sudah diproteksi Gorilla Glass 3."
                xiaomiImage = R.drawable.xiaomi_9t
            }
            "F2 Pro" -> {
                xiaomiDetail = "Poco F2 Pro menawarkan performa terbaik dengan pembekalan prosesor Snapdragon 865 serta di dukung memori UFS 3.1 dan LPDDR5 berkapasitas 8 GB.\n" +
                        "\n" +
                        "Yang pasti sangat powerful untuk gaming. Gaming pun makin asik karena hp Poco terbaru ini telah menggunakan teknologi LiquidCool 2.0 yang berfungsi untuk memberikan pendinginan maksimal ketika hp dipakai untuk waktu yang lama.\n" +
                        "\n" +
                        "Kapasitas baterai Poco F2 Pro cukup besar, 4700 mAh, dan pengisian dayanya sudah mendukung fast charging, atau pengisian cepat 30W. Poco F2 Pro sudah dilengkapi juga dengan teknologi pemindai sidik jari didalam layar.\n" +
                        "\n" +
                        "Poco F2 Pro memiliki empat kamera (quad camera) yang terletak di belakang. Kamera utama dengan sensor Sony IMX686 ini memiliki resolusi 64 MP."
                xiaomiImage = R.drawable.f2_pro
            }
            "F3" -> {
                xiaomiDetail = "Poco F3 hadir dengan layar AMOLED seluas 6,67 inci dan sudah dilapisi pelindung Corning Gorilla Glass 5. Tidak hanya itu, layar Poco F3 juga mendukung refresh rate 120Hz dan tampilan HDR10+.\n" +
                        "\n" +
                        "Dibagian belakang terdapat tiga kamera yang terdiri dari kamera wide 48 MP, kamera ultrawide 8 MP, dan kamera makro 5 MP yang menggunakan lensa 50mm. Sementara untuk kamera depannya memiliki resolusi 20 MP.\n" +
                        "\n" +
                        "\n" +
                        " \n" +
                        "Poco F3 sendiri berjalan dengan sistem operasi Android 11 yang memiliki tampilan antarmuka MIUI 12. Performanya ditenagai prosesor Snapdragon 870 yang didukung RAM 6 GB dan ROM 128 GB serta RAM 8 GB dan ROM 256 GB.\n" +
                        "\n" +
                        "Hp Xiaomi terbaru yang rilis bulan April 2021 ini menggunakan baterai berkapasitas 4520 mAh dengan teknologi fast charging 33W, yang diklaim mampu mengisi baterai hingga penuh dalam waktu kurang dari 1 jam."
                xiaomiImage = R.drawable.f3
            }
            "M3" -> {
                xiaomiDetail = "Hp Xiaomi terbaru 2021 ini hadir dengan spesifikasi tinggi namun dibanderol harga yang terjangkau. Spesifikasi Poco M3 diotaki prosesor Snapdragon 662 dengan sokongan RAM 4 GB dan 6 GB. Sangat mumpuni untuk aktivitas sehari-hari hingga gaming.\n" +
                        "\n" +
                        "Hp ini juga hadir dengan layar berukuran 6,53 inci serta sudah resolusi FullHD+. Bezelnya pun tipis yang menghasilkan rasio screen-to-body mencapai 90,34%. Layarnya juga sudah diproteksi Corning Gorilla Glass yang bisa mengurangi resiko goresan.\n" +
                        "\n" +
                        "Di sisi kamera, Poco M3 menawarkan tiga kamera belakang yang terdiri dari resolusi 48MP 4-in-1 Super Pixel, 2 MP (macro) dan 2 MP (depth).\n" +
                        "\n" +
                        "Fitur menarik lainnya adalah kapasitas baterasi yang besar, dimana didalamnya sudah tertanam baterai 6.000 mAh dengan teknologi High Charge Cycle Battery dan fast charging 18W."
                xiaomiImage = R.drawable.m3
            }
            "Mi 10T" -> {
                xiaomiDetail = "Mi 10T memiliki layar IPS dengan bentang seluas 6.67 inci resolusi FullHD+. Layar ini juga sudah mendukung refresh rate 144 Hz yang memiliki keunggulan pada gerakan layar yang lebih smooth. \n" +
                        "\n" +
                        "Xiaomi Mi 10T dibekali tiga kamera belakang yang sangat oke untuk mengabadikan momen pribadi. Konfigurasi kameranya terdiri dari kamera utama 64 MP, kamera ultrawide 13 MP dan kamera macro 5 MP.\n" +
                        "\n" +
                        "\n" +
                        " \n" +
                        "Untuk kamera selfie sudah beresolusi 20 MP dengan bukaan atau aperture f/2.2. Performanya menjadi hal yang menarik dari Mi 10T ini, karena sudah ditenagai prosesor Snapdragon 865.\n" +
                        "\n" +
                        "Kinerjanya makin ciamik dengan sokongan RAM 8 GB dan penyimpanan internal 128 GB. Dari sisi sumber daya ada baterai berkapasitas 5.000 mAh lengkap dengan fitur fast charging 33 Watt."
                xiaomiImage = R.drawable.mi_10t
            }
            "Note 10" -> {
                xiaomiDetail = "Salah satu fitur unggulan Redmi Note 10 sudah dibekali dengan layar berjenis Super AMOLED berukuran 6.43 inci beresolusi 1080 x 2400 piksel. Layar ini pun sudah dilapisi pelindung Corning Gorilla Glass 3.\n" +
                        "\n" +
                        "Ada empat kamera dibagian belakang yang terdiri dari kamera wide 48 MP, kamera ultrawide 8 MP, lalu kamera macro dan depth beresolusi 2 MP, dan kamera selfie yang memiliki resolusi 13 MP.\n" +
                        "\n" +
                        "Performa Redmi Note 10 ditenagai prosesor Snapdragon 678 dengan pengolah grafis Adreno 612 serta disokong RAM 4 GB dan ROM 64 GB serta RAM 6 GB dan 128 GB.\n" +
                        "\n" +
                        "Beraktivitas dengan Xiaomi Redmi Note 10 juga bisa seharian berkat baterai besar berkapasitas 5000 mAh yang sudah mendukung fast charging 33W."
                xiaomiImage = R.drawable.note_10
            }
            "Note 10 Pro" -> {
                xiaomiDetail = "Redmi Note 10 Pro hadir dengan layar AMOLED yang memiliki resolusi 1080 x 2400 piksel dan sudah mendukung 120Hz. Layarnya sendiri berukuran 6,67 inci.\n" +
                        "\n" +
                        "Untuk konfigurasi empat kamera di Redmi Note 10 Pro terdiri dari kamera wide 108 MP, kamera ultrawide 8 MP, kamera macro 5 MP, dan kamera depth 2 MP. Dimana sudah tersemat kamera depan dengan resolusi 16 MP.\n" +
                        "\n" +
                        "\n" +
                        " \n" +
                        "Performa Redmi Note 10 Pro dipercayakan pada prosesor Snapdragon 732G dengan varian memori yang ditawarkan yakni RAM 6 GB dan ROM 64 GB, RAM 6 GB dan ROM 128 GB serta RAM 8 GB dan ROM 128 GB.\n" +
                        "\n" +
                        "Sedangkan sumber dayanya mengandalkan baterai berkapasitas 5020 mAh yang sudah mendukung pengsian daya cepat, atau fast charging 33W."
                xiaomiImage = R.drawable.note_10_pro
            }
            "Note 7" -> {
                xiaomiDetail = "Smartphone Xiaomi Redmi Note 7 terbaru menawarkan prosesor dengan kecepatan 2,3 GHz dengan jenis Octa Core. Sedangkan untuk GPU, HP ini menggunakan GPU Mali G72 MP3 yang optimal. Dengan harga yang murah, Smartphone Xiaomi Redmi Note 7 terbaru membawa fitur kamera dengan resolusi tinggi berjumlah 4 buah masing-masing sebesar 48 MP, 12 MP, 5 MP dan 2 MP. Hasil Foto yang dihasilkan sangat mengagumkan dengan detail yang sempurna dan tanpa gambar kabur. Selain dibekali dengan kamera utama, dengan harga yang murah, Smartphone Xiaomi Redmi Note 7 terbaru juga membawa kamera selfie sebesar 13 MP. Kapasitas baterai pada HP ini juga sangat besar, sehingga awet digunakan berjam-jam, sehingga aktivitas tak akan terganggu. Dengan harga murah, fitur fast charging juga melengkapi kualitas baterai pada Smartphone Xiaomi Redmi Note 7 terbaru. Adapun kapasitas baterai yang ditawarkan adalah 4000 mAh."
                xiaomiImage = R.drawable.note_7
            }
            "Note 8" -> {
                xiaomiDetail = "Redmi Note 8 sendiri masuk ke Indonesia bulan Oktober 2019 dan mengusung layar seluas 6,39 inci dengan resolusi 1080 x 2340 pixel. Untuk performanya dipercayakan pada prosesor Snapdragon 665.\n" +
                        "\n" +
                        "Dimana prosesor ini akan di sokong RAM 6GB dan ROM 128GB. Sebagai sumber daya sudah tertanam baterai besar berkapasitas 4000mAh lengkap bersama fast charging 18Watt.\n" +
                        "\n" +
                        "Kamera menjadi nilai lebih dari Redmi Note 8 dengan menyematkan empat sensor sekaligus dengan konfigurasi 48 MP + 8 MP + 2 MP + 2 MP. Sedangkan kamera untuk foto selfie sudah memliki besaran 13MP."
                xiaomiImage = R.drawable.note_8
            }
            "X3 Pro" -> {
                xiaomiDetail =  "Poco X3 Pro mengusung empat kamera belakang yang menawarkan konfigurasi kamera wide 48 MP, kamera ultrawide 8 MP, kamera macro 2 MP dan kamera depth 2 MP. Sedangkan kamera depannya sudah memiliki resolusi 20 MP.\n" +
                        "\n" +
                        "Hp Xiaomi terbaru ini menggunakan layar IPS berukuran 6.67 inci dengan dukungan refresh rate 120Hz dan HDR10, sehingga akan memberikan tampilan visual yang memanjakan mata.\n" +
                        "\n" +
                        "Poco X3 Pro ditenagai prosesor Snapdragon 860 dengan dua varian memori RAM 6 GB dan ROM 128 GB serta RAM 8 GB dan ROM 256 GB. Mampu memberikan performa yang apik saat bermain game berat seperti PUBG.\n" +
                        "\n" +
                        "Poco X3 Pro juga menanam baterai berkapasitas 5160 mAh dengan teknologi fast charging 33W. Baterainya diklaim mampu terisi penuh dalam waktu 59 menit."
                xiaomiImage = R.drawable.x3_pro
            }
            else -> ""
        }
        try{
            if(xiaomiDetail == null) {
                throw IllegalArgumentException("$title has no match to any file!")
            }
            type = readFromAsset(xiaomiDetail)
        }catch(e: Exception){
            type = e.message.toString()
        } finally {
            XiaomiText.text = type
            TitleXiaomi.text = title
            imgXiaomi.setImageResource(xiaomiImage)
        }
    }

    private fun readFromAsset(fileName: String): String {
        val bufferReader = context.application.assets.open(fileName).bufferedReader()
        val data = bufferReader.use {
            it.readText()
        }
        return data
    }
}