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
        binding.sonuc.text= "0"


    }
    fun buttonToplama(Asayi1:String,Asayi2:String){


        val al_sayi1 = Asayi1.toInt()
        val al_sayi2 = Asayi2.toInt()

        val toplam = al_sayi1+al_sayi2

        binding.sonuc.text=toplam.toString()
    }
    fun buttonCarpma(Asayi1:String,Asayi2:String){

        val sayi1 = Asayi1.toInt()
        val sayi2 = Asayi2.toInt()

        val carp = sayi1+sayi2

        binding.sonuc.text=carp.toString()
    }
}