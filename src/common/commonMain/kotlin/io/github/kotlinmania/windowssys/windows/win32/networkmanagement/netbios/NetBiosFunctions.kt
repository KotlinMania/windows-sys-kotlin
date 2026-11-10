package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netbios

import io.github.kotlinmania.windowssys.COpaquePointer

public expect fun netbios(pncb: COpaquePointer?): UByte
