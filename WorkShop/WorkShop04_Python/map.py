def doblar(numero):
    return numero*2

numeros = [2, 5, 10, 23, 50, 33]

map(doblar, numeros)

list( map(lambda x: x*2, numeros) )