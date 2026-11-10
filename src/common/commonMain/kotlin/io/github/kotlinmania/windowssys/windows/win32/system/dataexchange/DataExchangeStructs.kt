@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.dataexchange

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmetafile
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityQualityOfService

public data class Convcontext(
    public var cb: UInt = 0u,
    public var wFlags: UInt = 0u,
    public var wCountryID: UInt = 0u,
    public var iCodePage: Int = 0,
    public var dwLangID: UInt = 0u,
    public var dwSecurity: UInt = 0u,
    public var qos: SecurityQualityOfService = SecurityQualityOfService(),
)

public data class Convinfo(
    public var cb: UInt = 0u,
    public var hUser: Int = 0,
    public var hConvPartner: Hconv = null,
    public var hszSvcPartner: Hsz = null,
    public var hszServiceReq: Hsz = null,
    public var hszTopic: Hsz = null,
    public var hszItem: Hsz = null,
    public var wFmt: UInt = 0u,
    public var wType: DdeClientTransactionType = 0u,
    public var wStatus: ConvinfoStatus = 0u,
    public var wConvst: ConvinfoConversationState = 0u,
    public var wLastError: UInt = 0u,
    public var hConvList: Hconvlist = null,
    public var convCtxt: Convcontext = Convcontext(),
    public var hwnd: Hwnd = null,
    public var hwndPartner: Hwnd = null,
)

public data class Copydatastruct(
    public var dwData: Int = 0,
    public var cbData: UInt = 0u,
    public var lpData: COpaquePointer? = null,
)

public data class Ddeack(
    public var bitfield: UShort = 0u,
)

public data class Ddeadvise(
    public var bitfield: UShort = 0u,
    public var cfFormat: Short = 0,
)

public data class Ddedata(
    public var bitfield: UShort = 0u,
    public var cfFormat: Short = 0,
    public var value: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ddedata) return false
        if (this.bitfield != other.bitfield) return false
        if (this.cfFormat != other.cfFormat) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.cfFormat.hashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }
}

public data class Ddeln(
    public var bitfield: UShort = 0u,
    public var cfFormat: Short = 0,
)

public data class DdemlMsgHookData(
    public var uiLo: Int = 0,
    public var uiHi: Int = 0,
    public var cbData: UInt = 0u,
    public var data: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DdemlMsgHookData) return false
        if (this.uiLo != other.uiLo) return false
        if (this.uiHi != other.uiHi) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uiLo.hashCode()
        result = 31 * result + this.uiHi.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class Ddepoke(
    public var bitfield: UShort = 0u,
    public var cfFormat: Short = 0,
    public var value: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ddepoke) return false
        if (this.bitfield != other.bitfield) return false
        if (this.cfFormat != other.cfFormat) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.cfFormat.hashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }
}

public data class Ddeup(
    public var bitfield: UShort = 0u,
    public var cfFormat: Short = 0,
    public var rgb: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ddeup) return false
        if (this.bitfield != other.bitfield) return false
        if (this.cfFormat != other.cfFormat) return false
        if (!this.rgb.contentEquals(other.rgb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.cfFormat.hashCode()
        result = 31 * result + this.rgb.contentHashCode()
        return result
    }
}

public data class Hszpair(
    public var hszSvc: Hsz = null,
    public var hszTopic: Hsz = null,
)

public data class Metafilepict(
    public var mm: Int = 0,
    public var xExt: Int = 0,
    public var yExt: Int = 0,
    public var hMF: Hmetafile = null,
)

public data class Moncbstruct(
    public var cb: UInt = 0u,
    public var dwTime: UInt = 0u,
    public var hTask: Handle = null,
    public var dwRet: UInt = 0u,
    public var wType: UInt = 0u,
    public var wFmt: UInt = 0u,
    public var hConv: Hconv = null,
    public var hsz1: Hsz = null,
    public var hsz2: Hsz = null,
    public var hData: Hddedata = null,
    public var dwData1: Int = 0,
    public var dwData2: Int = 0,
    public var cc: Convcontext = Convcontext(),
    public var cbData: UInt = 0u,
    public var data: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Moncbstruct) return false
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
        if (!this.data.contentEquals(other.data)) return false
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
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class Monconvstruct(
    public var cb: UInt = 0u,
    public var fConnect: Bool = 0,
    public var dwTime: UInt = 0u,
    public var hTask: Handle = null,
    public var hszSvc: Hsz = null,
    public var hszTopic: Hsz = null,
    public var hConvClient: Hconv = null,
    public var hConvServer: Hconv = null,
)

public data class Monerrstruct(
    public var cb: UInt = 0u,
    public var wLastError: UInt = 0u,
    public var dwTime: UInt = 0u,
    public var hTask: Handle = null,
)

public data class Monhszstructa(
    public var cb: UInt = 0u,
    public var fsAction: Bool = 0,
    public var dwTime: UInt = 0u,
    public var hsz: Hsz = null,
    public var hTask: Handle = null,
    public var str: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Monhszstructa) return false
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

public data class Monhszstructw(
    public var cb: UInt = 0u,
    public var fsAction: Bool = 0,
    public var dwTime: UInt = 0u,
    public var hsz: Hsz = null,
    public var hTask: Handle = null,
    public var str: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Monhszstructw) return false
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

public data class Monlinkstruct(
    public var cb: UInt = 0u,
    public var dwTime: UInt = 0u,
    public var hTask: Handle = null,
    public var fEstablished: Bool = 0,
    public var fNoData: Bool = 0,
    public var hszSvc: Hsz = null,
    public var hszTopic: Hsz = null,
    public var hszItem: Hsz = null,
    public var wFmt: UInt = 0u,
    public var fServer: Bool = 0,
    public var hConvServer: Hconv = null,
    public var hConvClient: Hconv = null,
)

public data class Monmsgstruct(
    public var cb: UInt = 0u,
    public var hwndTo: Hwnd = null,
    public var dwTime: UInt = 0u,
    public var hTask: Handle = null,
    public var wMsg: UInt = 0u,
    public var wParam: Wparam = 0uL,
    public var lParam: Lparam = 0L,
    public var dmhd: DdemlMsgHookData = DdemlMsgHookData(),
)
