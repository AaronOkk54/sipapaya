edad =[17,5,12,28,50]
precios = [3580.17,400,17.85]
print(edad)
print("\noperacionessss\n")

suma=(edad[1] + edad [3])
print(suma)
datos_estudiante =["ana",19,99]
print(datos_estudiante)
print("nombre",datos_estudiante[0],"edad",datos_estudiante[2],
      "\n","nomrbre:",datos_estudiante[0],"nota:",datos_estudiante[1])

print("\n\n\ncodigo 2\n\n\n")

datos = [85,25,30,50,45,17,81,77,15,25]
sumadatos = 0
cont = 0
while cont <len(datos):
    sumadatos = sumadatos + datos[cont]
    cont=cont+1
promedio = sumadatos/len(datos)
print("los datos de la lista son :",datos)
print("la suma de kis datis es:",sumadatos)
print("elpromedio es",promedio)
print("\n\n\ncodigo 3\n\n\n")
precios =[]
for x in range (6): #para meter el primer precio hay que empezar a contar desde 0
    valor = float(input("ingrese el precio"))
    precios.append(valor)#esta verga es para meterle a precios el valor de "valor"
suma_precios = (precios[1] + precios[5])
print("\nla lista de precios es: ", precios)
print("\n",precios[0],"\n",precios[5],"\n",suma_precios)
