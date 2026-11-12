package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netbios

import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun netbios(pncb: MutPtr<Ncb>): UByte
