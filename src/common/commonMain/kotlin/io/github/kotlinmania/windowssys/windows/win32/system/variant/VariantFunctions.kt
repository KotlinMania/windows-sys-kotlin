package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE

public expect fun ClearVariantArray(pvars: Long, cvars: UInt)

public expect fun DosDateTimeToVariantTime(wdosdate: UShort, wdostime: UShort, pvtime: Long): Int

public expect fun InitVariantFromBooleanArray(prgf: Long, celems: UInt, pvar: Long): HRESULT

public expect fun InitVariantFromBuffer(pv: Long, cb: UInt, pvar: Long): HRESULT

public expect fun InitVariantFromDoubleArray(prgn: Long, celems: UInt, pvar: Long): HRESULT

public expect fun InitVariantFromFileTime(pft: Long, pvar: Long): HRESULT

public expect fun InitVariantFromFileTimeArray(prgft: Long, celems: UInt, pvar: Long): HRESULT

public expect fun InitVariantFromGUIDAsString(guid: Long, pvar: Long): HRESULT

public expect fun InitVariantFromInt16Array(prgn: Long, celems: UInt, pvar: Long): HRESULT

public expect fun InitVariantFromInt32Array(prgn: Long, celems: UInt, pvar: Long): HRESULT

public expect fun InitVariantFromInt64Array(prgn: Long, celems: UInt, pvar: Long): HRESULT

public expect fun InitVariantFromResource(hinst: HINSTANCE, id: UInt, pvar: Long): HRESULT

public expect fun InitVariantFromStringArray(prgsz: Long, celems: UInt, pvar: Long): HRESULT

public expect fun InitVariantFromUInt16Array(prgn: Long, celems: UInt, pvar: Long): HRESULT

public expect fun InitVariantFromUInt32Array(prgn: Long, celems: UInt, pvar: Long): HRESULT

public expect fun InitVariantFromUInt64Array(prgn: Long, celems: UInt, pvar: Long): HRESULT

public expect fun InitVariantFromVariantArrayElem(varin: Long, ielem: UInt, pvar: Long): HRESULT

public expect fun SystemTimeToVariantTime(lpsystemtime: Long, pvtime: Long): Int

public expect fun VARIANT_UserFree(param0: Long, param1: Long)

public expect fun VARIANT_UserFree64(param0: Long, param1: Long)

public expect fun VARIANT_UserMarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun VARIANT_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun VARIANT_UserSize(param0: Long, param1: UInt, param2: Long): UInt

public expect fun VARIANT_UserSize64(param0: Long, param1: UInt, param2: Long): UInt

public expect fun VARIANT_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

public expect fun VARIANT_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

public expect fun VariantChangeType(pvargdest: Long, pvarsrc: Long, wflags: VAR_CHANGE_FLAGS, vt: VARENUM): HRESULT

public expect fun VariantChangeTypeEx(pvargdest: Long, pvarsrc: Long, lcid: UInt, wflags: VAR_CHANGE_FLAGS, vt: VARENUM): HRESULT

public expect fun VariantClear(pvarg: Long): HRESULT

public expect fun VariantCompare(var1: Long, var2: Long): Int

public expect fun VariantCopy(pvargdest: Long, pvargsrc: Long): HRESULT

public expect fun VariantCopyInd(pvardest: Long, pvargsrc: Long): HRESULT

public expect fun VariantGetBooleanElem(variable: Long, ielem: UInt, pfval: Long): HRESULT

public expect fun VariantGetDoubleElem(variable: Long, ielem: UInt, pnval: Long): HRESULT

public expect fun VariantGetElementCount(varin: Long): UInt

public expect fun VariantGetInt16Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT

public expect fun VariantGetInt32Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT

public expect fun VariantGetInt64Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT

public expect fun VariantGetStringElem(variable: Long, ielem: UInt, ppszval: Long): HRESULT

public expect fun VariantGetUInt16Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT

public expect fun VariantGetUInt32Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT

public expect fun VariantGetUInt64Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT

public expect fun VariantInit(pvarg: Long)

public expect fun VariantTimeToDosDateTime(vtime: Double, pwdosdate: Long, pwdostime: Long): Int

public expect fun VariantTimeToSystemTime(vtime: Double, lpsystemtime: Long): Int

public expect fun VariantToBoolean(varin: Long, pfret: Long): HRESULT

public expect fun VariantToBooleanArray(variable: Long, prgf: Long, crgn: UInt, pcelem: Long): HRESULT

public expect fun VariantToBooleanArrayAlloc(variable: Long, pprgf: Long, pcelem: Long): HRESULT

public expect fun VariantToBooleanWithDefault(varin: Long, fdefault: BOOL): BOOL

public expect fun VariantToBuffer(varin: Long, pv: Long, cb: UInt): HRESULT

public expect fun VariantToDosDateTime(varin: Long, pwdate: Long, pwtime: Long): HRESULT

public expect fun VariantToDouble(varin: Long, pdblret: Long): HRESULT

public expect fun VariantToDoubleArray(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT

public expect fun VariantToDoubleArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT

public expect fun VariantToDoubleWithDefault(varin: Long, dbldefault: Double): Double

public expect fun VariantToFileTime(varin: Long, stfout: PSTIME_FLAGS, pftout: Long): HRESULT

public expect fun VariantToGUID(varin: Long, pguid: Long): HRESULT

public expect fun VariantToInt16(varin: Long, piret: Long): HRESULT

public expect fun VariantToInt16Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT

public expect fun VariantToInt16ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT

public expect fun VariantToInt16WithDefault(varin: Long, idefault: Short): Short

public expect fun VariantToInt32(varin: Long, plret: Long): HRESULT

public expect fun VariantToInt32Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT

public expect fun VariantToInt32ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT

public expect fun VariantToInt32WithDefault(varin: Long, ldefault: Int): Int

public expect fun VariantToInt64(varin: Long, pllret: Long): HRESULT

public expect fun VariantToInt64Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT

public expect fun VariantToInt64ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT

public expect fun VariantToInt64WithDefault(varin: Long, lldefault: Long): Long

public expect fun VariantToString(varin: Long, pszbuf: PWSTR, cchbuf: UInt): HRESULT

public expect fun VariantToStringAlloc(varin: Long, ppszbuf: Long): HRESULT

public expect fun VariantToStringArray(variable: Long, prgsz: Long, crgsz: UInt, pcelem: Long): HRESULT

public expect fun VariantToStringArrayAlloc(variable: Long, pprgsz: Long, pcelem: Long): HRESULT

public expect fun VariantToStringWithDefault(varin: Long, pszdefault: PCWSTR): PCWSTR

public expect fun VariantToUInt16(varin: Long, puiret: Long): HRESULT

public expect fun VariantToUInt16Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT

public expect fun VariantToUInt16ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT

public expect fun VariantToUInt16WithDefault(varin: Long, uidefault: UShort): UShort

public expect fun VariantToUInt32(varin: Long, pulret: Long): HRESULT

public expect fun VariantToUInt32Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT

public expect fun VariantToUInt32ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT

public expect fun VariantToUInt32WithDefault(varin: Long, uldefault: UInt): UInt

public expect fun VariantToUInt64(varin: Long, pullret: Long): HRESULT

public expect fun VariantToUInt64Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT

public expect fun VariantToUInt64ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT

public expect fun VariantToUInt64WithDefault(varin: Long, ulldefault: ULong): ULong
