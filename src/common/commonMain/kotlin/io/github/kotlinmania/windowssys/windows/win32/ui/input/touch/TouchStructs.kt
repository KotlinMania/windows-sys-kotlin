package io.github.kotlinmania.windowssys.windows.win32.ui.input.touch

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Points

public data class Gestureconfig(
    public var dwID: GestureconfigId = 0u,
    public var dwWant: UInt = 0u,
    public var dwBlock: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Gestureconfig> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Gestureconfig> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Gestureconfig =
                    Gestureconfig(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Gestureconfig) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwWant)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwBlock)
                }
            }
    }
}

public class Gestureinfo internal constructor(
    public var cbSize: UInt,
    public var dwFlags: UInt,
    public var dwID: UInt,
    hwndTargetCtorArg: Hwnd,
    public var ptsLocation: Points,
    public var dwInstanceID: UInt,
    public var dwSequenceID: UInt,
    public var ullArguments: ULong,
    public var cbExtraArgs: UInt,
) {
    public var hwndTarget: Hwnd = hwndTargetCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        dwID = 0u,
        hwndTargetCtorArg = MutPtr(0L),
        ptsLocation = Points(),
        dwInstanceID = 0u,
        dwSequenceID = 0u,
        ullArguments = 0uL,
        cbExtraArgs = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UInt = this.dwID

    public operator fun component4(): Hwnd = this.hwndTarget

    public operator fun component5(): Points = this.ptsLocation

    public operator fun component6(): UInt = this.dwInstanceID

    public operator fun component7(): UInt = this.dwSequenceID

    public operator fun component8(): ULong = this.ullArguments

    public operator fun component9(): UInt = this.cbExtraArgs

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: UInt = this.dwFlags, dwID: UInt = this.dwID, hwndTarget: Hwnd = this.hwndTarget, ptsLocation: Points = this.ptsLocation, dwInstanceID: UInt = this.dwInstanceID, dwSequenceID: UInt = this.dwSequenceID, ullArguments: ULong = this.ullArguments, cbExtraArgs: UInt = this.cbExtraArgs): Gestureinfo = Gestureinfo(cbSize = cbSize, dwFlags = dwFlags, dwID = dwID, hwndTargetCtorArg = hwndTarget, ptsLocation = ptsLocation, dwInstanceID = dwInstanceID, dwSequenceID = dwSequenceID, ullArguments = ullArguments, cbExtraArgs = cbExtraArgs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Gestureinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwID != other.dwID) return false
        if (this.hwndTarget != other.hwndTarget) return false
        if (this.ptsLocation != other.ptsLocation) return false
        if (this.dwInstanceID != other.dwInstanceID) return false
        if (this.dwSequenceID != other.dwSequenceID) return false
        if (this.ullArguments != other.ullArguments) return false
        if (this.cbExtraArgs != other.cbExtraArgs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwID.hashCode()
        result = 31 * result + this.hwndTarget.hashCode()
        result = 31 * result + this.ptsLocation.hashCode()
        result = 31 * result + this.dwInstanceID.hashCode()
        result = 31 * result + this.dwSequenceID.hashCode()
        result = 31 * result + this.ullArguments.hashCode()
        result = 31 * result + this.cbExtraArgs.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: UInt = 0u,
            dwID: UInt = 0u,
            hwndTarget: Hwnd = MutPtr(0L),
            ptsLocation: Points = Points(),
            dwInstanceID: UInt = 0u,
            dwSequenceID: UInt = 0u,
            ullArguments: ULong = 0uL,
            cbExtraArgs: UInt = 0u,
        ): Gestureinfo =
            Gestureinfo(
                cbSize = cbSize,
                dwFlags = dwFlags,
                dwID = dwID,
                hwndTargetCtorArg = hwndTarget,
                ptsLocation = ptsLocation,
                dwInstanceID = dwInstanceID,
                dwSequenceID = dwSequenceID,
                ullArguments = ullArguments,
                cbExtraArgs = cbExtraArgs,
            )
    }
}

public class Gesturenotifystruct internal constructor(
    public var cbSize: UInt,
    public var dwFlags: UInt,
    hwndTargetCtorArg: Hwnd,
    public var ptsLocation: Points,
    public var dwInstanceID: UInt,
) {
    public var hwndTarget: Hwnd = hwndTargetCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        hwndTargetCtorArg = MutPtr(0L),
        ptsLocation = Points(),
        dwInstanceID = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hwnd = this.hwndTarget

    public operator fun component4(): Points = this.ptsLocation

    public operator fun component5(): UInt = this.dwInstanceID

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: UInt = this.dwFlags, hwndTarget: Hwnd = this.hwndTarget, ptsLocation: Points = this.ptsLocation, dwInstanceID: UInt = this.dwInstanceID): Gesturenotifystruct = Gesturenotifystruct(cbSize = cbSize, dwFlags = dwFlags, hwndTargetCtorArg = hwndTarget, ptsLocation = ptsLocation, dwInstanceID = dwInstanceID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Gesturenotifystruct) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hwndTarget != other.hwndTarget) return false
        if (this.ptsLocation != other.ptsLocation) return false
        if (this.dwInstanceID != other.dwInstanceID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hwndTarget.hashCode()
        result = 31 * result + this.ptsLocation.hashCode()
        result = 31 * result + this.dwInstanceID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: UInt = 0u,
            hwndTarget: Hwnd = MutPtr(0L),
            ptsLocation: Points = Points(),
            dwInstanceID: UInt = 0u,
        ): Gesturenotifystruct =
            Gesturenotifystruct(
                cbSize = cbSize,
                dwFlags = dwFlags,
                hwndTargetCtorArg = hwndTarget,
                ptsLocation = ptsLocation,
                dwInstanceID = dwInstanceID,
            )
    }
}

public class Touchinput internal constructor(
    public var x: Int,
    public var y: Int,
    hSourceCtorArg: Handle,
    public var dwID: UInt,
    public var dwFlags: ToucheventfFlags,
    public var dwMask: TouchinputmaskfMask,
    public var dwTime: UInt,
    public var dwExtraInfo: Int,
    public var cxContact: UInt,
    public var cyContact: UInt,
) {
    public var hSource: Handle = hSourceCtorArg
        internal set

    public constructor() : this(
        x = 0,
        y = 0,
        hSourceCtorArg = MutPtr(0L),
        dwID = 0u,
        dwFlags = 0u,
        dwMask = 0u,
        dwTime = 0u,
        dwExtraInfo = 0,
        cxContact = 0u,
        cyContact = 0u,
    )

    public operator fun component1(): Int = this.x

    public operator fun component2(): Int = this.y

    public operator fun component3(): Handle = this.hSource

    public operator fun component4(): UInt = this.dwID

    public operator fun component5(): ToucheventfFlags = this.dwFlags

    public operator fun component6(): TouchinputmaskfMask = this.dwMask

    public operator fun component7(): UInt = this.dwTime

    public operator fun component8(): Int = this.dwExtraInfo

    public operator fun component9(): UInt = this.cxContact

    public operator fun component10(): UInt = this.cyContact

    public fun copy(x: Int = this.x, y: Int = this.y, hSource: Handle = this.hSource, dwID: UInt = this.dwID, dwFlags: ToucheventfFlags = this.dwFlags, dwMask: TouchinputmaskfMask = this.dwMask, dwTime: UInt = this.dwTime, dwExtraInfo: Int = this.dwExtraInfo, cxContact: UInt = this.cxContact, cyContact: UInt = this.cyContact): Touchinput = Touchinput(x = x, y = y, hSourceCtorArg = hSource, dwID = dwID, dwFlags = dwFlags, dwMask = dwMask, dwTime = dwTime, dwExtraInfo = dwExtraInfo, cxContact = cxContact, cyContact = cyContact)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Touchinput) return false
        if (this.x != other.x) return false
        if (this.y != other.y) return false
        if (this.hSource != other.hSource) return false
        if (this.dwID != other.dwID) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwMask != other.dwMask) return false
        if (this.dwTime != other.dwTime) return false
        if (this.dwExtraInfo != other.dwExtraInfo) return false
        if (this.cxContact != other.cxContact) return false
        if (this.cyContact != other.cyContact) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.x.hashCode()
        result = 31 * result + this.y.hashCode()
        result = 31 * result + this.hSource.hashCode()
        result = 31 * result + this.dwID.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.dwTime.hashCode()
        result = 31 * result + this.dwExtraInfo.hashCode()
        result = 31 * result + this.cxContact.hashCode()
        result = 31 * result + this.cyContact.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            x: Int = 0,
            y: Int = 0,
            hSource: Handle = MutPtr(0L),
            dwID: UInt = 0u,
            dwFlags: ToucheventfFlags = 0u,
            dwMask: TouchinputmaskfMask = 0u,
            dwTime: UInt = 0u,
            dwExtraInfo: Int = 0,
            cxContact: UInt = 0u,
            cyContact: UInt = 0u,
        ): Touchinput =
            Touchinput(
                x = x,
                y = y,
                hSourceCtorArg = hSource,
                dwID = dwID,
                dwFlags = dwFlags,
                dwMask = dwMask,
                dwTime = dwTime,
                dwExtraInfo = dwExtraInfo,
                cxContact = cxContact,
                cyContact = cyContact,
            )
    }
}
