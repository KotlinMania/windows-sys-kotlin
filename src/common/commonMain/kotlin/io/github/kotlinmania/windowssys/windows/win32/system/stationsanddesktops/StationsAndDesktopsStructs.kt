package io.github.kotlinmania.windowssys.windows.win32.system.stationsanddesktops

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid

public class Bsminfo internal constructor(
    public var cbSize: UInt,
    hdeskCtorArg: Hdesk,
    hwndCtorArg: Hwnd,
    public var luid: Luid,
) {
    public var hdesk: Hdesk = hdeskCtorArg
        internal set

    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hdeskCtorArg = MutPtr(0L),
        hwndCtorArg = MutPtr(0L),
        luid = Luid(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Hdesk = this.hdesk

    public operator fun component3(): Hwnd = this.hwnd

    public operator fun component4(): Luid = this.luid

    public fun copy(cbSize: UInt = this.cbSize, hdesk: Hdesk = this.hdesk, hwnd: Hwnd = this.hwnd, luid: Luid = this.luid): Bsminfo = Bsminfo(cbSize = cbSize, hdeskCtorArg = hdesk, hwndCtorArg = hwnd, luid = luid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Bsminfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hdesk != other.hdesk) return false
        if (this.hwnd != other.hwnd) return false
        if (this.luid != other.luid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hdesk.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.luid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hdesk: Hdesk = MutPtr(0L),
            hwnd: Hwnd = MutPtr(0L),
            luid: Luid = Luid(),
        ): Bsminfo =
            Bsminfo(
                cbSize = cbSize,
                hdeskCtorArg = hdesk,
                hwndCtorArg = hwnd,
                luid = luid,
            )
    }
}

public data class Userobjectflags(
    public var fInherit: Bool = 0,
    public var fReserved: Bool = 0,
    public var dwFlags: UInt = 0u,
)
