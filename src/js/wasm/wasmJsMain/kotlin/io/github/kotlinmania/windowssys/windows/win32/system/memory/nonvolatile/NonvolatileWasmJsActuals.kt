@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

public actual fun RtlDrainNonVolatileFlush(nvtoken: Long): UInt =
    0u

public actual fun RtlFillNonVolatileMemory(nvtoken: Long, nvdestination: Long, size: ULong, value: UByte, flags: UInt): UInt =
    0u

public actual fun RtlFlushNonVolatileMemory(nvtoken: Long, nvbuffer: Long, size: ULong, flags: UInt): UInt =
    0u

public actual fun RtlFlushNonVolatileMemoryRanges(nvtoken: Long, nvranges: Long, numranges: ULong, flags: UInt): UInt =
    0u

public actual fun RtlFreeNonVolatileToken(nvtoken: Long): UInt =
    0u

public actual fun RtlGetNonVolatileToken(nvbuffer: Long, size: ULong, nvtoken: Long): UInt =
    0u

public actual fun RtlWriteNonVolatileMemory(nvtoken: Long, nvdestination: Long, source: Long, size: ULong, flags: UInt): UInt =
    0u
