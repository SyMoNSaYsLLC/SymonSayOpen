# recipes

Build recipes. 2 at generation time.

```
    symoneural-gstreamer-plugins-base_git.bb
    symoneural-gstreamer_git.bb
```

## Interfaces

No environment variable is read here, nothing inside this unit is imported, and
nothing inside this unit imports it. Stated rather than omitted: an absent interface
section reads as an oversight, an explicit one is an answer.

## Directories

| Directory | Holds |
|---|---|
| [`symoneural-gstreamer`](symoneural-gstreamer/symoneural-gstreamer.md) | build recipes — 2 at generation time |

## Where this leads

Up to [recipes-live.md](../recipes-live.md), the map for this unit.

Onward, in the order the code runs: [`symoneural-gstreamer`](symoneural-gstreamer/symoneural-gstreamer.md).
