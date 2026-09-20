# retired

The `retired` branch of `SymonSayOpen`.

§3.7: this is the map. Every directory below is listed with what lives there and
why a reader would go to it.

## Directories

| Directory | Holds |
|---|---|
| [`recipes`](recipes/recipes.md) | build recipes |

## retired — copyleft builds

*Folded in from `recipes.md` on 2026-09-20: §3.7 allows one
document per directory. Nothing was lost — the original file is at
`/home/google/Desktop/claude/quarantine-3.7-2026-09-20/mnt/SymonSayOpen/retired/recipes.md`.*

4 recipes in this group whose output carries a copyleft licence.

The recipes are our own work under FSL-1.1-ALv2. What is copyleft is what they build,
and that distinction is the reason this repository exists: none of these outputs may be
linked into a SymonSayDistribute release.

| Recipe | Declares | Directory |
|---|---|---|
| `symoneural-autoconf` | `GPL-3.0-or-later` | `symoneural-autoconf` |
| `symoneural-automake` | `GPL-2.0-or-later` | `symoneural-automake` |
| `symoneural-libtool` | `GPL-2.0-or-later AND LGPL-2.1-or-later` | `symoneural-libtool` |
| `symoneural-m4` | `GPL-3.0-or-later` | `symoneural-m4` |

## Licences declared in this group

| Licence | Recipes |
|---|---|
| `GPL-3.0-or-later` | 2 |
| `GPL-2.0-or-later` | 1 |
| `GPL-2.0-or-later AND LGPL-2.1-or-later` | 1 |

## Before adding one here

Say what the output is used for. A build-time dependency and a component linked into a
shipped artifact are different answers, and only the first is allowed anywhere in this
estate. If it would be linked in, the answer is a permissive replacement or dropping the
feature — not this repository.

Upstream source is not carried here; it is tracked in `SymonSaySource`. The index of
groups is on `main`.

## Where this leads

Into [`recipes`](recipes/recipes.md).
