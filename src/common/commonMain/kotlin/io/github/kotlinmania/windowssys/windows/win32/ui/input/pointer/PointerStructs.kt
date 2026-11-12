package io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputInjectionValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputInjectionValue> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): InputInjectionValue =
                    InputInjectionValue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: InputInjectionValue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.page)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.usage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.index)
                }
            }
    }
}

public data class InputTransform(
    public var anonymous: InputTransform0 = InputTransform0(),
)

public data class InputTransform0(
    public var anonymous: InputTransform00 = InputTransform00(),
    public var m: FloatArray = FloatArray(16),
) {
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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputTransform00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputTransform00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): InputTransform00 =
                    InputTransform00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 60L),
                    )
                override fun writeNative(addr: Long, value: InputTransform00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.v11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.v12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.v13)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.v14)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 16L, value.v21)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 20L, value.v22)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 24L, value.v23)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 28L, value.v24)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 32L, value.v31)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 36L, value.v32)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 40L, value.v33)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 44L, value.v34)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 48L, value.v41)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 52L, value.v42)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 56L, value.v43)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 60L, value.v44)
                }
            }
    }
}

public class PointerInfo internal constructor(
    public var pointerType: PointerInputType,
    public var pointerId: UInt,
    public var frameId: UInt,
    public var pointerFlags: PointerFlags,
    sourceDeviceCtorArg: Handle,
    hwndTargetCtorArg: Hwnd,
    public var ptPixelLocation: Point,
    public var ptHimetricLocation: Point,
    public var ptPixelLocationRaw: Point,
    public var ptHimetricLocationRaw: Point,
    public var dwTime: UInt,
    public var historyCount: UInt,
    public var inputData: Int,
    public var dwKeyStates: UInt,
    public var performanceCount: ULong,
    public var buttonChangeType: PointerButtonChangeType,
) {
    public var sourceDevice: Handle = sourceDeviceCtorArg
        internal set

    public var hwndTarget: Hwnd = hwndTargetCtorArg
        internal set

    public constructor() : this(
        pointerType = 0,
        pointerId = 0u,
        frameId = 0u,
        pointerFlags = 0u,
        sourceDeviceCtorArg = MutPtr(0L),
        hwndTargetCtorArg = MutPtr(0L),
        ptPixelLocation = Point(),
        ptHimetricLocation = Point(),
        ptPixelLocationRaw = Point(),
        ptHimetricLocationRaw = Point(),
        dwTime = 0u,
        historyCount = 0u,
        inputData = 0,
        dwKeyStates = 0u,
        performanceCount = 0uL,
        buttonChangeType = 0,
    )

    public operator fun component1(): PointerInputType = this.pointerType

    public operator fun component2(): UInt = this.pointerId

    public operator fun component3(): UInt = this.frameId

    public operator fun component4(): PointerFlags = this.pointerFlags

    public operator fun component5(): Handle = this.sourceDevice

    public operator fun component6(): Hwnd = this.hwndTarget

    public operator fun component7(): Point = this.ptPixelLocation

    public operator fun component8(): Point = this.ptHimetricLocation

    public operator fun component9(): Point = this.ptPixelLocationRaw

    public operator fun component10(): Point = this.ptHimetricLocationRaw

    public operator fun component11(): UInt = this.dwTime

    public operator fun component12(): UInt = this.historyCount

    public operator fun component13(): Int = this.inputData

    public operator fun component14(): UInt = this.dwKeyStates

    public operator fun component15(): ULong = this.performanceCount

    public operator fun component16(): PointerButtonChangeType = this.buttonChangeType

    public fun copy(pointerType: PointerInputType = this.pointerType, pointerId: UInt = this.pointerId, frameId: UInt = this.frameId, pointerFlags: PointerFlags = this.pointerFlags, sourceDevice: Handle = this.sourceDevice, hwndTarget: Hwnd = this.hwndTarget, ptPixelLocation: Point = this.ptPixelLocation, ptHimetricLocation: Point = this.ptHimetricLocation, ptPixelLocationRaw: Point = this.ptPixelLocationRaw, ptHimetricLocationRaw: Point = this.ptHimetricLocationRaw, dwTime: UInt = this.dwTime, historyCount: UInt = this.historyCount, inputData: Int = this.inputData, dwKeyStates: UInt = this.dwKeyStates, performanceCount: ULong = this.performanceCount, buttonChangeType: PointerButtonChangeType = this.buttonChangeType): PointerInfo = PointerInfo(pointerType = pointerType, pointerId = pointerId, frameId = frameId, pointerFlags = pointerFlags, sourceDeviceCtorArg = sourceDevice, hwndTargetCtorArg = hwndTarget, ptPixelLocation = ptPixelLocation, ptHimetricLocation = ptHimetricLocation, ptPixelLocationRaw = ptPixelLocationRaw, ptHimetricLocationRaw = ptHimetricLocationRaw, dwTime = dwTime, historyCount = historyCount, inputData = inputData, dwKeyStates = dwKeyStates, performanceCount = performanceCount, buttonChangeType = buttonChangeType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PointerInfo) return false
        if (this.pointerType != other.pointerType) return false
        if (this.pointerId != other.pointerId) return false
        if (this.frameId != other.frameId) return false
        if (this.pointerFlags != other.pointerFlags) return false
        if (this.sourceDevice != other.sourceDevice) return false
        if (this.hwndTarget != other.hwndTarget) return false
        if (this.ptPixelLocation != other.ptPixelLocation) return false
        if (this.ptHimetricLocation != other.ptHimetricLocation) return false
        if (this.ptPixelLocationRaw != other.ptPixelLocationRaw) return false
        if (this.ptHimetricLocationRaw != other.ptHimetricLocationRaw) return false
        if (this.dwTime != other.dwTime) return false
        if (this.historyCount != other.historyCount) return false
        if (this.inputData != other.inputData) return false
        if (this.dwKeyStates != other.dwKeyStates) return false
        if (this.performanceCount != other.performanceCount) return false
        if (this.buttonChangeType != other.buttonChangeType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pointerType.hashCode()
        result = 31 * result + this.pointerId.hashCode()
        result = 31 * result + this.frameId.hashCode()
        result = 31 * result + this.pointerFlags.hashCode()
        result = 31 * result + this.sourceDevice.hashCode()
        result = 31 * result + this.hwndTarget.hashCode()
        result = 31 * result + this.ptPixelLocation.hashCode()
        result = 31 * result + this.ptHimetricLocation.hashCode()
        result = 31 * result + this.ptPixelLocationRaw.hashCode()
        result = 31 * result + this.ptHimetricLocationRaw.hashCode()
        result = 31 * result + this.dwTime.hashCode()
        result = 31 * result + this.historyCount.hashCode()
        result = 31 * result + this.inputData.hashCode()
        result = 31 * result + this.dwKeyStates.hashCode()
        result = 31 * result + this.performanceCount.hashCode()
        result = 31 * result + this.buttonChangeType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pointerType: PointerInputType = 0,
            pointerId: UInt = 0u,
            frameId: UInt = 0u,
            pointerFlags: PointerFlags = 0u,
            sourceDevice: Handle = MutPtr(0L),
            hwndTarget: Hwnd = MutPtr(0L),
            ptPixelLocation: Point = Point(),
            ptHimetricLocation: Point = Point(),
            ptPixelLocationRaw: Point = Point(),
            ptHimetricLocationRaw: Point = Point(),
            dwTime: UInt = 0u,
            historyCount: UInt = 0u,
            inputData: Int = 0,
            dwKeyStates: UInt = 0u,
            performanceCount: ULong = 0uL,
            buttonChangeType: PointerButtonChangeType = 0,
        ): PointerInfo =
            PointerInfo(
                pointerType = pointerType,
                pointerId = pointerId,
                frameId = frameId,
                pointerFlags = pointerFlags,
                sourceDeviceCtorArg = sourceDevice,
                hwndTargetCtorArg = hwndTarget,
                ptPixelLocation = ptPixelLocation,
                ptHimetricLocation = ptHimetricLocation,
                ptPixelLocationRaw = ptPixelLocationRaw,
                ptHimetricLocationRaw = ptHimetricLocationRaw,
                dwTime = dwTime,
                historyCount = historyCount,
                inputData = inputData,
                dwKeyStates = dwKeyStates,
                performanceCount = performanceCount,
                buttonChangeType = buttonChangeType,
            )
    }
}

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
