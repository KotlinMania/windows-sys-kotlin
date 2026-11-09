package io.github.kotlinmania.windowssys.windows.win32.system.kernel

public expect fun RtlFirstEntrySList(listhead: Long): Long

public expect fun RtlInitializeSListHead(listhead: Long)

public expect fun RtlInterlockedFlushSList(listhead: Long): Long

public expect fun RtlInterlockedPopEntrySList(listhead: Long): Long

public expect fun RtlInterlockedPushEntrySList(listhead: Long, listentry: Long): Long

public expect fun RtlInterlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: UInt): Long

public expect fun RtlQueryDepthSList(listhead: Long): UShort
