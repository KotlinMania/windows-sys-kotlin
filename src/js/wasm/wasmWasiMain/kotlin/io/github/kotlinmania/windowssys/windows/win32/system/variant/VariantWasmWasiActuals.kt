@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE

public actual fun ClearVariantArray(pvars: Long, cvars: UInt) {
}

public actual fun DosDateTimeToVariantTime(wdosdate: UShort, wdostime: UShort, pvtime: Long): Int =
    0

public actual fun InitVariantFromBooleanArray(prgf: Long, celems: UInt, pvar: Long): HRESULT =
    0

public actual fun InitVariantFromBuffer(pv: Long, cb: UInt, pvar: Long): HRESULT =
    0

public actual fun InitVariantFromDoubleArray(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    0

public actual fun InitVariantFromFileTime(pft: Long, pvar: Long): HRESULT =
    0

public actual fun InitVariantFromFileTimeArray(prgft: Long, celems: UInt, pvar: Long): HRESULT =
    0

public actual fun InitVariantFromGUIDAsString(guid: Long, pvar: Long): HRESULT =
    0

public actual fun InitVariantFromInt16Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    0

public actual fun InitVariantFromInt32Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    0

public actual fun InitVariantFromInt64Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    0

public actual fun InitVariantFromResource(hinst: HINSTANCE, id: UInt, pvar: Long): HRESULT =
    0

public actual fun InitVariantFromStringArray(prgsz: Long, celems: UInt, pvar: Long): HRESULT =
    0

public actual fun InitVariantFromUInt16Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    0

public actual fun InitVariantFromUInt32Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    0

public actual fun InitVariantFromUInt64Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    0

public actual fun InitVariantFromVariantArrayElem(varin: Long, ielem: UInt, pvar: Long): HRESULT =
    0

public actual fun SystemTimeToVariantTime(lpsystemtime: Long, pvtime: Long): Int =
    0

public actual fun VARIANT_UserFree(param0: Long, param1: Long) {
}

public actual fun VARIANT_UserFree64(param0: Long, param1: Long) {
}

public actual fun VARIANT_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun VARIANT_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun VARIANT_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun VARIANT_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    0u

public actual fun VARIANT_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun VARIANT_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    0L

public actual fun VariantChangeType(pvargdest: Long, pvarsrc: Long, wflags: VAR_CHANGE_FLAGS, vt: VARENUM): HRESULT =
    0

public actual fun VariantChangeTypeEx(pvargdest: Long, pvarsrc: Long, lcid: UInt, wflags: VAR_CHANGE_FLAGS, vt: VARENUM): HRESULT =
    0

public actual fun VariantClear(pvarg: Long): HRESULT =
    0

public actual fun VariantCompare(var1: Long, var2: Long): Int =
    0

public actual fun VariantCopy(pvargdest: Long, pvargsrc: Long): HRESULT =
    0

public actual fun VariantCopyInd(pvardest: Long, pvargsrc: Long): HRESULT =
    0

public actual fun VariantGetBooleanElem(variable: Long, ielem: UInt, pfval: Long): HRESULT =
    0

public actual fun VariantGetDoubleElem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    0

public actual fun VariantGetElementCount(varin: Long): UInt =
    0u

public actual fun VariantGetInt16Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    0

public actual fun VariantGetInt32Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    0

public actual fun VariantGetInt64Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    0

public actual fun VariantGetStringElem(variable: Long, ielem: UInt, ppszval: Long): HRESULT =
    0

public actual fun VariantGetUInt16Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    0

public actual fun VariantGetUInt32Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    0

public actual fun VariantGetUInt64Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    0

public actual fun VariantInit(pvarg: Long) {
}

public actual fun VariantTimeToDosDateTime(vtime: Double, pwdosdate: Long, pwdostime: Long): Int =
    0

public actual fun VariantTimeToSystemTime(vtime: Double, lpsystemtime: Long): Int =
    0

public actual fun VariantToBoolean(varin: Long, pfret: Long): HRESULT =
    0

public actual fun VariantToBooleanArray(variable: Long, prgf: Long, crgn: UInt, pcelem: Long): HRESULT =
    0

public actual fun VariantToBooleanArrayAlloc(variable: Long, pprgf: Long, pcelem: Long): HRESULT =
    0

public actual fun VariantToBooleanWithDefault(varin: Long, fdefault: BOOL): BOOL =
    0

public actual fun VariantToBuffer(varin: Long, pv: Long, cb: UInt): HRESULT =
    0

public actual fun VariantToDosDateTime(varin: Long, pwdate: Long, pwtime: Long): HRESULT =
    0

public actual fun VariantToDouble(varin: Long, pdblret: Long): HRESULT =
    0

public actual fun VariantToDoubleArray(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    0

public actual fun VariantToDoubleArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    0

public actual fun VariantToDoubleWithDefault(varin: Long, dbldefault: Double): Double =
    0.0

public actual fun VariantToFileTime(varin: Long, stfout: PSTIME_FLAGS, pftout: Long): HRESULT =
    0

public actual fun VariantToGUID(varin: Long, pguid: Long): HRESULT =
    0

public actual fun VariantToInt16(varin: Long, piret: Long): HRESULT =
    0

public actual fun VariantToInt16Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    0

public actual fun VariantToInt16ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    0

public actual fun VariantToInt16WithDefault(varin: Long, idefault: Short): Short =
    0

public actual fun VariantToInt32(varin: Long, plret: Long): HRESULT =
    0

public actual fun VariantToInt32Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    0

public actual fun VariantToInt32ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    0

public actual fun VariantToInt32WithDefault(varin: Long, ldefault: Int): Int =
    0

public actual fun VariantToInt64(varin: Long, pllret: Long): HRESULT =
    0

public actual fun VariantToInt64Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    0

public actual fun VariantToInt64ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    0

public actual fun VariantToInt64WithDefault(varin: Long, lldefault: Long): Long =
    0L

public actual fun VariantToString(varin: Long, pszbuf: PWSTR, cchbuf: UInt): HRESULT =
    0

public actual fun VariantToStringAlloc(varin: Long, ppszbuf: Long): HRESULT =
    0

public actual fun VariantToStringArray(variable: Long, prgsz: Long, crgsz: UInt, pcelem: Long): HRESULT =
    0

public actual fun VariantToStringArrayAlloc(variable: Long, pprgsz: Long, pcelem: Long): HRESULT =
    0

public actual fun VariantToStringWithDefault(varin: Long, pszdefault: PCWSTR): PCWSTR =
    0L

public actual fun VariantToUInt16(varin: Long, puiret: Long): HRESULT =
    0

public actual fun VariantToUInt16Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    0

public actual fun VariantToUInt16ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    0

public actual fun VariantToUInt16WithDefault(varin: Long, uidefault: UShort): UShort =
    0u

public actual fun VariantToUInt32(varin: Long, pulret: Long): HRESULT =
    0

public actual fun VariantToUInt32Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    0

public actual fun VariantToUInt32ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    0

public actual fun VariantToUInt32WithDefault(varin: Long, uldefault: UInt): UInt =
    0u

public actual fun VariantToUInt64(varin: Long, pullret: Long): HRESULT =
    0

public actual fun VariantToUInt64Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    0

public actual fun VariantToUInt64ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    0

public actual fun VariantToUInt64WithDefault(varin: Long, ulldefault: ULong): ULong =
    0uL
