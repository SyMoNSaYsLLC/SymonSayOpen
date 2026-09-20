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

## Directories

| Directory | Holds |
|---|---|
| [`symoneural-bitbake`](symoneural-bitbake/symoneural-bitbake.md) | build recipes — 1 at generation time |
| [`symoneural-openembedded-core`](symoneural-openembedded-core/symoneural-openembedded-core.md) | build recipes — 1 at generation time |

## Where this leads

Up to [recipes-build.md](../recipes-build.md), the map for this unit.

Onward, in the order the code runs: [`symoneural-bitbake`](symoneural-bitbake/symoneural-bitbake.md), [`symoneural-openembedded-core`](symoneural-openembedded-core/symoneural-openembedded-core.md).
