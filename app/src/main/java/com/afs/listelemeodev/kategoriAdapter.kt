package com.afs.listelemeodev

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.afs.listelemeodev.databinding.CardTasarimBinding
import com.squareup.picasso.Picasso

class kategoriAdapter(var mContext:Context,var kategoriListesi:List<Kategoriler>)
    : RecyclerView.Adapter<kategoriAdapter.CardTasarimTutucu>(){

    inner class CardTasarimTutucu(tasarim:CardTasarimBinding) :RecyclerView.ViewHolder(tasarim.root){
    var tasarim:CardTasarimBinding
    init {

        this.tasarim = tasarim
    }

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim =CardTasarimBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
       val kategori = kategoriListesi.get(position)
        val t = holder.tasarim
        Picasso.get().load( mContext.resources.getIdentifier(kategori.kategoriResimAdi,"drawable",mContext.packageName)).resize(250,250).into(t.imageViewKategoriResim);
       // t.imageViewKategoriResim.setImageResource(
          //  mContext.resources.getIdentifier(kategori.kategoriResimAdi,"drawable",mContext.packageName))
        t.textViewKategoriAdi.text = kategori.kategoriAdi
    }

    override fun getItemCount(): Int {

        return kategoriListesi.size
    }
}