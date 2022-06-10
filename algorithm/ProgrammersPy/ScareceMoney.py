price = 3; money = 20; count = 4;

def solution(price, money, count):
    answer = -1
    nPrice = sum(n * price for n in range(1, count+1))

    if(nPrice > money):
        return nPrice-money
    else:
        return 0

print(solution(price, money, count))

"문제 , 문제 설명, 해결법"
def solution(price, money, count):
    return max(0,price*(count+1)*count//2-money)
ㄴ