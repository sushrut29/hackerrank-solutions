def getMoneySpent(keyboards, drives, b):
    lst=[]
    for i in range (len(keyboards)):
        for j in range (len(drives)):
            if (keyboards[i]+drives[j])<=b:
                lst.append(keyboards[i]+drives[j])
            
    if len(lst)==0:
        return -1
    else:
        return max(lst)
