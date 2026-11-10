package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Decimal
import io.github.kotlinmania.windowssys.windows.win32.foundation.VariantBool
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY
import io.github.kotlinmania.windowssys.windows.win32.system.com.Safearray

public data class Variant(public var anonymous: Variant0 = Variant0())

public data class Variant0(public var anonymous: Variant00 = Variant00(), public var decVal: Decimal = Decimal())

public data class Variant00(
    public var vt: Varenum = 0u,
    public var wReserved1: UShort = 0u,
    public var wReserved2: UShort = 0u,
    public var wReserved3: UShort = 0u,
    public var anonymous: Variant000 = Variant000(),
)

public class Variant000(
    public var llVal: Long = 0L,
    public var lVal: Int = 0,
    public var bVal: UByte = 0u,
    public var iVal: Short = 0,
    public var fltVal: Float = 0.0f,
    public var dblVal: Double = 0.0,
    public var boolVal: VariantBool = 0,
    public var obsoleteVariantBool: VariantBool = 0,
    public var scode: Int = 0,
    public var cyVal: CY = CY(),
    public var date: Double = 0.0,
    public var bstrVal: Bstr = null,
    public var punkVal: COpaquePointer? = null,
    public var pdispVal: COpaquePointer? = null,
    public var parray: Safearray? = null,
    public var pbVal: COpaquePointer? = null,
    public var piVal: Short? = null,
    public var plVal: Int? = null,
    public var pllVal: Long? = null,
    public var pfltVal: Float? = null,
    public var pdblVal: Double? = null,
    public var pboolVal: VariantBool? = null,
    public var obsoleteVariantPbool: VariantBool? = null,
    public var pscode: Int? = null,
    public var pcyVal: CY? = null,
    public var pdate: Double? = null,
    public var pbstrVal: Bstr? = null,
    public var ppunkVal: COpaquePointer? = null,
    public var ppdispVal: COpaquePointer? = null,
    public var pparray: COpaquePointer? = null,
    public var pvarVal: Variant? = null,
    public var byref: COpaquePointer? = null,
    public var cVal: Byte = 0,
    public var uiVal: UShort = 0u,
    public var ulVal: UInt = 0u,
    public var ullVal: ULong = 0uL,
    public var intVal: Int = 0,
    public var uintVal: UInt = 0u,
    public var pdecVal: Decimal? = null,
    public var pcVal: Pstr = null,
    public var puiVal: UShort? = null,
    public var pulVal: UInt? = null,
    public var pullVal: ULong? = null,
    public var pintVal: Int? = null,
    public var puintVal: UInt? = null,
    public var anonymous: Variant0000 = Variant0000(),
)

public data class Variant0000(public var pvRecord: COpaquePointer? = null, public var pRecInfo: COpaquePointer? = null)
