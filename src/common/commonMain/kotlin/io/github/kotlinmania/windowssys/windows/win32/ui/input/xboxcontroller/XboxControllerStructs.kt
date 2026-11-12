package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

public data class XinputBatteryInformation(
    public var batteryType: BatteryType = 0u,
    public var batteryLevel: BatteryLevel = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XinputBatteryInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XinputBatteryInformation> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): XinputBatteryInformation =
                    XinputBatteryInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: XinputBatteryInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.batteryType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.batteryLevel)
                }
            }
    }
}

public data class XinputCapabilities(
    public var type: XinputDevtype = 0u,
    public var subType: XinputDevsubtype = 0u,
    public var flags: XinputCapabilitiesFlags = 0u,
    public var gamepad: XinputGamepad = XinputGamepad(),
    public var vibration: XinputVibration = XinputVibration(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XinputCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XinputCapabilities> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): XinputCapabilities =
                    XinputCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (XinputGamepad.typeLayout()).readNative(addr + 4L),
                        (XinputVibration.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: XinputCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.subType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.flags)
                    (XinputGamepad.typeLayout()).writeNative(addr + 4L, value.gamepad)
                    (XinputVibration.typeLayout()).writeNative(addr + 16L, value.vibration)
                }
            }
    }
}

public data class XinputGamepad(
    public var wButtons: XinputGamepadButtonFlags = 0u,
    public var bLeftTrigger: UByte = 0u,
    public var bRightTrigger: UByte = 0u,
    public var sThumbLX: Short = 0,
    public var sThumbLY: Short = 0,
    public var sThumbRX: Short = 0,
    public var sThumbRY: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XinputGamepad> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XinputGamepad> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): XinputGamepad =
                    XinputGamepad(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: XinputGamepad) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wButtons)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bLeftTrigger)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bRightTrigger)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.sThumbLX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.sThumbLY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.sThumbRX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 10L, value.sThumbRY)
                }
            }
    }
}

public data class XinputKeystroke(
    public var virtualKey: XinputVirtualKey = 0u,
    public var unicode: UShort = 0u,
    public var flags: XinputKeystrokeFlags = 0u,
    public var userIndex: UByte = 0u,
    public var hidCode: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XinputKeystroke> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XinputKeystroke> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): XinputKeystroke =
                    XinputKeystroke(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                    )
                override fun writeNative(addr: Long, value: XinputKeystroke) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.virtualKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.unicode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.userIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.hidCode)
                }
            }
    }
}

public data class XinputState(
    public var dwPacketNumber: UInt = 0u,
    public var gamepad: XinputGamepad = XinputGamepad(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XinputState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XinputState> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): XinputState =
                    XinputState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (XinputGamepad.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: XinputState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwPacketNumber)
                    (XinputGamepad.typeLayout()).writeNative(addr + 4L, value.gamepad)
                }
            }
    }
}

public data class XinputVibration(
    public var wLeftMotorSpeed: UShort = 0u,
    public var wRightMotorSpeed: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XinputVibration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XinputVibration> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): XinputVibration =
                    XinputVibration(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: XinputVibration) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wLeftMotorSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wRightMotorSpeed)
                }
            }
    }
}
