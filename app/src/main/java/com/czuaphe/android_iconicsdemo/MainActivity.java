package com.czuaphe.android_iconicsdemo;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.context.IconicsContextWrapper;
import com.mikepenz.iconics.context.IconicsLayoutInflater;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.iconics.view.IconicsButton;
import com.mikepenz.iconics.view.IconicsImageView;

public class MainActivity extends AppCompatActivity {

    private IconicsButton  iconicsButton;
    private IconicsImageView  iconicsImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iconicsButton = (IconicsButton) findViewById(R.id.iconicsButton);
        iconicsImageView = (IconicsImageView) findViewById(R.id.iconicsImageView);

        iconicsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iconicsImageView.setIcon(getIcon(GoogleMaterial.Icon.gmd_ac_unit, 36, Color.GRAY));
            }
        });

    }

    private IconicsDrawable getIcon(IIcon icon,  int dp, int color) {
        return new IconicsDrawable(this).icon(icon).sizeDp(dp).color(color);
    }

}
