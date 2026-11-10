@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

public data class InputMessageSource(
    public var deviceType: InputMessageDeviceType = 0,
    public var originId: InputMessageOriginId = 0,
)

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

public data class Rawinputdevice(
    public var usUsagePage: UShort = 0u,
    public var usUsage: UShort = 0u,
    public var dwFlags: RawinputdeviceFlags = 0u,
    public var hwndTarget: Hwnd = null,
)

public data class Rawinputdevicelist(
    public var hDevice: Handle = null,
    public var dwType: RidDeviceInfoType = 0u,
)

public data class Rawinputheader(
    public var dwType: UInt = 0u,
    public var dwSize: UInt = 0u,
    public var hDevice: Handle = null,
    public var wParam: Wparam = 0uL,
)

public data class Rawkeyboard(
    public var makeCode: UShort = 0u,
    public var flags: UShort = 0u,
    public var reserved: UShort = 0u,
    public var vKey: UShort = 0u,
    public var message: UInt = 0u,
    public var extraInformation: UInt = 0u,
)

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
)

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
)

public data class RidDeviceInfoKeyboard(
    public var dwType: UInt = 0u,
    public var dwSubType: UInt = 0u,
    public var dwKeyboardMode: UInt = 0u,
    public var dwNumberOfFunctionKeys: UInt = 0u,
    public var dwNumberOfIndicators: UInt = 0u,
    public var dwNumberOfKeysTotal: UInt = 0u,
)

public data class RidDeviceInfoMouse(
    public var dwId: UInt = 0u,
    public var dwNumberOfButtons: UInt = 0u,
    public var dwSampleRate: UInt = 0u,
    public var fHasHorizontalWheel: Bool = 0,
)
