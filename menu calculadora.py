def sum(data1,data2):
   sum = data1 + data2
   print(sum)
def sub(data1,data2):
    sub=data1 - data2
    print(sub)
def div(data1,data2):
    div=data1/data2
    print("div")
def mult(data1, data2):
    mul=data1 * data2
    print(mul)
def menu():
    menchoice=int(input("para sumar digita 1 \n para restar digita 2 \n para dividir digita 3 \n "
                     "para multiplicar digita 4"))
    if menchoice < 5 and menchoice > 0:
        if menchoice == 1:
            sum(num1, num2)
        elif menchoice == 2:
            sub(num1,num2)
        elif menchoice == 3:
            div(num1,num2)
        else:
            mult(num1,num2)
if __name__ == '__main__':
    num1 = int(input("ingresa dato 1"))
    num2 = int(input("ingresa dato 2"))
    menu()