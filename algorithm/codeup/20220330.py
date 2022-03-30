
# #6040
# a, b = input().split()
# c = int(a) // int(b)
# print(c)

# #6041
# a, b = input().split()
# c = int(a) % int(b)
# print(c)

# #6042
# a=float(input())
# print( format(a, ".2f") )
# 
#6043
# f1, f2 = input().split()
# f3 = format((float(f1) / float(f2)), ".3f")
# print(f3)

#6044
n1, n2 = input().split()
n1 = int(n1); n2 = int(n2);
print(n1 + n2)
print(n1 - n2)
print(n1 * n2)
print(n1 // n2)
print(n1 % n2)
print(format((n1/n2), ".2f"))

#6045
a, b, c = input().split()
hab = int(a) + int(b) + int(c)
avg = hab/3
print(hab, format(avg, ".2f"))
