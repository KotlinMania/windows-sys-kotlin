@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun clearVariantArray(pvars: MutPtr, cvars: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantClearVariantArray")

public actual fun dosDateTimeToVariantTime(wdosdate: UShort, wdostime: UShort, pvtime: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantDosDateTimeToVariantTime")

public actual fun initVariantFromBooleanArray(prgf: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromBooleanArray")

public actual fun initVariantFromBuffer(pv: ConstPtr, cb: UInt, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromBuffer")

public actual fun initVariantFromDoubleArray(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromDoubleArray")

public actual fun initVariantFromFileTime(pft: ConstPtr, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromFileTime")

public actual fun initVariantFromFileTimeArray(prgft: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromFileTimeArray")

public actual fun initVariantFromGUIDAsString(guid: ConstPtr, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromGUIDAsString")

public actual fun initVariantFromInt16Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromInt16Array")

public actual fun initVariantFromInt32Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromInt32Array")

public actual fun initVariantFromInt64Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromInt64Array")

public actual fun initVariantFromResource(hinst: Hinstance, id: UInt, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromResource")

public actual fun initVariantFromStringArray(prgsz: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromStringArray")

public actual fun initVariantFromUInt16Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromUInt16Array")

public actual fun initVariantFromUInt32Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromUInt32Array")

public actual fun initVariantFromUInt64Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromUInt64Array")

public actual fun initVariantFromVariantArrayElem(varin: ConstPtr, ielem: UInt, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromVariantArrayElem")

public actual fun systemTimeToVariantTime(lpsystemtime: ConstPtr, pvtime: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantSystemTimeToVariantTime")

public actual fun variantUserFree(param0: ConstPtr, param1: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantUserFree")

public actual fun variantUserFree64(param0: ConstPtr, param1: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantUserFree64")

public actual fun variantUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantUserMarshal")

public actual fun variantUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantUserMarshal64")

public actual fun variantUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantUserSize")

public actual fun variantUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantUserSize64")

public actual fun variantUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantUserUnmarshal")

public actual fun variantUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantUserUnmarshal64")

public actual fun variantChangeType(pvargdest: MutPtr, pvarsrc: ConstPtr, wflags: VarChangeFlags, vt: Varenum): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantChangeType")

public actual fun variantChangeTypeEx(pvargdest: MutPtr, pvarsrc: ConstPtr, lcid: UInt, wflags: VarChangeFlags, vt: Varenum): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantChangeTypeEx")

public actual fun variantClear(pvarg: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantClear")

public actual fun variantCompare(var1: ConstPtr, var2: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantCompare")

public actual fun variantCopy(pvargdest: MutPtr, pvargsrc: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantCopy")

public actual fun variantCopyInd(pvardest: MutPtr, pvargsrc: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantCopyInd")

public actual fun variantGetBooleanElem(variable: ConstPtr, ielem: UInt, pfval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetBooleanElem")

public actual fun variantGetDoubleElem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetDoubleElem")

public actual fun variantGetElementCount(varin: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetElementCount")

public actual fun variantGetInt16Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetInt16Elem")

public actual fun variantGetInt32Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetInt32Elem")

public actual fun variantGetInt64Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetInt64Elem")

public actual fun variantGetStringElem(variable: ConstPtr, ielem: UInt, ppszval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetStringElem")

public actual fun variantGetUInt16Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetUInt16Elem")

public actual fun variantGetUInt32Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetUInt32Elem")

public actual fun variantGetUInt64Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetUInt64Elem")

public actual fun variantInit(pvarg: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantInit")

public actual fun variantTimeToDosDateTime(vtime: Double, pwdosdate: MutPtr, pwdostime: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantTimeToDosDateTime")

public actual fun variantTimeToSystemTime(vtime: Double, lpsystemtime: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantTimeToSystemTime")

public actual fun variantToBoolean(varin: ConstPtr, pfret: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToBoolean")

public actual fun variantToBooleanArray(variable: ConstPtr, prgf: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToBooleanArray")

public actual fun variantToBooleanArrayAlloc(variable: ConstPtr, pprgf: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToBooleanArrayAlloc")

public actual fun variantToBooleanWithDefault(varin: ConstPtr, fdefault: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToBooleanWithDefault")

public actual fun variantToBuffer(varin: ConstPtr, pv: MutPtr, cb: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToBuffer")

public actual fun variantToDosDateTime(varin: ConstPtr, pwdate: MutPtr, pwtime: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToDosDateTime")

public actual fun variantToDouble(varin: ConstPtr, pdblret: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToDouble")

public actual fun variantToDoubleArray(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToDoubleArray")

public actual fun variantToDoubleArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToDoubleArrayAlloc")

public actual fun variantToDoubleWithDefault(varin: ConstPtr, dbldefault: Double): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToDoubleWithDefault")

public actual fun variantToFileTime(varin: ConstPtr, stfout: PstimeFlags, pftout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToFileTime")

public actual fun variantToGUID(varin: ConstPtr, pguid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToGUID")

public actual fun variantToInt16(varin: ConstPtr, piret: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt16")

public actual fun variantToInt16Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt16Array")

public actual fun variantToInt16ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt16ArrayAlloc")

public actual fun variantToInt16WithDefault(varin: ConstPtr, idefault: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt16WithDefault")

public actual fun variantToInt32(varin: ConstPtr, plret: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt32")

public actual fun variantToInt32Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt32Array")

public actual fun variantToInt32ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt32ArrayAlloc")

public actual fun variantToInt32WithDefault(varin: ConstPtr, ldefault: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt32WithDefault")

public actual fun variantToInt64(varin: ConstPtr, pllret: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt64")

public actual fun variantToInt64Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt64Array")

public actual fun variantToInt64ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt64ArrayAlloc")

public actual fun variantToInt64WithDefault(varin: ConstPtr, lldefault: Long): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt64WithDefault")

public actual fun variantToString(varin: ConstPtr, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToString")

public actual fun variantToStringAlloc(varin: ConstPtr, ppszbuf: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToStringAlloc")

public actual fun variantToStringArray(variable: ConstPtr, prgsz: MutPtr, crgsz: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToStringArray")

public actual fun variantToStringArrayAlloc(variable: ConstPtr, pprgsz: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToStringArrayAlloc")

public actual fun variantToStringWithDefault(varin: ConstPtr, pszdefault: Pcwstr): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToStringWithDefault")

public actual fun variantToUInt16(varin: ConstPtr, puiret: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt16")

public actual fun variantToUInt16Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt16Array")

public actual fun variantToUInt16ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt16ArrayAlloc")

public actual fun variantToUInt16WithDefault(varin: ConstPtr, uidefault: UShort): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt16WithDefault")

public actual fun variantToUInt32(varin: ConstPtr, pulret: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt32")

public actual fun variantToUInt32Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt32Array")

public actual fun variantToUInt32ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt32ArrayAlloc")

public actual fun variantToUInt32WithDefault(varin: ConstPtr, uldefault: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt32WithDefault")

public actual fun variantToUInt64(varin: ConstPtr, pullret: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt64")

public actual fun variantToUInt64Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt64Array")

public actual fun variantToUInt64ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt64ArrayAlloc")

public actual fun variantToUInt64WithDefault(varin: ConstPtr, ulldefault: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt64WithDefault")
