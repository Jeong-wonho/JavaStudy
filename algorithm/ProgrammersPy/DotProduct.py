def solution(a, b):
    return sum(answerA*answerB for answerA, answerB in zip(a,b));