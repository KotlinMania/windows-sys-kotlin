@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Decimal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.VariantBool
import io.github.kotlinmania.windowssys.windows.win32.system.com.Blob
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY
import io.github.kotlinmania.windowssys.windows.win32.system.com.Safearray
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Varenum

public data class Bstrblob(
    public var cbSize: UInt = 0u,
    public var pData: COpaquePointer? = null,
)

public data class Cabool(
    public var cElems: UInt = 0u,
    public var pElems: VariantBool? = null,
)

public data class Cabstr(
    public var cElems: UInt = 0u,
    public var pElems: Bstr? = null,
)

public data class Cabstrblob(
    public var cElems: UInt = 0u,
    public var pElems: Bstrblob? = null,
)

public data class Cac(
    public var cElems: UInt = 0u,
    public var pElems: Pstr = null,
)

public data class Caclipdata(
    public var cElems: UInt = 0u,
    public var pElems: Clipdata? = null,
)

public data class Caclsid(
    public var cElems: UInt = 0u,
    public var pElems: Guid? = null,
)

public data class Cacy(
    public var cElems: UInt = 0u,
    public var pElems: CY? = null,
)

public data class Cadate(
    public var cElems: UInt = 0u,
    public var pElems: Double? = null,
)

public data class Cadbl(
    public var cElems: UInt = 0u,
    public var pElems: Double? = null,
)

public data class Cafiletime(
    public var cElems: UInt = 0u,
    public var pElems: Filetime? = null,
)

public data class Caflt(
    public var cElems: UInt = 0u,
    public var pElems: Float? = null,
)

public data class Cah(
    public var cElems: UInt = 0u,
    public var pElems: Long? = null,
)

public data class Cai(
    public var cElems: UInt = 0u,
    public var pElems: Short? = null,
)

public data class Cal(
    public var cElems: UInt = 0u,
    public var pElems: Int? = null,
)

public data class Calpstr(
    public var cElems: UInt = 0u,
    public var pElems: Pstr? = null,
)

public data class Calpwstr(
    public var cElems: UInt = 0u,
    public var pElems: Pwstr? = null,
)

public data class Capropvariant(
    public var cElems: UInt = 0u,
    public var pElems: Propvariant? = null,
)

public data class Cascode(
    public var cElems: UInt = 0u,
    public var pElems: Int? = null,
)

public data class Caub(
    public var cElems: UInt = 0u,
    public var pElems: COpaquePointer? = null,
)

public data class Cauh(
    public var cElems: UInt = 0u,
    public var pElems: ULong? = null,
)

public data class Caui(
    public var cElems: UInt = 0u,
    public var pElems: UShort? = null,
)

public data class Caul(
    public var cElems: UInt = 0u,
    public var pElems: UInt? = null,
)

public data class Clipdata(
    public var cbSize: UInt = 0u,
    public var ulClipFmt: Int = 0,
    public var pClipData: COpaquePointer? = null,
)

public data class Olestream(
    public var lpstbl: Olestreamvtbl? = null,
)

public data class Olestreamvtbl(
    public var get: Int = 0,
    public var put: Int = 0,
)

public data class Propbag2(
    public var dwType: UInt = 0u,
    public var vt: Varenum = 0u,
    public var cfType: UShort = 0u,
    public var dwHint: UInt = 0u,
    public var pstrName: Pwstr = null,
    public var clsid: Guid = Guid(),
)

public data class Propspec(
    public var ulKind: PropspecKind = 0u,
    public var anonymous: Propspec0 = Propspec0(),
)

public data class Propspec0(
    public var propid: UInt = 0u,
    public var lpwstr: Pwstr = null,
)

public data class Propvariant(
    public var anonymous: Propvariant0 = Propvariant0(),
)

public data class Propvariant0(
    public var anonymous: Propvariant00 = Propvariant00(),
    public var decVal: Decimal = Decimal(),
)

public data class Propvariant00(
    public var vt: Varenum = 0u,
    public var wReserved1: UShort = 0u,
    public var wReserved2: UShort = 0u,
    public var wReserved3: UShort = 0u,
    public var anonymous: Propvariant000 = Propvariant000(),
)

public class Propvariant000 {
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

    public var boolVal: VariantBool = 0

    public var obsoleteVariantBool: VariantBool = 0

    public var scode: Int = 0

    public var cyVal: CY = CY()

    public var date: Double = 0.0

    public var filetime: Filetime = Filetime()

    public var puuid: Guid? = null

    public var pclipdata: Clipdata? = null

    public var bstrVal: Bstr = null

    public var bstrblobVal: Bstrblob = Bstrblob()

    public var blob: Blob = Blob()

    public var pszVal: Pstr = null

    public var pwszVal: Pwstr = null

    public var punkVal: COpaquePointer? = null

    public var pdispVal: COpaquePointer? = null

    public var pStream: COpaquePointer? = null

    public var pStorage: COpaquePointer? = null

    public var pVersionedStream: Versionedstream? = null

    public var parray: Safearray? = null

    public var cac: Cac = Cac()

    public var caub: Caub = Caub()

    public var cai: Cai = Cai()

    public var caui: Caui = Caui()

    public var cal: Cal = Cal()

    public var caul: Caul = Caul()

    public var cah: Cah = Cah()

    public var cauh: Cauh = Cauh()

    public var caflt: Caflt = Caflt()

    public var cadbl: Cadbl = Cadbl()

    public var cabool: Cabool = Cabool()

    public var cascode: Cascode = Cascode()

    public var cacy: Cacy = Cacy()

    public var cadate: Cadate = Cadate()

    public var cafiletime: Cafiletime = Cafiletime()

    public var cauuid: Caclsid = Caclsid()

    public var caclipdata: Caclipdata = Caclipdata()

    public var cabstr: Cabstr = Cabstr()

    public var cabstrblob: Cabstrblob = Cabstrblob()

    public var calpstr: Calpstr = Calpstr()

    public var calpwstr: Calpwstr = Calpwstr()

    public var capropvar: Capropvariant = Capropvariant()

    public var pcVal: Pstr = null

    public var pbVal: COpaquePointer? = null

    public var piVal: Short? = null

    public var puiVal: UShort? = null

    public var plVal: Int? = null

    public var pulVal: UInt? = null

    public var pintVal: Int? = null

    public var puintVal: UInt? = null

    public var pfltVal: Float? = null

    public var pdblVal: Double? = null

    public var pboolVal: VariantBool? = null

    public var pdecVal: Decimal? = null

    public var pscode: Int? = null

    public var pcyVal: CY? = null

    public var pdate: Double? = null

    public var pbstrVal: Bstr? = null

    public var ppunkVal: COpaquePointer? = null

    public var ppdispVal: COpaquePointer? = null

    public var pparray: COpaquePointer? = null

    public var pvarVal: Propvariant? = null
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

public data class Serializedpropertyvalue(
    public var dwType: UInt = 0u,
    public var rgb: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Serializedpropertyvalue) return false
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

public data class Statpropsetstg(
    public var fmtid: Guid = Guid(),
    public var clsid: Guid = Guid(),
    public var grfFlags: UInt = 0u,
    public var mtime: Filetime = Filetime(),
    public var ctime: Filetime = Filetime(),
    public var atime: Filetime = Filetime(),
    public var dwOSVersion: UInt = 0u,
)

public data class Statpropstg(
    public var lpwstrName: Pwstr = null,
    public var propid: UInt = 0u,
    public var vt: Varenum = 0u,
)

public data class Stgoptions(
    public var usVersion: UShort = 0u,
    public var reserved: UShort = 0u,
    public var ulSectorSize: UInt = 0u,
    public var pwcsTemplateFile: Pcwstr = null,
)

public data class Versionedstream(
    public var guidVersion: Guid = Guid(),
    public var pStream: COpaquePointer? = null,
)
