# #6051
# a, b = input().split()
# a = int(a); b = int (b);
# print(a!=b)

# #6052
# n = int(input());
# print(bool(n))

# #6053
# a = bool(int(input()));
# print(not a)

# #6054
# a, b = input().split()
# print(bool(int(a)) and bool(int(b)))

# #6055
# a, b = input().split()
# print(bool(int(a)) or bool(int(b)))

# #6056
# a, b = input().split()
# c = bool(int(a))
# d = bool(int(b))
# print((c and (not d)) or ((not c) and d))

# #6057
# a, b = input().split()
# print(a == b)

#6058
a, b = input().split()
c = bool(int(a))
d = bool(int(b))
# 모두 false일때문 true출력
print(not(c) and not(d))