
public class Director {

    public void createAMDPC(Builder builder) {
        builder.reset();
        builder.setCPU("Ryzen 9 3950X");
        builder.setGPU("Radeon 5700xt");
        builder.setMotherboard("Asus rog Strix X570-E");
        builder.setRAM(32);
        builder.setStorage("5TB Solid State");
        builder.setPSU("ASUS ROG THOR 1200P - 80 PLUS PLATINUM");
        builder.setHasWaterCooling(true);
    }
    public void createIntelPC(Builder builder) {
        builder.reset();
        builder.setCPU("INTEL CORE I9 10900K");
        builder.setGPU("GTX 3090");
        builder.setMotherboard("MSI MEG Z490 GODLIKE");
        builder.setRAM(32);
        builder.setStorage("5TB Solid State");
        builder.setPSU("ASUS ROG THOR 1200P - 80 PLUS PLATINUM");
        builder.setHasWaterCooling(true);
    }
    public void createBudgetPC(Builder builder) {
        builder.reset();
        builder.setCPU("INTEL CORE I3 9100F");
        builder.setGPU("Integrated");
        builder.setMotherboard("MSI H310M PRO-VDH PLUS");
        builder.setRAM(8);
        builder.setStorage("512GB HDD");
        builder.setPSU("AEROCOOL CYLON 600W RGB 80 PLUS BRONZE");
        builder.setHasWaterCooling(false);
    }
    public void create500$PC(Builder builder) {
        builder.reset();
        builder.setCPU("Intel Core i3-10100");
        builder.setGPU("MSI GTX 1650 Super");
        builder.setMotherboard("Gigabyte H410M");
        builder.setRAM(8);
        builder.setStorage("480GB Solid State");
        builder.setPSU("Thermaltake 600W");
        builder.setHasWaterCooling(false);
    }
    public void create1000$PC(Builder builder) {
        builder.reset();
        builder.setCPU("Intel Core i5-10400");
        builder.setGPU("Gigabyte Radeon RX 5600 XT Gaming OC 6G");
        builder.setMotherboard("ASUS Prime H470-PLUS/CSM");
        builder.setRAM(16);
        builder.setStorage("512GB Solid State");
        builder.setPSU("Silverstone ET750-B");
        builder.setHasWaterCooling(true);
    }



}
