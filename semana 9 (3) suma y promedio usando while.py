cant = int(input("cuantas edades va promediar"))
X = 1
sumaedad = 0
while X< cant:
    edad = int(input("ingrese edad"))
    sumaedad = sumaedad + edad
    X = X+1
print("suma ",sumaedad)
promedio = sumaedad/cant
print("promedio ",promedio)
