public class CustomPCBuilder extends CustomPC implements Builder{
    private Object PC;

    public CustomPCBuilder() {
        this.reset();
    }

    public void reset() {
        this.PC = new CustomPC();
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setPSU(String PSU) {
        this.PSU = PSU;
    }

    public void setHasWaterCooling(boolean hasWaterCooling) {
        this.hasWaterCooling = hasWaterCooling;
    }

    public CustomPC finish() {
        this.reset();
        System.out.println(this.CPU + ", " + this.GPU + ", Watercooling?: " + this.hasWaterCooling + ", " + this.motherboard + ", " + this.PSU + ", " + this.RAM + "GB de RAM");
        return (CustomPC) PC;
    }
}
