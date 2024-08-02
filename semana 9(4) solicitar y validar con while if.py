'''hacer una acumulador que sume los impares y otro que sume los pares'''

#if x %2 ==0:
pares = 0
impares = 0
v = 0
limite = 10
while (v != limite):
    numero = int(input("ponga un numero"))
    if numero %2==0:
        pares = pares+1
        v = v+1

    else:
        impares = impares+1
        v = v+1

print("numeros pares ",pares, " numeros impares ", impares)