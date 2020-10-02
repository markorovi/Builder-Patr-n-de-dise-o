public class main {
    public static void main(String[] args) {
        Director director = new Director();
        CustomPCBuilder constructor = new CustomPCBuilder();

        director.createAMDPC(constructor);
        CustomPC PC1 = constructor.finish();

        director.create500$PC(constructor);
        CustomPC PC2 = constructor.finish();

        director.create1000$PC(constructor);
        CustomPC PC3 = constructor.finish();

        director.createBudgetPC(constructor);
        CustomPC PC4 = constructor.finish();

        director.createIntelPC(constructor);
        CustomPC PC5 = constructor.finish();

    }
}
