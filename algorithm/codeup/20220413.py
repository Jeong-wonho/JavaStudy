#6079
n = int(input())
s = 0
for i in range(n):
    s += i
    if(s >= n):
        print(i)
        break;
    
#6080
n, m = input().split();
n = int(n); m = int(m);
for i in range(1, n+1):
    for j in range(1, m+1):
        print(i, j)
        
#6081 int(input(), 16);
n = int(input(), 16);
for i in range(1, 16):
    print('%X'%n, '*%X'%i, '=%X'%(n*i), sep='')


#6082 3,6,9 의 왕이 되자
n = int(input());
for i in range(1, n+1):
    if i%10 == 3:
        print("X", end=' ')
        continue
    if i%10 == 6:
        print("X", end=' ')
        continue
    if i%10 == 9:
        print("X", end=' ')
        continue
    print(i, end=' ')
    
#6083 빛 섞어 색 만들기
r, g, b = input().split()
r = int(r); g = int(g); b = int(b);
s = 0
for i in range(r):
    for j in range(g):
        for z in range(b):
            print(i, j, z)
            s += 1
print(s)

#6084 44100 * 16 * 2 * 1 bit
h, b, c, s = input().split()
h = int(h); b= int(b);c = int(c); s = int(s);
save = round((h * b * c * s)/8/1024/1024, 1);
print("{0} MB".format(save))

#6085
w, h, b = input().split()
w = int(w); h = int(h); b = int(b);
save = round((w * h * b)/8/1024/1024, 2);
print("{:.2f} MB".format(save))