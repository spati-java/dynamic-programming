const fib = (number , memo={}) => {

    if(number in memo) return memo[number];
    if (number <= 2)
        return 1;
        
    memo[number] = fib(number - 1 , memo) + fib(number - 2 , memo);
    return memo[number];
}

console.log(fib(50));