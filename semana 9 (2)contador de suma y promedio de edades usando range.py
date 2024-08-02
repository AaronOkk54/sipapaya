#hacer un for para sumar las edades de todo
sumaEdad = 0
for i in range (10):
    edad = int(input("ingrese la edad: "))
    sumaEdad = sumaEdad + edad
print("la suma de las edades ",sumaEdad)
promedio = sumaEdad/10
print("el promedio es ", promedio)
