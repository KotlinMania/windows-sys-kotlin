@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun RtlDrainNonVolatileFlush(nvtoken: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssys_windows_win32_system_memory_nonvolatile_RtlDrainNonVolatileFlush(nvtoken.toCPointer<ByteVar>())

public actual fun RtlFillNonVolatileMemory(nvtoken: Long, nvdestination: Long, size: ULong, value: UByte, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssys_windows_win32_system_memory_nonvolatile_RtlFillNonVolatileMemory(nvtoken.toCPointer<ByteVar>(), nvdestination.toCPointer<ByteVar>(), size, value, flags)

public actual fun RtlFlushNonVolatileMemory(nvtoken: Long, nvbuffer: Long, size: ULong, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssys_windows_win32_system_memory_nonvolatile_RtlFlushNonVolatileMemory(nvtoken.toCPointer<ByteVar>(), nvbuffer.toCPointer<ByteVar>(), size, flags)

public actual fun RtlFlushNonVolatileMemoryRanges(nvtoken: Long, nvranges: Long, numranges: ULong, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssys_windows_win32_system_memory_nonvolatile_RtlFlushNonVolatileMemoryRanges(nvtoken.toCPointer<ByteVar>(), nvranges.toCPointer<ByteVar>(), numranges, flags)

public actual fun RtlFreeNonVolatileToken(nvtoken: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssys_windows_win32_system_memory_nonvolatile_RtlFreeNonVolatileToken(nvtoken.toCPointer<ByteVar>())

public actual fun RtlGetNonVolatileToken(nvbuffer: Long, size: ULong, nvtoken: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssys_windows_win32_system_memory_nonvolatile_RtlGetNonVolatileToken(nvbuffer.toCPointer<ByteVar>(), size, nvtoken.toCPointer<ByteVar>())

public actual fun RtlWriteNonVolatileMemory(nvtoken: Long, nvdestination: Long, source: Long, size: ULong, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssys_windows_win32_system_memory_nonvolatile_RtlWriteNonVolatileMemory(nvtoken.toCPointer<ByteVar>(), nvdestination.toCPointer<ByteVar>(), source.toCPointer<ByteVar>(), size, flags)
