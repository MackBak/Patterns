
public class GymPlan extends TrainingPlan {

    private final int oefeningenPerSessie;
    private final String typeOefening;
    private final int rustTussenSets;

    private GymPlan(GymPlanBuilder builder) {
        super(builder);
        this.oefeningenPerSessie = builder.oefeningenPerSessie;
        this.typeOefening = builder.typeOefening;
        this.rustTussenSets = builder.rustTussenSets;
    }

    @Override
    public void toonPlan() {
        System.out.printf("Gymplan: %d sessies/week, %d oefeningen per sessie, Type oefening: %s, " +
                        "Rust tussen sets: %d minuten, Intensiteit: %s, Rustdagen: %d\n",
                sessiesPerWeek, oefeningenPerSessie, typeOefening, rustTussenSets, intensiteit, rustDagen);
    }

    // Concrete builder klasse voor het bouwen van een GymPlan
    public static class GymPlanBuilder extends TrainingPlanBuilder<GymPlanBuilder> {
        private int oefeningenPerSessie = 5;    // Standaardwaarde
        private String typeOefening = "Kracht"; // Standaardwaarde
        private int rustTussenSets = 2;         // Standaardwaarde

        public GymPlanBuilder(int sessiesPerWeek) {
            super(sessiesPerWeek, 0);
        }

        public GymPlanBuilder oefeningenPerSessie(int oefeningenPerSessie) {
            this.oefeningenPerSessie = oefeningenPerSessie;
            return this;
        }

        public GymPlanBuilder typeOefening(String typeOefening) {
            this.typeOefening = typeOefening;
            return this;
        }

        public GymPlanBuilder rustTussenSets(int rustTussenSets) {
            this.rustTussenSets = rustTussenSets;
            return this;
        }

        @Override
        protected GymPlanBuilder self() {
            return this;
        }

        @Override
        public GymPlan build() {
            return new GymPlan(this);
        }
    }
}
