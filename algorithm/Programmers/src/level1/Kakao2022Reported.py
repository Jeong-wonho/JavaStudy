"""
 문제 파악

1. 나는 dictionary 자료형으로 풀려고 했다. but key 값을 잘 못 설정했다.
2. 필요없는 리스트들이 너무 많았다. 그래서 append가 많이 일어낫다.
3. set자료형 두개를 비교하면서 추가적인 메모리 사용이 있었던거 같다.
4. 일 처리 하기 위한 단계가 너무 많다. 
    1. id_list 순서대로 메일을 보낸다.
    2. report의 [1] index가 k개 이상인 경우에만 정지 된다. 
    3. 정지 되는 id를 신고한 id를 가진 사람에게만 메일을 보낸다.
"""
id_list = ["muzi", "frodo", "apeach", "neo"]
report = ["muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"]
k = 2

# 나의 풀이
def solution(id_list, report, k):
    answer = [0] * len(id_list)
    reports = {};
    for i in id_list:
        reports[i] = 0
    
    for rep in set(report):
        reports[rep.split()[1]] +=1
        
    for rep in set(report):
        if reports[rep.split()[1]] >= k:
            answer[id_list.index(rep.split()[0])] += 1
        
    return answer

print(solution(id_list, report, k))