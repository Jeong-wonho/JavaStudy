# 5
# R R R U D D
# (1,2) => (1, 3) => (1, 4) => (무시)=> (2, 4) => (3, 4)

n = int(input())
x,y =1, 1
plans = input().split()

dx = [0, 0, -1, 1] # u, d, l, r
dy = [-1, 1, 0, 0] # u, d, l, r
move_types = ['L', 'R', 'U', 'D']

#이동 계획을 하나씩 확인
for plan in plans:
    for i in range(len(move_types)):
        if plan == move_types[i]:
            nx = x + dx[i];
            ny = y + dy[i];
    # 공간을 벗어나는 경우 무시
    if nx < 1 or ny <1 or nx > n or ny > n:
        continue
    x,y = nx, ny;
print(x, y)