#나머지가 1인 것중 최소값을 구하는 문제
def solution(n):
    answer = 0
    ans = []
    for i in range(2, n):
        if(n%i == 1):
            ans.append(i)
    
    answer = ans[0]
    return answer

print(solution(10))