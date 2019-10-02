import random

def diez():
    print ("EJECUTAMOS DIEZ")
    return 10

def doce():
    print ("EJECUTAMOS DOCE")
    return 12

mayor = (diez(), doce())[(random.randint(0,100)>50)]
print(mayor)