# Project Shift Coding Challenge

First of all, this isn't a pass/fail challenge - get as far as you can. Some may find this difficult and others may find it rudimentary. We are merely interested in seeing what previous experience you have. Please limit your use of google to syntax and not answers.


## Problem 1
Write a function, that when invoked, alerts "Durham is awesome!"

## Problem 2
Write some JavaScript that loops through the following `bands` array and alerts, "I love [bandName]", obviously with the current band name string replacing the [bandName].

```JavaScript
const bands = ['Kiss', 'Aerosmith', 'ACDC', 'Led Zeppelin', 'Nickelback'];
```

## Problem 3
In the above challenge, when the loop gets to `'Nickelback'`, alert, "I DON'T love Nickelback!", but still alert the previous message for all other bands.

## Problem 4
Write some JavaScript that finds the average of the following array:

```JavaScript
const array = [34, 203, 16, 46, 34, 432, 342, 124, 33, 188, 12];
```

## Problem 5
Write some JavaScript to find the MOST frequent item, and the LEAST frequent item in the following array. The return should look like: `The most frequent item is: b. The least frequent item is : d`

```JavaScript
const array = ['a', 'b', 'c', 'd', 'c', 'b', 'b', 'c', 'a', 'e', 'b', 'e'];
```

## Problem 6
Imagine that you have two arrays, each with single letter strings in the arrays. For example:

```JavaScript
['a', 'b', 'c', 'a', 'a', 'b', 'd'];
['a', 'b', 'b', 'a', 'e', 'c', 'c', 'g'];
```
Write some JavaScript to create a new array based on the overlapping items and the number of times the overlap occurs. For example, our new array would look like this:

```JavaScript
['a', 'a', 'c', 'b', 'b'];
```

To explain further, the string `'a'` appears 3 times in the first array and 2 times in the second array. Therefore, there are only 2 overlaps. The string `'c'` appears 1 time in the first array and 2 times in the second array. Therefore, there is only 1 overlap. The same pattern follows with `'b'`. Our new array is based on those overlaps.

## Problem 7
Imagine that you're wanting to withdraw cash from the bank to cover specific costs. You want to withdraw the exact dollar amount, using the largest bills possible. For example, if the cost you were trying to cover is $1,745, you would need to withdraw 17 $100 bills, 2 $20 bills and 1 $5 bill. We'll leave change (anything less than a dollar) out of it for the sake of the exercise.

To solve this, write a function that takes one argument, `cost` and returns an object with the bill breakdown. For example, the object returned for $1,744, would like look this:

```JavaScript
{
  100: 17,
  20: 2,
  1: 4
}
```

If you want to take it a step further, enable your function to take a second argument, `bills`, which is an array of the bills you want your budget broken down in to. For example:

```JavaScript
budgetToBills(1754, [20, 10, 5, 1]); // { 20: 87, 10: 1, 1: 4 }
budgetToBills(1754, [100, 20, 50, 10, 5, 1]; // { 100: 17, 50: 1, 1: 4 }
```

What if you someone passes in the wrong arguments?
