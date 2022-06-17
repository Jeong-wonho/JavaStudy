def solution(s):
    return s.isdigit() & (len(s) == 4 | len(s) == 6)