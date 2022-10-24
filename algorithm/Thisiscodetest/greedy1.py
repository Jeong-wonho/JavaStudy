n, m, k = map(int, input().split());
# N개의 수를 공백으로 구분하여 입력 받기
data = list(map(int, input().split()));

data.sort() #입력받은 수들 정렬하기
first = data[n-1]
second = data[n-2]

count = int(m/(k+1)) * k #가장 큰 수가 반복되는 횟수
count += m %(k+1) # 나머지가 있을 수 있는 경우

result = 0
result += (count) * first
result += (m-count) * second

print(result)

            