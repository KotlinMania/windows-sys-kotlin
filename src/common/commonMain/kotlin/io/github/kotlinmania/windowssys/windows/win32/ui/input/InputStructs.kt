@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

public data class InputMessageSource(
    public var deviceType: InputMessageDeviceType = 0,
    public var originId: InputMessageOriginId = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputMessageSource> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputMessageSource> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): InputMessageSource =
                    InputMessageSource(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: InputMessageSource) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.deviceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.originId)
                }
            }
    }
}

public data class Rawhid(
    public var dwSizeHid: UInt = 0u,
    public var dwCount: UInt = 0u,
    public var bRawData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rawhid) return false
        if (this.dwSizeHid != other.dwSizeHid) return false
        if (this.dwCount != other.dwCount) return false
        if (!this.bRawData.contentEquals(other.bRawData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSizeHid.hashCode()
        result = 31 * result + this.dwCount.hashCode()
        result = 31 * result + this.bRawData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rawhid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rawhid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Rawhid =
                    Rawhid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Rawhid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSizeHid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.bRawData.toList())
                }
            }
    }
}

public data class Rawinput(
    public var header: Rawinputheader = Rawinputheader(),
    public var data: Rawinput0 = Rawinput0(),
)

public data class Rawinput0(
    public var mouse: Rawmouse = Rawmouse(),
    public var keyboard: Rawkeyboard = Rawkeyboard(),
    public var hid: Rawhid = Rawhid(),
)

public class Rawinputdevice internal constructor(
    public var usUsagePage: UShort,
    public var usUsage: UShort,
    public var dwFlags: RawinputdeviceFlags,
    hwndTargetCtorArg: Hwnd,
) {
    public var hwndTarget: Hwnd = hwndTargetCtorArg
        internal set

    public constructor() : this(
        usUsagePage = 0u,
        usUsage = 0u,
        dwFlags = 0u,
        hwndTargetCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.usUsagePage

    public operator fun component2(): UShort = this.usUsage

    public operator fun component3(): RawinputdeviceFlags = this.dwFlags

    public operator fun component4(): Hwnd = this.hwndTarget

    public fun copy(usUsagePage: UShort = this.usUsagePage, usUsage: UShort = this.usUsage, dwFlags: RawinputdeviceFlags = this.dwFlags, hwndTarget: Hwnd = this.hwndTarget): Rawinputdevice = Rawinputdevice(usUsagePage = usUsagePage, usUsage = usUsage, dwFlags = dwFlags, hwndTargetCtorArg = hwndTarget)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rawinputdevice) return false
        if (this.usUsagePage != other.usUsagePage) return false
        if (this.usUsage != other.usUsage) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hwndTarget != other.hwndTarget) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usUsagePage.hashCode()
        result = 31 * result + this.usUsage.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hwndTarget.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            usUsagePage: UShort = 0u,
            usUsage: UShort = 0u,
            dwFlags: RawinputdeviceFlags = 0u,
            hwndTarget: Hwnd = MutPtr(0L),
        ): Rawinputdevice =
            Rawinputdevice(
                usUsagePage = usUsagePage,
                usUsage = usUsage,
                dwFlags = dwFlags,
                hwndTargetCtorArg = hwndTarget,
            )
    }
}

public class Rawinputdevicelist internal constructor(
    hDeviceCtorArg: Handle,
    public var dwType: RidDeviceInfoType,
) {
    public var hDevice: Handle = hDeviceCtorArg
        internal set

    public constructor() : this(
        hDeviceCtorArg = MutPtr(0L),
        dwType = 0u,
    )

    public operator fun component1(): Handle = this.hDevice

    public operator fun component2(): RidDeviceInfoType = this.dwType

    public fun copy(hDevice: Handle = this.hDevice, dwType: RidDeviceInfoType = this.dwType): Rawinputdevicelist = Rawinputdevicelist(hDeviceCtorArg = hDevice, dwType = dwType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rawinputdevicelist) return false
        if (this.hDevice != other.hDevice) return false
        if (this.dwType != other.dwType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.dwType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: Handle = MutPtr(0L),
            dwType: RidDeviceInfoType = 0u,
        ): Rawinputdevicelist =
            Rawinputdevicelist(
                hDeviceCtorArg = hDevice,
                dwType = dwType,
            )
    }
}

public class Rawinputheader internal constructor(
    public var dwType: UInt,
    public var dwSize: UInt,
    hDeviceCtorArg: Handle,
    public var wParam: Wparam,
) {
    public var hDevice: Handle = hDeviceCtorArg
        internal set

    public constructor() : this(
        dwType = 0u,
        dwSize = 0u,
        hDeviceCtorArg = MutPtr(0L),
        wParam = 0uL,
    )

    public operator fun component1(): UInt = this.dwType

    public operator fun component2(): UInt = this.dwSize

    public operator fun component3(): Handle = this.hDevice

    public operator fun component4(): Wparam = this.wParam

    public fun copy(dwType: UInt = this.dwType, dwSize: UInt = this.dwSize, hDevice: Handle = this.hDevice, wParam: Wparam = this.wParam): Rawinputheader = Rawinputheader(dwType = dwType, dwSize = dwSize, hDeviceCtorArg = hDevice, wParam = wParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rawinputheader) return false
        if (this.dwType != other.dwType) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hDevice != other.hDevice) return false
        if (this.wParam != other.wParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwType.hashCode()
        result = 31 * result + this.dwSize.hashCode()
        result = 31 * result + this.hDevice.hashCode()
        result = 31 * result + this.wParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwType: UInt = 0u,
            dwSize: UInt = 0u,
            hDevice: Handle = MutPtr(0L),
            wParam: Wparam = 0uL,
        ): Rawinputheader =
            Rawinputheader(
                dwType = dwType,
                dwSize = dwSize,
                hDeviceCtorArg = hDevice,
                wParam = wParam,
            )
    }
}

public data class Rawkeyboard(
    public var makeCode: UShort = 0u,
    public var flags: UShort = 0u,
    public var reserved: UShort = 0u,
    public var vKey: UShort = 0u,
    public var message: UInt = 0u,
    public var extraInformation: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rawkeyboard> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rawkeyboard> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Rawkeyboard =
                    Rawkeyboard(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Rawkeyboard) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.makeCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.vKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.message)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.extraInformation)
                }
            }
    }
}

public data class Rawmouse(
    public var usFlags: MouseState = 0u,
    public var anonymous: Rawmouse0 = Rawmouse0(),
    public var ulRawButtons: UInt = 0u,
    public var lLastX: Int = 0,
    public var lLastY: Int = 0,
    public var ulExtraInformation: UInt = 0u,
)

public data class Rawmouse0(
    public var ulButtons: UInt = 0u,
    public var anonymous: Rawmouse00 = Rawmouse00(),
)

public data class Rawmouse00(
    public var usButtonFlags: UShort = 0u,
    public var usButtonData: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rawmouse00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rawmouse00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Rawmouse00 =
                    Rawmouse00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Rawmouse00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usButtonFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.usButtonData)
                }
            }
    }
}

public data class RidDeviceInfo(
    public var cbSize: UInt = 0u,
    public var dwType: RidDeviceInfoType = 0u,
    public var anonymous: RidDeviceInfo0 = RidDeviceInfo0(),
)

public data class RidDeviceInfo0(
    public var mouse: RidDeviceInfoMouse = RidDeviceInfoMouse(),
    public var keyboard: RidDeviceInfoKeyboard = RidDeviceInfoKeyboard(),
    public var hid: RidDeviceInfoHid = RidDeviceInfoHid(),
)

public data class RidDeviceInfoHid(
    public var dwVendorId: UInt = 0u,
    public var dwProductId: UInt = 0u,
    public var dwVersionNumber: UInt = 0u,
    public var usUsagePage: UShort = 0u,
    public var usUsage: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RidDeviceInfoHid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RidDeviceInfoHid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RidDeviceInfoHid =
                    RidDeviceInfoHid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: RidDeviceInfoHid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVendorId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwProductId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwVersionNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.usUsagePage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.usUsage)
                }
            }
    }
}

public data class RidDeviceInfoKeyboard(
    public var dwType: UInt = 0u,
    public var dwSubType: UInt = 0u,
    public var dwKeyboardMode: UInt = 0u,
    public var dwNumberOfFunctionKeys: UInt = 0u,
    public var dwNumberOfIndicators: UInt = 0u,
    public var dwNumberOfKeysTotal: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RidDeviceInfoKeyboard> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RidDeviceInfoKeyboard> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): RidDeviceInfoKeyboard =
                    RidDeviceInfoKeyboard(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: RidDeviceInfoKeyboard) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSubType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwKeyboardMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwNumberOfFunctionKeys)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwNumberOfIndicators)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwNumberOfKeysTotal)
                }
            }
    }
}

public data class RidDeviceInfoMouse(
    public var dwId: UInt = 0u,
    public var dwNumberOfButtons: UInt = 0u,
    public var dwSampleRate: UInt = 0u,
    public var fHasHorizontalWheel: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RidDeviceInfoMouse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RidDeviceInfoMouse> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RidDeviceInfoMouse =
                    RidDeviceInfoMouse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: RidDeviceInfoMouse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNumberOfButtons)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSampleRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.fHasHorizontalWheel)
                }
            }
    }
}
