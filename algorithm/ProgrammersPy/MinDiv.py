#최소값 구하는 문제
def solution(n):
    answer = 0
    ans = []
    for i in range(2, n):
        if(n%i == 1):
            ans.append(i)
    
    answer = ans[0]
    return answer

print(solution(10))