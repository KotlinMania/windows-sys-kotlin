@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.ui.input

import io.github.kotlinmania.windowssys.core.BOOL

public data class INPUT_MESSAGE_SOURCE(public var deviceType: INPUT_MESSAGE_DEVICE_TYPE = 0, public var originId: INPUT_MESSAGE_ORIGIN_ID = 0)

public data class RAWHID(
    public var dwSizeHid: UInt = 0u,
    public var dwCount: UInt = 0u,
    public var bRawData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RAWHID) return false
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

public data class RAWINPUT(public var header: RAWINPUTHEADER = RAWINPUTHEADER(), public var data: RAWINPUT_0 = RAWINPUT_0())

public data class RAWINPUT_0(
    public var mouse: RAWMOUSE = RAWMOUSE(),
    public var keyboard: RAWKEYBOARD = RAWKEYBOARD(),
    public var hid: RAWHID = RAWHID(),
)

public data class RAWINPUTDEVICE(
    public var usUsagePage: UShort = 0u,
    public var usUsage: UShort = 0u,
    public var dwFlags: RAWINPUTDEVICE_FLAGS = 0u,
    public var hwndTarget: Foundation.HWND = Foundation.HWND(),
)

public data class RAWINPUTDEVICELIST(public var hDevice: Foundation.HANDLE = Foundation.HANDLE(), public var dwType: RID_DEVICE_INFO_TYPE = 0u)

public data class RAWINPUTHEADER(
    public var dwType: UInt = 0u,
    public var dwSize: UInt = 0u,
    public var hDevice: Foundation.HANDLE = Foundation.HANDLE(),
    public var wParam: Foundation.WPARAM = Foundation.WPARAM(),
)

public data class RAWKEYBOARD(
    public var MakeCode: UShort = 0u,
    public var Flags: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var VKey: UShort = 0u,
    public var Message: UInt = 0u,
    public var ExtraInformation: UInt = 0u,
)

public data class RAWMOUSE(
    public var usFlags: MOUSE_STATE = 0u,
    public var Anonymous: RAWMOUSE_0 = RAWMOUSE_0(),
    public var ulRawButtons: UInt = 0u,
    public var lLastX: Int = 0,
    public var lLastY: Int = 0,
    public var ulExtraInformation: UInt = 0u,
)

public data class RAWMOUSE_0(public var ulButtons: UInt = 0u, public var Anonymous: RAWMOUSE_0_0 = RAWMOUSE_0_0())

public data class RAWMOUSE_0_0(public var usButtonFlags: UShort = 0u, public var usButtonData: UShort = 0u)

public data class RID_DEVICE_INFO(
    public var cbSize: UInt = 0u,
    public var dwType: RID_DEVICE_INFO_TYPE = 0u,
    public var Anonymous: RID_DEVICE_INFO_0 = RID_DEVICE_INFO_0(),
)

public data class RID_DEVICE_INFO_0(
    public var mouse: RID_DEVICE_INFO_MOUSE = RID_DEVICE_INFO_MOUSE(),
    public var keyboard: RID_DEVICE_INFO_KEYBOARD = RID_DEVICE_INFO_KEYBOARD(),
    public var hid: RID_DEVICE_INFO_HID = RID_DEVICE_INFO_HID(),
)

public data class RID_DEVICE_INFO_HID(
    public var dwVendorId: UInt = 0u,
    public var dwProductId: UInt = 0u,
    public var dwVersionNumber: UInt = 0u,
    public var usUsagePage: UShort = 0u,
    public var usUsage: UShort = 0u,
)

public data class RID_DEVICE_INFO_KEYBOARD(
    public var dwType: UInt = 0u,
    public var dwSubType: UInt = 0u,
    public var dwKeyboardMode: UInt = 0u,
    public var dwNumberOfFunctionKeys: UInt = 0u,
    public var dwNumberOfIndicators: UInt = 0u,
    public var dwNumberOfKeysTotal: UInt = 0u,
)

public data class RID_DEVICE_INFO_MOUSE(
    public var dwId: UInt = 0u,
    public var dwNumberOfButtons: UInt = 0u,
    public var dwSampleRate: UInt = 0u,
    public var fHasHorizontalWheel: BOOL = 0,
)
