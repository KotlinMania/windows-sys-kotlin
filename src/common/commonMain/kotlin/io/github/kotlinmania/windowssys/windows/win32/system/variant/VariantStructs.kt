package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.PSTR

public data class VARIANT(public var Anonymous: VARIANT_0 = VARIANT_0())

public data class VARIANT_0(public var Anonymous: VARIANT_0_0 = VARIANT_0_0(), public var decVal: Foundation.DECIMAL = Foundation.DECIMAL())

public data class VARIANT_0_0(
    public var vt: VARENUM = 0u,
    public var wReserved1: UShort = 0u,
    public var wReserved2: UShort = 0u,
    public var wReserved3: UShort = 0u,
    public var Anonymous: VARIANT_0_0_0 = VARIANT_0_0_0(),
)

public class VARIANT_0_0_0(
    public var llVal: Long = 0L,
    public var lVal: Int = 0,
    public var bVal: UByte = 0u,
    public var iVal: Short = 0,
    public var fltVal: Float = 0.0f,
    public var dblVal: Double = 0.0,
    public var boolVal: Foundation.VARIANT_BOOL = Foundation.VARIANT_BOOL(),
    public var __OBSOLETE__VARIANT_BOOL: Foundation.VARIANT_BOOL = Foundation.VARIANT_BOOL(),
    public var scode: Int = 0,
    public var cyVal: Com.CY = Com.CY(),
    public var date: Double = 0.0,
    public var bstrVal: BSTR = 0L,
    public var punkVal: Long = 0L,
    public var pdispVal: Long = 0L,
    public var parray: Long = 0L,
    public var pbVal: Long = 0L,
    public var piVal: Long = 0L,
    public var plVal: Long = 0L,
    public var pllVal: Long = 0L,
    public var pfltVal: Long = 0L,
    public var pdblVal: Long = 0L,
    public var pboolVal: Long = 0L,
    public var __OBSOLETE__VARIANT_PBOOL: Long = 0L,
    public var pscode: Long = 0L,
    public var pcyVal: Long = 0L,
    public var pdate: Long = 0L,
    public var pbstrVal: Long = 0L,
    public var ppunkVal: Long = 0L,
    public var ppdispVal: Long = 0L,
    public var pparray: Long = 0L,
    public var pvarVal: Long = 0L,
    public var byref: Long = 0L,
    public var cVal: Byte = 0,
    public var uiVal: UShort = 0u,
    public var ulVal: UInt = 0u,
    public var ullVal: ULong = 0uL,
    public var intVal: Int = 0,
    public var uintVal: UInt = 0u,
    public var pdecVal: Long = 0L,
    public var pcVal: PSTR = 0L,
    public var puiVal: Long = 0L,
    public var pulVal: Long = 0L,
    public var pullVal: Long = 0L,
    public var pintVal: Long = 0L,
    public var puintVal: Long = 0L,
    public var Anonymous: VARIANT_0_0_0_0 = VARIANT_0_0_0_0(),
)

public data class VARIANT_0_0_0_0(public var pvRecord: Long = 0L, public var pRecInfo: Long = 0L)
