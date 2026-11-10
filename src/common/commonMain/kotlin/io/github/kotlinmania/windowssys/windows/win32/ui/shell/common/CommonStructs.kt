@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.ui.shell.common

import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public data class ComdlgFilterspec(public var pszName: Pcwstr = null, public var pszSpec: Pcwstr = null)

public data class Itemidlist(public var mkid: Shitemid = Shitemid())

public data class Shelldetails(
    public var fmt: Int = 0,
    public var cxChar: Int = 0,
    public var str: Strret = Strret(),
)

public data class Shitemid(public var cb: UShort = 0u, public var abID: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shitemid) return false
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

public data class Strret(public var uType: UInt = 0u, public var anonymous: Strret0 = Strret0())

public data class Strret0(
    public var pOleStr: Pwstr = null,
    public var uOffset: UInt = 0u,
    public var cStr: UByteArray = UByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Strret0) return false
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
