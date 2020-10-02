from CustomPC import CustomPC
from Director import Director

class Main:
    def __init__(self):
        self.Start()

    def Start(self):
        director = Director()
        constructor = CustomPC()

        director.CreateAMDPC(constructor)
        PC1 = constructor.finish()

        director.create500PC(constructor)
        PC2 = constructor.finish()

        director.create1000PC(constructor)
        PC3 = constructor.finish()

        director.createBudgetPC(constructor)
        PC4 = constructor.finish()

        director.createIntelPC(constructor)
        PC5 = constructor.finish()

main = Main()