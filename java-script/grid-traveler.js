const gridTravelr = (rows, cols , memo = {}) => {

    const nodeId = rows + ',' + cols;

    if(nodeId in memo )
        return memo[nodeId];

    if(rows == 1 && cols == 1) return 1;
    if(rows == 0 || cols == 0) return 0;

    memo[nodeId] = gridTravelr(rows -1 , cols , memo) + gridTravelr(rows, cols-1 , memo);

    return memo[nodeId];
}

console.log(gridTravelr(2,3)) // 3
console.log(gridTravelr(3,3)) // 6
console.log(gridTravelr(18,18)) // 2333606220