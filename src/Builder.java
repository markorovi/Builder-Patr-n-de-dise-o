public interface Builder {
    void reset();
    void setCPU(String CPU);
    void setGPU(String GPU);
    void setMotherboard(String motherboard);
    void setRAM(int RAM);
    void setStorage(String storage);
    void setPSU(String PSU);
    void setHasWaterCooling(boolean hasWaterCooling);
}
