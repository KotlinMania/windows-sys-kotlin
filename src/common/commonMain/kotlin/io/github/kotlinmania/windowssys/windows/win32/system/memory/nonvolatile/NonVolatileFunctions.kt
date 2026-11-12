package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public expect fun rtlDrainNonVolatileFlush(nvtoken: ConstPtr<CVoid>): UInt

public expect fun rtlFillNonVolatileMemory(nvtoken: ConstPtr<CVoid>, nvdestination: MutPtr<CVoid>, size: ULong, value: UByte, flags: UInt): UInt

public expect fun rtlFlushNonVolatileMemory(nvtoken: ConstPtr<CVoid>, nvbuffer: ConstPtr<CVoid>, size: ULong, flags: UInt): UInt

public expect fun rtlFlushNonVolatileMemoryRanges(nvtoken: ConstPtr<CVoid>, nvranges: ConstPtr<NvMemoryRange>, numranges: ULong, flags: UInt): UInt

public expect fun rtlFreeNonVolatileToken(nvtoken: ConstPtr<CVoid>): UInt

public expect fun rtlGetNonVolatileToken(nvbuffer: ConstPtr<CVoid>, size: ULong, nvtoken: MutPtr<MutPtr<CVoid>>): UInt

public expect fun rtlWriteNonVolatileMemory(nvtoken: ConstPtr<CVoid>, nvdestination: MutPtr<CVoid>, source: ConstPtr<CVoid>, size: ULong, flags: UInt): UInt
