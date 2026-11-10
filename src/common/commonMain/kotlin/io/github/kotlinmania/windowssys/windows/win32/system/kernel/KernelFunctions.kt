package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.windowssys.COpaquePointer

public expect fun rtlFirstEntrySList(listhead: COpaquePointer?): COpaquePointer?

public expect fun rtlInitializeSListHead(listhead: COpaquePointer?)

public expect fun rtlInterlockedFlushSList(listhead: COpaquePointer?): COpaquePointer?

public expect fun rtlInterlockedPopEntrySList(listhead: COpaquePointer?): COpaquePointer?

public expect fun rtlInterlockedPushEntrySList(listhead: COpaquePointer?, listentry: COpaquePointer?): COpaquePointer?

public expect fun rtlInterlockedPushListSListEx(listhead: COpaquePointer?, list: COpaquePointer?, listend: COpaquePointer?, count: UInt): COpaquePointer?

public expect fun rtlQueryDepthSList(listhead: COpaquePointer?): UShort
