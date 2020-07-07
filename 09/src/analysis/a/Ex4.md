#Ex4 Solution

We had this function, that returns the average of a set of integers. 
It works almost perfectly by integer division. 
```java
public static int avg(Set<Integer> numbers) {
    int count = 0;
    int sum = 0;
    for (int number : numbers) {
      sum += number;
      count++;
    }
    
    return sum / count;
  }
```
#### What happens when `numbers` is empty?
If `numbers` is empty, the `foreach` loop doesn't execute, leaving `count` and `sum` as `0`.
Thus, when we reach the `return` statement, we have `return 0 / 0`, 
throwing an `ArithmeticException` because dividing by `0` isn't defined. 
#### The Solution
We need to prevent reaching the final return statement if `count = 0`. 
There are at least two ways to do that. 
Adding one of these before the problematic `return` fixes the problem. 
##### Option 1 - Checking if  `numbers` is empty
```java
       if(numbers.isEmpty()) {
         return 0;
       }
```
##### Option 2 - Checking if `count = 0` 
```java
      if(count == 0) {
        return 0;
      }
```