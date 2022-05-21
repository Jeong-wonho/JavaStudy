"""## 음양 더하기
absolute : 정수들의 절댓값을 차례대로 담은 정수 배열 absolute</br>
signs : 정수들의 부호를 차례대로 담은 배열

해결점: 실제 정수들의 합을 구하여 return하도록 solution 함수를 완성해주세요"""

def solution(absolutes, signs):
    answer = sum(abs if sign else -abs for sign, abs in zip(signs, absolutes))
        
    return answer