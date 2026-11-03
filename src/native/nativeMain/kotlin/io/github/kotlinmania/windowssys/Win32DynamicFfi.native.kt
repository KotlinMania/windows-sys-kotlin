@file:OptIn(ExperimentalUnsignedTypes::class, kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.cinterop.windowssys_alloc_zeroed
import io.github.kotlinmania.windowssys.cinterop.windowssys_free_mem
import io.github.kotlinmania.windowssys.cinterop.windowssys_guid_slot
import io.github.kotlinmania.windowssys.cinterop.windowssys_invoke
import io.github.kotlinmania.windowssys.cinterop.windowssys_invoke_fp
import io.github.kotlinmania.windowssys.cinterop.windowssys_invoke_ptr
import io.github.kotlinmania.windowssys.cinterop.windowssys_is_windows_host
import io.github.kotlinmania.windowssys.cinterop.windowssys_read_bytes
import io.github.kotlinmania.windowssys.cinterop.windowssys_write_bytes
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.usePinned
import kotlinx.cinterop.value

internal actual object Win32DynamicFfi {
    private val objectHandles = HashMap<Any, Long>()
    private var nextHandleId = 0x1000_0000L

    actual fun isWindowsHost(): Boolean = windowssys_is_windows_host() != 0

    actual fun invoke(
        dll: String,
        symbol: String,
        args: LongArray,
    ): Long =
        memScoped {
            val status = alloc<IntVar>()
            val raw =
                if (args.isEmpty()) {
                    windowssys_invoke(dll, symbol, 0, null, status.ptr)
                } else {
                    args.usePinned { pinned ->
                        windowssys_invoke(dll, symbol, args.size, pinned.addressOf(0), status.ptr)
                    }
                }
            checkInvokeStatus(status.value, dll, symbol)
            raw
        }

    actual fun invokeFp(
        dll: String,
        symbol: String,
        fpMask: Int,
        returnIsFloat32: Boolean,
        args: LongArray,
    ): Double =
        memScoped {
            val status = alloc<IntVar>()
            val retF32 = if (returnIsFloat32) 1 else 0
            val raw =
                if (args.isEmpty()) {
                    windowssys_invoke_fp(dll, symbol, fpMask, retF32, 0, null, status.ptr)
                } else {
                    args.usePinned { pinned ->
                        windowssys_invoke_fp(dll, symbol, fpMask, retF32, args.size, pinned.addressOf(0), status.ptr)
                    }
                }
            checkInvokeStatus(status.value, dll, symbol)
            raw
        }

    actual fun invokePtr(
        fnPtr: Long,
        args: LongArray,
    ): Long =
        memScoped {
            val status = alloc<IntVar>()
            val raw =
                if (args.isEmpty()) {
                    windowssys_invoke_ptr(fnPtr, 0, null, status.ptr)
                } else {
                    args.usePinned { pinned ->
                        windowssys_invoke_ptr(fnPtr, args.size, pinned.addressOf(0), status.ptr)
                    }
                }
            checkInvokeStatus(status.value, "<fnptr>", fnPtr.toString(16))
            raw
        }

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
        return padded.usePinned { pinned ->
            windowssys_guid_slot(data1, data2, data3, pinned.addressOf(0).reinterpret())
        }
    }

    actual fun objectSlot(value: Any?): Long {
        if (value == null) return 0L
        return objectHandles.getOrPut(value) { nextHandleId++ }
    }

    actual fun allocZeroed(size: Int): Long = windowssys_alloc_zeroed(size)

    actual fun freeMem(address: Long) {
        windowssys_free_mem(address)
    }

    actual fun readBytes(
        address: Long,
        length: Int,
    ): ByteArray {
        if (length <= 0 || address == 0L) return ByteArray(0)
        val out = ByteArray(length)
        out.usePinned { pinned ->
            windowssys_read_bytes(address, length, pinned.addressOf(0).reinterpret())
        }
        return out
    }

    actual fun writeBytes(
        address: Long,
        source: ByteArray,
    ) {
        if (source.isEmpty() || address == 0L) return
        source.usePinned { pinned ->
            windowssys_write_bytes(address, source.size, pinned.addressOf(0).reinterpret())
        }
    }

    private fun checkInvokeStatus(
        code: Int,
        dll: String,
        symbol: String,
    ) {
        if (code == -2) {
            throw UnsupportedOperationException("Win32 dynamic FFI ($dll!$symbol) requires a Windows host")
        }
        if (code != 0) {
            throw IllegalStateException("Win32 symbol resolution failed ($code): $dll!$symbol")
        }
    }
}
