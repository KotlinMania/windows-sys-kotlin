@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage

import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.system.com.BLOB
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY

public data class BSTRBLOB(public var cbSize: UInt = 0u, public var pData: Long = 0L)

public data class CABOOL(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CABSTR(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CABSTRBLOB(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CAC(public var cElems: UInt = 0u, public var pElems: PSTR = 0L)

public data class CACLIPDATA(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CACLSID(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CACY(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CADATE(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CADBL(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CAFILETIME(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CAFLT(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CAH(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CAI(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CAL(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CALPSTR(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CALPWSTR(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CAPROPVARIANT(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CASCODE(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CAUB(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CAUH(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CAUI(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CAUL(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CLIPDATA(
    public var cbSize: UInt = 0u,
    public var ulClipFmt: Int = 0,
    public var pClipData: Long = 0L,
)

public data class OLESTREAM(public var lpstbl: Long = 0L)

public data class OLESTREAMVTBL(public var Get: Long = 0L, public var Put: Long = 0L)

public data class PROPBAG2(
    public var dwType: UInt = 0u,
    public var vt: Variant.VARENUM = Variant.VARENUM(),
    public var cfType: UShort = 0u,
    public var dwHint: UInt = 0u,
    public var pstrName: PWSTR = 0L,
    public var clsid: GUID = GUID(),
)

public data class PROPSPEC(public var ulKind: PROPSPEC_KIND = 0u, public var Anonymous: PROPSPEC_0 = PROPSPEC_0())

public data class PROPSPEC_0(public var propid: UInt = 0u, public var lpwstr: PWSTR = 0L)

public data class PROPVARIANT(public var Anonymous: PROPVARIANT_0 = PROPVARIANT_0())

public data class PROPVARIANT_0(public var Anonymous: PROPVARIANT_0_0 = PROPVARIANT_0_0(), public var decVal: Foundation.DECIMAL = Foundation.DECIMAL())

public data class PROPVARIANT_0_0(
    public var vt: Variant.VARENUM = Variant.VARENUM(),
    public var wReserved1: UShort = 0u,
    public var wReserved2: UShort = 0u,
    public var wReserved3: UShort = 0u,
    public var Anonymous: PROPVARIANT_0_0_0 = PROPVARIANT_0_0_0(),
)

public class PROPVARIANT_0_0_0 {
    public var cVal: Byte = 0

    public var bVal: UByte = 0u

    public var iVal: Short = 0

    public var uiVal: UShort = 0u

    public var lVal: Int = 0

    public var ulVal: UInt = 0u

    public var intVal: Int = 0

    public var uintVal: UInt = 0u

    public var hVal: Long = 0L

    public var uhVal: ULong = 0uL

    public var fltVal: Float = 0.0f

    public var dblVal: Double = 0.0

    public var boolVal: Foundation.VARIANT_BOOL = Foundation.VARIANT_BOOL()

    public var __OBSOLETE__VARIANT_BOOL: Foundation.VARIANT_BOOL = Foundation.VARIANT_BOOL()

    public var scode: Int = 0

    public var cyVal: CY = CY()

    public var date: Double = 0.0

    public var filetime: Foundation.FILETIME = Foundation.FILETIME()

    public var puuid: Long = 0L

    public var pclipdata: Long = 0L

    public var bstrVal: BSTR = 0L

    public var bstrblobVal: BSTRBLOB = BSTRBLOB()

    public var blob: BLOB = BLOB()

    public var pszVal: PSTR = 0L

    public var pwszVal: PWSTR = 0L

    public var punkVal: Long = 0L

    public var pdispVal: Long = 0L

    public var pStream: Long = 0L

    public var pStorage: Long = 0L

    public var pVersionedStream: Long = 0L

    public var parray: Long = 0L

    public var cac: CAC = CAC()

    public var caub: CAUB = CAUB()

    public var cai: CAI = CAI()

    public var caui: CAUI = CAUI()

    public var cal: CAL = CAL()

    public var caul: CAUL = CAUL()

    public var cah: CAH = CAH()

    public var cauh: CAUH = CAUH()

    public var caflt: CAFLT = CAFLT()

    public var cadbl: CADBL = CADBL()

    public var cabool: CABOOL = CABOOL()

    public var cascode: CASCODE = CASCODE()

    public var cacy: CACY = CACY()

    public var cadate: CADATE = CADATE()

    public var cafiletime: CAFILETIME = CAFILETIME()

    public var cauuid: CACLSID = CACLSID()

    public var caclipdata: CACLIPDATA = CACLIPDATA()

    public var cabstr: CABSTR = CABSTR()

    public var cabstrblob: CABSTRBLOB = CABSTRBLOB()

    public var calpstr: CALPSTR = CALPSTR()

    public var calpwstr: CALPWSTR = CALPWSTR()

    public var capropvar: CAPROPVARIANT = CAPROPVARIANT()

    public var pcVal: PSTR = 0L

    public var pbVal: Long = 0L

    public var piVal: Long = 0L

    public var puiVal: Long = 0L

    public var plVal: Long = 0L

    public var pulVal: Long = 0L

    public var pintVal: Long = 0L

    public var puintVal: Long = 0L

    public var pfltVal: Long = 0L

    public var pdblVal: Long = 0L

    public var pboolVal: Long = 0L

    public var pdecVal: Long = 0L

    public var pscode: Long = 0L

    public var pcyVal: Long = 0L

    public var pdate: Long = 0L

    public var pbstrVal: Long = 0L

    public var ppunkVal: Long = 0L

    public var ppdispVal: Long = 0L

    public var pparray: Long = 0L

    public var pvarVal: Long = 0L
}

public data class RemSNB(
    public var ulCntStr: UInt = 0u,
    public var ulCntChar: UInt = 0u,
    public var rgString: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemSNB) return false
        if (this.ulCntStr != other.ulCntStr) return false
        if (this.ulCntChar != other.ulCntChar) return false
        if (!this.rgString.contentEquals(other.rgString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulCntStr.hashCode()
        result = 31 * result + this.ulCntChar.hashCode()
        result = 31 * result + this.rgString.contentHashCode()
        return result
    }
}

public data class SERIALIZEDPROPERTYVALUE(public var dwType: UInt = 0u, public var rgb: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SERIALIZEDPROPERTYVALUE) return false
        if (this.dwType != other.dwType) return false
        if (!this.rgb.contentEquals(other.rgb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwType.hashCode()
        result = 31 * result + this.rgb.contentHashCode()
        return result
    }
}

public data class STATPROPSETSTG(
    public var fmtid: GUID = GUID(),
    public var clsid: GUID = GUID(),
    public var grfFlags: UInt = 0u,
    public var mtime: Foundation.FILETIME = Foundation.FILETIME(),
    public var ctime: Foundation.FILETIME = Foundation.FILETIME(),
    public var atime: Foundation.FILETIME = Foundation.FILETIME(),
    public var dwOSVersion: UInt = 0u,
)

public data class STATPROPSTG(
    public var lpwstrName: PWSTR = 0L,
    public var propid: UInt = 0u,
    public var vt: Variant.VARENUM = Variant.VARENUM(),
)

public data class STGOPTIONS(
    public var usVersion: UShort = 0u,
    public var reserved: UShort = 0u,
    public var ulSectorSize: UInt = 0u,
    public var pwcsTemplateFile: PCWSTR = 0L,
)

public data class VERSIONEDSTREAM(public var guidVersion: GUID = GUID(), public var pStream: Long = 0L)
