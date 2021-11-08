package com.eren.cryptocurrencies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.eren.cryptocurrencies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val coinList = arrayListOf(
            CryptoModel(R.drawable.bitcoin, "Bitcoin",0),
            CryptoModel(R.drawable.ethereum, "Ethereum",0),
            CryptoModel(R.drawable.dogecoin, "Dogecoin",0),
            CryptoModel(R.drawable.solana, "Solana",0),
            CryptoModel(R.drawable.tether, "Tether",0),
            CryptoModel(R.drawable.binance, "Bitcoin",0)
        )
        val cryptoAdapter = CryptoAdapter(coinList)
        binding.coinRecyclerView.layoutManager = LinearLayoutManager(applicationContext,LinearLayoutManager.HORIZONTAL, false)
        binding.coinRecyclerView.adapter = cryptoAdapter
        binding.coinRecyclerView.setHasFixedSize(true)
    }
}