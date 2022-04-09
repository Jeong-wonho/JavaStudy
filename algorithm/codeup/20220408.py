#6070
number = int(input());
if((number // 3)==0 or (number//3) == 4 ):
    print("winter")
elif((number//3)==1):
    print("spring")
elif((number//3)==2):
    print('summer')
else:
    print('fall')
    
#6071
n = 1
while n!=0:
    n=int(input())
    if n!=0:
        print(n)
        
#6072
n = int(input());
while n!= 0:
    print(n)
    n -= 1
    
#6073
n = int(input());
while n!= 0:
    print(n-1)
    n -= 1
    
#6074
c = ord(input())
t = ord('a')
while t<=c :
  print(chr(t), end=' ')
  t += 1

#6075
n = int(input());
i = 0;
while i <= n:
    print(i)
    i += 1