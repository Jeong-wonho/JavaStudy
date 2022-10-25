# 5
# R R R U D D
n = int(input())
x, y = 1, 1
plans = input().split()

#오른쪽은 (0, n) 왼쪽은 (0, n-1) 위쪽은 (n, 0) 아래 (n-1, 0)
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
move_types = ['L', 'R', 'U', 'D']

for plan in plans:
    for i in range(len(move_types)):
        if plan == move_types[i]:
            nx = x + dx[i] # x + 0  = 1/  1 + 0  = 1 /   , 
            ny = y + dy[i] # y + 1  = 2/ 2 + 1 = 3 /
    # 공간을 벗어나는 경우 무시
    if nx < 1 or ny < 1 or nx > n or ny > n:
        continue
    # 이동 수행
    x, y = nx, ny

print(x, y)