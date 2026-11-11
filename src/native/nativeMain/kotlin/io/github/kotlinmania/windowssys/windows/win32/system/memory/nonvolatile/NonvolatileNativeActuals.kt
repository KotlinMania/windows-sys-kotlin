@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssys_windows_win32_system_memory_nonvolatile_rtlDrainNonVolatileFlush
import io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssys_windows_win32_system_memory_nonvolatile_rtlFillNonVolatileMemory
import io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssys_windows_win32_system_memory_nonvolatile_rtlFlushNonVolatileMemory
import io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssys_windows_win32_system_memory_nonvolatile_rtlFlushNonVolatileMemoryRanges
import io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssys_windows_win32_system_memory_nonvolatile_rtlFreeNonVolatileToken
import io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssys_windows_win32_system_memory_nonvolatile_rtlGetNonVolatileToken
import io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssys_windows_win32_system_memory_nonvolatile_rtlWriteNonVolatileMemory
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun rtlDrainNonVolatileFlush(nvtoken: COpaquePointer?): UInt =
    windowssys_windows_win32_system_memory_nonvolatile_rtlDrainNonVolatileFlush(nvtoken?.value?.toCPointer<ByteVar>())

public actual fun rtlFillNonVolatileMemory(nvtoken: COpaquePointer?, nvdestination: COpaquePointer?, size: ULong, value: UByte, flags: UInt): UInt =
    windowssys_windows_win32_system_memory_nonvolatile_rtlFillNonVolatileMemory(nvtoken?.value?.toCPointer<ByteVar>(), nvdestination?.value?.toCPointer<ByteVar>(), size, value, flags)

public actual fun rtlFlushNonVolatileMemory(nvtoken: COpaquePointer?, nvbuffer: COpaquePointer?, size: ULong, flags: UInt): UInt =
    windowssys_windows_win32_system_memory_nonvolatile_rtlFlushNonVolatileMemory(nvtoken?.value?.toCPointer<ByteVar>(), nvbuffer?.value?.toCPointer<ByteVar>(), size, flags)

public actual fun rtlFlushNonVolatileMemoryRanges(nvtoken: COpaquePointer?, nvranges: COpaquePointer?, numranges: ULong, flags: UInt): UInt =
    windowssys_windows_win32_system_memory_nonvolatile_rtlFlushNonVolatileMemoryRanges(nvtoken?.value?.toCPointer<ByteVar>(), nvranges?.value?.toCPointer<ByteVar>(), numranges, flags)

public actual fun rtlFreeNonVolatileToken(nvtoken: COpaquePointer?): UInt =
    windowssys_windows_win32_system_memory_nonvolatile_rtlFreeNonVolatileToken(nvtoken?.value?.toCPointer<ByteVar>())

public actual fun rtlGetNonVolatileToken(nvbuffer: COpaquePointer?, size: ULong, nvtoken: COpaquePointer?): UInt =
    windowssys_windows_win32_system_memory_nonvolatile_rtlGetNonVolatileToken(nvbuffer?.value?.toCPointer<ByteVar>(), size, nvtoken?.value?.toCPointer<ByteVar>())

public actual fun rtlWriteNonVolatileMemory(nvtoken: COpaquePointer?, nvdestination: COpaquePointer?, source: COpaquePointer?, size: ULong, flags: UInt): UInt =
    windowssys_windows_win32_system_memory_nonvolatile_rtlWriteNonVolatileMemory(nvtoken?.value?.toCPointer<ByteVar>(), nvdestination?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>(), size, flags)
