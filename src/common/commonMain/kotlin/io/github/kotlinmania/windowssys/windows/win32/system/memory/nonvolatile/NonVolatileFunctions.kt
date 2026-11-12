package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun rtlDrainNonVolatileFlush(nvtoken: ConstPtr): UInt

public expect fun rtlFillNonVolatileMemory(nvtoken: ConstPtr, nvdestination: MutPtr, size: ULong, value: UByte, flags: UInt): UInt

public expect fun rtlFlushNonVolatileMemory(nvtoken: ConstPtr, nvbuffer: ConstPtr, size: ULong, flags: UInt): UInt

public expect fun rtlFlushNonVolatileMemoryRanges(nvtoken: ConstPtr, nvranges: ConstPtr, numranges: ULong, flags: UInt): UInt

public expect fun rtlFreeNonVolatileToken(nvtoken: ConstPtr): UInt

public expect fun rtlGetNonVolatileToken(nvbuffer: ConstPtr, size: ULong, nvtoken: MutPtr): UInt

public expect fun rtlWriteNonVolatileMemory(nvtoken: ConstPtr, nvdestination: MutPtr, source: ConstPtr, size: ULong, flags: UInt): UInt
