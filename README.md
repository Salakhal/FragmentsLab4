# 📱 FragmentsLab - Lab 4 (Android Java)

Ce projet est un exercice pratique sur la **manipulation dynamique des Fragments** dans Android Studio. L'objectif est de comprendre comment naviguer entre différentes interfaces sans changer d'activité, tout en gérant le cycle de vie et la sauvegarde des données.

## 🎯 Objectifs du TP
* Apprendre à utiliser le `FragmentManager` et `FragmentTransaction`.
* Remplacer dynamiquement des fragments dans un `FrameLayout`.
* Gérer la pile de retour (**BackStack**) pour permettre la navigation arrière.
* Sauvegarder l'état de l'interface (SeekBar) lors de la rotation de l'écran avec `onSaveInstanceState`.
* Observer le cycle de vie d'un fragment via le **Logcat**.

---

## 🛠️ Structure du Projet

### 1. MainActivity (L'Hôte)
L'activité principale contient deux boutons de navigation et un `FrameLayout` qui sert de conteneur.
* **Méthode Clé :** `replaceFragment(Fragment fragment, boolean addToBackStack)`
* **Animations :** Utilisation de `setCustomAnimations` pour des transitions fluides.

### 2. FragmentOne
Une interface simple avec un bouton qui modifie un texte. 
* **Focus :** Initialisation de la vue dans `onViewCreated`.

### 3. FragmentTwo
Contient une `SeekBar` (curseur) et un `TextView`.
* **Focus :** Persistence des données. Si l'utilisateur change la valeur et tourne l'écran, la valeur est restaurée grâce au `Bundle savedInstanceState`.

---



## 📸 Aperçu des Fonctionnalités

| Fonctionnalité | Description |
| :--- | :--- |
| **Navigation** | Passage entre Fragment 1 et 2 via des boutons. |
| **Bouton Retour** | Le bouton "Back" du téléphone ramène au fragment précédent au lieu de quitter l'app. |
| **Animations** | Effet de glissement (Slide) lors du changement de fragment. |
| **Logs** | Suivi du cycle de vie (`onResume`, `onPause`) dans la console. |

---

## 🚀 Comment tester ?
1. Clonez ce dépôt.
2. Ouvrez le projet dans **Android Studio**.
3. Lancez l'émulateur ou connectez un appareil physique.
4. Cliquez sur **Fragment 2**, déplacez le curseur, puis tournez l'écran pour vérifier que la valeur reste la même.
5. Utilisez l'onglet **Logcat** et filtrez par `FragmentOne` pour voir les étapes du cycle de vie.

---

## 📚 Concepts Android appris
* **`getSupportFragmentManager()`** : Pour gérer les fragments.
* **`addToBackStack(null)`** : Pour l'historique de navigation.
* **`setCustomAnimations()`** : Pour l'expérience utilisateur (UX).
* **`onSaveInstanceState()`** : Pour la gestion de la configuration (Rotation).

---

## 📺 Démo Vidéo
Voici un aperçu du fonctionnement de l'application (Navigation, Animations, et Rotation) :



https://github.com/user-attachments/assets/e9b4c524-deb8-40f5-bcbc-9a095b04a41b





> **Note :** On peut observer la transition fluide entre Fragment 1 et Fragment 2 ainsi que la persistance de la valeur de la SeekBar.
---

## 👤 Auteur

* **École Normale Supérieure de Marrakech**
  
* **Réalisé par :** SALMA LAKHAL
  
* **Filière  :** CLE_INFO_S5
  
* **Année universitaire :** 2025/2026
  
* **Encadré par :** Pr. Mohamed LACHGAR

* **Cours :** Programmation Mobile : Android avec Java
  
