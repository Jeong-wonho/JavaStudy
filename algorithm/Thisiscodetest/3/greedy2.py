n,m = map(int, input().split());

result = 0;
# 한 줄 씩 입력 받아 확인
for i in range(n):
    data = list(map(int, input().split()))
    #현재 줄에서 '가장 작은 수 '찾기
    min_value = min(data)
    result = max(result, min_value);

print(result);