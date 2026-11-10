@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance

private object WindowsWin32SystemVariantJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_clearVariantArray(pvars: Long, cvars: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_dosDateTimeToVariantTime(wdosdate: Short, wdostime: Short, pvtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_initVariantFromBooleanArray(prgf: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_initVariantFromBuffer(pv: Long, cb: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_initVariantFromDoubleArray(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_initVariantFromFileTime(pft: Long, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_initVariantFromFileTimeArray(prgft: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_initVariantFromGUIDAsString(guid: Long, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_initVariantFromInt16Array(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_initVariantFromInt32Array(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_initVariantFromInt64Array(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_initVariantFromResource(hinst: Long, id: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_initVariantFromStringArray(prgsz: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_initVariantFromUInt16Array(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_initVariantFromUInt32Array(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_initVariantFromUInt64Array(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_initVariantFromVariantArrayElem(varin: Long, ielem: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_systemTimeToVariantTime(lpsystemtime: Long, pvtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantChangeType(pvargdest: Long, pvarsrc: Long, wflags: Short, vt: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantChangeTypeEx(pvargdest: Long, pvarsrc: Long, lcid: Int, wflags: Short, vt: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantClear(pvarg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantCompare(var1: Long, var2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantCopy(pvargdest: Long, pvargsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantCopyInd(pvardest: Long, pvargsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantGetBooleanElem(variable: Long, ielem: Int, pfval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantGetDoubleElem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantGetElementCount(varin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantGetInt16Elem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantGetInt32Elem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantGetInt64Elem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantGetStringElem(variable: Long, ielem: Int, ppszval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantGetUInt16Elem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantGetUInt32Elem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantGetUInt64Elem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantInit(pvarg: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantTimeToDosDateTime(vtime: Double, pwdosdate: Long, pwdostime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantTimeToSystemTime(vtime: Double, lpsystemtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToBoolean(varin: Long, pfret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToBooleanArray(variable: Long, prgf: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToBooleanArrayAlloc(variable: Long, pprgf: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToBooleanWithDefault(varin: Long, fdefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToBuffer(varin: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToDosDateTime(varin: Long, pwdate: Long, pwtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToDouble(varin: Long, pdblret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToDoubleArray(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToDoubleArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToDoubleWithDefault(varin: Long, dbldefault: Double): Double

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToFileTime(varin: Long, stfout: Int, pftout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToGUID(varin: Long, pguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToInt16(varin: Long, piret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToInt16Array(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToInt16ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToInt16WithDefault(varin: Long, idefault: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToInt32(varin: Long, plret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToInt32Array(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToInt32ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToInt32WithDefault(varin: Long, ldefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToInt64(varin: Long, pllret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToInt64Array(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToInt64ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToInt64WithDefault(varin: Long, lldefault: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToString(varin: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToStringAlloc(varin: Long, ppszbuf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToStringArray(variable: Long, prgsz: Long, crgsz: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToStringArrayAlloc(variable: Long, pprgsz: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToStringWithDefault(varin: Long, pszdefault: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToUInt16(varin: Long, puiret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToUInt16Array(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToUInt16ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToUInt16WithDefault(varin: Long, uidefault: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToUInt32(varin: Long, pulret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToUInt32Array(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToUInt32ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToUInt32WithDefault(varin: Long, uldefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToUInt64(varin: Long, pullret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToUInt64Array(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToUInt64ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_variant_variantToUInt64WithDefault(varin: Long, ulldefault: Long): Long
}

public actual fun clearVariantArray(pvars: COpaquePointer?, cvars: UInt) {
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_clearVariantArray((pvars?.value ?: 0L), cvars.toInt())
}

public actual fun dosDateTimeToVariantTime(wdosdate: UShort, wdostime: UShort, pvtime: COpaquePointer?): Int =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_dosDateTimeToVariantTime(wdosdate.toShort(), wdostime.toShort(), (pvtime?.value ?: 0L))

public actual fun initVariantFromBooleanArray(prgf: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_initVariantFromBooleanArray((prgf?.value ?: 0L), celems.toInt(), (pvar?.value ?: 0L))

public actual fun initVariantFromBuffer(pv: COpaquePointer?, cb: UInt, pvar: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_initVariantFromBuffer((pv?.value ?: 0L), cb.toInt(), (pvar?.value ?: 0L))

public actual fun initVariantFromDoubleArray(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_initVariantFromDoubleArray((prgn?.value ?: 0L), celems.toInt(), (pvar?.value ?: 0L))

public actual fun initVariantFromFileTime(pft: COpaquePointer?, pvar: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_initVariantFromFileTime((pft?.value ?: 0L), (pvar?.value ?: 0L))

public actual fun initVariantFromFileTimeArray(prgft: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_initVariantFromFileTimeArray((prgft?.value ?: 0L), celems.toInt(), (pvar?.value ?: 0L))

public actual fun initVariantFromGUIDAsString(guid: COpaquePointer?, pvar: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_initVariantFromGUIDAsString((guid?.value ?: 0L), (pvar?.value ?: 0L))

public actual fun initVariantFromInt16Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_initVariantFromInt16Array((prgn?.value ?: 0L), celems.toInt(), (pvar?.value ?: 0L))

public actual fun initVariantFromInt32Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_initVariantFromInt32Array((prgn?.value ?: 0L), celems.toInt(), (pvar?.value ?: 0L))

public actual fun initVariantFromInt64Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_initVariantFromInt64Array((prgn?.value ?: 0L), celems.toInt(), (pvar?.value ?: 0L))

public actual fun initVariantFromResource(hinst: Hinstance, id: UInt, pvar: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_initVariantFromResource((hinst?.value ?: 0L), id.toInt(), (pvar?.value ?: 0L))

public actual fun initVariantFromStringArray(prgsz: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_initVariantFromStringArray((prgsz?.value ?: 0L), celems.toInt(), (pvar?.value ?: 0L))

public actual fun initVariantFromUInt16Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_initVariantFromUInt16Array((prgn?.value ?: 0L), celems.toInt(), (pvar?.value ?: 0L))

public actual fun initVariantFromUInt32Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_initVariantFromUInt32Array((prgn?.value ?: 0L), celems.toInt(), (pvar?.value ?: 0L))

public actual fun initVariantFromUInt64Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_initVariantFromUInt64Array((prgn?.value ?: 0L), celems.toInt(), (pvar?.value ?: 0L))

public actual fun initVariantFromVariantArrayElem(varin: COpaquePointer?, ielem: UInt, pvar: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_initVariantFromVariantArrayElem((varin?.value ?: 0L), ielem.toInt(), (pvar?.value ?: 0L))

public actual fun systemTimeToVariantTime(lpsystemtime: COpaquePointer?, pvtime: COpaquePointer?): Int =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_systemTimeToVariantTime((lpsystemtime?.value ?: 0L), (pvtime?.value ?: 0L))

public actual fun variantUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantUserFree((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun variantUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantUserFree64((param0?.value ?: 0L), (param1?.value ?: 0L))
}

public actual fun variantUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantUserMarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun variantUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantUserMarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun variantUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantUserSize((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun variantUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantUserSize64((param0?.value ?: 0L), param1.toInt(), (param2?.value ?: 0L)).toUInt()

public actual fun variantUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantUserUnmarshal((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun variantUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantUserUnmarshal64((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun variantChangeType(pvargdest: COpaquePointer?, pvarsrc: COpaquePointer?, wflags: VarChangeFlags, vt: Varenum): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantChangeType((pvargdest?.value ?: 0L), (pvarsrc?.value ?: 0L), wflags.toShort(), vt.toShort())

public actual fun variantChangeTypeEx(pvargdest: COpaquePointer?, pvarsrc: COpaquePointer?, lcid: UInt, wflags: VarChangeFlags, vt: Varenum): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantChangeTypeEx((pvargdest?.value ?: 0L), (pvarsrc?.value ?: 0L), lcid.toInt(), wflags.toShort(), vt.toShort())

public actual fun variantClear(pvarg: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantClear((pvarg?.value ?: 0L))

public actual fun variantCompare(var1: COpaquePointer?, var2: COpaquePointer?): Int =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantCompare((var1?.value ?: 0L), (var2?.value ?: 0L))

public actual fun variantCopy(pvargdest: COpaquePointer?, pvargsrc: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantCopy((pvargdest?.value ?: 0L), (pvargsrc?.value ?: 0L))

public actual fun variantCopyInd(pvardest: COpaquePointer?, pvargsrc: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantCopyInd((pvardest?.value ?: 0L), (pvargsrc?.value ?: 0L))

public actual fun variantGetBooleanElem(variable: COpaquePointer?, ielem: UInt, pfval: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantGetBooleanElem((variable?.value ?: 0L), ielem.toInt(), (pfval?.value ?: 0L))

public actual fun variantGetDoubleElem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantGetDoubleElem((variable?.value ?: 0L), ielem.toInt(), (pnval?.value ?: 0L))

public actual fun variantGetElementCount(varin: COpaquePointer?): UInt =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantGetElementCount((varin?.value ?: 0L)).toUInt()

public actual fun variantGetInt16Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantGetInt16Elem((variable?.value ?: 0L), ielem.toInt(), (pnval?.value ?: 0L))

public actual fun variantGetInt32Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantGetInt32Elem((variable?.value ?: 0L), ielem.toInt(), (pnval?.value ?: 0L))

public actual fun variantGetInt64Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantGetInt64Elem((variable?.value ?: 0L), ielem.toInt(), (pnval?.value ?: 0L))

public actual fun variantGetStringElem(variable: COpaquePointer?, ielem: UInt, ppszval: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantGetStringElem((variable?.value ?: 0L), ielem.toInt(), (ppszval?.value ?: 0L))

public actual fun variantGetUInt16Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantGetUInt16Elem((variable?.value ?: 0L), ielem.toInt(), (pnval?.value ?: 0L))

public actual fun variantGetUInt32Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantGetUInt32Elem((variable?.value ?: 0L), ielem.toInt(), (pnval?.value ?: 0L))

public actual fun variantGetUInt64Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantGetUInt64Elem((variable?.value ?: 0L), ielem.toInt(), (pnval?.value ?: 0L))

public actual fun variantInit(pvarg: COpaquePointer?) {
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantInit((pvarg?.value ?: 0L))
}

public actual fun variantTimeToDosDateTime(vtime: Double, pwdosdate: COpaquePointer?, pwdostime: COpaquePointer?): Int =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantTimeToDosDateTime(vtime, (pwdosdate?.value ?: 0L), (pwdostime?.value ?: 0L))

public actual fun variantTimeToSystemTime(vtime: Double, lpsystemtime: COpaquePointer?): Int =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantTimeToSystemTime(vtime, (lpsystemtime?.value ?: 0L))

public actual fun variantToBoolean(varin: COpaquePointer?, pfret: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToBoolean((varin?.value ?: 0L), (pfret?.value ?: 0L))

public actual fun variantToBooleanArray(variable: COpaquePointer?, prgf: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToBooleanArray((variable?.value ?: 0L), (prgf?.value ?: 0L), crgn.toInt(), (pcelem?.value ?: 0L))

public actual fun variantToBooleanArrayAlloc(variable: COpaquePointer?, pprgf: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToBooleanArrayAlloc((variable?.value ?: 0L), (pprgf?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun variantToBooleanWithDefault(varin: COpaquePointer?, fdefault: Bool): Bool =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToBooleanWithDefault((varin?.value ?: 0L), fdefault)

public actual fun variantToBuffer(varin: COpaquePointer?, pv: COpaquePointer?, cb: UInt): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToBuffer((varin?.value ?: 0L), (pv?.value ?: 0L), cb.toInt())

public actual fun variantToDosDateTime(varin: COpaquePointer?, pwdate: COpaquePointer?, pwtime: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToDosDateTime((varin?.value ?: 0L), (pwdate?.value ?: 0L), (pwtime?.value ?: 0L))

public actual fun variantToDouble(varin: COpaquePointer?, pdblret: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToDouble((varin?.value ?: 0L), (pdblret?.value ?: 0L))

public actual fun variantToDoubleArray(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToDoubleArray((variable?.value ?: 0L), (prgn?.value ?: 0L), crgn.toInt(), (pcelem?.value ?: 0L))

public actual fun variantToDoubleArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToDoubleArrayAlloc((variable?.value ?: 0L), (pprgn?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun variantToDoubleWithDefault(varin: COpaquePointer?, dbldefault: Double): Double =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToDoubleWithDefault((varin?.value ?: 0L), dbldefault)

public actual fun variantToFileTime(varin: COpaquePointer?, stfout: PstimeFlags, pftout: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToFileTime((varin?.value ?: 0L), stfout, (pftout?.value ?: 0L))

public actual fun variantToGUID(varin: COpaquePointer?, pguid: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToGUID((varin?.value ?: 0L), (pguid?.value ?: 0L))

public actual fun variantToInt16(varin: COpaquePointer?, piret: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToInt16((varin?.value ?: 0L), (piret?.value ?: 0L))

public actual fun variantToInt16Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToInt16Array((variable?.value ?: 0L), (prgn?.value ?: 0L), crgn.toInt(), (pcelem?.value ?: 0L))

public actual fun variantToInt16ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToInt16ArrayAlloc((variable?.value ?: 0L), (pprgn?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun variantToInt16WithDefault(varin: COpaquePointer?, idefault: Short): Short =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToInt16WithDefault((varin?.value ?: 0L), idefault)

public actual fun variantToInt32(varin: COpaquePointer?, plret: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToInt32((varin?.value ?: 0L), (plret?.value ?: 0L))

public actual fun variantToInt32Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToInt32Array((variable?.value ?: 0L), (prgn?.value ?: 0L), crgn.toInt(), (pcelem?.value ?: 0L))

public actual fun variantToInt32ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToInt32ArrayAlloc((variable?.value ?: 0L), (pprgn?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun variantToInt32WithDefault(varin: COpaquePointer?, ldefault: Int): Int =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToInt32WithDefault((varin?.value ?: 0L), ldefault)

public actual fun variantToInt64(varin: COpaquePointer?, pllret: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToInt64((varin?.value ?: 0L), (pllret?.value ?: 0L))

public actual fun variantToInt64Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToInt64Array((variable?.value ?: 0L), (prgn?.value ?: 0L), crgn.toInt(), (pcelem?.value ?: 0L))

public actual fun variantToInt64ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToInt64ArrayAlloc((variable?.value ?: 0L), (pprgn?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun variantToInt64WithDefault(varin: COpaquePointer?, lldefault: Long): Long =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToInt64WithDefault((varin?.value ?: 0L), lldefault)

public actual fun variantToString(varin: COpaquePointer?, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToString((varin?.value ?: 0L), (pszbuf?.value ?: 0L), cchbuf.toInt())

public actual fun variantToStringAlloc(varin: COpaquePointer?, ppszbuf: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToStringAlloc((varin?.value ?: 0L), (ppszbuf?.value ?: 0L))

public actual fun variantToStringArray(variable: COpaquePointer?, prgsz: COpaquePointer?, crgsz: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToStringArray((variable?.value ?: 0L), (prgsz?.value ?: 0L), crgsz.toInt(), (pcelem?.value ?: 0L))

public actual fun variantToStringArrayAlloc(variable: COpaquePointer?, pprgsz: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToStringArrayAlloc((variable?.value ?: 0L), (pprgsz?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun variantToStringWithDefault(varin: COpaquePointer?, pszdefault: Pcwstr): Pcwstr =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToStringWithDefault((varin?.value ?: 0L), (pszdefault?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun variantToUInt16(varin: COpaquePointer?, puiret: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToUInt16((varin?.value ?: 0L), (puiret?.value ?: 0L))

public actual fun variantToUInt16Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToUInt16Array((variable?.value ?: 0L), (prgn?.value ?: 0L), crgn.toInt(), (pcelem?.value ?: 0L))

public actual fun variantToUInt16ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToUInt16ArrayAlloc((variable?.value ?: 0L), (pprgn?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun variantToUInt16WithDefault(varin: COpaquePointer?, uidefault: UShort): UShort =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToUInt16WithDefault((varin?.value ?: 0L), uidefault.toShort()).toUShort()

public actual fun variantToUInt32(varin: COpaquePointer?, pulret: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToUInt32((varin?.value ?: 0L), (pulret?.value ?: 0L))

public actual fun variantToUInt32Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToUInt32Array((variable?.value ?: 0L), (prgn?.value ?: 0L), crgn.toInt(), (pcelem?.value ?: 0L))

public actual fun variantToUInt32ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToUInt32ArrayAlloc((variable?.value ?: 0L), (pprgn?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun variantToUInt32WithDefault(varin: COpaquePointer?, uldefault: UInt): UInt =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToUInt32WithDefault((varin?.value ?: 0L), uldefault.toInt()).toUInt()

public actual fun variantToUInt64(varin: COpaquePointer?, pullret: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToUInt64((varin?.value ?: 0L), (pullret?.value ?: 0L))

public actual fun variantToUInt64Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToUInt64Array((variable?.value ?: 0L), (prgn?.value ?: 0L), crgn.toInt(), (pcelem?.value ?: 0L))

public actual fun variantToUInt64ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToUInt64ArrayAlloc((variable?.value ?: 0L), (pprgn?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun variantToUInt64WithDefault(varin: COpaquePointer?, ulldefault: ULong): ULong =
    WindowsWin32SystemVariantJniBridge.windowssys_windows_win32_system_variant_variantToUInt64WithDefault((varin?.value ?: 0L), ulldefault.toLong()).toULong()
