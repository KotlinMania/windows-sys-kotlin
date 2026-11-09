@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

private object WindowsWin32SystemMemoryNonvolatileJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_nonvolatile_RtlDrainNonVolatileFlush(nvtoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_nonvolatile_RtlFillNonVolatileMemory(nvtoken: Long, nvdestination: Long, size: Long, value: Byte, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_nonvolatile_RtlFlushNonVolatileMemory(nvtoken: Long, nvbuffer: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_nonvolatile_RtlFlushNonVolatileMemoryRanges(nvtoken: Long, nvranges: Long, numranges: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_nonvolatile_RtlFreeNonVolatileToken(nvtoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_nonvolatile_RtlGetNonVolatileToken(nvbuffer: Long, size: Long, nvtoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_nonvolatile_RtlWriteNonVolatileMemory(nvtoken: Long, nvdestination: Long, source: Long, size: Long, flags: Int): Int
}

public actual fun RtlDrainNonVolatileFlush(nvtoken: Long): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssys_windows_win32_system_memory_nonvolatile_RtlDrainNonVolatileFlush(nvtoken).toUInt()

public actual fun RtlFillNonVolatileMemory(nvtoken: Long, nvdestination: Long, size: ULong, value: UByte, flags: UInt): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssys_windows_win32_system_memory_nonvolatile_RtlFillNonVolatileMemory(nvtoken, nvdestination, size.toLong(), value.toByte(), flags.toInt()).toUInt()

public actual fun RtlFlushNonVolatileMemory(nvtoken: Long, nvbuffer: Long, size: ULong, flags: UInt): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssys_windows_win32_system_memory_nonvolatile_RtlFlushNonVolatileMemory(nvtoken, nvbuffer, size.toLong(), flags.toInt()).toUInt()

public actual fun RtlFlushNonVolatileMemoryRanges(nvtoken: Long, nvranges: Long, numranges: ULong, flags: UInt): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssys_windows_win32_system_memory_nonvolatile_RtlFlushNonVolatileMemoryRanges(nvtoken, nvranges, numranges.toLong(), flags.toInt()).toUInt()

public actual fun RtlFreeNonVolatileToken(nvtoken: Long): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssys_windows_win32_system_memory_nonvolatile_RtlFreeNonVolatileToken(nvtoken).toUInt()

public actual fun RtlGetNonVolatileToken(nvbuffer: Long, size: ULong, nvtoken: Long): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssys_windows_win32_system_memory_nonvolatile_RtlGetNonVolatileToken(nvbuffer, size.toLong(), nvtoken).toUInt()

public actual fun RtlWriteNonVolatileMemory(nvtoken: Long, nvdestination: Long, source: Long, size: ULong, flags: UInt): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssys_windows_win32_system_memory_nonvolatile_RtlWriteNonVolatileMemory(nvtoken, nvdestination, source, size.toLong(), flags.toInt()).toUInt()
