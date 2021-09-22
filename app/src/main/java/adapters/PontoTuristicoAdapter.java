package adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ac1ex02.DetalhesActivity;
import com.example.ac1ex02.MainActivity;
import com.example.ac1ex02.R;

import java.util.ArrayList;

import holders.PontoTuristicoViewHolder;
import models.PontoTuristicoModel;

public class PontoTuristicoAdapter extends RecyclerView.Adapter<PontoTuristicoViewHolder> {
    private final ArrayList<PontoTuristicoModel> pontosTuristicos;

    public PontoTuristicoAdapter(ArrayList<PontoTuristicoModel> pontosTuristicos) {this.pontosTuristicos = pontosTuristicos;};

    @NonNull
    @Override
    public PontoTuristicoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PontoTuristicoViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_ponto_turistico, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PontoTuristicoViewHolder holder, int position) {
        holder.txtNome.setText(pontosTuristicos.get(position).getNome());
        holder.txtDescricao.setText(pontosTuristicos.get(position).getDescricao());
        holder.btnDetalhes.setOnClickListener(view -> abrirDetalhes(view, pontosTuristicos.get(position)));
        holder.imgPrincipal.setImageResource(holder.imgPrincipal.getResources().getIdentifier("@drawable/"+ pontosTuristicos.get(position).getFoto1(),null, holder.itemView.getContext().getPackageName() ));
    }

    public void abrirDetalhes(View view, PontoTuristicoModel pontoTuristico){
        Intent intent = new Intent(view.getContext(), DetalhesActivity.class);
        intent.putExtra("pontoTuristico", pontoTuristico);
        view.getContext().startActivity(intent);
    }

    @Override
    public int getItemCount() {
        return pontosTuristicos != null ? pontosTuristicos.size():0;
    }


}
