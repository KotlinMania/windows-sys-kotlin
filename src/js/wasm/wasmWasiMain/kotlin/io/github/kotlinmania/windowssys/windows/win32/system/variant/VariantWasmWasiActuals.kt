@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun clearVariantArray(pvars: MutPtr<Variant>, cvars: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantClearVariantArray")

public actual fun dosDateTimeToVariantTime(wdosdate: UShort, wdostime: UShort, pvtime: MutPtr<Double>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantDosDateTimeToVariantTime")

public actual fun initVariantFromBooleanArray(prgf: ConstPtr<Bool>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromBooleanArray")

public actual fun initVariantFromBuffer(pv: ConstPtr<CVoid>, cb: UInt, pvar: MutPtr<Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromBuffer")

public actual fun initVariantFromDoubleArray(prgn: ConstPtr<Double>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromDoubleArray")

public actual fun initVariantFromFileTime(pft: ConstPtr<Filetime>, pvar: MutPtr<Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromFileTime")

public actual fun initVariantFromFileTimeArray(prgft: ConstPtr<Filetime>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromFileTimeArray")

public actual fun initVariantFromGUIDAsString(guid: ConstPtr<Guid>, pvar: MutPtr<Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromGUIDAsString")

public actual fun initVariantFromInt16Array(prgn: ConstPtr<Short>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromInt16Array")

public actual fun initVariantFromInt32Array(prgn: ConstPtr<Int>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromInt32Array")

public actual fun initVariantFromInt64Array(prgn: ConstPtr<Long>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromInt64Array")

public actual fun initVariantFromResource(hinst: Hinstance, id: UInt, pvar: MutPtr<Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromResource")

public actual fun initVariantFromStringArray(prgsz: ConstPtr<Pcwstr>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromStringArray")

public actual fun initVariantFromUInt16Array(prgn: ConstPtr<UShort>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromUInt16Array")

public actual fun initVariantFromUInt32Array(prgn: ConstPtr<UInt>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromUInt32Array")

public actual fun initVariantFromUInt64Array(prgn: ConstPtr<ULong>, celems: UInt, pvar: MutPtr<Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromUInt64Array")

public actual fun initVariantFromVariantArrayElem(varin: ConstPtr<Variant>, ielem: UInt, pvar: MutPtr<Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantInitVariantFromVariantArrayElem")

public actual fun systemTimeToVariantTime(lpsystemtime: ConstPtr<Systemtime>, pvtime: MutPtr<Double>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantSystemTimeToVariantTime")

public actual fun variantUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Variant>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantUserFree")

public actual fun variantUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Variant>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantUserFree64")

public actual fun variantUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Variant>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantUserMarshal")

public actual fun variantUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Variant>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantUserMarshal64")

public actual fun variantUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Variant>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantUserSize")

public actual fun variantUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Variant>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantUserSize64")

public actual fun variantUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Variant>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantUserUnmarshal")

public actual fun variantUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Variant>): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantUserUnmarshal64")

public actual fun variantChangeType(pvargdest: MutPtr<Variant>, pvarsrc: ConstPtr<Variant>, wflags: VarChangeFlags, vt: Varenum): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantChangeType")

public actual fun variantChangeTypeEx(pvargdest: MutPtr<Variant>, pvarsrc: ConstPtr<Variant>, lcid: UInt, wflags: VarChangeFlags, vt: Varenum): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantChangeTypeEx")

public actual fun variantClear(pvarg: MutPtr<Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantClear")

public actual fun variantCompare(var1: ConstPtr<Variant>, var2: ConstPtr<Variant>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantCompare")

public actual fun variantCopy(pvargdest: MutPtr<Variant>, pvargsrc: ConstPtr<Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantCopy")

public actual fun variantCopyInd(pvardest: MutPtr<Variant>, pvargsrc: ConstPtr<Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantCopyInd")

public actual fun variantGetBooleanElem(variable: ConstPtr<Variant>, ielem: UInt, pfval: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetBooleanElem")

public actual fun variantGetDoubleElem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<Double>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetDoubleElem")

public actual fun variantGetElementCount(varin: ConstPtr<Variant>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetElementCount")

public actual fun variantGetInt16Elem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<Short>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetInt16Elem")

public actual fun variantGetInt32Elem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetInt32Elem")

public actual fun variantGetInt64Elem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetInt64Elem")

public actual fun variantGetStringElem(variable: ConstPtr<Variant>, ielem: UInt, ppszval: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetStringElem")

public actual fun variantGetUInt16Elem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<UShort>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetUInt16Elem")

public actual fun variantGetUInt32Elem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetUInt32Elem")

public actual fun variantGetUInt64Elem(variable: ConstPtr<Variant>, ielem: UInt, pnval: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantGetUInt64Elem")

public actual fun variantInit(pvarg: MutPtr<Variant>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantInit")

public actual fun variantTimeToDosDateTime(vtime: Double, pwdosdate: MutPtr<UShort>, pwdostime: MutPtr<UShort>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantTimeToDosDateTime")

public actual fun variantTimeToSystemTime(vtime: Double, lpsystemtime: MutPtr<Systemtime>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantTimeToSystemTime")

public actual fun variantToBoolean(varin: ConstPtr<Variant>, pfret: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToBoolean")

public actual fun variantToBooleanArray(variable: ConstPtr<Variant>, prgf: MutPtr<Bool>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToBooleanArray")

public actual fun variantToBooleanArrayAlloc(variable: ConstPtr<Variant>, pprgf: MutPtr<MutPtr<Bool>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToBooleanArrayAlloc")

public actual fun variantToBooleanWithDefault(varin: ConstPtr<Variant>, fdefault: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToBooleanWithDefault")

public actual fun variantToBuffer(varin: ConstPtr<Variant>, pv: MutPtr<CVoid>, cb: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToBuffer")

public actual fun variantToDosDateTime(varin: ConstPtr<Variant>, pwdate: MutPtr<UShort>, pwtime: MutPtr<UShort>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToDosDateTime")

public actual fun variantToDouble(varin: ConstPtr<Variant>, pdblret: MutPtr<Double>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToDouble")

public actual fun variantToDoubleArray(variable: ConstPtr<Variant>, prgn: MutPtr<Double>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToDoubleArray")

public actual fun variantToDoubleArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<Double>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToDoubleArrayAlloc")

public actual fun variantToDoubleWithDefault(varin: ConstPtr<Variant>, dbldefault: Double): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToDoubleWithDefault")

public actual fun variantToFileTime(varin: ConstPtr<Variant>, stfout: PstimeFlags, pftout: MutPtr<Filetime>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToFileTime")

public actual fun variantToGUID(varin: ConstPtr<Variant>, pguid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToGUID")

public actual fun variantToInt16(varin: ConstPtr<Variant>, piret: MutPtr<Short>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt16")

public actual fun variantToInt16Array(variable: ConstPtr<Variant>, prgn: MutPtr<Short>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt16Array")

public actual fun variantToInt16ArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<Short>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt16ArrayAlloc")

public actual fun variantToInt16WithDefault(varin: ConstPtr<Variant>, idefault: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt16WithDefault")

public actual fun variantToInt32(varin: ConstPtr<Variant>, plret: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt32")

public actual fun variantToInt32Array(variable: ConstPtr<Variant>, prgn: MutPtr<Int>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt32Array")

public actual fun variantToInt32ArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<Int>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt32ArrayAlloc")

public actual fun variantToInt32WithDefault(varin: ConstPtr<Variant>, ldefault: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt32WithDefault")

public actual fun variantToInt64(varin: ConstPtr<Variant>, pllret: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt64")

public actual fun variantToInt64Array(variable: ConstPtr<Variant>, prgn: MutPtr<Long>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt64Array")

public actual fun variantToInt64ArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<Long>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt64ArrayAlloc")

public actual fun variantToInt64WithDefault(varin: ConstPtr<Variant>, lldefault: Long): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToInt64WithDefault")

public actual fun variantToString(varin: ConstPtr<Variant>, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToString")

public actual fun variantToStringAlloc(varin: ConstPtr<Variant>, ppszbuf: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToStringAlloc")

public actual fun variantToStringArray(variable: ConstPtr<Variant>, prgsz: MutPtr<Pwstr>, crgsz: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToStringArray")

public actual fun variantToStringArrayAlloc(variable: ConstPtr<Variant>, pprgsz: MutPtr<MutPtr<Pwstr>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToStringArrayAlloc")

public actual fun variantToStringWithDefault(varin: ConstPtr<Variant>, pszdefault: Pcwstr): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToStringWithDefault")

public actual fun variantToUInt16(varin: ConstPtr<Variant>, puiret: MutPtr<UShort>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt16")

public actual fun variantToUInt16Array(variable: ConstPtr<Variant>, prgn: MutPtr<UShort>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt16Array")

public actual fun variantToUInt16ArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<UShort>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt16ArrayAlloc")

public actual fun variantToUInt16WithDefault(varin: ConstPtr<Variant>, uidefault: UShort): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt16WithDefault")

public actual fun variantToUInt32(varin: ConstPtr<Variant>, pulret: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt32")

public actual fun variantToUInt32Array(variable: ConstPtr<Variant>, prgn: MutPtr<UInt>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt32Array")

public actual fun variantToUInt32ArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<UInt>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt32ArrayAlloc")

public actual fun variantToUInt32WithDefault(varin: ConstPtr<Variant>, uldefault: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt32WithDefault")

public actual fun variantToUInt64(varin: ConstPtr<Variant>, pullret: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt64")

public actual fun variantToUInt64Array(variable: ConstPtr<Variant>, prgn: MutPtr<ULong>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt64Array")

public actual fun variantToUInt64ArrayAlloc(variable: ConstPtr<Variant>, pprgn: MutPtr<MutPtr<ULong>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt64ArrayAlloc")

public actual fun variantToUInt64WithDefault(varin: ConstPtr<Variant>, ulldefault: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemVariantVariantToUInt64WithDefault")
