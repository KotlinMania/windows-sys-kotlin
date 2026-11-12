package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun rtlFirstEntrySList(listhead: ConstPtr): MutPtr

public expect fun rtlInitializeSListHead(listhead: MutPtr)

public expect fun rtlInterlockedFlushSList(listhead: MutPtr): MutPtr

public expect fun rtlInterlockedPopEntrySList(listhead: MutPtr): MutPtr

public expect fun rtlInterlockedPushEntrySList(listhead: MutPtr, listentry: MutPtr): MutPtr

public expect fun rtlInterlockedPushListSListEx(listhead: MutPtr, list: MutPtr, listend: MutPtr, count: UInt): MutPtr

public expect fun rtlQueryDepthSList(listhead: ConstPtr): UShort
