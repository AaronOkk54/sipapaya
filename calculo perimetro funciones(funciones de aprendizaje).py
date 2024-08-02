def perimetro(dato):
    total=dato*4
    print("el perimetro del cuadrado es: ", total)
def area(dato):
    total = dato * dato
    print("el area del cuadrado es:",total)
def calcularperimetro():
    lado=int(input("ingrese el valor dde lado"))
    opc=int(input("elija una opcion \n***1=perimetro\n2=area \n***"))
    perimetro(lado)
    area(lado)

if __name__ == '__main__':
 for f in range(3):
     calcularperimetro()