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

## Directories

| Directory | Holds |
|---|---|
| [`symoneural-autoconf`](symoneural-autoconf/symoneural-autoconf.md) | build recipes — 1 at generation time |
| [`symoneural-automake`](symoneural-automake/symoneural-automake.md) | build recipes — 1 at generation time |
| [`symoneural-libtool`](symoneural-libtool/symoneural-libtool.md) | build recipes — 1 at generation time |
| [`symoneural-m4`](symoneural-m4/symoneural-m4.md) | build recipes — 1 at generation time |

## Where this leads

Up to [retired.md](../retired.md), the map for this unit.

Onward, in the order the code runs: [`symoneural-autoconf`](symoneural-autoconf/symoneural-autoconf.md), [`symoneural-automake`](symoneural-automake/symoneural-automake.md), [`symoneural-libtool`](symoneural-libtool/symoneural-libtool.md), [`symoneural-m4`](symoneural-m4/symoneural-m4.md).
