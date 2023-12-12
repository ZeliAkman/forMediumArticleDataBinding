package com.example.databindingformediumarticle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.databindingformediumarticle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.mainNesnesi = this
        binding.hesaplamaSonucu= "0"


    }
    fun buttonToplama(alinanSayi1:String , alinanSayi2:String){

        val al_sayi1 = alinanSayi1.toInt()
        val al_sayi2 = alinanSayi2.toInt()
        val toplam = al_sayi1+al_sayi2

        binding.hesaplamaSonucu=toplam.toString()
    }
    fun buttonCarpma(alinanSayi1:String , alinanSayi2:String){

        val al_sayi1 = alinanSayi1.toInt()
        val al_sayi2 = alinanSayi2.toInt()
        val carpma = al_sayi1+al_sayi2

        binding.hesaplamaSonucu=carpma.toString()
    }
}