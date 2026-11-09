package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

public expect fun RtlDrainNonVolatileFlush(nvtoken: Long): UInt

public expect fun RtlFillNonVolatileMemory(nvtoken: Long, nvdestination: Long, size: ULong, value: UByte, flags: UInt): UInt

public expect fun RtlFlushNonVolatileMemory(nvtoken: Long, nvbuffer: Long, size: ULong, flags: UInt): UInt

public expect fun RtlFlushNonVolatileMemoryRanges(nvtoken: Long, nvranges: Long, numranges: ULong, flags: UInt): UInt

public expect fun RtlFreeNonVolatileToken(nvtoken: Long): UInt

public expect fun RtlGetNonVolatileToken(nvbuffer: Long, size: ULong, nvtoken: Long): UInt

public expect fun RtlWriteNonVolatileMemory(nvtoken: Long, nvdestination: Long, source: Long, size: ULong, flags: UInt): UInt
