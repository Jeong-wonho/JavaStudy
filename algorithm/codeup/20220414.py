#6086
n = int(input());
s = 0;
c = 1;
while (True):
    s += c;
    c += 1;
    if (s>=n):
        break

print(s)

#6087
n = int(input());
for i in range(1, n+1) :
  if i%3==0 :
    continue            #다음 반복 단계로 넘어간다.
  print(i, end=' ')    #i가 짝수가 아닐 때만 실행된다.

#6088
a, d, n = input().split();
a = int(a); d = int(d); n = int(n);
s = a;
for i in range(1, n):
    s += d;

print(s)

#6089
a, r, n = input().split();
a = int(a); r = int(r); n=int(n);
s = a;
for i in range(1, n):
    s *= r
print(s)

#6090
a, m, d, n = input().split();
a = int(a); m = int(m); d = int(d); n = int(n);
s = a;
for i in range(1, n):
    s = s * m + d

print(s);

#6091
a, b, c = input().split();
a = int(a); b = int(b); c = int(c);
d = 1;
isBoolean = True;
while isBoolean:
    d += 1;
    isBoolean = d%a!=0 or d%b!=0 or d%c!=0;

print(d);

#6092
n = int(input()) # 번호 부르는 수, 0부터 n-1
a = input().split()
d = [];

for i in range(n):
    a[i] = int(a[i])

for i in range(24):
    d.append(0)

for i in range(n):
    d[a[i]] += 1

for i in range(1, 24):
    print(d[i], end=' ')