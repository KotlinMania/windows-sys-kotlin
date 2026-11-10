@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun clearVariantArray(pvars: COpaquePointer?, cvars: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_clearVariantArray(pvars?.value?.toCPointer<ByteVar>(), cvars)
}

public actual fun dosDateTimeToVariantTime(wdosdate: UShort, wdostime: UShort, pvtime: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_dosDateTimeToVariantTime(wdosdate, wdostime, pvtime?.value?.toCPointer<ByteVar>())

public actual fun initVariantFromBooleanArray(prgf: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_initVariantFromBooleanArray(prgf?.value?.toCPointer<ByteVar>(), celems, pvar?.value?.toCPointer<ByteVar>())

public actual fun initVariantFromBuffer(pv: COpaquePointer?, cb: UInt, pvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_initVariantFromBuffer(pv?.value?.toCPointer<ByteVar>(), cb, pvar?.value?.toCPointer<ByteVar>())

public actual fun initVariantFromDoubleArray(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_initVariantFromDoubleArray(prgn?.value?.toCPointer<ByteVar>(), celems, pvar?.value?.toCPointer<ByteVar>())

public actual fun initVariantFromFileTime(pft: COpaquePointer?, pvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_initVariantFromFileTime(pft?.value?.toCPointer<ByteVar>(), pvar?.value?.toCPointer<ByteVar>())

public actual fun initVariantFromFileTimeArray(prgft: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_initVariantFromFileTimeArray(prgft?.value?.toCPointer<ByteVar>(), celems, pvar?.value?.toCPointer<ByteVar>())

public actual fun initVariantFromGUIDAsString(guid: COpaquePointer?, pvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_initVariantFromGUIDAsString(guid?.value?.toCPointer<ByteVar>(), pvar?.value?.toCPointer<ByteVar>())

public actual fun initVariantFromInt16Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_initVariantFromInt16Array(prgn?.value?.toCPointer<ByteVar>(), celems, pvar?.value?.toCPointer<ByteVar>())

public actual fun initVariantFromInt32Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_initVariantFromInt32Array(prgn?.value?.toCPointer<ByteVar>(), celems, pvar?.value?.toCPointer<ByteVar>())

public actual fun initVariantFromInt64Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_initVariantFromInt64Array(prgn?.value?.toCPointer<ByteVar>(), celems, pvar?.value?.toCPointer<ByteVar>())

public actual fun initVariantFromResource(hinst: Hinstance, id: UInt, pvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_initVariantFromResource(hinst?.value?.toCPointer<ByteVar>(), id, pvar?.value?.toCPointer<ByteVar>())

public actual fun initVariantFromStringArray(prgsz: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_initVariantFromStringArray(prgsz?.value?.toCPointer<ByteVar>(), celems, pvar?.value?.toCPointer<ByteVar>())

public actual fun initVariantFromUInt16Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_initVariantFromUInt16Array(prgn?.value?.toCPointer<ByteVar>(), celems, pvar?.value?.toCPointer<ByteVar>())

public actual fun initVariantFromUInt32Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_initVariantFromUInt32Array(prgn?.value?.toCPointer<ByteVar>(), celems, pvar?.value?.toCPointer<ByteVar>())

public actual fun initVariantFromUInt64Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_initVariantFromUInt64Array(prgn?.value?.toCPointer<ByteVar>(), celems, pvar?.value?.toCPointer<ByteVar>())

public actual fun initVariantFromVariantArrayElem(varin: COpaquePointer?, ielem: UInt, pvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_initVariantFromVariantArrayElem(varin?.value?.toCPointer<ByteVar>(), ielem, pvar?.value?.toCPointer<ByteVar>())

public actual fun systemTimeToVariantTime(lpsystemtime: COpaquePointer?, pvtime: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_systemTimeToVariantTime(lpsystemtime?.value?.toCPointer<ByteVar>(), pvtime?.value?.toCPointer<ByteVar>())

public actual fun variantUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantUserFree(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun variantUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantUserFree64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())
}

public actual fun variantUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantUserMarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun variantUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantUserMarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun variantUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantUserSize(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun variantUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantUserSize64(param0?.value?.toCPointer<ByteVar>(), param1, param2?.value?.toCPointer<ByteVar>())

public actual fun variantUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantUserUnmarshal(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun variantUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantUserUnmarshal64(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun variantChangeType(pvargdest: COpaquePointer?, pvarsrc: COpaquePointer?, wflags: VarChangeFlags, vt: Varenum): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantChangeType(pvargdest?.value?.toCPointer<ByteVar>(), pvarsrc?.value?.toCPointer<ByteVar>(), wflags, vt)

public actual fun variantChangeTypeEx(pvargdest: COpaquePointer?, pvarsrc: COpaquePointer?, lcid: UInt, wflags: VarChangeFlags, vt: Varenum): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantChangeTypeEx(pvargdest?.value?.toCPointer<ByteVar>(), pvarsrc?.value?.toCPointer<ByteVar>(), lcid, wflags, vt)

public actual fun variantClear(pvarg: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantClear(pvarg?.value?.toCPointer<ByteVar>())

public actual fun variantCompare(var1: COpaquePointer?, var2: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantCompare(var1?.value?.toCPointer<ByteVar>(), var2?.value?.toCPointer<ByteVar>())

public actual fun variantCopy(pvargdest: COpaquePointer?, pvargsrc: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantCopy(pvargdest?.value?.toCPointer<ByteVar>(), pvargsrc?.value?.toCPointer<ByteVar>())

public actual fun variantCopyInd(pvardest: COpaquePointer?, pvargsrc: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantCopyInd(pvardest?.value?.toCPointer<ByteVar>(), pvargsrc?.value?.toCPointer<ByteVar>())

public actual fun variantGetBooleanElem(variable: COpaquePointer?, ielem: UInt, pfval: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantGetBooleanElem(variable?.value?.toCPointer<ByteVar>(), ielem, pfval?.value?.toCPointer<ByteVar>())

public actual fun variantGetDoubleElem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantGetDoubleElem(variable?.value?.toCPointer<ByteVar>(), ielem, pnval?.value?.toCPointer<ByteVar>())

public actual fun variantGetElementCount(varin: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantGetElementCount(varin?.value?.toCPointer<ByteVar>())

public actual fun variantGetInt16Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantGetInt16Elem(variable?.value?.toCPointer<ByteVar>(), ielem, pnval?.value?.toCPointer<ByteVar>())

public actual fun variantGetInt32Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantGetInt32Elem(variable?.value?.toCPointer<ByteVar>(), ielem, pnval?.value?.toCPointer<ByteVar>())

public actual fun variantGetInt64Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantGetInt64Elem(variable?.value?.toCPointer<ByteVar>(), ielem, pnval?.value?.toCPointer<ByteVar>())

public actual fun variantGetStringElem(variable: COpaquePointer?, ielem: UInt, ppszval: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantGetStringElem(variable?.value?.toCPointer<ByteVar>(), ielem, ppszval?.value?.toCPointer<ByteVar>())

public actual fun variantGetUInt16Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantGetUInt16Elem(variable?.value?.toCPointer<ByteVar>(), ielem, pnval?.value?.toCPointer<ByteVar>())

public actual fun variantGetUInt32Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantGetUInt32Elem(variable?.value?.toCPointer<ByteVar>(), ielem, pnval?.value?.toCPointer<ByteVar>())

public actual fun variantGetUInt64Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantGetUInt64Elem(variable?.value?.toCPointer<ByteVar>(), ielem, pnval?.value?.toCPointer<ByteVar>())

public actual fun variantInit(pvarg: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantInit(pvarg?.value?.toCPointer<ByteVar>())
}

public actual fun variantTimeToDosDateTime(vtime: Double, pwdosdate: COpaquePointer?, pwdostime: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantTimeToDosDateTime(vtime, pwdosdate?.value?.toCPointer<ByteVar>(), pwdostime?.value?.toCPointer<ByteVar>())

public actual fun variantTimeToSystemTime(vtime: Double, lpsystemtime: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantTimeToSystemTime(vtime, lpsystemtime?.value?.toCPointer<ByteVar>())

public actual fun variantToBoolean(varin: COpaquePointer?, pfret: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToBoolean(varin?.value?.toCPointer<ByteVar>(), pfret?.value?.toCPointer<ByteVar>())

public actual fun variantToBooleanArray(variable: COpaquePointer?, prgf: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToBooleanArray(variable?.value?.toCPointer<ByteVar>(), prgf?.value?.toCPointer<ByteVar>(), crgn, pcelem?.value?.toCPointer<ByteVar>())

public actual fun variantToBooleanArrayAlloc(variable: COpaquePointer?, pprgf: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToBooleanArrayAlloc(variable?.value?.toCPointer<ByteVar>(), pprgf?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun variantToBooleanWithDefault(varin: COpaquePointer?, fdefault: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToBooleanWithDefault(varin?.value?.toCPointer<ByteVar>(), fdefault)

public actual fun variantToBuffer(varin: COpaquePointer?, pv: COpaquePointer?, cb: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToBuffer(varin?.value?.toCPointer<ByteVar>(), pv?.value?.toCPointer<ByteVar>(), cb)

public actual fun variantToDosDateTime(varin: COpaquePointer?, pwdate: COpaquePointer?, pwtime: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToDosDateTime(varin?.value?.toCPointer<ByteVar>(), pwdate?.value?.toCPointer<ByteVar>(), pwtime?.value?.toCPointer<ByteVar>())

public actual fun variantToDouble(varin: COpaquePointer?, pdblret: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToDouble(varin?.value?.toCPointer<ByteVar>(), pdblret?.value?.toCPointer<ByteVar>())

public actual fun variantToDoubleArray(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToDoubleArray(variable?.value?.toCPointer<ByteVar>(), prgn?.value?.toCPointer<ByteVar>(), crgn, pcelem?.value?.toCPointer<ByteVar>())

public actual fun variantToDoubleArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToDoubleArrayAlloc(variable?.value?.toCPointer<ByteVar>(), pprgn?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun variantToDoubleWithDefault(varin: COpaquePointer?, dbldefault: Double): Double =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToDoubleWithDefault(varin?.value?.toCPointer<ByteVar>(), dbldefault)

public actual fun variantToFileTime(varin: COpaquePointer?, stfout: PstimeFlags, pftout: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToFileTime(varin?.value?.toCPointer<ByteVar>(), stfout, pftout?.value?.toCPointer<ByteVar>())

public actual fun variantToGUID(varin: COpaquePointer?, pguid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToGUID(varin?.value?.toCPointer<ByteVar>(), pguid?.value?.toCPointer<ByteVar>())

public actual fun variantToInt16(varin: COpaquePointer?, piret: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToInt16(varin?.value?.toCPointer<ByteVar>(), piret?.value?.toCPointer<ByteVar>())

public actual fun variantToInt16Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToInt16Array(variable?.value?.toCPointer<ByteVar>(), prgn?.value?.toCPointer<ByteVar>(), crgn, pcelem?.value?.toCPointer<ByteVar>())

public actual fun variantToInt16ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToInt16ArrayAlloc(variable?.value?.toCPointer<ByteVar>(), pprgn?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun variantToInt16WithDefault(varin: COpaquePointer?, idefault: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToInt16WithDefault(varin?.value?.toCPointer<ByteVar>(), idefault)

public actual fun variantToInt32(varin: COpaquePointer?, plret: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToInt32(varin?.value?.toCPointer<ByteVar>(), plret?.value?.toCPointer<ByteVar>())

public actual fun variantToInt32Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToInt32Array(variable?.value?.toCPointer<ByteVar>(), prgn?.value?.toCPointer<ByteVar>(), crgn, pcelem?.value?.toCPointer<ByteVar>())

public actual fun variantToInt32ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToInt32ArrayAlloc(variable?.value?.toCPointer<ByteVar>(), pprgn?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun variantToInt32WithDefault(varin: COpaquePointer?, ldefault: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToInt32WithDefault(varin?.value?.toCPointer<ByteVar>(), ldefault)

public actual fun variantToInt64(varin: COpaquePointer?, pllret: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToInt64(varin?.value?.toCPointer<ByteVar>(), pllret?.value?.toCPointer<ByteVar>())

public actual fun variantToInt64Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToInt64Array(variable?.value?.toCPointer<ByteVar>(), prgn?.value?.toCPointer<ByteVar>(), crgn, pcelem?.value?.toCPointer<ByteVar>())

public actual fun variantToInt64ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToInt64ArrayAlloc(variable?.value?.toCPointer<ByteVar>(), pprgn?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun variantToInt64WithDefault(varin: COpaquePointer?, lldefault: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToInt64WithDefault(varin?.value?.toCPointer<ByteVar>(), lldefault)

public actual fun variantToString(varin: COpaquePointer?, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToString(varin?.value?.toCPointer<ByteVar>(), pszbuf?.value?.toCPointer<ByteVar>(), cchbuf)

public actual fun variantToStringAlloc(varin: COpaquePointer?, ppszbuf: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToStringAlloc(varin?.value?.toCPointer<ByteVar>(), ppszbuf?.value?.toCPointer<ByteVar>())

public actual fun variantToStringArray(variable: COpaquePointer?, prgsz: COpaquePointer?, crgsz: UInt, pcelem: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToStringArray(variable?.value?.toCPointer<ByteVar>(), prgsz?.value?.toCPointer<ByteVar>(), crgsz, pcelem?.value?.toCPointer<ByteVar>())

public actual fun variantToStringArrayAlloc(variable: COpaquePointer?, pprgsz: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToStringArrayAlloc(variable?.value?.toCPointer<ByteVar>(), pprgsz?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun variantToStringWithDefault(varin: COpaquePointer?, pszdefault: Pcwstr): Pcwstr =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToStringWithDefault(varin?.value?.toCPointer<ByteVar>(), pszdefault?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun variantToUInt16(varin: COpaquePointer?, puiret: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToUInt16(varin?.value?.toCPointer<ByteVar>(), puiret?.value?.toCPointer<ByteVar>())

public actual fun variantToUInt16Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToUInt16Array(variable?.value?.toCPointer<ByteVar>(), prgn?.value?.toCPointer<ByteVar>(), crgn, pcelem?.value?.toCPointer<ByteVar>())

public actual fun variantToUInt16ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToUInt16ArrayAlloc(variable?.value?.toCPointer<ByteVar>(), pprgn?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun variantToUInt16WithDefault(varin: COpaquePointer?, uidefault: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToUInt16WithDefault(varin?.value?.toCPointer<ByteVar>(), uidefault)

public actual fun variantToUInt32(varin: COpaquePointer?, pulret: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToUInt32(varin?.value?.toCPointer<ByteVar>(), pulret?.value?.toCPointer<ByteVar>())

public actual fun variantToUInt32Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToUInt32Array(variable?.value?.toCPointer<ByteVar>(), prgn?.value?.toCPointer<ByteVar>(), crgn, pcelem?.value?.toCPointer<ByteVar>())

public actual fun variantToUInt32ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToUInt32ArrayAlloc(variable?.value?.toCPointer<ByteVar>(), pprgn?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun variantToUInt32WithDefault(varin: COpaquePointer?, uldefault: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToUInt32WithDefault(varin?.value?.toCPointer<ByteVar>(), uldefault)

public actual fun variantToUInt64(varin: COpaquePointer?, pullret: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToUInt64(varin?.value?.toCPointer<ByteVar>(), pullret?.value?.toCPointer<ByteVar>())

public actual fun variantToUInt64Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToUInt64Array(variable?.value?.toCPointer<ByteVar>(), prgn?.value?.toCPointer<ByteVar>(), crgn, pcelem?.value?.toCPointer<ByteVar>())

public actual fun variantToUInt64ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToUInt64ArrayAlloc(variable?.value?.toCPointer<ByteVar>(), pprgn?.value?.toCPointer<ByteVar>(), pcelem?.value?.toCPointer<ByteVar>())

public actual fun variantToUInt64WithDefault(varin: COpaquePointer?, ulldefault: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.variant.cinterop.windowssys_windows_win32_system_variant_variantToUInt64WithDefault(varin?.value?.toCPointer<ByteVar>(), ulldefault)
