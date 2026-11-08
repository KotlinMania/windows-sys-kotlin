package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.POINTER_INPUT_TYPE

public data class INPUT_INJECTION_VALUE(
    public var page: UShort = 0u,
    public var usage: UShort = 0u,
    public var value: Int = 0,
    public var index: UShort = 0u,
)

public data class INPUT_TRANSFORM(public var Anonymous: INPUT_TRANSFORM_0 = INPUT_TRANSFORM_0())

public data class INPUT_TRANSFORM_0(public var Anonymous: INPUT_TRANSFORM_0_0 = INPUT_TRANSFORM_0_0(), public var m: FloatArray = FloatArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is INPUT_TRANSFORM_0) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.m.contentEquals(other.m)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous.hashCode()
        result = 31 * result + this.m.contentHashCode()
        return result
    }
}

public data class INPUT_TRANSFORM_0_0(
    public var _11: Float = 0.0f,
    public var _12: Float = 0.0f,
    public var _13: Float = 0.0f,
    public var _14: Float = 0.0f,
    public var _21: Float = 0.0f,
    public var _22: Float = 0.0f,
    public var _23: Float = 0.0f,
    public var _24: Float = 0.0f,
    public var _31: Float = 0.0f,
    public var _32: Float = 0.0f,
    public var _33: Float = 0.0f,
    public var _34: Float = 0.0f,
    public var _41: Float = 0.0f,
    public var _42: Float = 0.0f,
    public var _43: Float = 0.0f,
    public var _44: Float = 0.0f,
)

public data class POINTER_INFO(
    public var pointerType: POINTER_INPUT_TYPE = 0,
    public var pointerId: UInt = 0u,
    public var frameId: UInt = 0u,
    public var pointerFlags: POINTER_FLAGS = 0u,
    public var sourceDevice: HANDLE = 0L,
    public var hwndTarget: HWND = 0L,
    public var ptPixelLocation: POINT = POINT(),
    public var ptHimetricLocation: POINT = POINT(),
    public var ptPixelLocationRaw: POINT = POINT(),
    public var ptHimetricLocationRaw: POINT = POINT(),
    public var dwTime: UInt = 0u,
    public var historyCount: UInt = 0u,
    public var InputData: Int = 0,
    public var dwKeyStates: UInt = 0u,
    public var PerformanceCount: ULong = 0uL,
    public var ButtonChangeType: POINTER_BUTTON_CHANGE_TYPE = 0,
)

public data class POINTER_PEN_INFO(
    public var pointerInfo: POINTER_INFO = POINTER_INFO(),
    public var penFlags: UInt = 0u,
    public var penMask: UInt = 0u,
    public var pressure: UInt = 0u,
    public var rotation: UInt = 0u,
    public var tiltX: Int = 0,
    public var tiltY: Int = 0,
)

public data class POINTER_TOUCH_INFO(
    public var pointerInfo: POINTER_INFO = POINTER_INFO(),
    public var touchFlags: UInt = 0u,
    public var touchMask: UInt = 0u,
    public var rcContact: RECT = RECT(),
    public var rcContactRaw: RECT = RECT(),
    public var orientation: UInt = 0u,
    public var pressure: UInt = 0u,
)
