package com.example.fragmentslab_lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialisation des boutons
        btn1 = findViewById(R.id.btnFragment1);
        btn2 = findViewById(R.id.btnFragment2);

        // 1. Afficher le premier fragment au démarrage (si c'est le premier lancement)
        if (savedInstanceState == null) {
            replaceFragment(new FragmentOne(), false);
        }

        // 2. Actions au clic sur les boutons
        btn1.setOnClickListener(v -> replaceFragment(new FragmentOne(), true));
        btn2.setOnClickListener(v -> replaceFragment(new FragmentTwo(), true));
    }

    // 3. LA MÉTHODE MAGIQUE (avec animations et gestion de la pile)
    private void replaceFragment(Fragment fragment, boolean addToBackStack) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction()
                .setReorderingAllowed(true)

                //  Animations pour un passage fluide entre les fragments
                .setCustomAnimations(
                        android.R.anim.slide_in_left,  // Animation d'entrée
                        android.R.anim.slide_out_right, // Animation de sortie
                        android.R.anim.fade_in,        // Animation au retour (Back)
                        android.R.anim.fade_out        // Animation de sortie du retour
                )

                .replace(R.id.fragment_container, fragment);

        if (addToBackStack) {
            // Permet de revenir au fragment précédent avec le bouton "Back" du téléphone
            ft.addToBackStack(null);
        }

        ft.commit(); // Exécute le changement
    }
}