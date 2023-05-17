package com.example.cryptocurrency.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocurrency.R;
import com.example.cryptocurrency.domain.CryptoWallet;
import com.majorik.sparklinelibrary.SparkLineLayout;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class CryptoWalletAdapter extends RecyclerView.Adapter<CryptoWalletAdapter.viewHolder>{
    ArrayList<CryptoWallet> cryptoWallets;
    DecimalFormat formatter;

    public CryptoWalletAdapter(ArrayList<CryptoWallet> cryptoWallets) {
        this.cryptoWallets = cryptoWallets;
        formatter =new DecimalFormat("###,###,###,###");
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_wallet,parent,false);
        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.cryptoNameTxt.setText(cryptoWallets.get(position).getCryptoName());
        holder.cryptoPriceTxt.setText(formatter.format(cryptoWallets.get(position).getCryptoPrice()));
        holder.changePercentTxt.setText(cryptoWallets.get(position).getChangePercent()+"%");
        holder.propertySizeTxt.setText(cryptoWallets.get(position).getPropertySize()+cryptoWallets.get(position).getCryptoSymbol());
        holder.PropertyAmountTxt.setText("$"+formatter.format(cryptoWallets.get(position).getPropertyAmount()));


        if (cryptoWallets.get(position).getChangePercent()>0){
            holder.changePercentTxt.setTextColor(Color.parseColor("#12c737"));
        } else if (cryptoWallets.get(position).getChangePercent()<0) {
            holder.changePercentTxt.setTextColor(Color.parseColor("#fc0000"));
        }else {
            holder.changePercentTxt.setTextColor(Color.parseColor("#ffffff"));
        }

        holder.lineChar.setData(cryptoWallets.get(position).getLineData());


    }

    @Override
    public int getItemCount() {
        return cryptoWallets.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder{
        TextView cryptoNameTxt,cryptoPriceTxt,propertySizeTxt,PropertyAmountTxt,changePercentTxt;
        ImageView logoCrypto ;
        SparkLineLayout lineChar;
        public viewHolder(@NonNull View itemView)
        {
            super(itemView);
            cryptoNameTxt= itemView.findViewById(R.id.cryptoNameTxt);
            cryptoPriceTxt=itemView.findViewById(R.id.cryptoPriceTxt);
            propertySizeTxt=itemView.findViewById(R.id.propertySizeTxt);
            changePercentTxt=itemView.findViewById(R.id.changePercentTxt);
            PropertyAmountTxt=itemView.findViewById(R.id.propertyAmountTxt);
            logoCrypto=itemView.findViewById(R.id.logoImg);
            lineChar= itemView.findViewById(R.id.sparkLineLayout);

      }



    }
}
