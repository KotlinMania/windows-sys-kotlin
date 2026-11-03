@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.ui.shell.common

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class COMDLG_FILTERSPEC(public var pszName: PCWSTR = 0L, public var pszSpec: PCWSTR = 0L)

public data class ITEMIDLIST(public var mkid: SHITEMID = SHITEMID())

public data class SHELLDETAILS(
    public var fmt: Int = 0,
    public var cxChar: Int = 0,
    public var str: STRRET = STRRET(),
)

public data class SHITEMID(public var cb: UShort = 0u, public var abID: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SHITEMID) return false
        if (this.cb != other.cb) return false
        if (!this.abID.contentEquals(other.abID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.abID.contentHashCode()
        return result
    }
}

public data class STRRET(public var uType: UInt = 0u, public var Anonymous: STRRET_0 = STRRET_0())

public data class STRRET_0(
    public var pOleStr: PWSTR = 0L,
    public var uOffset: UInt = 0u,
    public var cStr: UByteArray = UByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STRRET_0) return false
        if (this.pOleStr != other.pOleStr) return false
        if (this.uOffset != other.uOffset) return false
        if (!this.cStr.contentEquals(other.cStr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pOleStr.hashCode()
        result = 31 * result + this.uOffset.hashCode()
        result = 31 * result + this.cStr.contentHashCode()
        return result
    }
}
