# 5 8 3 n : 배열의 길이 5, m : 더해야 하는 수 8 k: 한 수가 연속해서 더할 수 있는 것 3
# 2 4 5 4 6 -> data

n, m, k = map(int, input().split());
data = list(map(int, input().split()))

data.sort()
first = data[n-1] #가장 큰수
second = data[n-2] #두번째로 큰수 

result = 0

while True:
    for i in range(k):
        if m == 0:
            break
        result += first
        m -= 1 # 더 할 때 마다 1빼기
    if m == 0: #m이 0이라면 반복문 탈출
        break
    result += second # 두 번째로 큰수를 한번 더하기
    m -= 1 #더할때마다 1씩 빼기
print(result)

