package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance

public expect fun clearVariantArray(pvars: MutPtr, cvars: UInt)

public expect fun dosDateTimeToVariantTime(wdosdate: UShort, wdostime: UShort, pvtime: MutPtr): Int

public expect fun initVariantFromBooleanArray(prgf: ConstPtr, celems: UInt, pvar: MutPtr): Hresult

public expect fun initVariantFromBuffer(pv: ConstPtr, cb: UInt, pvar: MutPtr): Hresult

public expect fun initVariantFromDoubleArray(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult

public expect fun initVariantFromFileTime(pft: ConstPtr, pvar: MutPtr): Hresult

public expect fun initVariantFromFileTimeArray(prgft: ConstPtr, celems: UInt, pvar: MutPtr): Hresult

public expect fun initVariantFromGUIDAsString(guid: ConstPtr, pvar: MutPtr): Hresult

public expect fun initVariantFromInt16Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult

public expect fun initVariantFromInt32Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult

public expect fun initVariantFromInt64Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult

public expect fun initVariantFromResource(hinst: Hinstance, id: UInt, pvar: MutPtr): Hresult

public expect fun initVariantFromStringArray(prgsz: ConstPtr, celems: UInt, pvar: MutPtr): Hresult

public expect fun initVariantFromUInt16Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult

public expect fun initVariantFromUInt32Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult

public expect fun initVariantFromUInt64Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult

public expect fun initVariantFromVariantArrayElem(varin: ConstPtr, ielem: UInt, pvar: MutPtr): Hresult

public expect fun systemTimeToVariantTime(lpsystemtime: ConstPtr, pvtime: MutPtr): Int

public expect fun variantUserFree(param0: ConstPtr, param1: ConstPtr)

public expect fun variantUserFree64(param0: ConstPtr, param1: ConstPtr)

public expect fun variantUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun variantUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr

public expect fun variantUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun variantUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt

public expect fun variantUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun variantUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr

public expect fun variantChangeType(pvargdest: MutPtr, pvarsrc: ConstPtr, wflags: VarChangeFlags, vt: Varenum): Hresult

public expect fun variantChangeTypeEx(pvargdest: MutPtr, pvarsrc: ConstPtr, lcid: UInt, wflags: VarChangeFlags, vt: Varenum): Hresult

public expect fun variantClear(pvarg: MutPtr): Hresult

public expect fun variantCompare(var1: ConstPtr, var2: ConstPtr): Int

public expect fun variantCopy(pvargdest: MutPtr, pvargsrc: ConstPtr): Hresult

public expect fun variantCopyInd(pvardest: MutPtr, pvargsrc: ConstPtr): Hresult

public expect fun variantGetBooleanElem(variable: ConstPtr, ielem: UInt, pfval: MutPtr): Hresult

public expect fun variantGetDoubleElem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult

public expect fun variantGetElementCount(varin: ConstPtr): UInt

public expect fun variantGetInt16Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult

public expect fun variantGetInt32Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult

public expect fun variantGetInt64Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult

public expect fun variantGetStringElem(variable: ConstPtr, ielem: UInt, ppszval: MutPtr): Hresult

public expect fun variantGetUInt16Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult

public expect fun variantGetUInt32Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult

public expect fun variantGetUInt64Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult

public expect fun variantInit(pvarg: MutPtr)

public expect fun variantTimeToDosDateTime(vtime: Double, pwdosdate: MutPtr, pwdostime: MutPtr): Int

public expect fun variantTimeToSystemTime(vtime: Double, lpsystemtime: MutPtr): Int

public expect fun variantToBoolean(varin: ConstPtr, pfret: MutPtr): Hresult

public expect fun variantToBooleanArray(variable: ConstPtr, prgf: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult

public expect fun variantToBooleanArrayAlloc(variable: ConstPtr, pprgf: MutPtr, pcelem: MutPtr): Hresult

public expect fun variantToBooleanWithDefault(varin: ConstPtr, fdefault: Bool): Bool

public expect fun variantToBuffer(varin: ConstPtr, pv: MutPtr, cb: UInt): Hresult

public expect fun variantToDosDateTime(varin: ConstPtr, pwdate: MutPtr, pwtime: MutPtr): Hresult

public expect fun variantToDouble(varin: ConstPtr, pdblret: MutPtr): Hresult

public expect fun variantToDoubleArray(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult

public expect fun variantToDoubleArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult

public expect fun variantToDoubleWithDefault(varin: ConstPtr, dbldefault: Double): Double

public expect fun variantToFileTime(varin: ConstPtr, stfout: PstimeFlags, pftout: MutPtr): Hresult

public expect fun variantToGUID(varin: ConstPtr, pguid: MutPtr): Hresult

public expect fun variantToInt16(varin: ConstPtr, piret: MutPtr): Hresult

public expect fun variantToInt16Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult

public expect fun variantToInt16ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult

public expect fun variantToInt16WithDefault(varin: ConstPtr, idefault: Short): Short

public expect fun variantToInt32(varin: ConstPtr, plret: MutPtr): Hresult

public expect fun variantToInt32Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult

public expect fun variantToInt32ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult

public expect fun variantToInt32WithDefault(varin: ConstPtr, ldefault: Int): Int

public expect fun variantToInt64(varin: ConstPtr, pllret: MutPtr): Hresult

public expect fun variantToInt64Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult

public expect fun variantToInt64ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult

public expect fun variantToInt64WithDefault(varin: ConstPtr, lldefault: Long): Long

public expect fun variantToString(varin: ConstPtr, pszbuf: Pwstr, cchbuf: UInt): Hresult

public expect fun variantToStringAlloc(varin: ConstPtr, ppszbuf: MutPtr): Hresult

public expect fun variantToStringArray(variable: ConstPtr, prgsz: MutPtr, crgsz: UInt, pcelem: MutPtr): Hresult

public expect fun variantToStringArrayAlloc(variable: ConstPtr, pprgsz: MutPtr, pcelem: MutPtr): Hresult

public expect fun variantToStringWithDefault(varin: ConstPtr, pszdefault: Pcwstr): Pcwstr

public expect fun variantToUInt16(varin: ConstPtr, puiret: MutPtr): Hresult

public expect fun variantToUInt16Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult

public expect fun variantToUInt16ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult

public expect fun variantToUInt16WithDefault(varin: ConstPtr, uidefault: UShort): UShort

public expect fun variantToUInt32(varin: ConstPtr, pulret: MutPtr): Hresult

public expect fun variantToUInt32Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult

public expect fun variantToUInt32ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult

public expect fun variantToUInt32WithDefault(varin: ConstPtr, uldefault: UInt): UInt

public expect fun variantToUInt64(varin: ConstPtr, pullret: MutPtr): Hresult

public expect fun variantToUInt64Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult

public expect fun variantToUInt64ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult

public expect fun variantToUInt64WithDefault(varin: ConstPtr, ulldefault: ULong): ULong
