@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssysWindowsWin32SystemMemoryNonvolatileRtlDrainNonVolatileFlush
import io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssysWindowsWin32SystemMemoryNonvolatileRtlFillNonVolatileMemory
import io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemory
import io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemoryRanges
import io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssysWindowsWin32SystemMemoryNonvolatileRtlFreeNonVolatileToken
import io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssysWindowsWin32SystemMemoryNonvolatileRtlGetNonVolatileToken
import io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile.cinterop.windowssysWindowsWin32SystemMemoryNonvolatileRtlWriteNonVolatileMemory
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun rtlDrainNonVolatileFlush(nvtoken: ConstPtr): UInt =
    windowssysWindowsWin32SystemMemoryNonvolatileRtlDrainNonVolatileFlush(nvtoken.rawAddress.toCPointer<ByteVar>())

public actual fun rtlFillNonVolatileMemory(nvtoken: ConstPtr, nvdestination: MutPtr, size: ULong, value: UByte, flags: UInt): UInt =
    windowssysWindowsWin32SystemMemoryNonvolatileRtlFillNonVolatileMemory(nvtoken.rawAddress.toCPointer<ByteVar>(), nvdestination.rawAddress.toCPointer<ByteVar>(), size, value, flags)

public actual fun rtlFlushNonVolatileMemory(nvtoken: ConstPtr, nvbuffer: ConstPtr, size: ULong, flags: UInt): UInt =
    windowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemory(nvtoken.rawAddress.toCPointer<ByteVar>(), nvbuffer.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun rtlFlushNonVolatileMemoryRanges(nvtoken: ConstPtr, nvranges: ConstPtr, numranges: ULong, flags: UInt): UInt =
    windowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemoryRanges(nvtoken.rawAddress.toCPointer<ByteVar>(), nvranges.rawAddress.toCPointer<ByteVar>(), numranges, flags)

public actual fun rtlFreeNonVolatileToken(nvtoken: ConstPtr): UInt =
    windowssysWindowsWin32SystemMemoryNonvolatileRtlFreeNonVolatileToken(nvtoken.rawAddress.toCPointer<ByteVar>())

public actual fun rtlGetNonVolatileToken(nvbuffer: ConstPtr, size: ULong, nvtoken: MutPtr): UInt =
    windowssysWindowsWin32SystemMemoryNonvolatileRtlGetNonVolatileToken(nvbuffer.rawAddress.toCPointer<ByteVar>(), size, nvtoken.rawAddress.toCPointer<ByteVar>())

public actual fun rtlWriteNonVolatileMemory(nvtoken: ConstPtr, nvdestination: MutPtr, source: ConstPtr, size: ULong, flags: UInt): UInt =
    windowssysWindowsWin32SystemMemoryNonvolatileRtlWriteNonVolatileMemory(nvtoken.rawAddress.toCPointer<ByteVar>(), nvdestination.rawAddress.toCPointer<ByteVar>(), source.rawAddress.toCPointer<ByteVar>(), size, flags)
