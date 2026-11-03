@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.internal.WindowssysJni
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicLong

internal actual object Win32DynamicFfi {
    private val objectHandles = ConcurrentHashMap<Any, Long>()
    private val nextHandleId = AtomicLong(0x1000_0000L)

    actual fun isWindowsHost(): Boolean = WindowssysJni.isWindowsHost()

    actual fun invoke(
        dll: String,
        symbol: String,
        args: LongArray,
    ): Long = WindowssysJni.invoke(dll, symbol, args)

    actual fun invokeFp(
        dll: String,
        symbol: String,
        fpMask: Int,
        returnIsFloat32: Boolean,
        args: LongArray,
    ): Double = WindowssysJni.invokeFp(dll, symbol, fpMask, returnIsFloat32, args)

    actual fun invokePtr(
        fnPtr: Long,
        args: LongArray,
    ): Long = WindowssysJni.invokePtr(fnPtr, args)

    actual fun guidSlot(
        data1: UInt,
        data2: UShort,
        data3: UShort,
        data4: UByteArray,
    ): Long {
        val padded = ByteArray(8)
        val limit = minOf(8, data4.size)
        for (i in 0 until limit) {
            padded[i] = data4[i].toByte()
        }
        return WindowssysJni.guidSlot(data1.toInt(), data2.toShort(), data3.toShort(), padded)
    }

    actual fun objectSlot(value: Any?): Long {
        if (value == null) return 0L
        return objectHandles.computeIfAbsent(value) { nextHandleId.getAndIncrement() }
    }

    actual fun allocZeroed(size: Int): Long = WindowssysJni.allocZeroed(size)

    actual fun freeMem(address: Long) {
        WindowssysJni.freeMem(address)
    }

    actual fun readBytes(
        address: Long,
        length: Int,
    ): ByteArray = WindowssysJni.readBytes(address, length)

    actual fun writeBytes(
        address: Long,
        source: ByteArray,
    ) {
        WindowssysJni.writeBytes(address, source)
    }
}
