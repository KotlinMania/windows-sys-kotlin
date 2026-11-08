@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.dataexchange

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HMETAFILE
import io.github.kotlinmania.windowssys.windows.win32.security.SECURITY_QUALITY_OF_SERVICE

public data class CONVCONTEXT(
    public var cb: UInt = 0u,
    public var wFlags: UInt = 0u,
    public var wCountryID: UInt = 0u,
    public var iCodePage: Int = 0,
    public var dwLangID: UInt = 0u,
    public var dwSecurity: UInt = 0u,
    public var qos: SECURITY_QUALITY_OF_SERVICE = SECURITY_QUALITY_OF_SERVICE(),
)

public data class CONVINFO(
    public var cb: UInt = 0u,
    public var hUser: ULong = 0uL,
    public var hConvPartner: HCONV = 0L,
    public var hszSvcPartner: HSZ = 0L,
    public var hszServiceReq: HSZ = 0L,
    public var hszTopic: HSZ = 0L,
    public var hszItem: HSZ = 0L,
    public var wFmt: UInt = 0u,
    public var wType: DDE_CLIENT_TRANSACTION_TYPE = 0u,
    public var wStatus: CONVINFO_STATUS = 0u,
    public var wConvst: CONVINFO_CONVERSATION_STATE = 0u,
    public var wLastError: UInt = 0u,
    public var hConvList: HCONVLIST = 0L,
    public var ConvCtxt: CONVCONTEXT = CONVCONTEXT(),
    public var hwnd: HWND = 0L,
    public var hwndPartner: HWND = 0L,
)

public data class COPYDATASTRUCT(
    public var dwData: ULong = 0uL,
    public var cbData: UInt = 0u,
    public var lpData: Long = 0L,
)

public data class DDEACK(public var _bitfield: UShort = 0u)

public data class DDEADVISE(public var _bitfield: UShort = 0u, public var cfFormat: Short = 0)

public data class DDEDATA(
    public var _bitfield: UShort = 0u,
    public var cfFormat: Short = 0,
    public var Value: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DDEDATA) return false
        if (this._bitfield != other._bitfield) return false
        if (this.cfFormat != other.cfFormat) return false
        if (!this.Value.contentEquals(other.Value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this._bitfield.hashCode()
        result = 31 * result + this.cfFormat.hashCode()
        result = 31 * result + this.Value.contentHashCode()
        return result
    }
}

public data class DDELN(public var _bitfield: UShort = 0u, public var cfFormat: Short = 0)

public data class DDEML_MSG_HOOK_DATA(
    public var uiLo: ULong = 0uL,
    public var uiHi: ULong = 0uL,
    public var cbData: UInt = 0u,
    public var Data: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DDEML_MSG_HOOK_DATA) return false
        if (this.uiLo != other.uiLo) return false
        if (this.uiHi != other.uiHi) return false
        if (this.cbData != other.cbData) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uiLo.hashCode()
        result = 31 * result + this.uiHi.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class DDEPOKE(
    public var _bitfield: UShort = 0u,
    public var cfFormat: Short = 0,
    public var Value: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DDEPOKE) return false
        if (this._bitfield != other._bitfield) return false
        if (this.cfFormat != other.cfFormat) return false
        if (!this.Value.contentEquals(other.Value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this._bitfield.hashCode()
        result = 31 * result + this.cfFormat.hashCode()
        result = 31 * result + this.Value.contentHashCode()
        return result
    }
}

public data class DDEUP(
    public var _bitfield: UShort = 0u,
    public var cfFormat: Short = 0,
    public var rgb: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DDEUP) return false
        if (this._bitfield != other._bitfield) return false
        if (this.cfFormat != other.cfFormat) return false
        if (!this.rgb.contentEquals(other.rgb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this._bitfield.hashCode()
        result = 31 * result + this.cfFormat.hashCode()
        result = 31 * result + this.rgb.contentHashCode()
        return result
    }
}

public data class HSZPAIR(public var hszSvc: HSZ = 0L, public var hszTopic: HSZ = 0L)

public data class METAFILEPICT(
    public var mm: Int = 0,
    public var xExt: Int = 0,
    public var yExt: Int = 0,
    public var hMF: HMETAFILE = 0L,
)

public data class MONCBSTRUCT(
    public var cb: UInt = 0u,
    public var dwTime: UInt = 0u,
    public var hTask: HANDLE = 0L,
    public var dwRet: UInt = 0u,
    public var wType: UInt = 0u,
    public var wFmt: UInt = 0u,
    public var hConv: HCONV = 0L,
    public var hsz1: HSZ = 0L,
    public var hsz2: HSZ = 0L,
    public var hData: HDDEDATA = 0L,
    public var dwData1: ULong = 0uL,
    public var dwData2: ULong = 0uL,
    public var cc: CONVCONTEXT = CONVCONTEXT(),
    public var cbData: UInt = 0u,
    public var Data: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MONCBSTRUCT) return false
        if (this.cb != other.cb) return false
        if (this.dwTime != other.dwTime) return false
        if (this.hTask != other.hTask) return false
        if (this.dwRet != other.dwRet) return false
        if (this.wType != other.wType) return false
        if (this.wFmt != other.wFmt) return false
        if (this.hConv != other.hConv) return false
        if (this.hsz1 != other.hsz1) return false
        if (this.hsz2 != other.hsz2) return false
        if (this.hData != other.hData) return false
        if (this.dwData1 != other.dwData1) return false
        if (this.dwData2 != other.dwData2) return false
        if (this.cc != other.cc) return false
        if (this.cbData != other.cbData) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.dwTime.hashCode()
        result = 31 * result + this.hTask.hashCode()
        result = 31 * result + this.dwRet.hashCode()
        result = 31 * result + this.wType.hashCode()
        result = 31 * result + this.wFmt.hashCode()
        result = 31 * result + this.hConv.hashCode()
        result = 31 * result + this.hsz1.hashCode()
        result = 31 * result + this.hsz2.hashCode()
        result = 31 * result + this.hData.hashCode()
        result = 31 * result + this.dwData1.hashCode()
        result = 31 * result + this.dwData2.hashCode()
        result = 31 * result + this.cc.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class MONCONVSTRUCT(
    public var cb: UInt = 0u,
    public var fConnect: BOOL = 0,
    public var dwTime: UInt = 0u,
    public var hTask: HANDLE = 0L,
    public var hszSvc: HSZ = 0L,
    public var hszTopic: HSZ = 0L,
    public var hConvClient: HCONV = 0L,
    public var hConvServer: HCONV = 0L,
)

public data class MONERRSTRUCT(
    public var cb: UInt = 0u,
    public var wLastError: UInt = 0u,
    public var dwTime: UInt = 0u,
    public var hTask: HANDLE = 0L,
)

public data class MONHSZSTRUCTA(
    public var cb: UInt = 0u,
    public var fsAction: BOOL = 0,
    public var dwTime: UInt = 0u,
    public var hsz: HSZ = 0L,
    public var hTask: HANDLE = 0L,
    public var str: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MONHSZSTRUCTA) return false
        if (this.cb != other.cb) return false
        if (this.fsAction != other.fsAction) return false
        if (this.dwTime != other.dwTime) return false
        if (this.hsz != other.hsz) return false
        if (this.hTask != other.hTask) return false
        if (!this.str.contentEquals(other.str)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.fsAction.hashCode()
        result = 31 * result + this.dwTime.hashCode()
        result = 31 * result + this.hsz.hashCode()
        result = 31 * result + this.hTask.hashCode()
        result = 31 * result + this.str.contentHashCode()
        return result
    }
}

public data class MONHSZSTRUCTW(
    public var cb: UInt = 0u,
    public var fsAction: BOOL = 0,
    public var dwTime: UInt = 0u,
    public var hsz: HSZ = 0L,
    public var hTask: HANDLE = 0L,
    public var str: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MONHSZSTRUCTW) return false
        if (this.cb != other.cb) return false
        if (this.fsAction != other.fsAction) return false
        if (this.dwTime != other.dwTime) return false
        if (this.hsz != other.hsz) return false
        if (this.hTask != other.hTask) return false
        if (!this.str.contentEquals(other.str)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.fsAction.hashCode()
        result = 31 * result + this.dwTime.hashCode()
        result = 31 * result + this.hsz.hashCode()
        result = 31 * result + this.hTask.hashCode()
        result = 31 * result + this.str.contentHashCode()
        return result
    }
}

public data class MONLINKSTRUCT(
    public var cb: UInt = 0u,
    public var dwTime: UInt = 0u,
    public var hTask: HANDLE = 0L,
    public var fEstablished: BOOL = 0,
    public var fNoData: BOOL = 0,
    public var hszSvc: HSZ = 0L,
    public var hszTopic: HSZ = 0L,
    public var hszItem: HSZ = 0L,
    public var wFmt: UInt = 0u,
    public var fServer: BOOL = 0,
    public var hConvServer: HCONV = 0L,
    public var hConvClient: HCONV = 0L,
)

public data class MONMSGSTRUCT(
    public var cb: UInt = 0u,
    public var hwndTo: HWND = 0L,
    public var dwTime: UInt = 0u,
    public var hTask: HANDLE = 0L,
    public var wMsg: UInt = 0u,
    public var wParam: WPARAM = 0uL,
    public var lParam: LPARAM = 0L,
    public var dmhd: DDEML_MSG_HOOK_DATA = DDEML_MSG_HOOK_DATA(),
)
