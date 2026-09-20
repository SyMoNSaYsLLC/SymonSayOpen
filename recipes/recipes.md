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

## Directories

| Directory | Holds |
|---|---|
| [`debian-kernel-inputs`](debian-kernel-inputs/debian-kernel-inputs.md) | build recipes — 1 at generation time |
| [`symoneural-awcc`](symoneural-awcc/symoneural-awcc.md) | build recipes — 1 at generation time |
| [`symoneural-nvidia-open-kernel`](symoneural-nvidia-open-kernel/symoneural-nvidia-open-kernel.md) | build recipes — 2 at generation time |

## Where this leads

Up to [recipes-platform.md](../recipes-platform.md), the map for this unit.

Onward, in the order the code runs: [`debian-kernel-inputs`](debian-kernel-inputs/debian-kernel-inputs.md), [`symoneural-awcc`](symoneural-awcc/symoneural-awcc.md), [`symoneural-nvidia-open-kernel`](symoneural-nvidia-open-kernel/symoneural-nvidia-open-kernel.md).
