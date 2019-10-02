def square(number):
    return number**2

lista= [1, 2, 3, 5, 9]
lista1 = list(map(square, lista))
lista1 = list(map(lambda number: number**2, lista))

print (lista1)