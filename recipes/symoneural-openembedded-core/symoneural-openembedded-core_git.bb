# SPDX-License-Identifier: MIT
# Copyright 2026 SymonSaysLLC
# SyMoNeuRaL build metadata. MIT so it combines freely with the copyleft it builds;
# what this recipe BUILDS keeps its own licence, declared in LICENSE below.
# Recipe created by recipetool, then CURATED for SyMoNeuRaL.
# LICENSE / LIC_FILES_CHKSUM / PV verified against the pinned upstream source tree.
# SRCREV and SRC_URI are the acquisition pins - do not change without re-verifying.
# Built by symoneural-pristine: a DISPOSABLE `git archive` export of the
# acquired tree. ${S} is throwaway; the acquired tree is never written to.
# do_unpack asserts the tree HEAD equals SRCREV and refuses to build otherwise.
inherit symoneural-pristine
SYMON_TREE = "upstream/build/devtools/openembedded-core"

LICENSE = "MIT AND GPL-2.0-only"
# LIC_FILES_CHKSUM regenerated 2026-09-17 from the PINNED tree (fe7a24bc); recipetool's
# list had named 8 files from a different revision and do_unpack refused the export.
# Rationale: over-declaring makes bitbake detect licence drift across ALL
# licence-bearing files; under-declaring hides it. Curating this down to one
# canonical file dropped OpenBLAS from 8 files to 1, losing coverage of the
# vendored LAPACK, LAPACKE, ReLAPACK and netlib BLAS reference licences.
LIC_FILES_CHKSUM = "file://LICENSE;md5=b97a012949927931feb7793eee5ed924 \
                    file://LICENSE.GPL-2.0-only;md5=4ee23c52855c222cba72583d301d2338 \
                    file://LICENSE.MIT;md5=030cb33d2af49ccebca74d0588b84a21 \
                    file://meta-selftest/recipes-test/license/incompatible-license-alias.bb;md5=7f4cc7a623766989e4f2147044683f32 \
                    file://meta-selftest/recipes-test/license/incompatible-license.bb;md5=325c78f25569fb9dcfd2d91b9141e708 \
                    file://meta-selftest/recipes-test/license/incompatible-licenses.bb;md5=8c4994d2fe6cfaba399806a7c0f88e3a \
                    file://meta-selftest/recipes-test/license/incompatible-nonspdx-license.bb;md5=f440216cf997a27a5872ecda767bc352 \
                    file://meta-skeleton/recipes-kernel/hello-mod/files/COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e \
                    file://meta-skeleton/recipes-skeleton/service/service/COPYRIGHT;md5=349c872e0066155e1818b786938876a4 \
                    file://meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420 \
                    file://meta/classes-global/license.bbclass;md5=02492767e453161b612b74f467110dbc \
                    file://meta/classes-recipe/license_image.bbclass;md5=fa92dfa594e036b8234092805e6c7b61 \
                    file://meta/conf/licenses.conf;md5=e6b02610a8d6dde4924676c4e76f2c31 \
                    file://meta/files/common-licenses/AGPL-1.0-only;md5=06bcb8ed1dec352d24e92f6f39cd138f \
                    file://meta/files/common-licenses/AGPL-1.0-or-later;md5=06bcb8ed1dec352d24e92f6f39cd138f \
                    file://meta/files/common-licenses/AGPL-3.0-only;md5=73f1eb20517c55bf9493b7dd6e480788 \
                    file://meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e \
                    file://meta/files/common-licenses/BSD-3-Clause-No-Military-License;md5=c8a6a9be92f163b6c1ed17d533daa86e \
                    file://meta/files/common-licenses/BSD-3-Clause-No-Nuclear-License;md5=17c115db2c7fcf47125deff9367911fb \
                    file://meta/files/common-licenses/BSD-3-Clause-No-Nuclear-License-2014;md5=c2a08f01e6d3a42b0942bc5a5a32a3e5 \
                    file://meta/files/common-licenses/CNRI-Python-GPL-Compatible;md5=efc38ad5089e7c3314adca7c4eb8351b \
                    file://meta/files/common-licenses/GPL-1.0-only;md5=e9e36a9de734199567a4d769498f743d \
                    file://meta/files/common-licenses/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61 \
                    file://meta/files/common-licenses/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6 \
                    file://meta/files/common-licenses/GPL-2.0-or-later;md5=fed54355545ffd980b814dab4a3b312c \
                    file://meta/files/common-licenses/GPL-2.0-with-GCC-exception;md5=14c42911132e8c9008911385aede6449 \
                    file://meta/files/common-licenses/GPL-2.0-with-OpenSSL-exception;md5=d9e4412f125e3e6f14efba8ce7b4604f \
                    file://meta/files/common-licenses/GPL-2.0-with-autoconf-exception;md5=966c02a95037a9c7ad75a7597aea9c5f \
                    file://meta/files/common-licenses/GPL-2.0-with-classpath-exception;md5=6133e6794362eff6641708cfcc075b80 \
                    file://meta/files/common-licenses/GPL-2.0-with-font-exception;md5=bf93e21a513f6f923474e62fb920434d \
                    file://meta/files/common-licenses/GPL-3-with-bison-exception;md5=6e1bac3dc21fcc4fa049cf5c407eb7a2 \
                    file://meta/files/common-licenses/GPL-3.0-only;md5=c79ff39f19dfec6d293b95dea7b07891 \
                    file://meta/files/common-licenses/GPL-3.0-or-later;md5=1c76c4cc354acaac30ed4d5eefea7245 \
                    file://meta/files/common-licenses/GPL-3.0-with-GCC-exception;md5=aef5f35c9272f508be848cd99e0151df \
                    file://meta/files/common-licenses/GPL-3.0-with-autoconf-exception;md5=da26b415cb0faf9bfe6829f0ffa409ec \
                    file://meta/files/common-licenses/LGPL-2.0-only;md5=9427b8ccf5cf3df47c29110424c9641a \
                    file://meta/files/common-licenses/LGPL-2.0-or-later;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
                    file://meta/files/common-licenses/LGPL-2.1-only;md5=1a6d268fd218675ffea8be556788b780 \
                    file://meta/files/common-licenses/LGPL-2.1-or-later;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
                    file://meta/files/common-licenses/LGPL-3.0-only;md5=bfccfe952269fff2b407dd11f2f3083b \
                    file://meta/files/common-licenses/LGPL-3.0-or-later;md5=c51d3eef3be114124d11349ca0d7e117 \
                    file://meta/files/common-licenses/LGPLLR;md5=159ff0ac8f0ae99f92b7e604b3bf02b6 \
                    file://meta/files/common-licenses/NGPL;md5=eba216effbb501d5a27143374c96cec2 \
                    file://meta/files/common-licenses/Unlicense;md5=7246f848faa4e9c9fc0ea91122d6e680 \
                    file://meta/lib/oe/license.py;md5=500b10836bc38e699ec838e3d90c71ec \
                    file://meta/lib/oeqa/files/maturin/guessing-game/LICENSE-APACHE;md5=1836efb2eb779966696f473ee8540542 \
                    file://meta/lib/oeqa/files/maturin/guessing-game/LICENSE-MIT;md5=85fd3b67069cff784d98ebfc7d5c0797 \
                    file://meta/lib/oeqa/selftest/cases/oelib/license.py;md5=e9d2e420c0c1bf75a205c99bf909efed \
                    file://meta/recipes-core/base-files/base-files/licenses/GPL-2;md5=94d55d512a9ba36caa9b7df079bae19f \
                    file://meta/recipes-core/gettext/gettext-minimal/COPYING;md5=4bd090a20bfcd1a18f1f79837b5e3e91 \
                    file://meta/recipes-core/init-ifupdown/init-ifupdown-1.0/copyright;md5=3dd6192d306f582dee7687da3d8748ab \
                    file://meta/recipes-core/volatile-binds/files/COPYING.MIT;md5=5750f3aa4ea2b00c2bf21b2b2a7b714d \
                    file://meta/recipes-devtools/docbook-xml/docbook-xml-dtd4/LICENSE-OASIS;md5=b9ee6208caa6e66c68dfad6f31d73f92 \
                    file://meta/recipes-extended/texinfo-dummy-native/texinfo-dummy/COPYING;md5=d6bb62e73ca8b901d3f2e9d71542f4bb \
                    file://meta/recipes-graphics/x11-common/xserver-nodm-init/gplv2-license.patch;md5=f7a0906c8a29b8c88e019be8a3102cfd \
                    file://meta/recipes-kernel/linux/linux-dummy/COPYING.GPL;md5=751419260aa954499f7abaabaa882bbe \
                    file://meta/recipes-multimedia/gstreamer/gstreamer1.0-plugins-license.inc;md5=634ee1f29b13e6cece17dc744b58cd71 \
                    file://scripts/contrib/convert-spdx-licenses.py;md5=4c5416a1b7b616ab7927bb05fde5e101 \
                    file://scripts/pybootchartgui/COPYING;md5=44ac4678311254db62edf8fd39cb8124"

SRC_URI = "git://git.openembedded.org/openembedded-core;protocol=https;branch=master"

# Modify these as desired
PV = "master+git"
SRCREV = "fe7a24bc67118e7e184b5f5247258715e3904e7c"

