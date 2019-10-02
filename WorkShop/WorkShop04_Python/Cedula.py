suma = 0
termino = False

cedula = int(input("Ingrese su numero de cedula: "))
verificador = cedula
while (termino == False):

    while(verificador > 0):
        suma = suma + (verificador % 10)
        verificador = verificador / 10

    if( suma <= 9):
        termino = True
    else:
        verificador = suma
        suma = 0

print ("El digito verificador es: " + str(suma))