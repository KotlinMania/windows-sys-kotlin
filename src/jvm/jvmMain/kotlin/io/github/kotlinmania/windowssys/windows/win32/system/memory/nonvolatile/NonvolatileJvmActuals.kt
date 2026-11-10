@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

import io.github.kotlinmania.windowssys.COpaquePointer

private object WindowsWin32SystemMemoryNonvolatileJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_nonvolatile_rtlDrainNonVolatileFlush(nvtoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_nonvolatile_rtlFillNonVolatileMemory(nvtoken: Long, nvdestination: Long, size: Long, value: Byte, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_nonvolatile_rtlFlushNonVolatileMemory(nvtoken: Long, nvbuffer: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_nonvolatile_rtlFlushNonVolatileMemoryRanges(nvtoken: Long, nvranges: Long, numranges: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_nonvolatile_rtlFreeNonVolatileToken(nvtoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_nonvolatile_rtlGetNonVolatileToken(nvbuffer: Long, size: Long, nvtoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_memory_nonvolatile_rtlWriteNonVolatileMemory(nvtoken: Long, nvdestination: Long, source: Long, size: Long, flags: Int): Int
}

public actual fun rtlDrainNonVolatileFlush(nvtoken: COpaquePointer?): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssys_windows_win32_system_memory_nonvolatile_rtlDrainNonVolatileFlush((nvtoken?.value ?: 0L)).toUInt()

public actual fun rtlFillNonVolatileMemory(nvtoken: COpaquePointer?, nvdestination: COpaquePointer?, size: ULong, value: UByte, flags: UInt): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssys_windows_win32_system_memory_nonvolatile_rtlFillNonVolatileMemory((nvtoken?.value ?: 0L), (nvdestination?.value ?: 0L), size.toLong(), value.toByte(), flags.toInt()).toUInt()

public actual fun rtlFlushNonVolatileMemory(nvtoken: COpaquePointer?, nvbuffer: COpaquePointer?, size: ULong, flags: UInt): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssys_windows_win32_system_memory_nonvolatile_rtlFlushNonVolatileMemory((nvtoken?.value ?: 0L), (nvbuffer?.value ?: 0L), size.toLong(), flags.toInt()).toUInt()

public actual fun rtlFlushNonVolatileMemoryRanges(nvtoken: COpaquePointer?, nvranges: COpaquePointer?, numranges: ULong, flags: UInt): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssys_windows_win32_system_memory_nonvolatile_rtlFlushNonVolatileMemoryRanges((nvtoken?.value ?: 0L), (nvranges?.value ?: 0L), numranges.toLong(), flags.toInt()).toUInt()

public actual fun rtlFreeNonVolatileToken(nvtoken: COpaquePointer?): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssys_windows_win32_system_memory_nonvolatile_rtlFreeNonVolatileToken((nvtoken?.value ?: 0L)).toUInt()

public actual fun rtlGetNonVolatileToken(nvbuffer: COpaquePointer?, size: ULong, nvtoken: COpaquePointer?): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssys_windows_win32_system_memory_nonvolatile_rtlGetNonVolatileToken((nvbuffer?.value ?: 0L), size.toLong(), (nvtoken?.value ?: 0L)).toUInt()

public actual fun rtlWriteNonVolatileMemory(nvtoken: COpaquePointer?, nvdestination: COpaquePointer?, source: COpaquePointer?, size: ULong, flags: UInt): UInt =
    WindowsWin32SystemMemoryNonvolatileJniBridge.windowssys_windows_win32_system_memory_nonvolatile_rtlWriteNonVolatileMemory((nvtoken?.value ?: 0L), (nvdestination?.value ?: 0L), (source?.value ?: 0L), size.toLong(), flags.toInt()).toUInt()
