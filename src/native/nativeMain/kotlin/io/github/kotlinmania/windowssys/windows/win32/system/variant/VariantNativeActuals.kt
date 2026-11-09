@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ClearVariantArray(pvars: Long, cvars: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_ClearVariantArray(pvars.toCPointer<ByteVar>(), cvars)
}

public actual fun DosDateTimeToVariantTime(wdosdate: UShort, wdostime: UShort, pvtime: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_DosDateTimeToVariantTime(wdosdate, wdostime, pvtime.toCPointer<ByteVar>())

public actual fun InitVariantFromBooleanArray(prgf: Long, celems: UInt, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_InitVariantFromBooleanArray(prgf.toCPointer<ByteVar>(), celems, pvar.toCPointer<ByteVar>())

public actual fun InitVariantFromBuffer(pv: Long, cb: UInt, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_InitVariantFromBuffer(pv.toCPointer<ByteVar>(), cb, pvar.toCPointer<ByteVar>())

public actual fun InitVariantFromDoubleArray(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_InitVariantFromDoubleArray(prgn.toCPointer<ByteVar>(), celems, pvar.toCPointer<ByteVar>())

public actual fun InitVariantFromFileTime(pft: Long, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_InitVariantFromFileTime(pft.toCPointer<ByteVar>(), pvar.toCPointer<ByteVar>())

public actual fun InitVariantFromFileTimeArray(prgft: Long, celems: UInt, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_InitVariantFromFileTimeArray(prgft.toCPointer<ByteVar>(), celems, pvar.toCPointer<ByteVar>())

public actual fun InitVariantFromGUIDAsString(guid: Long, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_InitVariantFromGUIDAsString(guid.toCPointer<ByteVar>(), pvar.toCPointer<ByteVar>())

public actual fun InitVariantFromInt16Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_InitVariantFromInt16Array(prgn.toCPointer<ByteVar>(), celems, pvar.toCPointer<ByteVar>())

public actual fun InitVariantFromInt32Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_InitVariantFromInt32Array(prgn.toCPointer<ByteVar>(), celems, pvar.toCPointer<ByteVar>())

public actual fun InitVariantFromInt64Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_InitVariantFromInt64Array(prgn.toCPointer<ByteVar>(), celems, pvar.toCPointer<ByteVar>())

public actual fun InitVariantFromResource(hinst: HINSTANCE, id: UInt, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_InitVariantFromResource(hinst.toCPointer<ByteVar>(), id, pvar.toCPointer<ByteVar>())

public actual fun InitVariantFromStringArray(prgsz: Long, celems: UInt, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_InitVariantFromStringArray(prgsz.toCPointer<ByteVar>(), celems, pvar.toCPointer<ByteVar>())

public actual fun InitVariantFromUInt16Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_InitVariantFromUInt16Array(prgn.toCPointer<ByteVar>(), celems, pvar.toCPointer<ByteVar>())

public actual fun InitVariantFromUInt32Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_InitVariantFromUInt32Array(prgn.toCPointer<ByteVar>(), celems, pvar.toCPointer<ByteVar>())

public actual fun InitVariantFromUInt64Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_InitVariantFromUInt64Array(prgn.toCPointer<ByteVar>(), celems, pvar.toCPointer<ByteVar>())

public actual fun InitVariantFromVariantArrayElem(varin: Long, ielem: UInt, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_InitVariantFromVariantArrayElem(varin.toCPointer<ByteVar>(), ielem, pvar.toCPointer<ByteVar>())

public actual fun SystemTimeToVariantTime(lpsystemtime: Long, pvtime: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_SystemTimeToVariantTime(lpsystemtime.toCPointer<ByteVar>(), pvtime.toCPointer<ByteVar>())

public actual fun VARIANT_UserFree(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VARIANT_UserFree(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun VARIANT_UserFree64(param0: Long, param1: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VARIANT_UserFree64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())
}

public actual fun VARIANT_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VARIANT_UserMarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun VARIANT_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VARIANT_UserMarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun VARIANT_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VARIANT_UserSize(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun VARIANT_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VARIANT_UserSize64(param0.toCPointer<ByteVar>(), param1, param2.toCPointer<ByteVar>())

public actual fun VARIANT_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VARIANT_UserUnmarshal(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun VARIANT_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VARIANT_UserUnmarshal64(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun VariantChangeType(pvargdest: Long, pvarsrc: Long, wflags: VAR_CHANGE_FLAGS, vt: VARENUM): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantChangeType(pvargdest.toCPointer<ByteVar>(), pvarsrc.toCPointer<ByteVar>(), wflags, vt)

public actual fun VariantChangeTypeEx(pvargdest: Long, pvarsrc: Long, lcid: UInt, wflags: VAR_CHANGE_FLAGS, vt: VARENUM): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantChangeTypeEx(pvargdest.toCPointer<ByteVar>(), pvarsrc.toCPointer<ByteVar>(), lcid, wflags, vt)

public actual fun VariantClear(pvarg: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantClear(pvarg.toCPointer<ByteVar>())

public actual fun VariantCompare(var1: Long, var2: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantCompare(var1.toCPointer<ByteVar>(), var2.toCPointer<ByteVar>())

public actual fun VariantCopy(pvargdest: Long, pvargsrc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantCopy(pvargdest.toCPointer<ByteVar>(), pvargsrc.toCPointer<ByteVar>())

public actual fun VariantCopyInd(pvardest: Long, pvargsrc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantCopyInd(pvardest.toCPointer<ByteVar>(), pvargsrc.toCPointer<ByteVar>())

public actual fun VariantGetBooleanElem(variable: Long, ielem: UInt, pfval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantGetBooleanElem(variable.toCPointer<ByteVar>(), ielem, pfval.toCPointer<ByteVar>())

public actual fun VariantGetDoubleElem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantGetDoubleElem(variable.toCPointer<ByteVar>(), ielem, pnval.toCPointer<ByteVar>())

public actual fun VariantGetElementCount(varin: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantGetElementCount(varin.toCPointer<ByteVar>())

public actual fun VariantGetInt16Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantGetInt16Elem(variable.toCPointer<ByteVar>(), ielem, pnval.toCPointer<ByteVar>())

public actual fun VariantGetInt32Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantGetInt32Elem(variable.toCPointer<ByteVar>(), ielem, pnval.toCPointer<ByteVar>())

public actual fun VariantGetInt64Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantGetInt64Elem(variable.toCPointer<ByteVar>(), ielem, pnval.toCPointer<ByteVar>())

public actual fun VariantGetStringElem(variable: Long, ielem: UInt, ppszval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantGetStringElem(variable.toCPointer<ByteVar>(), ielem, ppszval.toCPointer<ByteVar>())

public actual fun VariantGetUInt16Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantGetUInt16Elem(variable.toCPointer<ByteVar>(), ielem, pnval.toCPointer<ByteVar>())

public actual fun VariantGetUInt32Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantGetUInt32Elem(variable.toCPointer<ByteVar>(), ielem, pnval.toCPointer<ByteVar>())

public actual fun VariantGetUInt64Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantGetUInt64Elem(variable.toCPointer<ByteVar>(), ielem, pnval.toCPointer<ByteVar>())

public actual fun VariantInit(pvarg: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantInit(pvarg.toCPointer<ByteVar>())
}

public actual fun VariantTimeToDosDateTime(vtime: Double, pwdosdate: Long, pwdostime: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantTimeToDosDateTime(vtime, pwdosdate.toCPointer<ByteVar>(), pwdostime.toCPointer<ByteVar>())

public actual fun VariantTimeToSystemTime(vtime: Double, lpsystemtime: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantTimeToSystemTime(vtime, lpsystemtime.toCPointer<ByteVar>())

public actual fun VariantToBoolean(varin: Long, pfret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToBoolean(varin.toCPointer<ByteVar>(), pfret.toCPointer<ByteVar>())

public actual fun VariantToBooleanArray(variable: Long, prgf: Long, crgn: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToBooleanArray(variable.toCPointer<ByteVar>(), prgf.toCPointer<ByteVar>(), crgn, pcelem.toCPointer<ByteVar>())

public actual fun VariantToBooleanArrayAlloc(variable: Long, pprgf: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToBooleanArrayAlloc(variable.toCPointer<ByteVar>(), pprgf.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun VariantToBooleanWithDefault(varin: Long, fdefault: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToBooleanWithDefault(varin.toCPointer<ByteVar>(), fdefault)

public actual fun VariantToBuffer(varin: Long, pv: Long, cb: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToBuffer(varin.toCPointer<ByteVar>(), pv.toCPointer<ByteVar>(), cb)

public actual fun VariantToDosDateTime(varin: Long, pwdate: Long, pwtime: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToDosDateTime(varin.toCPointer<ByteVar>(), pwdate.toCPointer<ByteVar>(), pwtime.toCPointer<ByteVar>())

public actual fun VariantToDouble(varin: Long, pdblret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToDouble(varin.toCPointer<ByteVar>(), pdblret.toCPointer<ByteVar>())

public actual fun VariantToDoubleArray(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToDoubleArray(variable.toCPointer<ByteVar>(), prgn.toCPointer<ByteVar>(), crgn, pcelem.toCPointer<ByteVar>())

public actual fun VariantToDoubleArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToDoubleArrayAlloc(variable.toCPointer<ByteVar>(), pprgn.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun VariantToDoubleWithDefault(varin: Long, dbldefault: Double): Double =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToDoubleWithDefault(varin.toCPointer<ByteVar>(), dbldefault)

public actual fun VariantToFileTime(varin: Long, stfout: PSTIME_FLAGS, pftout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToFileTime(varin.toCPointer<ByteVar>(), stfout, pftout.toCPointer<ByteVar>())

public actual fun VariantToGUID(varin: Long, pguid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToGUID(varin.toCPointer<ByteVar>(), pguid.toCPointer<ByteVar>())

public actual fun VariantToInt16(varin: Long, piret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToInt16(varin.toCPointer<ByteVar>(), piret.toCPointer<ByteVar>())

public actual fun VariantToInt16Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToInt16Array(variable.toCPointer<ByteVar>(), prgn.toCPointer<ByteVar>(), crgn, pcelem.toCPointer<ByteVar>())

public actual fun VariantToInt16ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToInt16ArrayAlloc(variable.toCPointer<ByteVar>(), pprgn.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun VariantToInt16WithDefault(varin: Long, idefault: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToInt16WithDefault(varin.toCPointer<ByteVar>(), idefault)

public actual fun VariantToInt32(varin: Long, plret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToInt32(varin.toCPointer<ByteVar>(), plret.toCPointer<ByteVar>())

public actual fun VariantToInt32Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToInt32Array(variable.toCPointer<ByteVar>(), prgn.toCPointer<ByteVar>(), crgn, pcelem.toCPointer<ByteVar>())

public actual fun VariantToInt32ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToInt32ArrayAlloc(variable.toCPointer<ByteVar>(), pprgn.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun VariantToInt32WithDefault(varin: Long, ldefault: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToInt32WithDefault(varin.toCPointer<ByteVar>(), ldefault)

public actual fun VariantToInt64(varin: Long, pllret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToInt64(varin.toCPointer<ByteVar>(), pllret.toCPointer<ByteVar>())

public actual fun VariantToInt64Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToInt64Array(variable.toCPointer<ByteVar>(), prgn.toCPointer<ByteVar>(), crgn, pcelem.toCPointer<ByteVar>())

public actual fun VariantToInt64ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToInt64ArrayAlloc(variable.toCPointer<ByteVar>(), pprgn.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun VariantToInt64WithDefault(varin: Long, lldefault: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToInt64WithDefault(varin.toCPointer<ByteVar>(), lldefault)

public actual fun VariantToString(varin: Long, pszbuf: PWSTR, cchbuf: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToString(varin.toCPointer<ByteVar>(), pszbuf.toCPointer<ByteVar>(), cchbuf)

public actual fun VariantToStringAlloc(varin: Long, ppszbuf: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToStringAlloc(varin.toCPointer<ByteVar>(), ppszbuf.toCPointer<ByteVar>())

public actual fun VariantToStringArray(variable: Long, prgsz: Long, crgsz: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToStringArray(variable.toCPointer<ByteVar>(), prgsz.toCPointer<ByteVar>(), crgsz, pcelem.toCPointer<ByteVar>())

public actual fun VariantToStringArrayAlloc(variable: Long, pprgsz: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToStringArrayAlloc(variable.toCPointer<ByteVar>(), pprgsz.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun VariantToStringWithDefault(varin: Long, pszdefault: PCWSTR): PCWSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToStringWithDefault(varin.toCPointer<ByteVar>(), pszdefault.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun VariantToUInt16(varin: Long, puiret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToUInt16(varin.toCPointer<ByteVar>(), puiret.toCPointer<ByteVar>())

public actual fun VariantToUInt16Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToUInt16Array(variable.toCPointer<ByteVar>(), prgn.toCPointer<ByteVar>(), crgn, pcelem.toCPointer<ByteVar>())

public actual fun VariantToUInt16ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToUInt16ArrayAlloc(variable.toCPointer<ByteVar>(), pprgn.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun VariantToUInt16WithDefault(varin: Long, uidefault: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToUInt16WithDefault(varin.toCPointer<ByteVar>(), uidefault)

public actual fun VariantToUInt32(varin: Long, pulret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToUInt32(varin.toCPointer<ByteVar>(), pulret.toCPointer<ByteVar>())

public actual fun VariantToUInt32Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToUInt32Array(variable.toCPointer<ByteVar>(), prgn.toCPointer<ByteVar>(), crgn, pcelem.toCPointer<ByteVar>())

public actual fun VariantToUInt32ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToUInt32ArrayAlloc(variable.toCPointer<ByteVar>(), pprgn.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun VariantToUInt32WithDefault(varin: Long, uldefault: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToUInt32WithDefault(varin.toCPointer<ByteVar>(), uldefault)

public actual fun VariantToUInt64(varin: Long, pullret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToUInt64(varin.toCPointer<ByteVar>(), pullret.toCPointer<ByteVar>())

public actual fun VariantToUInt64Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToUInt64Array(variable.toCPointer<ByteVar>(), prgn.toCPointer<ByteVar>(), crgn, pcelem.toCPointer<ByteVar>())

public actual fun VariantToUInt64ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToUInt64ArrayAlloc(variable.toCPointer<ByteVar>(), pprgn.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun VariantToUInt64WithDefault(varin: Long, ulldefault: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_VariantToUInt64WithDefault(varin.toCPointer<ByteVar>(), ulldefault)
