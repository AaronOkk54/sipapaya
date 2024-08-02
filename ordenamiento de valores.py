def ordenDatos (dato1, dato2, dato3):
    if (dato1 > dato2 and dato1 > dato3) and (dato2 > dato3):
        print(dato1, dato2, dato3)
    elif (dato2 > dato1 and dato2 > dato3) and (dato3 > dato1):
        print(dato2, dato3, dato1)
    elif (dato3 > dato1 and dato3 > dato2) and (dato2 > dato1):
        print(dato3, dato2, dato1)
    elif (dato1 > dato2 and dato1 > dato3) and (dato3 > dato2):
        print(dato1, dato3, dato2)
    elif (dato2 > dato1 and dato2 > dato3) and (dato1 > dato3):
        print(dato2, dato1, dato3)
    else:
        print(dato3, dato1, dato2)

def obtener():
    numero1 = int(input("ingrese numero 1"))
    numero2 = int(input("ingrese numero 2"))
    numero3 = int(input("ingrese numero 3"))
    ordenDatos(numero1,numero2,numero3)
if __name__ == '__main__':
    obtener()
   
