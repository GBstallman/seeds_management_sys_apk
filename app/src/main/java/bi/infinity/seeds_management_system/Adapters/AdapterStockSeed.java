package bi.infinity.seeds_management_system.Adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import bi.infinity.seeds_management_system.Model.Stock;
import bi.infinity.seeds_management_system.R;

public class AdapterStockSeed extends RecyclerView.Adapter<AdapterStockSeed.ViewHolder> {
    private Context context;
    ArrayList<Stock> stocks;


    public AdapterStockSeed(ArrayList<Stock> stocks, Context context) {
        this.context = context;
        this.stocks = stocks;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_seeds_home, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Stock stock = stocks.get(position);
        holder.txt_detail_item_name.setText(stock.details);
        holder.txt_seed_item_name.setText(stock.nom);
        holder.txt_seed_item_owner.setText(stock.owner);
        //holder.img_seed.setText(seed.image);
    }

    @Override
    public int getItemCount() {
        return stocks.size();
    }

    public void setData(ArrayList<Stock> seeds) {
        this.stocks = seeds;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View view;
        TextView txt_detail_item_name ,txt_seed_item_name,txt_seed_item_owner ;
        ImageView img_seed;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_detail_item_name = itemView.findViewById(R.id.txt_detail_item_name);
            txt_seed_item_name = itemView.findViewById(R.id.txt_seed_item_name);
            txt_seed_item_owner = itemView.findViewById(R.id.txt_seed_item_owner);
            img_seed = itemView.findViewById(R.id.img_seed);
            view = itemView;
        }
    }
}