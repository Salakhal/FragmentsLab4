package com.example.fragmentslab_lab4;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FragmentOne extends Fragment {

    private TextView tv;
    private Button btnHello;
    private static final String TAG = "FragmentOne";

    public FragmentOne() {
        // Lie automatiquement le Fragment au layout res/layout/fragment_one.xml
        super(R.layout.fragment_one);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Initialisation des composants de l'interface
        tv = view.findViewById(R.id.textOne);
        btnHello = view.findViewById(R.id.btnHello);

        // Action du bouton : change le texte du TextView
        btnHello.setOnClickListener(v -> {
            tv.setText("Bonjour depuis Fragment 1 !");
        });

        Log.d(TAG, "onViewCreated() : Vue initialisée");
    }

    // --- Gestion du Cycle de Vie (Etape 7 du Lab) ---

    @Override
    public void onResume() {
        super.onResume();
        // S'affiche quand le fragment devient visible et actif
        Log.d(TAG, " onResume() : Fragment 1 est affiché !");
    }

    @Override
    public void onPause() {
        super.onPause();
        // S'affiche quand on change de fragment ou qu'on quitte l'app
        Log.d(TAG, " onPause() : Fragment 1 est mis en pause !");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // S'affiche quand la vue du fragment est détruite
        Log.d(TAG, "onDestroyView() : La vue est détruite !");
    }
}