package com.phoenixcampos.lurkerforreddit;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by phoen on 8/24/2017.
 */

public class GitHubRepoAdapter extends ArrayAdapter {

    public GitHubRepoAdapter(@NonNull Context context, @NonNull List objects) {
        super(context, -1, objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
