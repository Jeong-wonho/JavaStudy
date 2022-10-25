#나이트 행 위치는 1~8 열 위치는 a~h
# 나이트는 2칸 씩 이동하네
n = input();
#최대 경우의 수는  8개
row = int(n[1])
column = int(ord(n[0])) - int(ord('a')) + 1

steps = [(-2, -1), (-1, -2), (1, -2), (2, -1), (2, 1), (1, 2), (-1, 2), (-2, 1)]

result=0
for step in steps:
    next_row = row +step[0]
    next_column = column + step[1]
    if next_row >= 1 and next_row <= 8 and next_column >=1 and next_column <=8:
        result += 1
print(result)