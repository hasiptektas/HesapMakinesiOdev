package com.example.hesapmakinesiodev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hesapmakinesiodev.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar

class AnasayfaFragment : Fragment() {

    private lateinit var tasarim : FragmentAnasayfaBinding




    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)



        tasarim.button0.setOnClickListener {

            var str1:String = tasarim.toplamaEkrani.text.toString()

            tasarim.toplamaEkrani.text= str1 + "0"

        }

        tasarim.button1.setOnClickListener {

            var str1:String = tasarim.toplamaEkrani.text.toString()
            tasarim.toplamaEkrani.text= str1 + "1"

        }

        tasarim.button2.setOnClickListener {



            var str1:String = tasarim.toplamaEkrani.text.toString()
            tasarim.toplamaEkrani.text= str1 + "2"

        }

        tasarim.button3.setOnClickListener {

            var str1:String = tasarim.toplamaEkrani.text.toString()
            tasarim.toplamaEkrani.text= str1 + "3"



        }

        tasarim.button4.setOnClickListener {



            var str1:String = tasarim.toplamaEkrani.text.toString()
            tasarim.toplamaEkrani.text= str1 + "4"

        }

        tasarim.button5.setOnClickListener {


            var str1:String = tasarim.toplamaEkrani.text.toString()
            tasarim.toplamaEkrani.text= str1 + "5"

        }

        tasarim.button6.setOnClickListener {



            var str1:String = tasarim.toplamaEkrani.text.toString()
            tasarim.toplamaEkrani.text= str1 + "6"

        }

        tasarim.button7.setOnClickListener {



            var str1:String = tasarim.toplamaEkrani.text.toString()
            tasarim.toplamaEkrani.text= str1 + "7"

        }

        tasarim.button8.setOnClickListener {



            var str1:String = tasarim.toplamaEkrani.text.toString()
            tasarim.toplamaEkrani.text= str1 + "8"

        }

        tasarim.button9.setOnClickListener {



            var str1:String = tasarim.toplamaEkrani.text.toString()
            tasarim.toplamaEkrani.text= str1 + "9"

        }

        tasarim.buttonGeri.setOnClickListener {

            var str1:String = tasarim.toplamaEkrani.text.toString()

            var sil : String = str1.substring(0, str1.length - 1);

            tasarim.toplamaEkrani.text = sil

        }

        tasarim.buttonEsittir.setOnClickListener {


            var str1 : String =tasarim.toplamaEkrani.text.toString()

            var deger = str1.split('+')

            var birinciDeger = deger[0].toInt()
            var ikinciDeger = deger[1].toInt()


            var toplam = birinciDeger + ikinciDeger

            var sonuc = toplam.toString()

            tasarim.sonucEkrani.text = birinciDeger.toString()+"+"+ikinciDeger.toString()+"="+sonuc
            tasarim.toplamaEkrani.text = sonuc + "+"



        }

        tasarim.buttonTopla.setOnClickListener {

            var str1:String = tasarim.toplamaEkrani.text.toString()
            tasarim.toplamaEkrani.text= str1 + "+"

        }

        tasarim.buttonTemizle.setOnClickListener {

            tasarim.toplamaEkrani.text = ""
            tasarim.sonucEkrani.text = ""

        }

        return tasarim.root
    }


    /*fun artiKontrol() {

        var c  = tasarim.toplamaEkrani.text.toString();
        var karakter = c.substring(0,1);
        var uyariBir = "İlk Karakter "+" Olamaz"
        var uyariiki = "Bir seferde sadece 2 sayi toplanabilir"


        if(karakter.equals('+')) {

            tasarim.toplamaEkrani.text = ""
        }

        else if(tasarim.toplamaEkrani.text.withIndex().filter{ it.value == '+' }.map{ it.index }.size > 1) {


            var str1:String = tasarim.toplamaEkrani.text.toString()

            var sil : String = str1.substring(0, str1.length - 1);

            tasarim.toplamaEkrani.text = sil



        }

    }

    fun showSnackbar(view: View?, message: String?, duration: Int) {
        Snackbar.make(requireView(), message!!, duration).show()
    }*/

}