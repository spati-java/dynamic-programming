def gridTraveler (rows, cols , memo = {}):

    nodeId = str(rows) + ',' + str(cols)
    
    if(nodeId in memo): return memo.get[nodeId]
    
    if(rows == 1 and cols == 1): return 1

    if(rows == 0 or cols == 0): return 0

    memo[nodeId] = gridTraveler(rows -1 , cols , memo = {}) + gridTraveler(rows , cols-1 , memo = {})

    return memo[nodeId]

print(gridTraveler(2,3)) 
print(gridTraveler(3,3)) 
print(gridTraveler(4,4))
#print(gridTraveler(18,18))
