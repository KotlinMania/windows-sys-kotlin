@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.kernel

public actual fun RtlFirstEntrySList(listhead: Long): Long =
    0L

public actual fun RtlInitializeSListHead(listhead: Long) {
}

public actual fun RtlInterlockedFlushSList(listhead: Long): Long =
    0L

public actual fun RtlInterlockedPopEntrySList(listhead: Long): Long =
    0L

public actual fun RtlInterlockedPushEntrySList(listhead: Long, listentry: Long): Long =
    0L

public actual fun RtlInterlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: UInt): Long =
    0L

public actual fun RtlQueryDepthSList(listhead: Long): UShort =
    0u
