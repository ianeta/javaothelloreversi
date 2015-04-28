# Introduction #

The implementation is done in the Java language. This project may host more than one implementation of the game.

# Details #

A sub-folder nOth1(nothize's Othello 1) is made under the trunk to have a separate namespace so that it will be easier to add another implementation in another sub-folder easier in the future.

## Sample screen ##

Below is the first draft of the Othello board output in console mode. The idea of using '.', 'X', 'O' as empty, black, white is brought from the Othello game I wrote a decade ago using Pascal. That idea was borrowed from the tic-tac-toe game of the use of cross and circle while dot was designed to visualize the empty slots.

```
  1 2 3 4 5 6 7 8
1 . . . . . . . .
2 . . . . . . . .
3 . . . . . . . .
4 . . . O X . . .
5 . . . X O . . .
6 . . . . . . . .
7 . . . . . . . .
8 . . . . . . . .

Current player: BLACK
```


## TDD(Test-Driven Development) ##

Ricky Liu has proposed a development method - Test-Driven Development. This has long been a dream to me whilst lacking of practical experience. So it's worth to try it here.

But, where to start? [Here](http://www.agiledata.org/essays/tdd.html) reveals some information.

Get lost of how to unit testing? See the [unit testing guidelines](http://geosoft.no/development/unittesting.html).

## What to test? ##

With TDD, creating test cases requires knowing part of the whole picture beforehand!

So first determine the whole picture:

  1. Starting board.
    1. Initialization
    1. Show the board
  1. Player move
    1. If no move x 2, goto 3; If no move, goto 2.5.
    1. Ask for move until valid move
    1. Perform move
    1. Update the board
    1. switch player
  1. End game

Break it, the big steps 1, 2 and 3 can be tested separately.

### Starting board ###

Just make sure the Board is being initialized to all EMPTY except the center 4x4 slots following the starting position illustrated above.

### Player move ###

Choose the easier task first. 2.2 seems to be easy. It consists of two smaller tasks: ask for move and move validation.

......is this the right way to TDD?



# About OOD #

Just read through this page [Tell, don't ask](http://ketan.padegaonkar.name/2009/09/04/tell-dont-ask-part-1.html).(Tell someone to do something, not ask someone for information to make decision) It's a simple rule to follow for Object-Oriented Design.

And here is [part-2](http://ketan.padegaonkar.name/2009/09/04/tell-dont-ask-part-2.html), "Objects expose behavior, not state".

# When to do optimization? #

Linked from the "Tell Don't ask" above, I come across many interesting discussion style article/wiki. One of it is [OptimizeLater](http://www.c2.com/cgi/wiki?OptimizeLater). It is a good discussion that have points from both side. Every suggestions/guide-line is not absolute, they're all living with certain assumptions and constraints.

Perhaps if I have had read it earlier, I could save time **less** worrying about the performance issues, until it has happened or being a spot after profiling.