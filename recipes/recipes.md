# recipes

Build recipes. 4 at generation time.

```
    symoneural-autoconf_git.bb
    symoneural-automake_git.bb
    symoneural-libtool_git.bb
    symoneural-m4_git.bb
```

## Interfaces

No environment variable is read here, nothing inside this unit is imported, and
nothing inside this unit imports it. Stated rather than omitted: an absent interface
section reads as an oversight, an explicit one is an answer.

## Where this leads

Up to [retired.md](../retired.md), the map for this unit.

Nothing here calls into another directory of this unit, so the chain ends at this
document. §3.7 requires that to be said rather than left as a dead end.
