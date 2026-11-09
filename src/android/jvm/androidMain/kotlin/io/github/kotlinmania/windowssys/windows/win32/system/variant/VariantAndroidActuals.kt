@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE

private object WindowsWin32SystemVariantJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_ClearVariantArray(pvars: Long, cvars: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_DosDateTimeToVariantTime(wdosdate: Short, wdostime: Short, pvtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_InitVariantFromBooleanArray(prgf: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_InitVariantFromBuffer(pv: Long, cb: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_InitVariantFromDoubleArray(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_InitVariantFromFileTime(pft: Long, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_InitVariantFromFileTimeArray(prgft: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_InitVariantFromGUIDAsString(guid: Long, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_InitVariantFromInt16Array(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_InitVariantFromInt32Array(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_InitVariantFromInt64Array(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_InitVariantFromResource(hinst: Long, id: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_InitVariantFromStringArray(prgsz: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_InitVariantFromUInt16Array(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_InitVariantFromUInt32Array(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_InitVariantFromUInt64Array(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_InitVariantFromVariantArrayElem(varin: Long, ielem: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_SystemTimeToVariantTime(lpsystemtime: Long, pvtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VARIANT_UserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VARIANT_UserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VARIANT_UserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VARIANT_UserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VARIANT_UserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VARIANT_UserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VARIANT_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VARIANT_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantChangeType(pvargdest: Long, pvarsrc: Long, wflags: Short, vt: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantChangeTypeEx(pvargdest: Long, pvarsrc: Long, lcid: Int, wflags: Short, vt: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantClear(pvarg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantCompare(var1: Long, var2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantCopy(pvargdest: Long, pvargsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantCopyInd(pvardest: Long, pvargsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantGetBooleanElem(variable: Long, ielem: Int, pfval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantGetDoubleElem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantGetElementCount(varin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantGetInt16Elem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantGetInt32Elem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantGetInt64Elem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantGetStringElem(variable: Long, ielem: Int, ppszval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantGetUInt16Elem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantGetUInt32Elem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantGetUInt64Elem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantInit(pvarg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantTimeToDosDateTime(vtime: Double, pwdosdate: Long, pwdostime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantTimeToSystemTime(vtime: Double, lpsystemtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToBoolean(varin: Long, pfret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToBooleanArray(variable: Long, prgf: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToBooleanArrayAlloc(variable: Long, pprgf: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToBooleanWithDefault(varin: Long, fdefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToBuffer(varin: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToDosDateTime(varin: Long, pwdate: Long, pwtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToDouble(varin: Long, pdblret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToDoubleArray(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToDoubleArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToDoubleWithDefault(varin: Long, dbldefault: Double): Double

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToFileTime(varin: Long, stfout: Int, pftout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToGUID(varin: Long, pguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToInt16(varin: Long, piret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToInt16Array(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToInt16ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToInt16WithDefault(varin: Long, idefault: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToInt32(varin: Long, plret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToInt32Array(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToInt32ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToInt32WithDefault(varin: Long, ldefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToInt64(varin: Long, pllret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToInt64Array(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToInt64ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToInt64WithDefault(varin: Long, lldefault: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToString(varin: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToStringAlloc(varin: Long, ppszbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToStringArray(variable: Long, prgsz: Long, crgsz: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToStringArrayAlloc(variable: Long, pprgsz: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToStringWithDefault(varin: Long, pszdefault: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToUInt16(varin: Long, puiret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToUInt16Array(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToUInt16ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToUInt16WithDefault(varin: Long, uidefault: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToUInt32(varin: Long, pulret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToUInt32Array(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToUInt32ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToUInt32WithDefault(varin: Long, uldefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToUInt64(varin: Long, pullret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToUInt64Array(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToUInt64ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_VariantToUInt64WithDefault(varin: Long, ulldefault: Long): Long
}

public actual fun ClearVariantArray(pvars: Long, cvars: UInt) {
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_ClearVariantArray(pvars, cvars.toInt())
}

public actual fun DosDateTimeToVariantTime(wdosdate: UShort, wdostime: UShort, pvtime: Long): Int =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_DosDateTimeToVariantTime(wdosdate.toShort(), wdostime.toShort(), pvtime)

public actual fun InitVariantFromBooleanArray(prgf: Long, celems: UInt, pvar: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_InitVariantFromBooleanArray(prgf, celems.toInt(), pvar)

public actual fun InitVariantFromBuffer(pv: Long, cb: UInt, pvar: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_InitVariantFromBuffer(pv, cb.toInt(), pvar)

public actual fun InitVariantFromDoubleArray(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_InitVariantFromDoubleArray(prgn, celems.toInt(), pvar)

public actual fun InitVariantFromFileTime(pft: Long, pvar: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_InitVariantFromFileTime(pft, pvar)

public actual fun InitVariantFromFileTimeArray(prgft: Long, celems: UInt, pvar: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_InitVariantFromFileTimeArray(prgft, celems.toInt(), pvar)

public actual fun InitVariantFromGUIDAsString(guid: Long, pvar: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_InitVariantFromGUIDAsString(guid, pvar)

public actual fun InitVariantFromInt16Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_InitVariantFromInt16Array(prgn, celems.toInt(), pvar)

public actual fun InitVariantFromInt32Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_InitVariantFromInt32Array(prgn, celems.toInt(), pvar)

public actual fun InitVariantFromInt64Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_InitVariantFromInt64Array(prgn, celems.toInt(), pvar)

public actual fun InitVariantFromResource(hinst: HINSTANCE, id: UInt, pvar: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_InitVariantFromResource(hinst, id.toInt(), pvar)

public actual fun InitVariantFromStringArray(prgsz: Long, celems: UInt, pvar: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_InitVariantFromStringArray(prgsz, celems.toInt(), pvar)

public actual fun InitVariantFromUInt16Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_InitVariantFromUInt16Array(prgn, celems.toInt(), pvar)

public actual fun InitVariantFromUInt32Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_InitVariantFromUInt32Array(prgn, celems.toInt(), pvar)

public actual fun InitVariantFromUInt64Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_InitVariantFromUInt64Array(prgn, celems.toInt(), pvar)

public actual fun InitVariantFromVariantArrayElem(varin: Long, ielem: UInt, pvar: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_InitVariantFromVariantArrayElem(varin, ielem.toInt(), pvar)

public actual fun SystemTimeToVariantTime(lpsystemtime: Long, pvtime: Long): Int =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_SystemTimeToVariantTime(lpsystemtime, pvtime)

public actual fun VARIANT_UserFree(param0: Long, param1: Long) {
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VARIANT_UserFree(param0, param1)
}

public actual fun VARIANT_UserFree64(param0: Long, param1: Long) {
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VARIANT_UserFree64(param0, param1)
}

public actual fun VARIANT_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VARIANT_UserMarshal(param0, param1, param2)

public actual fun VARIANT_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VARIANT_UserMarshal64(param0, param1, param2)

public actual fun VARIANT_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VARIANT_UserSize(param0, param1.toInt(), param2).toUInt()

public actual fun VARIANT_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VARIANT_UserSize64(param0, param1.toInt(), param2).toUInt()

public actual fun VARIANT_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VARIANT_UserUnmarshal(param0, param1, param2)

public actual fun VARIANT_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VARIANT_UserUnmarshal64(param0, param1, param2)

public actual fun VariantChangeType(pvargdest: Long, pvarsrc: Long, wflags: VAR_CHANGE_FLAGS, vt: VARENUM): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantChangeType(pvargdest, pvarsrc, wflags.toShort(), vt.toShort())

public actual fun VariantChangeTypeEx(pvargdest: Long, pvarsrc: Long, lcid: UInt, wflags: VAR_CHANGE_FLAGS, vt: VARENUM): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantChangeTypeEx(pvargdest, pvarsrc, lcid.toInt(), wflags.toShort(), vt.toShort())

public actual fun VariantClear(pvarg: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantClear(pvarg)

public actual fun VariantCompare(var1: Long, var2: Long): Int =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantCompare(var1, var2)

public actual fun VariantCopy(pvargdest: Long, pvargsrc: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantCopy(pvargdest, pvargsrc)

public actual fun VariantCopyInd(pvardest: Long, pvargsrc: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantCopyInd(pvardest, pvargsrc)

public actual fun VariantGetBooleanElem(variable: Long, ielem: UInt, pfval: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantGetBooleanElem(variable, ielem.toInt(), pfval)

public actual fun VariantGetDoubleElem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantGetDoubleElem(variable, ielem.toInt(), pnval)

public actual fun VariantGetElementCount(varin: Long): UInt =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantGetElementCount(varin).toUInt()

public actual fun VariantGetInt16Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantGetInt16Elem(variable, ielem.toInt(), pnval)

public actual fun VariantGetInt32Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantGetInt32Elem(variable, ielem.toInt(), pnval)

public actual fun VariantGetInt64Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantGetInt64Elem(variable, ielem.toInt(), pnval)

public actual fun VariantGetStringElem(variable: Long, ielem: UInt, ppszval: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantGetStringElem(variable, ielem.toInt(), ppszval)

public actual fun VariantGetUInt16Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantGetUInt16Elem(variable, ielem.toInt(), pnval)

public actual fun VariantGetUInt32Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantGetUInt32Elem(variable, ielem.toInt(), pnval)

public actual fun VariantGetUInt64Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantGetUInt64Elem(variable, ielem.toInt(), pnval)

public actual fun VariantInit(pvarg: Long) {
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantInit(pvarg)
}

public actual fun VariantTimeToDosDateTime(vtime: Double, pwdosdate: Long, pwdostime: Long): Int =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantTimeToDosDateTime(vtime, pwdosdate, pwdostime)

public actual fun VariantTimeToSystemTime(vtime: Double, lpsystemtime: Long): Int =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantTimeToSystemTime(vtime, lpsystemtime)

public actual fun VariantToBoolean(varin: Long, pfret: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToBoolean(varin, pfret)

public actual fun VariantToBooleanArray(variable: Long, prgf: Long, crgn: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToBooleanArray(variable, prgf, crgn.toInt(), pcelem)

public actual fun VariantToBooleanArrayAlloc(variable: Long, pprgf: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToBooleanArrayAlloc(variable, pprgf, pcelem)

public actual fun VariantToBooleanWithDefault(varin: Long, fdefault: BOOL): BOOL =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToBooleanWithDefault(varin, fdefault)

public actual fun VariantToBuffer(varin: Long, pv: Long, cb: UInt): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToBuffer(varin, pv, cb.toInt())

public actual fun VariantToDosDateTime(varin: Long, pwdate: Long, pwtime: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToDosDateTime(varin, pwdate, pwtime)

public actual fun VariantToDouble(varin: Long, pdblret: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToDouble(varin, pdblret)

public actual fun VariantToDoubleArray(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToDoubleArray(variable, prgn, crgn.toInt(), pcelem)

public actual fun VariantToDoubleArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToDoubleArrayAlloc(variable, pprgn, pcelem)

public actual fun VariantToDoubleWithDefault(varin: Long, dbldefault: Double): Double =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToDoubleWithDefault(varin, dbldefault)

public actual fun VariantToFileTime(varin: Long, stfout: PSTIME_FLAGS, pftout: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToFileTime(varin, stfout, pftout)

public actual fun VariantToGUID(varin: Long, pguid: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToGUID(varin, pguid)

public actual fun VariantToInt16(varin: Long, piret: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToInt16(varin, piret)

public actual fun VariantToInt16Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToInt16Array(variable, prgn, crgn.toInt(), pcelem)

public actual fun VariantToInt16ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToInt16ArrayAlloc(variable, pprgn, pcelem)

public actual fun VariantToInt16WithDefault(varin: Long, idefault: Short): Short =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToInt16WithDefault(varin, idefault)

public actual fun VariantToInt32(varin: Long, plret: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToInt32(varin, plret)

public actual fun VariantToInt32Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToInt32Array(variable, prgn, crgn.toInt(), pcelem)

public actual fun VariantToInt32ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToInt32ArrayAlloc(variable, pprgn, pcelem)

public actual fun VariantToInt32WithDefault(varin: Long, ldefault: Int): Int =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToInt32WithDefault(varin, ldefault)

public actual fun VariantToInt64(varin: Long, pllret: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToInt64(varin, pllret)

public actual fun VariantToInt64Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToInt64Array(variable, prgn, crgn.toInt(), pcelem)

public actual fun VariantToInt64ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToInt64ArrayAlloc(variable, pprgn, pcelem)

public actual fun VariantToInt64WithDefault(varin: Long, lldefault: Long): Long =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToInt64WithDefault(varin, lldefault)

public actual fun VariantToString(varin: Long, pszbuf: PWSTR, cchbuf: UInt): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToString(varin, pszbuf, cchbuf.toInt())

public actual fun VariantToStringAlloc(varin: Long, ppszbuf: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToStringAlloc(varin, ppszbuf)

public actual fun VariantToStringArray(variable: Long, prgsz: Long, crgsz: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToStringArray(variable, prgsz, crgsz.toInt(), pcelem)

public actual fun VariantToStringArrayAlloc(variable: Long, pprgsz: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToStringArrayAlloc(variable, pprgsz, pcelem)

public actual fun VariantToStringWithDefault(varin: Long, pszdefault: PCWSTR): PCWSTR =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToStringWithDefault(varin, pszdefault)

public actual fun VariantToUInt16(varin: Long, puiret: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToUInt16(varin, puiret)

public actual fun VariantToUInt16Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToUInt16Array(variable, prgn, crgn.toInt(), pcelem)

public actual fun VariantToUInt16ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToUInt16ArrayAlloc(variable, pprgn, pcelem)

public actual fun VariantToUInt16WithDefault(varin: Long, uidefault: UShort): UShort =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToUInt16WithDefault(varin, uidefault.toShort()).toUShort()

public actual fun VariantToUInt32(varin: Long, pulret: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToUInt32(varin, pulret)

public actual fun VariantToUInt32Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToUInt32Array(variable, prgn, crgn.toInt(), pcelem)

public actual fun VariantToUInt32ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToUInt32ArrayAlloc(variable, pprgn, pcelem)

public actual fun VariantToUInt32WithDefault(varin: Long, uldefault: UInt): UInt =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToUInt32WithDefault(varin, uldefault.toInt()).toUInt()

public actual fun VariantToUInt64(varin: Long, pullret: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToUInt64(varin, pullret)

public actual fun VariantToUInt64Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToUInt64Array(variable, prgn, crgn.toInt(), pcelem)

public actual fun VariantToUInt64ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToUInt64ArrayAlloc(variable, pprgn, pcelem)

public actual fun VariantToUInt64WithDefault(varin: Long, ulldefault: ULong): ULong =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_VariantToUInt64WithDefault(varin, ulldefault.toLong()).toULong()
