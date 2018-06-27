package tk.explorecode.myrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class GridPresidentAdapter extends RecyclerView.Adapter<GridPresidentAdapter.GridViewHolder> {

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        public GridViewHolder(View itemView) {
            super(itemView);
        }
    }
}
