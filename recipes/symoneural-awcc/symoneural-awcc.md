# symoneural-awcc

The capability `recipes-platform` provides. Its HTTP surface is `service.py` at the
worktree root; this directory is what that surface calls.

## Interfaces

No environment variable is read here, nothing inside this unit is imported, and
nothing inside this unit imports it. Stated rather than omitted: an absent interface
section reads as an oversight, an explicit one is an answer.

## Directories

| Directory | Holds |
|---|---|
| [`files`](files/files.md) | `ExternalProject.cmake` |

## Where this leads

Up to [recipes.md](../recipes.md), the map for this unit.

Onward, in the order the code runs: [`files`](files/files.md).
