package io.github.kotlinmania.windowssys.windows.win32.gaming

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

public data class GamingDeviceModelInformation(
    public var vendorId: GamingDeviceVendorId = 0,
    public var deviceId: GamingDeviceDeviceId = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GamingDeviceModelInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GamingDeviceModelInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): GamingDeviceModelInformation =
                    GamingDeviceModelInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: GamingDeviceModelInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.vendorId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.deviceId)
                }
            }
    }
}
