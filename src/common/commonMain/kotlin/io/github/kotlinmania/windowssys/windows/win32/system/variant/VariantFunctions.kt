package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance

public expect fun clearVariantArray(pvars: COpaquePointer?, cvars: UInt)

public expect fun dosDateTimeToVariantTime(wdosdate: UShort, wdostime: UShort, pvtime: COpaquePointer?): Int

public expect fun initVariantFromBooleanArray(prgf: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult

public expect fun initVariantFromBuffer(pv: COpaquePointer?, cb: UInt, pvar: COpaquePointer?): Hresult

public expect fun initVariantFromDoubleArray(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult

public expect fun initVariantFromFileTime(pft: COpaquePointer?, pvar: COpaquePointer?): Hresult

public expect fun initVariantFromFileTimeArray(prgft: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult

public expect fun initVariantFromGUIDAsString(guid: COpaquePointer?, pvar: COpaquePointer?): Hresult

public expect fun initVariantFromInt16Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult

public expect fun initVariantFromInt32Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult

public expect fun initVariantFromInt64Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult

public expect fun initVariantFromResource(hinst: Hinstance, id: UInt, pvar: COpaquePointer?): Hresult

public expect fun initVariantFromStringArray(prgsz: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult

public expect fun initVariantFromUInt16Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult

public expect fun initVariantFromUInt32Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult

public expect fun initVariantFromUInt64Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult

public expect fun initVariantFromVariantArrayElem(varin: COpaquePointer?, ielem: UInt, pvar: COpaquePointer?): Hresult

public expect fun systemTimeToVariantTime(lpsystemtime: COpaquePointer?, pvtime: COpaquePointer?): Int

public expect fun variantUserFree(param0: COpaquePointer?, param1: COpaquePointer?)

public expect fun variantUserFree64(param0: COpaquePointer?, param1: COpaquePointer?)

public expect fun variantUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer?

public expect fun variantUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer?

public expect fun variantUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt

public expect fun variantUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt

public expect fun variantUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer?

public expect fun variantUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer?

public expect fun variantChangeType(pvargdest: COpaquePointer?, pvarsrc: COpaquePointer?, wflags: VarChangeFlags, vt: Varenum): Hresult

public expect fun variantChangeTypeEx(pvargdest: COpaquePointer?, pvarsrc: COpaquePointer?, lcid: UInt, wflags: VarChangeFlags, vt: Varenum): Hresult

public expect fun variantClear(pvarg: COpaquePointer?): Hresult

public expect fun variantCompare(var1: COpaquePointer?, var2: COpaquePointer?): Int

public expect fun variantCopy(pvargdest: COpaquePointer?, pvargsrc: COpaquePointer?): Hresult

public expect fun variantCopyInd(pvardest: COpaquePointer?, pvargsrc: COpaquePointer?): Hresult

public expect fun variantGetBooleanElem(variable: COpaquePointer?, ielem: UInt, pfval: COpaquePointer?): Hresult

public expect fun variantGetDoubleElem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult

public expect fun variantGetElementCount(varin: COpaquePointer?): UInt

public expect fun variantGetInt16Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult

public expect fun variantGetInt32Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult

public expect fun variantGetInt64Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult

public expect fun variantGetStringElem(variable: COpaquePointer?, ielem: UInt, ppszval: COpaquePointer?): Hresult

public expect fun variantGetUInt16Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult

public expect fun variantGetUInt32Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult

public expect fun variantGetUInt64Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult

public expect fun variantInit(pvarg: COpaquePointer?)

public expect fun variantTimeToDosDateTime(vtime: Double, pwdosdate: COpaquePointer?, pwdostime: COpaquePointer?): Int

public expect fun variantTimeToSystemTime(vtime: Double, lpsystemtime: COpaquePointer?): Int

public expect fun variantToBoolean(varin: COpaquePointer?, pfret: COpaquePointer?): Hresult

public expect fun variantToBooleanArray(variable: COpaquePointer?, prgf: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult

public expect fun variantToBooleanArrayAlloc(variable: COpaquePointer?, pprgf: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun variantToBooleanWithDefault(varin: COpaquePointer?, fdefault: Bool): Bool

public expect fun variantToBuffer(varin: COpaquePointer?, pv: COpaquePointer?, cb: UInt): Hresult

public expect fun variantToDosDateTime(varin: COpaquePointer?, pwdate: COpaquePointer?, pwtime: COpaquePointer?): Hresult

public expect fun variantToDouble(varin: COpaquePointer?, pdblret: COpaquePointer?): Hresult

public expect fun variantToDoubleArray(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult

public expect fun variantToDoubleArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun variantToDoubleWithDefault(varin: COpaquePointer?, dbldefault: Double): Double

public expect fun variantToFileTime(varin: COpaquePointer?, stfout: PstimeFlags, pftout: COpaquePointer?): Hresult

public expect fun variantToGUID(varin: COpaquePointer?, pguid: COpaquePointer?): Hresult

public expect fun variantToInt16(varin: COpaquePointer?, piret: COpaquePointer?): Hresult

public expect fun variantToInt16Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult

public expect fun variantToInt16ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun variantToInt16WithDefault(varin: COpaquePointer?, idefault: Short): Short

public expect fun variantToInt32(varin: COpaquePointer?, plret: COpaquePointer?): Hresult

public expect fun variantToInt32Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult

public expect fun variantToInt32ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun variantToInt32WithDefault(varin: COpaquePointer?, ldefault: Int): Int

public expect fun variantToInt64(varin: COpaquePointer?, pllret: COpaquePointer?): Hresult

public expect fun variantToInt64Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult

public expect fun variantToInt64ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun variantToInt64WithDefault(varin: COpaquePointer?, lldefault: Long): Long

public expect fun variantToString(varin: COpaquePointer?, pszbuf: Pwstr, cchbuf: UInt): Hresult

public expect fun variantToStringAlloc(varin: COpaquePointer?, ppszbuf: COpaquePointer?): Hresult

public expect fun variantToStringArray(variable: COpaquePointer?, prgsz: COpaquePointer?, crgsz: UInt, pcelem: COpaquePointer?): Hresult

public expect fun variantToStringArrayAlloc(variable: COpaquePointer?, pprgsz: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun variantToStringWithDefault(varin: COpaquePointer?, pszdefault: Pcwstr): Pcwstr

public expect fun variantToUInt16(varin: COpaquePointer?, puiret: COpaquePointer?): Hresult

public expect fun variantToUInt16Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult

public expect fun variantToUInt16ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun variantToUInt16WithDefault(varin: COpaquePointer?, uidefault: UShort): UShort

public expect fun variantToUInt32(varin: COpaquePointer?, pulret: COpaquePointer?): Hresult

public expect fun variantToUInt32Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult

public expect fun variantToUInt32ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun variantToUInt32WithDefault(varin: COpaquePointer?, uldefault: UInt): UInt

public expect fun variantToUInt64(varin: COpaquePointer?, pullret: COpaquePointer?): Hresult

public expect fun variantToUInt64Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult

public expect fun variantToUInt64ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun variantToUInt64WithDefault(varin: COpaquePointer?, ulldefault: ULong): ULong
