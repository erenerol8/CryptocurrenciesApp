package com.eren.cryptocurrencies

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eren.cryptocurrencies.databinding.CryptoCardDesignBinding

class CryptoAdapter(private var coinList: ArrayList<CryptoModel>) :
    RecyclerView.Adapter<CryptoAdapter.CoinCardDesign>() {
    class CoinCardDesign(val CoinCardDesignBinding: CryptoCardDesignBinding) :
        RecyclerView.ViewHolder(CoinCardDesignBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinCardDesign {
        val layoutInflater = LayoutInflater.from(parent.context)
        val coinCardDesignBinding = CryptoCardDesignBinding.inflate(layoutInflater, parent, false)
        return CoinCardDesign(coinCardDesignBinding)
    }

    override fun onBindViewHolder(holder: CoinCardDesign, position: Int) {
        val coin = coinList[position]
        holder.CoinCardDesignBinding.cryptoImageView.setImageResource(coin.cryptoImage)
        holder.CoinCardDesignBinding.cryptoNameTextView.text = coin.cryptoCoinName

    }

    override fun getItemCount(): Int {
        return coinList.size
    }
}