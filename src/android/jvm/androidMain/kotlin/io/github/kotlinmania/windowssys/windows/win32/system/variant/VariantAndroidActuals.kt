@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
    external fun windowssysWindowsWin32SystemVariantClearVariantArray(pvars: Long, cvars: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantDosDateTimeToVariantTime(wdosdate: Short, wdostime: Short, pvtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantInitVariantFromBooleanArray(prgf: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantInitVariantFromBuffer(pv: Long, cb: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantInitVariantFromDoubleArray(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantInitVariantFromFileTime(pft: Long, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantInitVariantFromFileTimeArray(prgft: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantInitVariantFromGUIDAsString(guid: Long, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantInitVariantFromInt16Array(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantInitVariantFromInt32Array(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantInitVariantFromInt64Array(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantInitVariantFromResource(hinst: Long, id: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantInitVariantFromStringArray(prgsz: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantInitVariantFromUInt16Array(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantInitVariantFromUInt32Array(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantInitVariantFromUInt64Array(prgn: Long, celems: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantInitVariantFromVariantArrayElem(varin: Long, ielem: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantSystemTimeToVariantTime(lpsystemtime: Long, pvtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantUserFree(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantUserFree64(param0: Long, param1: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantUserMarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantUserMarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantUserSize(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantUserSize64(param0: Long, param1: Int, param2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantUserUnmarshal(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantUserUnmarshal64(param0: Long, param1: Long, param2: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantChangeType(pvargdest: Long, pvarsrc: Long, wflags: Short, vt: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantChangeTypeEx(pvargdest: Long, pvarsrc: Long, lcid: Int, wflags: Short, vt: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantClear(pvarg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantCompare(var1: Long, var2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantCopy(pvargdest: Long, pvargsrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantCopyInd(pvardest: Long, pvargsrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantGetBooleanElem(variable: Long, ielem: Int, pfval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantGetDoubleElem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantGetElementCount(varin: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantGetInt16Elem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantGetInt32Elem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantGetInt64Elem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantGetStringElem(variable: Long, ielem: Int, ppszval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantGetUInt16Elem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantGetUInt32Elem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantGetUInt64Elem(variable: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantInit(pvarg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantTimeToDosDateTime(vtime: Double, pwdosdate: Long, pwdostime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantTimeToSystemTime(vtime: Double, lpsystemtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToBoolean(varin: Long, pfret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToBooleanArray(variable: Long, prgf: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToBooleanArrayAlloc(variable: Long, pprgf: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToBooleanWithDefault(varin: Long, fdefault: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToBuffer(varin: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToDosDateTime(varin: Long, pwdate: Long, pwtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToDouble(varin: Long, pdblret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToDoubleArray(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToDoubleArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToDoubleWithDefault(varin: Long, dbldefault: Double): Double

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToFileTime(varin: Long, stfout: Int, pftout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToGUID(varin: Long, pguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToInt16(varin: Long, piret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToInt16Array(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToInt16ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToInt16WithDefault(varin: Long, idefault: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToInt32(varin: Long, plret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToInt32Array(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToInt32ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToInt32WithDefault(varin: Long, ldefault: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToInt64(varin: Long, pllret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToInt64Array(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToInt64ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToInt64WithDefault(varin: Long, lldefault: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToString(varin: Long, pszbuf: Long, cchbuf: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToStringAlloc(varin: Long, ppszbuf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToStringArray(variable: Long, prgsz: Long, crgsz: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToStringArrayAlloc(variable: Long, pprgsz: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToStringWithDefault(varin: Long, pszdefault: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToUInt16(varin: Long, puiret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToUInt16Array(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToUInt16ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToUInt16WithDefault(varin: Long, uidefault: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToUInt32(varin: Long, pulret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToUInt32Array(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToUInt32ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToUInt32WithDefault(varin: Long, uldefault: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToUInt64(varin: Long, pullret: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToUInt64Array(variable: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToUInt64ArrayAlloc(variable: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemVariantVariantToUInt64WithDefault(varin: Long, ulldefault: Long): Long
}

public actual fun clearVariantArray(pvars: MutPtr, cvars: UInt) {
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantClearVariantArray(pvars.rawAddress, cvars.toInt())
}

public actual fun dosDateTimeToVariantTime(wdosdate: UShort, wdostime: UShort, pvtime: MutPtr): Int =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantDosDateTimeToVariantTime(wdosdate.toShort(), wdostime.toShort(), pvtime.rawAddress)

public actual fun initVariantFromBooleanArray(prgf: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantInitVariantFromBooleanArray(prgf.rawAddress, celems.toInt(), pvar.rawAddress)

public actual fun initVariantFromBuffer(pv: ConstPtr, cb: UInt, pvar: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantInitVariantFromBuffer(pv.rawAddress, cb.toInt(), pvar.rawAddress)

public actual fun initVariantFromDoubleArray(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantInitVariantFromDoubleArray(prgn.rawAddress, celems.toInt(), pvar.rawAddress)

public actual fun initVariantFromFileTime(pft: ConstPtr, pvar: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantInitVariantFromFileTime(pft.rawAddress, pvar.rawAddress)

public actual fun initVariantFromFileTimeArray(prgft: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantInitVariantFromFileTimeArray(prgft.rawAddress, celems.toInt(), pvar.rawAddress)

public actual fun initVariantFromGUIDAsString(guid: ConstPtr, pvar: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantInitVariantFromGUIDAsString(guid.rawAddress, pvar.rawAddress)

public actual fun initVariantFromInt16Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantInitVariantFromInt16Array(prgn.rawAddress, celems.toInt(), pvar.rawAddress)

public actual fun initVariantFromInt32Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantInitVariantFromInt32Array(prgn.rawAddress, celems.toInt(), pvar.rawAddress)

public actual fun initVariantFromInt64Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantInitVariantFromInt64Array(prgn.rawAddress, celems.toInt(), pvar.rawAddress)

public actual fun initVariantFromResource(hinst: Hinstance, id: UInt, pvar: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantInitVariantFromResource(hinst.rawAddress, id.toInt(), pvar.rawAddress)

public actual fun initVariantFromStringArray(prgsz: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantInitVariantFromStringArray(prgsz.rawAddress, celems.toInt(), pvar.rawAddress)

public actual fun initVariantFromUInt16Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantInitVariantFromUInt16Array(prgn.rawAddress, celems.toInt(), pvar.rawAddress)

public actual fun initVariantFromUInt32Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantInitVariantFromUInt32Array(prgn.rawAddress, celems.toInt(), pvar.rawAddress)

public actual fun initVariantFromUInt64Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantInitVariantFromUInt64Array(prgn.rawAddress, celems.toInt(), pvar.rawAddress)

public actual fun initVariantFromVariantArrayElem(varin: ConstPtr, ielem: UInt, pvar: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantInitVariantFromVariantArrayElem(varin.rawAddress, ielem.toInt(), pvar.rawAddress)

public actual fun systemTimeToVariantTime(lpsystemtime: ConstPtr, pvtime: MutPtr): Int =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantSystemTimeToVariantTime(lpsystemtime.rawAddress, pvtime.rawAddress)

public actual fun variantUserFree(param0: ConstPtr, param1: ConstPtr) {
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantUserFree(param0.rawAddress, param1.rawAddress)
}

public actual fun variantUserFree64(param0: ConstPtr, param1: ConstPtr) {
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantUserFree64(param0.rawAddress, param1.rawAddress)
}

public actual fun variantUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantUserMarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun variantUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    MutPtr(WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantUserMarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun variantUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantUserSize(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun variantUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantUserSize64(param0.rawAddress, param1.toInt(), param2.rawAddress).toUInt()

public actual fun variantUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    MutPtr(WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantUserUnmarshal(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun variantUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    MutPtr(WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantUserUnmarshal64(param0.rawAddress, param1.rawAddress, param2.rawAddress))

public actual fun variantChangeType(pvargdest: MutPtr, pvarsrc: ConstPtr, wflags: VarChangeFlags, vt: Varenum): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantChangeType(pvargdest.rawAddress, pvarsrc.rawAddress, wflags.toShort(), vt.toShort())

public actual fun variantChangeTypeEx(pvargdest: MutPtr, pvarsrc: ConstPtr, lcid: UInt, wflags: VarChangeFlags, vt: Varenum): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantChangeTypeEx(pvargdest.rawAddress, pvarsrc.rawAddress, lcid.toInt(), wflags.toShort(), vt.toShort())

public actual fun variantClear(pvarg: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantClear(pvarg.rawAddress)

public actual fun variantCompare(var1: ConstPtr, var2: ConstPtr): Int =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantCompare(var1.rawAddress, var2.rawAddress)

public actual fun variantCopy(pvargdest: MutPtr, pvargsrc: ConstPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantCopy(pvargdest.rawAddress, pvargsrc.rawAddress)

public actual fun variantCopyInd(pvardest: MutPtr, pvargsrc: ConstPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantCopyInd(pvardest.rawAddress, pvargsrc.rawAddress)

public actual fun variantGetBooleanElem(variable: ConstPtr, ielem: UInt, pfval: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantGetBooleanElem(variable.rawAddress, ielem.toInt(), pfval.rawAddress)

public actual fun variantGetDoubleElem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantGetDoubleElem(variable.rawAddress, ielem.toInt(), pnval.rawAddress)

public actual fun variantGetElementCount(varin: ConstPtr): UInt =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantGetElementCount(varin.rawAddress).toUInt()

public actual fun variantGetInt16Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantGetInt16Elem(variable.rawAddress, ielem.toInt(), pnval.rawAddress)

public actual fun variantGetInt32Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantGetInt32Elem(variable.rawAddress, ielem.toInt(), pnval.rawAddress)

public actual fun variantGetInt64Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantGetInt64Elem(variable.rawAddress, ielem.toInt(), pnval.rawAddress)

public actual fun variantGetStringElem(variable: ConstPtr, ielem: UInt, ppszval: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantGetStringElem(variable.rawAddress, ielem.toInt(), ppszval.rawAddress)

public actual fun variantGetUInt16Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantGetUInt16Elem(variable.rawAddress, ielem.toInt(), pnval.rawAddress)

public actual fun variantGetUInt32Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantGetUInt32Elem(variable.rawAddress, ielem.toInt(), pnval.rawAddress)

public actual fun variantGetUInt64Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantGetUInt64Elem(variable.rawAddress, ielem.toInt(), pnval.rawAddress)

public actual fun variantInit(pvarg: MutPtr) {
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantInit(pvarg.rawAddress)
}

public actual fun variantTimeToDosDateTime(vtime: Double, pwdosdate: MutPtr, pwdostime: MutPtr): Int =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantTimeToDosDateTime(vtime, pwdosdate.rawAddress, pwdostime.rawAddress)

public actual fun variantTimeToSystemTime(vtime: Double, lpsystemtime: MutPtr): Int =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantTimeToSystemTime(vtime, lpsystemtime.rawAddress)

public actual fun variantToBoolean(varin: ConstPtr, pfret: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToBoolean(varin.rawAddress, pfret.rawAddress)

public actual fun variantToBooleanArray(variable: ConstPtr, prgf: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToBooleanArray(variable.rawAddress, prgf.rawAddress, crgn.toInt(), pcelem.rawAddress)

public actual fun variantToBooleanArrayAlloc(variable: ConstPtr, pprgf: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToBooleanArrayAlloc(variable.rawAddress, pprgf.rawAddress, pcelem.rawAddress)

public actual fun variantToBooleanWithDefault(varin: ConstPtr, fdefault: Bool): Bool =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToBooleanWithDefault(varin.rawAddress, fdefault)

public actual fun variantToBuffer(varin: ConstPtr, pv: MutPtr, cb: UInt): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToBuffer(varin.rawAddress, pv.rawAddress, cb.toInt())

public actual fun variantToDosDateTime(varin: ConstPtr, pwdate: MutPtr, pwtime: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToDosDateTime(varin.rawAddress, pwdate.rawAddress, pwtime.rawAddress)

public actual fun variantToDouble(varin: ConstPtr, pdblret: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToDouble(varin.rawAddress, pdblret.rawAddress)

public actual fun variantToDoubleArray(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToDoubleArray(variable.rawAddress, prgn.rawAddress, crgn.toInt(), pcelem.rawAddress)

public actual fun variantToDoubleArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToDoubleArrayAlloc(variable.rawAddress, pprgn.rawAddress, pcelem.rawAddress)

public actual fun variantToDoubleWithDefault(varin: ConstPtr, dbldefault: Double): Double =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToDoubleWithDefault(varin.rawAddress, dbldefault)

public actual fun variantToFileTime(varin: ConstPtr, stfout: PstimeFlags, pftout: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToFileTime(varin.rawAddress, stfout, pftout.rawAddress)

public actual fun variantToGUID(varin: ConstPtr, pguid: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToGUID(varin.rawAddress, pguid.rawAddress)

public actual fun variantToInt16(varin: ConstPtr, piret: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToInt16(varin.rawAddress, piret.rawAddress)

public actual fun variantToInt16Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToInt16Array(variable.rawAddress, prgn.rawAddress, crgn.toInt(), pcelem.rawAddress)

public actual fun variantToInt16ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToInt16ArrayAlloc(variable.rawAddress, pprgn.rawAddress, pcelem.rawAddress)

public actual fun variantToInt16WithDefault(varin: ConstPtr, idefault: Short): Short =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToInt16WithDefault(varin.rawAddress, idefault)

public actual fun variantToInt32(varin: ConstPtr, plret: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToInt32(varin.rawAddress, plret.rawAddress)

public actual fun variantToInt32Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToInt32Array(variable.rawAddress, prgn.rawAddress, crgn.toInt(), pcelem.rawAddress)

public actual fun variantToInt32ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToInt32ArrayAlloc(variable.rawAddress, pprgn.rawAddress, pcelem.rawAddress)

public actual fun variantToInt32WithDefault(varin: ConstPtr, ldefault: Int): Int =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToInt32WithDefault(varin.rawAddress, ldefault)

public actual fun variantToInt64(varin: ConstPtr, pllret: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToInt64(varin.rawAddress, pllret.rawAddress)

public actual fun variantToInt64Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToInt64Array(variable.rawAddress, prgn.rawAddress, crgn.toInt(), pcelem.rawAddress)

public actual fun variantToInt64ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToInt64ArrayAlloc(variable.rawAddress, pprgn.rawAddress, pcelem.rawAddress)

public actual fun variantToInt64WithDefault(varin: ConstPtr, lldefault: Long): Long =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToInt64WithDefault(varin.rawAddress, lldefault)

public actual fun variantToString(varin: ConstPtr, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToString(varin.rawAddress, pszbuf.rawAddress, cchbuf.toInt())

public actual fun variantToStringAlloc(varin: ConstPtr, ppszbuf: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToStringAlloc(varin.rawAddress, ppszbuf.rawAddress)

public actual fun variantToStringArray(variable: ConstPtr, prgsz: MutPtr, crgsz: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToStringArray(variable.rawAddress, prgsz.rawAddress, crgsz.toInt(), pcelem.rawAddress)

public actual fun variantToStringArrayAlloc(variable: ConstPtr, pprgsz: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToStringArrayAlloc(variable.rawAddress, pprgsz.rawAddress, pcelem.rawAddress)

public actual fun variantToStringWithDefault(varin: ConstPtr, pszdefault: Pcwstr): Pcwstr =
    ConstPtr(WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToStringWithDefault(varin.rawAddress, pszdefault.rawAddress))

public actual fun variantToUInt16(varin: ConstPtr, puiret: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToUInt16(varin.rawAddress, puiret.rawAddress)

public actual fun variantToUInt16Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToUInt16Array(variable.rawAddress, prgn.rawAddress, crgn.toInt(), pcelem.rawAddress)

public actual fun variantToUInt16ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToUInt16ArrayAlloc(variable.rawAddress, pprgn.rawAddress, pcelem.rawAddress)

public actual fun variantToUInt16WithDefault(varin: ConstPtr, uidefault: UShort): UShort =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToUInt16WithDefault(varin.rawAddress, uidefault.toShort()).toUShort()

public actual fun variantToUInt32(varin: ConstPtr, pulret: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToUInt32(varin.rawAddress, pulret.rawAddress)

public actual fun variantToUInt32Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToUInt32Array(variable.rawAddress, prgn.rawAddress, crgn.toInt(), pcelem.rawAddress)

public actual fun variantToUInt32ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToUInt32ArrayAlloc(variable.rawAddress, pprgn.rawAddress, pcelem.rawAddress)

public actual fun variantToUInt32WithDefault(varin: ConstPtr, uldefault: UInt): UInt =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToUInt32WithDefault(varin.rawAddress, uldefault.toInt()).toUInt()

public actual fun variantToUInt64(varin: ConstPtr, pullret: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToUInt64(varin.rawAddress, pullret.rawAddress)

public actual fun variantToUInt64Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToUInt64Array(variable.rawAddress, prgn.rawAddress, crgn.toInt(), pcelem.rawAddress)

public actual fun variantToUInt64ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToUInt64ArrayAlloc(variable.rawAddress, pprgn.rawAddress, pcelem.rawAddress)

public actual fun variantToUInt64WithDefault(varin: ConstPtr, ulldefault: ULong): ULong =
    WindowsWin32SystemVariantJniBridge.windowssysWindowsWin32SystemVariantVariantToUInt64WithDefault(varin.rawAddress, ulldefault.toLong()).toULong()
