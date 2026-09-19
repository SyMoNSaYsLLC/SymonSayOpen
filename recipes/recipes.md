# recipes

Build recipes. 2 at generation time.

```
    symoneural-bitbake_git.bb
    symoneural-openembedded-core_git.bb
```

## Interfaces

No environment variable is read here, nothing inside this unit is imported, and
nothing inside this unit imports it. Stated rather than omitted: an absent interface
section reads as an oversight, an explicit one is an answer.

## Where this leads

Up to [recipes-build.md](../recipes-build.md), the map for this unit.

Nothing here calls into another directory of this unit, so the chain ends at this
document. §3.7 requires that to be said rather than left as a dead end.
