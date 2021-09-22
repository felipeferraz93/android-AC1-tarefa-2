package holders;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import com.example.ac1ex02.R;

public class PontoTuristicoViewHolder extends RecyclerView.ViewHolder {
    public TextView txtNome;
    public TextView txtDescricao;
    public Button btnDetalhes;
    public ImageView imgPrincipal;

    public PontoTuristicoViewHolder(View view){
        super(view);
        txtNome = (TextView)view.findViewById(R.id.txtNome);
        txtDescricao = (TextView)view.findViewById(R.id.txtDescricao);
        btnDetalhes = (Button) view.findViewById(R.id.btnDetalhes);
        imgPrincipal = (ImageView) view.findViewById(R.id.imgPrincipal);
    }
}
