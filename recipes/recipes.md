# recipes

Build recipes. 4 at generation time.

```
    debian-kernel-inputs-6.12.107+deb13-amd64_6.12.107.bb
    symoneural-awcc_1.19.0.bb
    symoneural-nvidia-open-kernel-debian_615.71.09.bb
    symoneural-nvidia-open-kernel_615.71.09.bb
```

## Interfaces

No environment variable is read here, nothing inside this unit is imported, and
nothing inside this unit imports it. Stated rather than omitted: an absent interface
section reads as an oversight, an explicit one is an answer.

## Where this leads

Up to [recipes-platform.md](../recipes-platform.md), the map for this unit.

Nothing here calls into another directory of this unit, so the chain ends at this
document. §3.7 requires that to be said rather than left as a dead end.
