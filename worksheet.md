# 09/02 Worksheet: Complexity

## Review
1. In your own words, what is computational complexity? Why is it important to consider?
2. In your own words, what is the difference between best-case and worst-case complexity?
3. In your own words, what is the difference between run-time complexity and memory complexity?
4. When calculating complexity, we often round to the largest order operation (e.g., O(3n<sup>2</sup> + 2n + 42) is expressed as O(n<sup>2</sup>)). Why is this an accepted practice?
5. Put the following big-O's in order from fastest to slowest: O(n<sup>2</sup>), O(3<sup>n</sup>), O(n!), O(2<sup>n</sup>), O(n<sup>3</sup>), O(n), O(log(n))
6. What are each of the following big-O's called in English: O(n<sup>2</sup>), O(n<sup>3</sup>), O(n), O(n!), O(2<sup>n</sup>), O(1)?

## Exploration
For each of the following functions, say whether it has computational complexity O(1), O(n), O(n<sup>2</sup>), or O(n<sup>3</sup>). Give a two-sentence justification of your answer. Your justification should *not* be based on actually running the code. 

1. 
```java
public int f1(int n) {
 int x = 0;
 for (int i = 0; i < n*n*n; i++){
  x++;
 }
 return x;
}
```

2.
```java
public int f2(int n){
 int x = 0;
 for (int i = 0; i < n; i++){
  x++;
  continue;
 }
 return x;
}
```

3.
```java
public int f3(int n){
 int x = 0;
 for (int i = 0; i < n; i++){
  x++;
  break;
 {
 return x;
}
```

4.
```java
public int f4(int n){
 int x = 0;
 for (int i = 0; i < n; i++){
  if (n % 1000000000 == 0) {
   x++;
  }
 }
 return x;
}
```

5. 
```java
public int f5(int n){
 int x = 0;
 for (int i = 0; i < n; i++){
  for (int j = 0; j < i; j++){
   x++;
  }
 }
 return x;
}
```

6.
```java
public int f6(int n){
 int x = 0;
 int y = 10;
 for (int i = 0; i < n; i++){
  for (int j = 0; j < y; j++){
   x++;
  }
 }
 return x;
}
```

7. 
```java
public int f7(int n){
 int x = 0;
 for (int i = 0; i < n; i++){
  x++;
 }
 for (int j = n; j >= 0; j--){
  x++;
 }
 return x;
}
```

8.
```java
public int f8(int[] arr){
 int x = 0;
 for (int i = 0; i < arr.length; i++){
  x++;
 }
 return x;
}
```

## Challenge
One time when we consider computational complexity is when trying to pick the most efficient data structure for a project. In this section, you will compare LinkedLists and ArrayLists for this purpose.

1.
    a. What is the best and worst case complexity of the `add()` method for ArrayLists? Give a brief justification of each answer.   
    b. What is the best and worst case complexity of the `add()` method in a LinkedList? Give a brief justification of each answer.   
    c. Is `add()` more efficient in ArrayLists or LinkedLists overall? Explain your reasoning.   


2. 
    a. What is the best and worst case complexity of the `size()` method for ArrayLists? Give a brief justification of each answer.   
    b. What is the best and worst case complexity of the `size()` method in a LinkedList? Give a brief justification of each answer.   
    c. Is `size()` more efficient in ArrayLists or LinkedLists overall? Explain your reasoning.   

3. 
    a. What is the best and worst case complexity of the `get()` method for ArrayLists? Give a brief justification of each answer.    
    (Something to keep in mind here is that array indexing (i.e., `array[i]`) is constant time. Why? Every element in an array takes up the same amount of space in memory. The starting location in memory is known. Thus, we can find the exact location of any element in the array by plugging into the formula: `start + index * size`. Because this does not depend on the size of the overall array, and each individual computation is constant, we consider array indexing to be constant time overall.)   
    b. What is the best and worst case complexity of the `get()` method in a LinkedList? Give a brief justification of each answer.   
    c. Is `get()` more efficient in ArrayLists or LinkedLists overall? Explain your reasoning.   

4. Based only on these three methods, under what circumstances would you pick an ArrayList over a LinkedList? When would you pick a LinkedList over an ArrayList? What would you need to know about a project in order to make this decision?

5. The [Millenium Prize](https://www.claymath.org/millennium-problems) awards $1,000,000 to the first person (or group) that finds a solution to any of a set of problems. One of these is known as the "P vs. NP Problem" or "Does P = NP?". Spend a few minutes googling this problem. What are some examples of P complexities? What are some examples of NP complexities? What would it mean if P=NP?
