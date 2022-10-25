## 정수 n이 입력되면 00시 00분 00초부터 N시 59분 59초 까지의 모든 시간 중에서 3이 하나라도 포함되는,
# 모든 경우의 수를 구하는 프로그램 ex)1을 입력했을 때 다음은 3이 하나라도 포함되어 있으므로 세어야 하는 시각
# 00시00분 00초 ~ N시59분59초

n = int(input());
result = 0
for h in range(n+1):
    for m in range(60):
        for s in range(60):
            if '3' in str(h) + str(m) + str(s):
                result += 1

print(result)
                
                
