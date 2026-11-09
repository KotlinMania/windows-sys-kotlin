@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE

private val _windowsWin32SystemVariantNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun ClearVariantArray(pvars: Long, cvars: UInt) {
    if (_windowsWin32SystemVariantNapiAddon != null) {
        _windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_ClearVariantArray(pvars.toString(), cvars.toInt())
    }
}

public actual fun DosDateTimeToVariantTime(wdosdate: UShort, wdostime: UShort, pvtime: Long): Int =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_DosDateTimeToVariantTime(wdosdate.toInt(), wdostime.toInt(), pvtime.toString()) as Int) else 0

public actual fun InitVariantFromBooleanArray(prgf: Long, celems: UInt, pvar: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_InitVariantFromBooleanArray(prgf.toString(), celems.toInt(), pvar.toString()) as Int) else 0

public actual fun InitVariantFromBuffer(pv: Long, cb: UInt, pvar: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_InitVariantFromBuffer(pv.toString(), cb.toInt(), pvar.toString()) as Int) else 0

public actual fun InitVariantFromDoubleArray(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_InitVariantFromDoubleArray(prgn.toString(), celems.toInt(), pvar.toString()) as Int) else 0

public actual fun InitVariantFromFileTime(pft: Long, pvar: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_InitVariantFromFileTime(pft.toString(), pvar.toString()) as Int) else 0

public actual fun InitVariantFromFileTimeArray(prgft: Long, celems: UInt, pvar: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_InitVariantFromFileTimeArray(prgft.toString(), celems.toInt(), pvar.toString()) as Int) else 0

public actual fun InitVariantFromGUIDAsString(guid: Long, pvar: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_InitVariantFromGUIDAsString(guid.toString(), pvar.toString()) as Int) else 0

public actual fun InitVariantFromInt16Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_InitVariantFromInt16Array(prgn.toString(), celems.toInt(), pvar.toString()) as Int) else 0

public actual fun InitVariantFromInt32Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_InitVariantFromInt32Array(prgn.toString(), celems.toInt(), pvar.toString()) as Int) else 0

public actual fun InitVariantFromInt64Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_InitVariantFromInt64Array(prgn.toString(), celems.toInt(), pvar.toString()) as Int) else 0

public actual fun InitVariantFromResource(hinst: HINSTANCE, id: UInt, pvar: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_InitVariantFromResource(hinst.toString(), id.toInt(), pvar.toString()) as Int) else 0

public actual fun InitVariantFromStringArray(prgsz: Long, celems: UInt, pvar: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_InitVariantFromStringArray(prgsz.toString(), celems.toInt(), pvar.toString()) as Int) else 0

public actual fun InitVariantFromUInt16Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_InitVariantFromUInt16Array(prgn.toString(), celems.toInt(), pvar.toString()) as Int) else 0

public actual fun InitVariantFromUInt32Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_InitVariantFromUInt32Array(prgn.toString(), celems.toInt(), pvar.toString()) as Int) else 0

public actual fun InitVariantFromUInt64Array(prgn: Long, celems: UInt, pvar: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_InitVariantFromUInt64Array(prgn.toString(), celems.toInt(), pvar.toString()) as Int) else 0

public actual fun InitVariantFromVariantArrayElem(varin: Long, ielem: UInt, pvar: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_InitVariantFromVariantArrayElem(varin.toString(), ielem.toInt(), pvar.toString()) as Int) else 0

public actual fun SystemTimeToVariantTime(lpsystemtime: Long, pvtime: Long): Int =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_SystemTimeToVariantTime(lpsystemtime.toString(), pvtime.toString()) as Int) else 0

public actual fun VARIANT_UserFree(param0: Long, param1: Long) {
    if (_windowsWin32SystemVariantNapiAddon != null) {
        _windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VARIANT_UserFree(param0.toString(), param1.toString())
    }
}

public actual fun VARIANT_UserFree64(param0: Long, param1: Long) {
    if (_windowsWin32SystemVariantNapiAddon != null) {
        _windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VARIANT_UserFree64(param0.toString(), param1.toString())
    }
}

public actual fun VARIANT_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VARIANT_UserMarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun VARIANT_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VARIANT_UserMarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun VARIANT_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VARIANT_UserSize(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun VARIANT_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VARIANT_UserSize64(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun VARIANT_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VARIANT_UserUnmarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun VARIANT_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VARIANT_UserUnmarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun VariantChangeType(pvargdest: Long, pvarsrc: Long, wflags: VAR_CHANGE_FLAGS, vt: VARENUM): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantChangeType(pvargdest.toString(), pvarsrc.toString(), wflags.toInt(), vt.toInt()) as Int) else 0

public actual fun VariantChangeTypeEx(pvargdest: Long, pvarsrc: Long, lcid: UInt, wflags: VAR_CHANGE_FLAGS, vt: VARENUM): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantChangeTypeEx(pvargdest.toString(), pvarsrc.toString(), lcid.toInt(), wflags.toInt(), vt.toInt()) as Int) else 0

public actual fun VariantClear(pvarg: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantClear(pvarg.toString()) as Int) else 0

public actual fun VariantCompare(var1: Long, var2: Long): Int =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantCompare(var1.toString(), var2.toString()) as Int) else 0

public actual fun VariantCopy(pvargdest: Long, pvargsrc: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantCopy(pvargdest.toString(), pvargsrc.toString()) as Int) else 0

public actual fun VariantCopyInd(pvardest: Long, pvargsrc: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantCopyInd(pvardest.toString(), pvargsrc.toString()) as Int) else 0

public actual fun VariantGetBooleanElem(variable: Long, ielem: UInt, pfval: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantGetBooleanElem(variable.toString(), ielem.toInt(), pfval.toString()) as Int) else 0

public actual fun VariantGetDoubleElem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantGetDoubleElem(variable.toString(), ielem.toInt(), pnval.toString()) as Int) else 0

public actual fun VariantGetElementCount(varin: Long): UInt =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantGetElementCount(varin.toString()) as Int).toUInt() else 0u

public actual fun VariantGetInt16Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantGetInt16Elem(variable.toString(), ielem.toInt(), pnval.toString()) as Int) else 0

public actual fun VariantGetInt32Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantGetInt32Elem(variable.toString(), ielem.toInt(), pnval.toString()) as Int) else 0

public actual fun VariantGetInt64Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantGetInt64Elem(variable.toString(), ielem.toInt(), pnval.toString()) as Int) else 0

public actual fun VariantGetStringElem(variable: Long, ielem: UInt, ppszval: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantGetStringElem(variable.toString(), ielem.toInt(), ppszval.toString()) as Int) else 0

public actual fun VariantGetUInt16Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantGetUInt16Elem(variable.toString(), ielem.toInt(), pnval.toString()) as Int) else 0

public actual fun VariantGetUInt32Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantGetUInt32Elem(variable.toString(), ielem.toInt(), pnval.toString()) as Int) else 0

public actual fun VariantGetUInt64Elem(variable: Long, ielem: UInt, pnval: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantGetUInt64Elem(variable.toString(), ielem.toInt(), pnval.toString()) as Int) else 0

public actual fun VariantInit(pvarg: Long) {
    if (_windowsWin32SystemVariantNapiAddon != null) {
        _windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantInit(pvarg.toString())
    }
}

public actual fun VariantTimeToDosDateTime(vtime: Double, pwdosdate: Long, pwdostime: Long): Int =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantTimeToDosDateTime(vtime, pwdosdate.toString(), pwdostime.toString()) as Int) else 0

public actual fun VariantTimeToSystemTime(vtime: Double, lpsystemtime: Long): Int =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantTimeToSystemTime(vtime, lpsystemtime.toString()) as Int) else 0

public actual fun VariantToBoolean(varin: Long, pfret: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToBoolean(varin.toString(), pfret.toString()) as Int) else 0

public actual fun VariantToBooleanArray(variable: Long, prgf: Long, crgn: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToBooleanArray(variable.toString(), prgf.toString(), crgn.toInt(), pcelem.toString()) as Int) else 0

public actual fun VariantToBooleanArrayAlloc(variable: Long, pprgf: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToBooleanArrayAlloc(variable.toString(), pprgf.toString(), pcelem.toString()) as Int) else 0

public actual fun VariantToBooleanWithDefault(varin: Long, fdefault: BOOL): BOOL =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToBooleanWithDefault(varin.toString(), fdefault) as Int) else 0

public actual fun VariantToBuffer(varin: Long, pv: Long, cb: UInt): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToBuffer(varin.toString(), pv.toString(), cb.toInt()) as Int) else 0

public actual fun VariantToDosDateTime(varin: Long, pwdate: Long, pwtime: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToDosDateTime(varin.toString(), pwdate.toString(), pwtime.toString()) as Int) else 0

public actual fun VariantToDouble(varin: Long, pdblret: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToDouble(varin.toString(), pdblret.toString()) as Int) else 0

public actual fun VariantToDoubleArray(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToDoubleArray(variable.toString(), prgn.toString(), crgn.toInt(), pcelem.toString()) as Int) else 0

public actual fun VariantToDoubleArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToDoubleArrayAlloc(variable.toString(), pprgn.toString(), pcelem.toString()) as Int) else 0

public actual fun VariantToDoubleWithDefault(varin: Long, dbldefault: Double): Double =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToDoubleWithDefault(varin.toString(), dbldefault) as Double) else 0.0

public actual fun VariantToFileTime(varin: Long, stfout: PSTIME_FLAGS, pftout: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToFileTime(varin.toString(), stfout, pftout.toString()) as Int) else 0

public actual fun VariantToGUID(varin: Long, pguid: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToGUID(varin.toString(), pguid.toString()) as Int) else 0

public actual fun VariantToInt16(varin: Long, piret: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToInt16(varin.toString(), piret.toString()) as Int) else 0

public actual fun VariantToInt16Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToInt16Array(variable.toString(), prgn.toString(), crgn.toInt(), pcelem.toString()) as Int) else 0

public actual fun VariantToInt16ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToInt16ArrayAlloc(variable.toString(), pprgn.toString(), pcelem.toString()) as Int) else 0

public actual fun VariantToInt16WithDefault(varin: Long, idefault: Short): Short =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToInt16WithDefault(varin.toString(), idefault.toInt()) as Int).toShort() else 0

public actual fun VariantToInt32(varin: Long, plret: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToInt32(varin.toString(), plret.toString()) as Int) else 0

public actual fun VariantToInt32Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToInt32Array(variable.toString(), prgn.toString(), crgn.toInt(), pcelem.toString()) as Int) else 0

public actual fun VariantToInt32ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToInt32ArrayAlloc(variable.toString(), pprgn.toString(), pcelem.toString()) as Int) else 0

public actual fun VariantToInt32WithDefault(varin: Long, ldefault: Int): Int =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToInt32WithDefault(varin.toString(), ldefault) as Int) else 0

public actual fun VariantToInt64(varin: Long, pllret: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToInt64(varin.toString(), pllret.toString()) as Int) else 0

public actual fun VariantToInt64Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToInt64Array(variable.toString(), prgn.toString(), crgn.toInt(), pcelem.toString()) as Int) else 0

public actual fun VariantToInt64ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToInt64ArrayAlloc(variable.toString(), pprgn.toString(), pcelem.toString()) as Int) else 0

public actual fun VariantToInt64WithDefault(varin: Long, lldefault: Long): Long =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToInt64WithDefault(varin.toString(), lldefault.toString()) as String).toLong() else 0L

public actual fun VariantToString(varin: Long, pszbuf: PWSTR, cchbuf: UInt): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToString(varin.toString(), pszbuf.toString(), cchbuf.toInt()) as Int) else 0

public actual fun VariantToStringAlloc(varin: Long, ppszbuf: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToStringAlloc(varin.toString(), ppszbuf.toString()) as Int) else 0

public actual fun VariantToStringArray(variable: Long, prgsz: Long, crgsz: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToStringArray(variable.toString(), prgsz.toString(), crgsz.toInt(), pcelem.toString()) as Int) else 0

public actual fun VariantToStringArrayAlloc(variable: Long, pprgsz: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToStringArrayAlloc(variable.toString(), pprgsz.toString(), pcelem.toString()) as Int) else 0

public actual fun VariantToStringWithDefault(varin: Long, pszdefault: PCWSTR): PCWSTR =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToStringWithDefault(varin.toString(), pszdefault.toString()) as String).toLong() else 0L

public actual fun VariantToUInt16(varin: Long, puiret: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToUInt16(varin.toString(), puiret.toString()) as Int) else 0

public actual fun VariantToUInt16Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToUInt16Array(variable.toString(), prgn.toString(), crgn.toInt(), pcelem.toString()) as Int) else 0

public actual fun VariantToUInt16ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToUInt16ArrayAlloc(variable.toString(), pprgn.toString(), pcelem.toString()) as Int) else 0

public actual fun VariantToUInt16WithDefault(varin: Long, uidefault: UShort): UShort =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToUInt16WithDefault(varin.toString(), uidefault.toInt()) as Int).toUShort() else 0u

public actual fun VariantToUInt32(varin: Long, pulret: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToUInt32(varin.toString(), pulret.toString()) as Int) else 0

public actual fun VariantToUInt32Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToUInt32Array(variable.toString(), prgn.toString(), crgn.toInt(), pcelem.toString()) as Int) else 0

public actual fun VariantToUInt32ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToUInt32ArrayAlloc(variable.toString(), pprgn.toString(), pcelem.toString()) as Int) else 0

public actual fun VariantToUInt32WithDefault(varin: Long, uldefault: UInt): UInt =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToUInt32WithDefault(varin.toString(), uldefault.toInt()) as Int).toUInt() else 0u

public actual fun VariantToUInt64(varin: Long, pullret: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToUInt64(varin.toString(), pullret.toString()) as Int) else 0

public actual fun VariantToUInt64Array(variable: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToUInt64Array(variable.toString(), prgn.toString(), crgn.toInt(), pcelem.toString()) as Int) else 0

public actual fun VariantToUInt64ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToUInt64ArrayAlloc(variable.toString(), pprgn.toString(), pcelem.toString()) as Int) else 0

public actual fun VariantToUInt64WithDefault(varin: Long, ulldefault: ULong): ULong =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_VariantToUInt64WithDefault(varin.toString(), ulldefault.toString()) as String).toULong() else 0uL
