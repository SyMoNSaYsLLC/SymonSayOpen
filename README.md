# SymonSayOpen

The copyleft side of the estate, kept apart from the distribution on purpose.

## Why the separation exists

SyMoNsAyLeaRn ships under SymonSaysLLC Open Source License 1.0: source-available now, Apache-2.0 two years after each
release. That promise is only keepable if nothing copyleft is linked into what ships, so the
ship gate fails a release on any strong copyleft component and reviews the weak ones.

But the estate still builds copyleft software. A build system, a kernel module, a media
framework and a platform tool are all copyleft, all needed, and none of them belong in a
proprietary release. Mixing them into one tree means every licence question has to be asked
about every artifact, and the answer drifts the moment someone adds a dependency.

So they live here. The rule is one sentence: **nothing on this repository may be linked into
a SymonSayDistribute release.** Separation is what makes that checkable rather than hoped for.

## What is here, and what is not

| Here | Not here |
|---|---|
| recipes that build copyleft components | anything that links into a shipped runtime |
| the licence each one declares | upstream source — that is tracked in `SymonSaySource` |
| what we use it for, and whether the output ships | weights, in any format or size |

A recipe here is our own work, licensed **SymonSaysLLC Open Source License 1.0** — not the distribution's SymonSaysLLC Open Source License 1.0. These
recipes exist to combine with copyleft software, and a proprietary licence on metadata whose
purpose is that combination creates a question at every use. What each recipe BUILDS keeps its
own licence, which is recorded per recipe and is the whole reason these are kept apart. See
`NOTICE.md`.

## How it is laid out

| Branch | Holds |
|---|---|
| `main` | this index, and nothing else |
| one per recipe group | the recipes in that group whose output is copyleft |

## The three repositories

| Repository | Holds | Licence of what it ships |
|---|---|---|
| `SymonSayDistribute` | the runtimes, one branch each, each cutting releases | SymonSaysLLC Open Source License 1.0, no copyleft |
| `SymonSaySource` | what we build from: pins, licences, provenance | tracking only, ships nothing |
| `SymonSayOpen` | the copyleft builds | SymonSaysLLC Open Source License 1.0 metadata; the outputs stay copyleft and never link into a release |

The same three directories exist on the build host, so the separation is visible before
anyone opens a file.

## Adding a copyleft build

1. Put the recipe on its group's branch.
2. Record what it declares and what we use it for. "It is a build dependency" and "it is
   linked into a shipped artifact" are different answers and only one of them is allowed.
3. If it would be linked into a runtime, it does not go here — it does not go anywhere. The
   answer is a permissive replacement or dropping the feature.

## The licence boundary

These four trees carry **two** licences between them, and that is the point of the split:

| Licence | Where | Why there |
|---|---|---|
| `SymonSaysLLC Open Source License 1.0` | `SymonSayDistribute` | the product: source-available now, Apache-2.0 two years after each release |
| `SymonSaysLLC Open Source License 1.0` | `SymonSayOSS`, `SymonSayOpen`, `SymonSaySource` | work meant to combine freely — with copyleft, with anyone's code, with itself |

Two rules follow, and they are not the same rule:

**A licence deviation inside a tree is a new branch.** If one component in a tree cannot carry
that tree's licence — an upstream obligation, a contributed file with its own terms — it gets
its own branch, and that branch states the licence at the top of its document. A tree stays
readable because every branch in it either carries the tree's licence or says plainly that it
does not.

**A genuinely third licence is a new tree.** If something needs terms that are neither of the
two above — a copyleft obligation on our own code, a third-party commercial licence, an
agreement with its own conditions — it does not go on a branch here. It becomes its own
repository at `/mnt/<repo>`, with its own index, because a tree whose licence you cannot state
in one line is a tree nobody can ship from.

Anything that fits none of the four is raised rather than guessed at, and work continues around
it instead of stopping on it.
