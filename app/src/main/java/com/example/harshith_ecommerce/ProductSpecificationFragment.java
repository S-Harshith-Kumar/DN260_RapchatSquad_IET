package com.example.harshith_ecommerce;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProductSpecificationFragment extends Fragment {

    public ProductSpecificationFragment() {
        // Required empty public constructor
    }

    private RecyclerView productSpecificationRecyclerView;
    public static List<ProductSpecificationModel> productSpecificationModelList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_product_specification, container, false);

        productSpecificationRecyclerView = view.findViewById(R.id.product_specification_recyclerview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);

        productSpecificationRecyclerView.setLayoutManager(linearLayoutManager);



//        productSpecificationModelList.add(new ProductSpecificationModel(0,"General"));
//        productSpecificationModelList.add(new ProductSpecificationModel(1,"Product Type","Chair"));
//        productSpecificationModelList.add(new ProductSpecificationModel(1,"Color","Brown"));
//        productSpecificationModelList.add(new ProductSpecificationModel(1,"Material","Wood"));
//        productSpecificationModelList.add(new ProductSpecificationModel(1,"No. of pieces","1"));
//        productSpecificationModelList.add(new ProductSpecificationModel(1,"Durable","Yes"));
//        productSpecificationModelList.add(new ProductSpecificationModel(1,"Waranty","No"));
//        productSpecificationModelList.add(new ProductSpecificationModel(1,"Manufacturer","Amigo"));
//        productSpecificationModelList.add(new ProductSpecificationModel(0,"Product Dimension"));
//        productSpecificationModelList.add(new ProductSpecificationModel(1,"Dimension","70*70*200 cm"));
//        productSpecificationModelList.add(new ProductSpecificationModel(1,"Weight","5 Kilograms"));
//        productSpecificationModelList.add(new ProductSpecificationModel(1,"Length","70cm"));
//        productSpecificationModelList.add(new ProductSpecificationModel(1,"Breadth","70cm"));
//        productSpecificationModelList.add(new ProductSpecificationModel(1,"Height","200cm"));

        ProductSpecificationAdapter productSpecificationAdapter = new ProductSpecificationAdapter(productSpecificationModelList);
        productSpecificationRecyclerView.setAdapter(productSpecificationAdapter);
        productSpecificationAdapter.notifyDataSetChanged();

        return view;
    }
}
