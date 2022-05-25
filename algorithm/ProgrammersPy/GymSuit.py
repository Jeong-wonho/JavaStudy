lost = [3, 4, 5]; reserve=[2, 3, 4]; n = 5;

# 순서대로 생각해보자
"""
1. 여벌 체육복이 있는 사람만 -1, +1 인 사람에게 체육복을 빌려줄 수 있다.
- 그렇게 한번 선택된 사람은 다른 사람에게 빌려줄 수가 없다.
2. 여벌 체육복을 가져온 인원이 체육복을 도난 당했을 경우에는 ,
다른 사람에게 체육복을 빌려줄 수 없다.

문제해결
1. 빌려줄 수 있는 사람만 남기는게 중요하다.
lost배열과 reserve배열이 같은 경우에는 배열에서 제거하자
"""

def solution(n, lost, reserve):
    answer = n;
    
    #동일한 요소들 제거
    lostA = set(lost) - set(reserve)
    reserveA = set(reserve) - set(lost)

    #구분을 해야 한다. /남아 있는 값을 구하는 것이자나
    for r in reserveA:
        if(r-1 in lostA):
            lostA.remove(r-1)
        elif(r+1 in lostA):
            lostA.remove(r+1)
        
    
    return answer-len(lostA);



