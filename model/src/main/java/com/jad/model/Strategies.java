package com.jad.model;

import com.jad.share.IBehavior;

public class Strategies {

    // --- SPOILER ---
    public static class SpoilerAesthetic implements IBehavior {
        public String getName() {
            return "Esthétique";
        }

        public String getDescription() {
            return "aucun effet mécanique";
        }
    }

    public static class SpoilerAerodynamic implements IBehavior {
        public String getName() {
            return "Aérodynamique";
        }

        public String getDescription() {
            return "stabilité accrue";
        }
    }

    public static class SpoilerExaggerated implements IBehavior {
        public String getName() {
            return "Exagéré";
        }

        public String getDescription() {
            return "vitesse max réduite, effet visuel accentué";
        }
    }

    // --- NEONS ---
    public static class NeonSober implements IBehavior {
        public String getName() {
            return "Sobre";
        }

        public String getDescription() {
            return "lumière fixe";
        }
    }

    public static class NeonDisco implements IBehavior {
        public String getName() {
            return "Disco";
        }

        public String getDescription() {
            return "clignotement simulé";
        }
    }

    public static class NeonRandom implements IBehavior {
        public String getName() {
            return "Aléatoire";
        }

        public String getDescription() {
            return "affichage imprévisible";
        }
    }

    // --- JANTES ---
    public static class RimsPerformance implements IBehavior {
        public String getName() {
            return "Performance";
        }

        public String getDescription() {
            return "accélération améliorée";
        }
    }

    public static class RimsLowCost implements IBehavior {
        public String getName() {
            return "Low-cost";
        }

        public String getDescription() {
            return "aucun effet";
        }
    }

    public static class RimsShowOff implements IBehavior {
        public String getName() {
            return "Show-off";
        }

        public String getDescription() {
            return "bruit distinctif";
        }
    }

    // --- POT D'ECHAPPEMENT ---
    public static class ExhaustSilent implements IBehavior {
        public String getName() {
            return "Silencieux";
        }

        public String getDescription() {
            return "bruit discret";
        }
    }

    public static class ExhaustSport implements IBehavior {
        public String getName() {
            return "Sport";
        }

        public String getDescription() {
            return "bruit puissant";
        }
    }

    public static class ExhaustDrag implements IBehavior {
        public String getName() {
            return "Drag";
        }

        public String getDescription() {
            return "bruit extrême";
        }
    }
}