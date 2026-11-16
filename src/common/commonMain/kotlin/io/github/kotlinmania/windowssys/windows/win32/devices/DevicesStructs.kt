package io.github.kotlinmania.windowssys.windows.win32.devices

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

public data class Ieee1394ApiRequest(
    public var requestNumber: UInt = 0u,
    public var flags: UInt = 0u,
    public var u: Ieee1394ApiRequest0 = Ieee1394ApiRequest0(),
)

public data class Ieee1394ApiRequest0(
    public var addVirtualDevice: Ieee1394VdevPnpRequest = Ieee1394VdevPnpRequest(),
    public var removeVirtualDevice: Ieee1394VdevPnpRequest = Ieee1394VdevPnpRequest(),
)

public data class Ieee1394VdevPnpRequest(
    public var fulFlags: UInt = 0u,
    public var reserved: UInt = 0u,
    public var instanceId: ULong = 0uL,
    public var deviceId: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ieee1394VdevPnpRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ieee1394VdevPnpRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ieee1394VdevPnpRequest =
                    Ieee1394VdevPnpRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Ieee1394VdevPnpRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fulFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.instanceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.deviceId)
                }
            }
    }
}
