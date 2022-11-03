package com.example.lk06psi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listPahlawan = ArrayList<Pahlawan>()
        listPahlawan.add(Pahlawan(R.drawable.foto,"Sisingamangaraja V","Si Singamangaraja XII dengan nama lengkap Patuan Bosar Sinambela gelar Ompu Pulo Batu (18 Februari 1845 – 17 Juni 1907) adalah seorang raja di Negeri Toba dan pejuang yang berperang melawan Belanda. "))
        listPahlawan.add((Pahlawan(R.drawable.foto,"Pangeran Antasari","Pangeran Antasari (lahir di Kayu Tangi, Kesultanan Banjar, 1797 atau 1809 – meninggal di Bayan Begok, Hindia Belanda, 11 Oktober 1862 pada umur 53 tahun) adalah seorang Pahlawan Nasional Indonesia.")))
        listPahlawan.add((Pahlawan(R.drawable.foto,"Otto Iskandar Dinata","Otto Iskandardinata lahir 31 Maret 1897 di Bojongsoang, Kabupaten Bandung. Otto merupakan anak bungsu dari pasangan Raden haji Adam Rahmat dan Siti Hidayah.")))
        listPahlawan.add((Pahlawan(R.drawable.foto,"I Gusti Ngurah Rai","Brigadir Jenderal TNI (Anumerta) I Gusti Ngurah Rai (30 Januari 1917 – 20 November 1946) adalah seorang tokoh militer Indonesia, yang berjasa dalam Perang Kemerdekaan.")))
        listPahlawan.add((Pahlawan(R.drawable.foto,"Kapitan Pattimura","Pattimura lahir sebagai Thomas Matulessia pada 8 Juni 1783 di Saparua. Orang tuanya adalah Frans Matulessia dan Fransina Tilahoi, dan dia memiliki seorang adik laki-laki bernama Yohanis.")))
        val rvListPahlawan = findViewById<RecyclerView>(R.id.rvListPahlawan)
        val adapter = ListPahlawanAdapter(listPahlawan)
        rvListPahlawan.adapter = adapter
        rvListPahlawan.layoutManager = LinearLayoutManager(this)
    }
}