sizes = [[60, 50], [30, 70], [60, 30], [80, 40]]

def solution(sizes):
    return max(max(x) for x in sizes) * max(min(x) for x in sizes)
# def solution(sizes):
#     width = []
#     height = []
#     for i in sizes:
#         i.sort()
#         width.append(i[0])
#         height.append(i[1])
    

#     answer = max(width) * max(height)
#     return answer

print(solution(sizes))