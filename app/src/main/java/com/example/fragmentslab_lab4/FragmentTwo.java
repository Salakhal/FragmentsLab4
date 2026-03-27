package com.example.fragmentslab_lab4;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class FragmentTwo extends Fragment {

    private TextView tvValue;
    private SeekBar seek;
    private int progress = 0;
    private static final String KEY_PROGRESS = "progress";
    private static final String TAG = "FragmentTwo";

    public FragmentTwo() {

        super(R.layout.fragment_two);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tvValue = view.findViewById(R.id.tvValue);
        seek = view.findViewById(R.id.seekBar);

        // 1. Restaurer l'état
        if (savedInstanceState != null) {
            progress = savedInstanceState.getInt(KEY_PROGRESS, 0);
            seek.setProgress(progress);
            tvValue.setText("Valeur : " + progress);
            Log.d(TAG, "Restauré : " + progress);
        }

        // 2. Écouter les changements de la SeekBar
        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int p, boolean fromUser) {
                progress = p; // Mise à jour de la variable globale
                tvValue.setText("Valeur : " + p);
            }

            @Override public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override public void onStopTrackingTouch(SeekBar seekBar) {}
        });
    }

    // 3. Sauvegarder la valeur avant la destruction (ex: Rotation)
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_PROGRESS, progress);
        Log.d(TAG, "Sauvegardé : " + progress);
    }

    // --- Cycle de vie pour le Logcat ---
    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, " onResume() : Fragment 2 est actif !");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, " onPause() : Fragment 2 est en pause !");
    }
}