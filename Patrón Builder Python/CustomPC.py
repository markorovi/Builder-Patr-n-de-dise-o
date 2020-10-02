class CustomPC():
    def __init__(self):
        self.CPU = None
        self.GPU = None
        self.motherboard = None
        self.RAM = None
        self.storage = None
        self.PSU = None
        self.hasWaterCooling = None

    def setCPU(self, CPU):
        self.CPU = CPU
    
    def setGPU(self, GPU):
        self.GPU = GPU
    
    def setMotherboard(self, motherboard):
        self.motherboard = motherboard

    def setRAM(self, RAM):
        self.RAM = RAM

    def setStorage(self, storage):
        self.storage = storage

    def setPSU(self, PSU):
        self.PSU = PSU

    def setHasWaterCooling(self, hasWaterCooling):
        self.hasWaterCooling = hasWaterCooling

    def finish(self):
        print(self.CPU + ", " + self.GPU + ", Watercooling?: " + str(self.hasWaterCooling) + ", " + self.motherboard + ", " + self.PSU + ", " + str(self.RAM) + "GB de RAM")
        return self
