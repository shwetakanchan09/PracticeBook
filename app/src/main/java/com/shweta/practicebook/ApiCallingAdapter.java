package com.shweta.practicebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ApiCallingAdapter extends RecyclerView.Adapter<ApiCallingAdapter.ViewHolder> {
    Context context;
    List<GenderModel> genderModelList;

    public ApiCallingAdapter(Context context, List<GenderModel> catAndGendList) {
        this.context = context;
        this.genderModelList = catAndGendList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_api_response, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GenderModel genderModel = genderModelList.get(position);
        holder.name.setText(genderModel.getName());
        holder.meaning.setText(genderModel.getMeaning());

        if (genderModel.getGender().equals("1")) {
            holder.gender.setText("Male");
        } else if (genderModel.getGender().equals("2")) {
            holder.gender.setText("Female");
        } else {
            holder.gender.setText("Other");
        }



        if (genderModel.getCategoryId().equals("10")) {
            holder.catid.setText("hindu");
        } else if (genderModel.getCategoryId().equals("8")) {
            holder.catid.setText("muslim");
        } else {
            holder.catid.setText("Other");
        }
    }

    @Override
    public int getItemCount() {
        return genderModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, meaning, gender, catid;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            name = (TextView) itemView.findViewById(R.id.txtName);
            meaning = (TextView) itemView.findViewById(R.id.txtMean);
            gender = (TextView) itemView.findViewById(R.id.txtGen);
            catid = (TextView) itemView.findViewById(R.id.txtCatId);
        }
    }
}
