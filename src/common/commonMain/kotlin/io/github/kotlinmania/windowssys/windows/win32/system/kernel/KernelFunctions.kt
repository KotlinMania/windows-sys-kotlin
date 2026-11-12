package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun rtlFirstEntrySList(listhead: ConstPtr<SlistHeader>): MutPtr<SlistEntry>

public expect fun rtlInitializeSListHead(listhead: MutPtr<SlistHeader>)

public expect fun rtlInterlockedFlushSList(listhead: MutPtr<SlistHeader>): MutPtr<SlistEntry>

public expect fun rtlInterlockedPopEntrySList(listhead: MutPtr<SlistHeader>): MutPtr<SlistEntry>

public expect fun rtlInterlockedPushEntrySList(listhead: MutPtr<SlistHeader>, listentry: MutPtr<SlistEntry>): MutPtr<SlistEntry>

public expect fun rtlInterlockedPushListSListEx(listhead: MutPtr<SlistHeader>, list: MutPtr<SlistEntry>, listend: MutPtr<SlistEntry>, count: UInt): MutPtr<SlistEntry>

public expect fun rtlQueryDepthSList(listhead: ConstPtr<SlistHeader>): UShort
