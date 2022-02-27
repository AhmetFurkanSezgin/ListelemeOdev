package com.afs.listelemeodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.afs.listelemeodev.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var  tasarim: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
tasarim = FragmentAnasayfaBinding.inflate(inflater,container, false)


        tasarim.toolbarAnasayfa.setLogo(R.drawable.logo)

        tasarim.rv.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)

        val kategoriListesi = ArrayList<Kategoriler>()

        val k1 = Kategoriler(1,"Haftanın Fırsatları","haftafirsat")
        val k2 = Kategoriler(2,"Kargo Teslimatlı Ürünler","kargoteslimat")
        val k3 = Kategoriler(3,"Meyve&Sebze","meyvesebze")
        val k4 = Kategoriler(4,"Et&Tavuk&Şarküteri","ettavuk")
        val k5 = Kategoriler(5,"Kahvaltılık","kahvaltilikicon")
        val k6 = Kategoriler(6,"Ekmek&Pastane","ekmek")
        val k7 = Kategoriler(7,"Dondurulmuş Ürünler","dondurulmus")
        val k8 = Kategoriler(8,"Yemeklik Malzemeler","yemeklikmalzemeler")
        val k9 = Kategoriler(9,"Atıştırmalık","atistirmalik")
        val k10 = Kategoriler(10,"İçecek","icecek")
        val k11 = Kategoriler(11,"Kişisel Bakım&Kozmetik","kozmetik")
        val k12 = Kategoriler(12,"Temizlik","temizlik")
        val k13 = Kategoriler(13,"Anne-Bebek&Çocuk","annebebekcocuk")
        val k14 = Kategoriler(14,"Evcil Dostlar","evcildostlar")
        val k15 = Kategoriler(15,"Elektronik","elektronik")
        val k16 = Kategoriler(16,"Giyim&Aksesuar","giyimaksesuar")

        kategoriListesi.add(k1)
        kategoriListesi.add(k2)
        kategoriListesi.add(k3)
        kategoriListesi.add(k4)
        kategoriListesi.add(k5)
        kategoriListesi.add(k6)
        kategoriListesi.add(k7)
        kategoriListesi.add(k8)
        kategoriListesi.add(k9)
        kategoriListesi.add(k10)
        kategoriListesi.add(k11)
        kategoriListesi.add(k12)
        kategoriListesi.add(k13)
        kategoriListesi.add(k14)
        kategoriListesi.add(k15)
        kategoriListesi.add(k16)

        val adapter =kategoriAdapter(requireContext(),kategoriListesi)
        tasarim.rv.adapter = adapter



        return  tasarim.root

    }


    }
