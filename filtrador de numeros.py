num = list(map(int, input("put num with_").split()))# Leer la lista de números y convertirlos a enteros
p = int(input("0 or x num"))
if p == 0:
    result = [i for i in num if i % 2 == 0]#filtrar num par
    print(result)
else:
    result = [i for i in num if i % 2 != 0]#lo mismo pero impar
    print(result)