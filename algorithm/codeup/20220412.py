#6076
n = int(input());

for i in range(n+1):
    print(i);
    
#6077
n = int(input());
s = 0
for i in range(1, n+1):
    if (i%2==0):
        s += i

print(s)

#6078
while(True):
    c = input();
    print(c)
    if(c=='q'):
        break
