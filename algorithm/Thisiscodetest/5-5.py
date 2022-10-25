def factorial_iterative(n):
    result = 1
    
    for i in range(1, n+1):
        result *= i
    return result

def factorial_recursive(n):
    if n <= 1:
        return 1
    # n! = n*(n-1)!를 그대로 코드로 작성하기
    return n*factorial_recursive(n-1)

#각각의 방식으로 구현한 n! 출력 (n=5)
print('반복적으로 구현:', factorial_iterative(5))
print('재귀적으로 구현:', factorial_recursive(5))