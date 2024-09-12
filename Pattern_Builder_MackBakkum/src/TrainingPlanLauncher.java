public class TrainingPlanLauncher {

    public static void main(String[] args) {

        FietsPlan fietsPlan = new FietsPlan.FietsPlanBuilder(3, 30)  // 3 sessies/week, 30 km/sessie
                .intensiteit("Zwaar")
                .hoogtemeters(500)
                .fietsSoort("Mountainbike")
                .build();
        fietsPlan.toonPlan();

        HardloopPlan hardloopPlan = new HardloopPlan.HardloopPlanBuilder(6, 7) // 6 sessies/week, 7km/sessie
                .intensiteit("Intensief")
                .doelTempo("4:45 min/km")
                .warmingUpTijd(15)
                .rustDagen(1)
                .build();
        hardloopPlan.toonPlan();

        GymPlan gymPlan = new GymPlan.GymPlanBuilder(4)  // 4 sessies/week
                .intensiteit("Gemiddeld")
                .oefeningenPerSessie(8)
                .typeOefening("Kracht")
                .rustTussenSets(1)
                .rustDagen(3)
                .build();
        gymPlan.toonPlan();
    }
}

//  Verwachte output:
//  Fietsplan: 3 sessies/week, 30,00 km per sessie, Intensiteit: Zwaar, Hoogtemeters: 500,00 meter, Fietssoort: Mountainbike
//  Hardloopplan: 6 sessies/week, 7,00 km per sessie, Intensiteit: Intensief, Doeltempo: 4:45 min/km, Warming-up: 15 minuten, Rustdagen: 1
//  Gymplan: 4 sessies/week, 8 oefeningen per sessie, Type oefening: Kracht, Rust tussen sets: 1 minuten, Intensiteit: Gemiddeld, Rustdagen: 3
