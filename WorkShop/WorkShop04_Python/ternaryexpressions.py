#import random
#(a,b,c,d) = (1,2,3,4) if (random.randint(0,100)>50) else (4,3,2,1)
#print (a,b,c,d)

a = 10
b = 12
mayor = (lambda:b, lambda:a)[a>b]()


import random

def diez():
    print ("EJECUTAMOS DIEZ")
    return 12

def doce():
    print ("EJECUTAMOS DOCE")
    return 12

mayor = (lambda:diez(), lambda:doce())[(random.randint(0,100)>50)]()
print(mayor)