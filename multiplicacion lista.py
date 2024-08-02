input_num = input("digales").split()
num = list(map(int, input_num)) #convertir lista a numeros enteros
multi = 1 #de una vez pondre esto, 1 es elemento neutro en "*" como el 0
for i in num:
    multi *= i
print(multi)
'''Al inicio, resultado es 1.
En la primera iteración, i es 3. Entonces,multi = 1 * 3, lo que actualiza resultado a 3.
En la segunda iteración, i es 4. Entonces,multi= 3 * 4, lo que actualiza resultado a 12.
En la tercera iteración, i es 5. Entonces, multi = 12 * 5, lo que actualiza resultado a 60.'''
