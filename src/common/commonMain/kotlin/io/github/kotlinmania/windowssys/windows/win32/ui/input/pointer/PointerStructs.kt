package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.PointerInputType

public data class InputInjectionValue(
    public var page: UShort = 0u,
    public var usage: UShort = 0u,
    public var value: Int = 0,
    public var index: UShort = 0u,
)

public data class InputTransform(public var anonymous: InputTransform0 = InputTransform0())

public data class InputTransform0(public var anonymous: InputTransform00 = InputTransform00(), public var m: FloatArray = FloatArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InputTransform0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.m.contentEquals(other.m)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.m.contentHashCode()
        return result
    }
}

public data class InputTransform00(
    public var v11: Float = 0.0f,
    public var v12: Float = 0.0f,
    public var v13: Float = 0.0f,
    public var v14: Float = 0.0f,
    public var v21: Float = 0.0f,
    public var v22: Float = 0.0f,
    public var v23: Float = 0.0f,
    public var v24: Float = 0.0f,
    public var v31: Float = 0.0f,
    public var v32: Float = 0.0f,
    public var v33: Float = 0.0f,
    public var v34: Float = 0.0f,
    public var v41: Float = 0.0f,
    public var v42: Float = 0.0f,
    public var v43: Float = 0.0f,
    public var v44: Float = 0.0f,
)

public data class PointerInfo(
    public var pointerType: PointerInputType = 0,
    public var pointerId: UInt = 0u,
    public var frameId: UInt = 0u,
    public var pointerFlags: PointerFlags = 0u,
    public var sourceDevice: Handle = null,
    public var hwndTarget: Hwnd = null,
    public var ptPixelLocation: Point = Point(),
    public var ptHimetricLocation: Point = Point(),
    public var ptPixelLocationRaw: Point = Point(),
    public var ptHimetricLocationRaw: Point = Point(),
    public var dwTime: UInt = 0u,
    public var historyCount: UInt = 0u,
    public var inputData: Int = 0,
    public var dwKeyStates: UInt = 0u,
    public var performanceCount: ULong = 0uL,
    public var buttonChangeType: PointerButtonChangeType = 0,
)

public data class PointerPenInfo(
    public var pointerInfo: PointerInfo = PointerInfo(),
    public var penFlags: UInt = 0u,
    public var penMask: UInt = 0u,
    public var pressure: UInt = 0u,
    public var rotation: UInt = 0u,
    public var tiltX: Int = 0,
    public var tiltY: Int = 0,
)

public data class PointerTouchInfo(
    public var pointerInfo: PointerInfo = PointerInfo(),
    public var touchFlags: UInt = 0u,
    public var touchMask: UInt = 0u,
    public var rcContact: Rect = Rect(),
    public var rcContactRaw: Rect = Rect(),
    public var orientation: UInt = 0u,
    public var pressure: UInt = 0u,
)
