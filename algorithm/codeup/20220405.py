#6059 비트단위논리연산
#** 비트단위(bitwise) 연산자는, ~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor), <<(bitwise left shift), >>(bitwise right shift) 가 있다.
# s = int(input())
# print(~s)

#6060
# # a, b = input().split()
# print(int(a) & int(b))

# #6061
# a, b = input().split()
# print(int(a) | int(b))

# #6062
# a, b = input().split()
# print(int(a) ^ int(b))

# #6063 삼항연산
# a, b = input().split()
# print(int(a) if (int(a) >= int(b)) else b)

#6064 삼항연산 
a, b, c = input().split()
a = int(a); b = int(b); c = int(c);
d = (a if a<b else b) if ((a if a < b else b) < c) else c
print(d);