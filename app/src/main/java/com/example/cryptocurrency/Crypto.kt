package com.example.cryptocurrency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.cryptocurrency.Adapter.CryptoWalletAdapter
import com.example.cryptocurrency.domain.CryptoWallet

class Crypto : AppCompatActivity() {
    private lateinit var recyclerView:RecyclerView
    private lateinit var cryptoWalletArrayList:ArrayList<CryptoWallet>
    private lateinit var lineData:ArrayList<Int>
    private lateinit var lineData2:ArrayList<Int>
    private lateinit var lineData3:ArrayList<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crypto)

        recyclerViewWallet();
    }

    private fun recyclerViewWallet() {
        recyclerView.layoutManager= LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView=findViewById(R.id.view)
        recyclerView.setHasFixedSize(true)

        lineData.add(1000)
        lineData.add(1100)
        lineData.add(1200)
        lineData.add(1100)



        lineData2.add(2100)
        lineData2.add(2000)
        lineData2.add(1900)
        lineData2.add(2000)



        lineData3.add(900)
        lineData3.add(1000)
        lineData3.add(1100)
        lineData3.add(1000)




        cryptoWalletArrayList.add(CryptoWallet("Bitcoin","Btx",1234.12,2.13,lineData,1234.12,0.12343))
        cryptoWalletArrayList.add(CryptoWallet("Etherium","ETH",2134.12,-1.13,lineData2,6545.65,0.12343))
        cryptoWalletArrayList.add(CryptoWallet("Trox","Rox",6543.12,0.73,lineData3,3234.12,0.02154))

        recyclerView.adapter=CryptoWalletAdapter(cryptoWalletArrayList)







    }
}