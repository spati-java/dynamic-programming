def fib (number , memo = {}):
  if number in memo:
    return memo.get(number)
  if number <= 2: 
    return 1
    
  memo[number] = fib(number-1) + fib(number-2)

  return memo.get(number);

print(fib(50))
