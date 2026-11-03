package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun RtlDrainNonVolatileFlush(nvtoken: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlDrainNonVolatileFlush", longArrayOf(nvtoken)).toUInt()
}

public fun RtlFillNonVolatileMemory(nvtoken: Long, nvdestination: Long, size: ULong, value: UByte, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFillNonVolatileMemory", longArrayOf(nvtoken, nvdestination, size.toLong(), value.toLong(), flags.toLong())).toUInt()
}

public fun RtlFlushNonVolatileMemory(nvtoken: Long, nvbuffer: Long, size: ULong, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFlushNonVolatileMemory", longArrayOf(nvtoken, nvbuffer, size.toLong(), flags.toLong())).toUInt()
}

public fun RtlFlushNonVolatileMemoryRanges(nvtoken: Long, nvranges: Long, numranges: ULong, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFlushNonVolatileMemoryRanges", longArrayOf(nvtoken, nvranges, numranges.toLong(), flags.toLong())).toUInt()
}

public fun RtlFreeNonVolatileToken(nvtoken: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlFreeNonVolatileToken", longArrayOf(nvtoken)).toUInt()
}

public fun RtlGetNonVolatileToken(nvbuffer: Long, size: ULong, nvtoken: Long): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlGetNonVolatileToken", longArrayOf(nvbuffer, size.toLong(), nvtoken)).toUInt()
}

public fun RtlWriteNonVolatileMemory(nvtoken: Long, nvdestination: Long, source: Long, size: ULong, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("ntdll.dll", "RtlWriteNonVolatileMemory", longArrayOf(nvtoken, nvdestination, source, size.toLong(), flags.toLong())).toUInt()
}
