# Why this repository is MIT and the distribution is not

SyMoNsAyLeaRn ships under FSL-1.1-ALv2: source-available, becoming Apache-2.0 two years
after each release. That is the right licence for a product. It is the wrong licence here,
for two reasons.

**These recipes stand beside copyleft work.** They build components under GPL, LGPL and MPL,
they sit next to that source in a build tree, and several are appends to OpenEmbedded
metadata that is itself MIT. A proprietary licence on metadata whose whole purpose is to
combine with copyleft software creates a question at every use. MIT does not.

**The separation has to be legible, not argued.** `SymonSayDistribute` carries proprietary
work and ships no copyleft. This repository carries the copyleft builds. If both sides used
the same licence the split would be a directory convention; with different licences it is a
statement, and the ship gate can enforce it.

What is MIT here is our own metadata: the recipes, the patches we wrote, the documents.
What each recipe BUILDS keeps its own licence, which is recorded per recipe and is the whole
reason these are kept apart.

MIT is also what OpenEmbedded uses for its own metadata, so an append of ours and the recipe
it appends to are under the same terms.
