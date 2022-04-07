#6065
a, b, c = input().split();
a = int(a); b= int(b); c=int(c);

if a%2==0:
    print(a)
if b%2==0:
    print(b)
if c%2==0:
    print(c)

def checkNumber(number):
    if number%2==0:
        print('even')
    else:
        print("odd")

checkNumber(a);
checkNumber(b);
checkNumber(c);
        
#6067
n = int(input())
if n<0 :
    if n%2==0 :
        print('A')      #주의 : 변수 A와 문자열 'A' / "A" 는 의미가 완전히 다르다. 
    else :
        print('B')
else :
    if n%2==0 :
        print('C')
    else :
        print('D')

#6068
n = int(input());
if n>89:
    print('A')
elif(n>69):
    print('B')
elif(n>39):
    print('C')
else:
    print('D')
    
#6069
word = input();
if(word == "A"):
    print("A: best!!!")
elif(word == "B"):
    print("B: good!!")
elif(word == "C"):
    print("C : run!")
elif(word =="D"):
    print("D : slowly~")
else:
    print("what?")

    