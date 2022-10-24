n, k = map(int, input().split());
result = 0

# 너무 어려운데?
while True:
    #(N==K로 나누어 떨어지는 수)가 될때까지 1씩 빼기
    target = (n//k) * k # 21//4 = 5 * 4 = 20 / 1* 4 = 4 / 0
    result += (n-target) # 21-20  = 1 / 4 / 
    n = target # n = 20 / n = 4 / n = 0
    # N이 K보다 작을 때 반복문 탈출 
    if n < k: 
        break
    #K로 나누기
    result += 1 # 2 / 3
    n //= k # n = 20 // 4 -> n = 5 / n = 1

result += (n-1)
print(result)