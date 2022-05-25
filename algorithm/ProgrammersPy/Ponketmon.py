def solution(nums):
    ponketmon = [];
    for n in nums: 
        if (n not in ponketmon) and (len(ponketmon) < len(nums)/2):
            ponketmon.append(n)

    return len(ponketmon)