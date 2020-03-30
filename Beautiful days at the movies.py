def Reverse_Integer(Number):
    Reverse = 0
    while(Number > 0):
        Remainder = Number %10
        Reverse = (Reverse *10) + Remainder
        Number = Number //10
    return Reverse

def beautifulDays(i, j, k):
    count=0
    for i in range(i,j+1):
        if abs(i-Reverse_Integer(i))%k==0:
            count+=1
    return count
