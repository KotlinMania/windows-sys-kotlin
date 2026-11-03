package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun ClearVariantArray(pvars: Long, cvars: UInt) {
    Win32DynamicFfi.invoke("propsys.dll", "ClearVariantArray", longArrayOf(pvars, cvars.toLong()))
}

public fun DosDateTimeToVariantTime(wdosdate: UShort, wdostime: UShort, pvtime: Long): Int {
    return Win32DynamicFfi.invoke("oleaut32.dll", "DosDateTimeToVariantTime", longArrayOf(wdosdate.toLong(), wdostime.toLong(), pvtime)).toInt()
}

public fun InitVariantFromBooleanArray(prgf: Long, celems: UInt, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitVariantFromBooleanArray", longArrayOf(prgf, celems.toLong(), pvar)).toInt()
}

public fun InitVariantFromBuffer(pv: Long, cb: UInt, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitVariantFromBuffer", longArrayOf(pv, cb.toLong(), pvar)).toInt()
}

public fun InitVariantFromDoubleArray(prgn: Long, celems: UInt, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitVariantFromDoubleArray", longArrayOf(prgn, celems.toLong(), pvar)).toInt()
}

public fun InitVariantFromFileTime(pft: Long, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitVariantFromFileTime", longArrayOf(pft, pvar)).toInt()
}

public fun InitVariantFromFileTimeArray(prgft: Long, celems: UInt, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitVariantFromFileTimeArray", longArrayOf(prgft, celems.toLong(), pvar)).toInt()
}

public fun InitVariantFromGUIDAsString(guid: Long, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitVariantFromGUIDAsString", longArrayOf(guid, pvar)).toInt()
}

public fun InitVariantFromInt16Array(prgn: Long, celems: UInt, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitVariantFromInt16Array", longArrayOf(prgn, celems.toLong(), pvar)).toInt()
}

public fun InitVariantFromInt32Array(prgn: Long, celems: UInt, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitVariantFromInt32Array", longArrayOf(prgn, celems.toLong(), pvar)).toInt()
}

public fun InitVariantFromInt64Array(prgn: Long, celems: UInt, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitVariantFromInt64Array", longArrayOf(prgn, celems.toLong(), pvar)).toInt()
}

public fun InitVariantFromResource(hinst: Foundation.HINSTANCE, id: UInt, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitVariantFromResource", longArrayOf(Win32DynamicFfi.objectSlot(hinst), id.toLong(), pvar)).toInt()
}

public fun InitVariantFromStringArray(prgsz: Long, celems: UInt, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitVariantFromStringArray", longArrayOf(prgsz, celems.toLong(), pvar)).toInt()
}

public fun InitVariantFromUInt16Array(prgn: Long, celems: UInt, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitVariantFromUInt16Array", longArrayOf(prgn, celems.toLong(), pvar)).toInt()
}

public fun InitVariantFromUInt32Array(prgn: Long, celems: UInt, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitVariantFromUInt32Array", longArrayOf(prgn, celems.toLong(), pvar)).toInt()
}

public fun InitVariantFromUInt64Array(prgn: Long, celems: UInt, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitVariantFromUInt64Array", longArrayOf(prgn, celems.toLong(), pvar)).toInt()
}

public fun InitVariantFromVariantArrayElem(varin: Long, ielem: UInt, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitVariantFromVariantArrayElem", longArrayOf(varin, ielem.toLong(), pvar)).toInt()
}

public fun SystemTimeToVariantTime(lpsystemtime: Long, pvtime: Long): Int {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SystemTimeToVariantTime", longArrayOf(lpsystemtime, pvtime)).toInt()
}

public fun VARIANT_UserFree(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("oleaut32.dll", "VARIANT_UserFree", longArrayOf(param0, param1))
}

public fun VARIANT_UserFree64(param0: Long, param1: Long) {
    Win32DynamicFfi.invoke("oleaut32.dll", "VARIANT_UserFree64", longArrayOf(param0, param1))
}

public fun VARIANT_UserMarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VARIANT_UserMarshal", longArrayOf(param0, param1, param2))
}

public fun VARIANT_UserMarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VARIANT_UserMarshal64", longArrayOf(param0, param1, param2))
}

public fun VARIANT_UserSize(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VARIANT_UserSize", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun VARIANT_UserSize64(param0: Long, param1: UInt, param2: Long): UInt {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VARIANT_UserSize64", longArrayOf(param0, param1.toLong(), param2)).toUInt()
}

public fun VARIANT_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VARIANT_UserUnmarshal", longArrayOf(param0, param1, param2))
}

public fun VARIANT_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VARIANT_UserUnmarshal64", longArrayOf(param0, param1, param2))
}

public fun VariantChangeType(pvargdest: Long, pvarsrc: Long, wflags: VAR_CHANGE_FLAGS, vt: VARENUM): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VariantChangeType", longArrayOf(pvargdest, pvarsrc, wflags.toLong(), vt.toLong())).toInt()
}

public fun VariantChangeTypeEx(pvargdest: Long, pvarsrc: Long, lcid: UInt, wflags: VAR_CHANGE_FLAGS, vt: VARENUM): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VariantChangeTypeEx", longArrayOf(pvargdest, pvarsrc, lcid.toLong(), wflags.toLong(), vt.toLong())).toInt()
}

public fun VariantClear(pvarg: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VariantClear", longArrayOf(pvarg)).toInt()
}

public fun VariantCompare(var1: Long, var2: Long): Int {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantCompare", longArrayOf(var1, var2)).toInt()
}

public fun VariantCopy(pvargdest: Long, pvargsrc: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VariantCopy", longArrayOf(pvargdest, pvargsrc)).toInt()
}

public fun VariantCopyInd(pvardest: Long, pvargsrc: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "VariantCopyInd", longArrayOf(pvardest, pvargsrc)).toInt()
}

public fun VariantGetBooleanElem(variable: Long, ielem: UInt, pfval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantGetBooleanElem", longArrayOf(variable, ielem.toLong(), pfval)).toInt()
}

public fun VariantGetDoubleElem(variable: Long, ielem: UInt, pnval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantGetDoubleElem", longArrayOf(variable, ielem.toLong(), pnval)).toInt()
}

public fun VariantGetElementCount(varin: Long): UInt {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantGetElementCount", longArrayOf(varin)).toUInt()
}

public fun VariantGetInt16Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantGetInt16Elem", longArrayOf(variable, ielem.toLong(), pnval)).toInt()
}

public fun VariantGetInt32Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantGetInt32Elem", longArrayOf(variable, ielem.toLong(), pnval)).toInt()
}

public fun VariantGetInt64Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantGetInt64Elem", longArrayOf(variable, ielem.toLong(), pnval)).toInt()
}

public fun VariantGetStringElem(variable: Long, ielem: UInt, ppszval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantGetStringElem", longArrayOf(variable, ielem.toLong(), ppszval)).toInt()
}

public fun VariantGetUInt16Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantGetUInt16Elem", longArrayOf(variable, ielem.toLong(), pnval)).toInt()
}

public fun VariantGetUInt32Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantGetUInt32Elem", longArrayOf(variable, ielem.toLong(), pnval)).toInt()
}

public fun VariantGetUInt64Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantGetUInt64Elem", longArrayOf(variable, ielem.toLong(), pnval)).toInt()
}

public fun VariantInit(pvarg: Long) {
    Win32DynamicFfi.invoke("oleaut32.dll", "VariantInit", longArrayOf(pvarg))
}

public fun VariantTimeToDosDateTime(vtime: Double, pwdosdate: Long, pwdostime: Long): Int {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VariantTimeToDosDateTime", 2, false, longArrayOf(vtime.toRawBits(), pwdosdate, pwdostime)).toLong().toInt()
}

public fun VariantTimeToSystemTime(vtime: Double, lpsystemtime: Long): Int {
    return Win32DynamicFfi.invokeFp("oleaut32.dll", "VariantTimeToSystemTime", 2, false, longArrayOf(vtime.toRawBits(), lpsystemtime)).toLong().toInt()
}

public fun VariantToBoolean(varin: Long, pfret: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToBoolean", longArrayOf(varin, pfret)).toInt()
}

public fun VariantToBooleanArray(variable: Long, prgf: Long, crgn: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToBooleanArray", longArrayOf(variable, prgf, crgn.toLong(), pcelem)).toInt()
}

public fun VariantToBooleanArrayAlloc(variable: Long, pprgf: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToBooleanArrayAlloc", longArrayOf(variable, pprgf, pcelem)).toInt()
}

public fun VariantToBooleanWithDefault(varin: Long, fdefault: BOOL): BOOL {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToBooleanWithDefault", longArrayOf(varin, fdefault.toLong())).toInt()
}

public fun VariantToBuffer(varin: Long, pv: Long, cb: UInt): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToBuffer", longArrayOf(varin, pv, cb.toLong())).toInt()
}

public fun VariantToDosDateTime(varin: Long, pwdate: Long, pwtime: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToDosDateTime", longArrayOf(varin, pwdate, pwtime)).toInt()
}

public fun VariantToDouble(varin: Long, pdblret: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToDouble", longArrayOf(varin, pdblret)).toInt()
}

public fun VariantToDoubleArray(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToDoubleArray", longArrayOf(variable, prgn, crgn.toLong(), pcelem)).toInt()
}

public fun VariantToDoubleArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToDoubleArrayAlloc", longArrayOf(variable, pprgn, pcelem)).toInt()
}

public fun VariantToDoubleWithDefault(varin: Long, dbldefault: Double): Double {
    return Win32DynamicFfi.invokeFp("propsys.dll", "VariantToDoubleWithDefault", 8, false, longArrayOf(varin, dbldefault.toRawBits()))
}

public fun VariantToFileTime(varin: Long, stfout: PSTIME_FLAGS, pftout: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToFileTime", longArrayOf(varin, stfout.toLong(), pftout)).toInt()
}

public fun VariantToGUID(varin: Long, pguid: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToGUID", longArrayOf(varin, pguid)).toInt()
}

public fun VariantToInt16(varin: Long, piret: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToInt16", longArrayOf(varin, piret)).toInt()
}

public fun VariantToInt16Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToInt16Array", longArrayOf(variable, prgn, crgn.toLong(), pcelem)).toInt()
}

public fun VariantToInt16ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToInt16ArrayAlloc", longArrayOf(variable, pprgn, pcelem)).toInt()
}

public fun VariantToInt16WithDefault(varin: Long, idefault: Short): Short {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToInt16WithDefault", longArrayOf(varin, idefault.toLong())).toShort()
}

public fun VariantToInt32(varin: Long, plret: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToInt32", longArrayOf(varin, plret)).toInt()
}

public fun VariantToInt32Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToInt32Array", longArrayOf(variable, prgn, crgn.toLong(), pcelem)).toInt()
}

public fun VariantToInt32ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToInt32ArrayAlloc", longArrayOf(variable, pprgn, pcelem)).toInt()
}

public fun VariantToInt32WithDefault(varin: Long, ldefault: Int): Int {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToInt32WithDefault", longArrayOf(varin, ldefault.toLong())).toInt()
}

public fun VariantToInt64(varin: Long, pllret: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToInt64", longArrayOf(varin, pllret)).toInt()
}

public fun VariantToInt64Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToInt64Array", longArrayOf(variable, prgn, crgn.toLong(), pcelem)).toInt()
}

public fun VariantToInt64ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToInt64ArrayAlloc", longArrayOf(variable, pprgn, pcelem)).toInt()
}

public fun VariantToInt64WithDefault(varin: Long, lldefault: Long): Long {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToInt64WithDefault", longArrayOf(varin, lldefault))
}

public fun VariantToString(varin: Long, pszbuf: PWSTR, cchbuf: UInt): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToString", longArrayOf(varin, pszbuf, cchbuf.toLong())).toInt()
}

public fun VariantToStringAlloc(varin: Long, ppszbuf: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToStringAlloc", longArrayOf(varin, ppszbuf)).toInt()
}

public fun VariantToStringArray(variable: Long, prgsz: Long, crgsz: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToStringArray", longArrayOf(variable, prgsz, crgsz.toLong(), pcelem)).toInt()
}

public fun VariantToStringArrayAlloc(variable: Long, pprgsz: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToStringArrayAlloc", longArrayOf(variable, pprgsz, pcelem)).toInt()
}

public fun VariantToStringWithDefault(varin: Long, pszdefault: PCWSTR): PCWSTR {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToStringWithDefault", longArrayOf(varin, pszdefault))
}

public fun VariantToUInt16(varin: Long, puiret: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToUInt16", longArrayOf(varin, puiret)).toInt()
}

public fun VariantToUInt16Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToUInt16Array", longArrayOf(variable, prgn, crgn.toLong(), pcelem)).toInt()
}

public fun VariantToUInt16ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToUInt16ArrayAlloc", longArrayOf(variable, pprgn, pcelem)).toInt()
}

public fun VariantToUInt16WithDefault(varin: Long, uidefault: UShort): UShort {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToUInt16WithDefault", longArrayOf(varin, uidefault.toLong())).toUShort()
}

public fun VariantToUInt32(varin: Long, pulret: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToUInt32", longArrayOf(varin, pulret)).toInt()
}

public fun VariantToUInt32Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToUInt32Array", longArrayOf(variable, prgn, crgn.toLong(), pcelem)).toInt()
}

public fun VariantToUInt32ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToUInt32ArrayAlloc", longArrayOf(variable, pprgn, pcelem)).toInt()
}

public fun VariantToUInt32WithDefault(varin: Long, uldefault: UInt): UInt {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToUInt32WithDefault", longArrayOf(varin, uldefault.toLong())).toUInt()
}

public fun VariantToUInt64(varin: Long, pullret: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToUInt64", longArrayOf(varin, pullret)).toInt()
}

public fun VariantToUInt64Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToUInt64Array", longArrayOf(variable, prgn, crgn.toLong(), pcelem)).toInt()
}

public fun VariantToUInt64ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToUInt64ArrayAlloc", longArrayOf(variable, pprgn, pcelem)).toInt()
}

public fun VariantToUInt64WithDefault(varin: Long, ulldefault: ULong): ULong {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToUInt64WithDefault", longArrayOf(varin, ulldefault.toLong())).toULong()
}
