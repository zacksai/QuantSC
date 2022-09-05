# Problem Statement

A room contains 100 light bulbs (numbered from 1 to 100), and all are kept OFF initially. Outside of this room are 100 people. The first person enters the room and turns ON all the light bulbs whose labels are a multiple of 1 (i.e. All the light bulbs are switched to ON). The second person enters the room and turns off the light bulbs whose labels are a multiple of 2 (i.e. The even numbered light bulbs are turned OFF) The third person toggles light bulbs numbered with multiples of 3. This process continues until all 100 people pass. After this, how many light bulbs are ON? Please explain your reasoning!

***
## Solution in 40 Words

The only times bulbs will be left on are when they have an odd number of factors. 

Only square numbers have an odd number of factors.

**There are 10 square numbers from 1-100, so only 10 bulbs will be on.**

***
## Full Answer

Here's the full thought process:

Bulbs can be toggled an even or odd number of times. Even means they'll be off in the end, and odd means they'll be on. Example:

    2 toggles: on, off
    3 toggles: on, off, on

How many times will a bulb be toggled? When its factors are toggled. Example:

Bulb 6 factors into 1, 2, 3, 6.

So person 1, 2, 3, and 6 will toggle bulb 6 since they're all multiples of 6. 
Person 4 and 5 won't toggle it cause 6 isn't a multiple of 4 or 5:

    Person 1: on
    Person 2: off
    Person 3: on
    Person 4: nothing
    Person 5: nothing
    Person 6: off
    Person 7+: nothing (never a factor of 6)

So the **factors determine how many times the bulb is toggled.** 
If the bulb number has an even number of factors, it will end up off.
If the bulb number has an odd number of factors, it will end up on.

When does a number have an odd number of factors?
Let's check prime numbers, even numbers, and odd numbers:

1. Prime numbers are divisible by 1 and themselves. Just those two. Always even.


2. Even numbers are divisible by 1, themselves, and other even numbers. 
   * 2: (1, 2) – even 
   * 4: (1, 2, 4) – odd 
   * 6: (1, 2, 3, 6) – even 
   * 8: (1, 2, 4, 8) – even
        
* That's always even, except for 4, 16, etc...


3. Odd numbers are divisible by 1, themselves, and other odd numbers.



    3: (1, 3) – even

    5: (1, 5) – even 

    7: (1, 7) – even 

    9: (1, 3, 9) – odd

   * That's always even, except for 9, 25, etc...

So even and odd numbers always have an even number of factors, except for a few exceptions. The pattern to the exceptions? 

**The number must be a square.**

Typically, factors go in pairs since they're two separate numbers.
However, squares can divide into a single number multiplied by itself.
That's just one factor, not a pair.

So squares add one factor to an otherwise even number of factors.
One plus even is odd.
Found it!

All the squares have an odd number of factors, so they'll end up toggled on. What are all the squares from 1-100?

`1, 4, 16, 25, 36, 49, 64, 81, 100`

That's 10 bulbs that go on, off, (repeat 1-5 times,) and finally on again.
The rest of the bulbs will always end up toggling off. Always an even number of factors for them.

**Only 10 bulbs will be on at the end**

***
## Further Demonstration

Code demonstrates factorization of all numbers 1-100 to confirm.

## TL;DR

Squares are the only numbers that will be toggled on and off an odd number of times, leaving them on. There's 10 of them. The answer is 10.