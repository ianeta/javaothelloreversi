# Introduction #

One of a flexible design pattern is called Model-View-Controller(or Model-View-Adapter) that separate the view and model.

It's valuable for a flexible design, but requires more design and development effort. While at the first sight, the all-in-one approach may seems to be easier. With flexibility comes complexity.


# Details #

## What is Model-View-Controller?(A short explanation) ##

Model refers to the data and behavior associated with the data. View is the presentation of the model data is some ways. Controller is an adapter that translate both the input data to the model and the output or state changes from the model to the view.


## What are the components of the game, Othello? ##

  1. Board - 1 and only 1 of it. (But...wait!! It consist of 8x8 slots for empty/black/white piece!)
  1. Player - Two.
  1. Piece - Black or white.
  1. Score - 1 point per piece.


## What should be included in the User Interface? ##

  1. Board(with empty, black or white piece)
  1. Whose turn
  1. The score so far
  1. An option to quit the game...
  1. Optionally, a timer

## Too boring? Lets go! ##

The skeleton of the game is available in the Source tab now!

See the [implementation](implementation.md) wiki for sample screen.