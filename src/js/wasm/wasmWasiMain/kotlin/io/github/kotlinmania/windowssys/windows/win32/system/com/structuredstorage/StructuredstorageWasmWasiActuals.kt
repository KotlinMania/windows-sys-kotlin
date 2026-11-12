@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.com.Clsctx
import io.github.kotlinmania.windowssys.windows.win32.system.com.Coserverinfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.Dvtargetdevice
import io.github.kotlinmania.windowssys.windows.win32.system.com.MultiQi
import io.github.kotlinmania.windowssys.windows.win32.system.com.Stgm
import io.github.kotlinmania.windowssys.windows.win32.system.com.Stgmedium
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun clearPropVariantArray(rgpropvar: MutPtr<Propvariant>, cvars: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageClearPropVariantArray")

public actual fun coGetInstanceFromFile(pserverinfo: ConstPtr<Coserverinfo>, pclsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, dwclsctx: Clsctx, grfmode: UInt, pwszname: Pcwstr, dwcount: UInt, presults: MutPtr<MultiQi>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromFile")

public actual fun coGetInstanceFromIStorage(pserverinfo: ConstPtr<Coserverinfo>, pclsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, dwclsctx: Clsctx, pstg: MutPtr<CVoid>, dwcount: UInt, presults: MutPtr<MultiQi>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromIStorage")

public actual fun coGetInterfaceAndReleaseStream(pstm: MutPtr<CVoid>, iid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageCoGetInterfaceAndReleaseStream")

public actual fun createILockBytesOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, pplkbyt: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageCreateILockBytesOnHGlobal")

public actual fun createStreamOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, ppstm: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageCreateStreamOnHGlobal")

public actual fun fmtIdToPropStgName(pfmtid: ConstPtr<Guid>, oszname: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageFmtIdToPropStgName")

public actual fun freePropVariantArray(cvariants: UInt, rgvars: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageFreePropVariantArray")

public actual fun getConvertStg(pstg: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageGetConvertStg")

public actual fun getHGlobalFromILockBytes(plkbyt: MutPtr<CVoid>, phglobal: MutPtr<Hglobal>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromILockBytes")

public actual fun getHGlobalFromStream(pstm: MutPtr<CVoid>, phglobal: MutPtr<Hglobal>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromStream")

public actual fun initPropVariantFromBooleanVector(prgf: ConstPtr<Bool>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBooleanVector")

public actual fun initPropVariantFromBuffer(pv: ConstPtr<CVoid>, cb: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBuffer")

public actual fun initPropVariantFromCLSID(clsid: ConstPtr<Guid>, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromCLSID")

public actual fun initPropVariantFromDoubleVector(prgn: ConstPtr<Double>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromDoubleVector")

public actual fun initPropVariantFromFileTime(pftin: ConstPtr<Filetime>, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTime")

public actual fun initPropVariantFromFileTimeVector(prgft: ConstPtr<Filetime>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTimeVector")

public actual fun initPropVariantFromGUIDAsString(guid: ConstPtr<Guid>, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromGUIDAsString")

public actual fun initPropVariantFromInt16Vector(prgn: ConstPtr<Short>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt16Vector")

public actual fun initPropVariantFromInt32Vector(prgn: ConstPtr<Int>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt32Vector")

public actual fun initPropVariantFromInt64Vector(prgn: ConstPtr<Long>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt64Vector")

public actual fun initPropVariantFromPropVariantVectorElem(propvarin: ConstPtr<Propvariant>, ielem: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromPropVariantVectorElem")

public actual fun initPropVariantFromResource(hinst: Hinstance, id: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromResource")

public actual fun initPropVariantFromStringAsVector(psz: Pcwstr, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringAsVector")

public actual fun initPropVariantFromStringVector(prgsz: ConstPtr<Pcwstr>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringVector")

public actual fun initPropVariantFromUInt16Vector(prgn: ConstPtr<UShort>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt16Vector")

public actual fun initPropVariantFromUInt32Vector(prgn: ConstPtr<UInt>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt32Vector")

public actual fun initPropVariantFromUInt64Vector(prgn: ConstPtr<ULong>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt64Vector")

public actual fun initPropVariantVectorFromPropVariant(propvarsingle: ConstPtr<Propvariant>, ppropvarvector: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantVectorFromPropVariant")

public actual fun oleConvertIStorageToOLESTREAM(pstg: MutPtr<CVoid>, lpolestream: MutPtr<Olestream>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAM")

public actual fun oleConvertIStorageToOLESTREAMEx(pstg: MutPtr<CVoid>, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: ConstPtr<Stgmedium>, polestm: MutPtr<Olestream>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAMEx")

public actual fun oleConvertOLESTREAMToIStorage(lpolestream: ConstPtr<Olestream>, pstg: MutPtr<CVoid>, ptd: ConstPtr<Dvtargetdevice>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorage")

public actual fun oleConvertOLESTREAMToIStorageEx(polestm: ConstPtr<Olestream>, pstg: MutPtr<CVoid>, pcfformat: MutPtr<UShort>, plwwidth: MutPtr<Int>, plheight: MutPtr<Int>, pdwsize: MutPtr<UInt>, pmedium: MutPtr<Stgmedium>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorageEx")

public actual fun propStgNameToFmtId(oszname: Pcwstr, pfmtid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropStgNameToFmtId")

public actual fun propVariantChangeType(ppropvardest: MutPtr<Propvariant>, propvarsrc: ConstPtr<Propvariant>, flags: PropvarChangeFlags, vt: Variant.Varenum): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantChangeType")

public actual fun propVariantClear(pvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantClear")

public actual fun propVariantCompareEx(propvar1: ConstPtr<Propvariant>, propvar2: ConstPtr<Propvariant>, unit: PropvarCompareUnit, flags: PropvarCompareFlags): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantCompareEx")

public actual fun propVariantCopy(pvardest: MutPtr<Propvariant>, pvarsrc: ConstPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantCopy")

public actual fun propVariantGetBooleanElem(propvar: ConstPtr<Propvariant>, ielem: UInt, pfval: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetBooleanElem")

public actual fun propVariantGetDoubleElem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<Double>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetDoubleElem")

public actual fun propVariantGetElementCount(propvar: ConstPtr<Propvariant>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetElementCount")

public actual fun propVariantGetFileTimeElem(propvar: ConstPtr<Propvariant>, ielem: UInt, pftval: MutPtr<Filetime>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetFileTimeElem")

public actual fun propVariantGetInt16Elem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<Short>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt16Elem")

public actual fun propVariantGetInt32Elem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt32Elem")

public actual fun propVariantGetInt64Elem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt64Elem")

public actual fun propVariantGetStringElem(propvar: ConstPtr<Propvariant>, ielem: UInt, ppszval: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetStringElem")

public actual fun propVariantGetUInt16Elem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<UShort>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt16Elem")

public actual fun propVariantGetUInt32Elem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt32Elem")

public actual fun propVariantGetUInt64Elem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt64Elem")

public actual fun propVariantToBSTR(propvar: ConstPtr<Propvariant>, pbstrout: MutPtr<Bstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToBSTR")

public actual fun propVariantToBoolean(propvarin: ConstPtr<Propvariant>, pfret: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToBoolean")

public actual fun propVariantToBooleanVector(propvar: ConstPtr<Propvariant>, prgf: MutPtr<Bool>, crgf: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVector")

public actual fun propVariantToBooleanVectorAlloc(propvar: ConstPtr<Propvariant>, pprgf: MutPtr<MutPtr<Bool>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVectorAlloc")

public actual fun propVariantToBooleanWithDefault(propvarin: ConstPtr<Propvariant>, fdefault: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanWithDefault")

public actual fun propVariantToBuffer(propvar: ConstPtr<Propvariant>, pv: MutPtr<CVoid>, cb: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToBuffer")

public actual fun propVariantToDouble(propvarin: ConstPtr<Propvariant>, pdblret: MutPtr<Double>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToDouble")

public actual fun propVariantToDoubleVector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<Double>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVector")

public actual fun propVariantToDoubleVectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<Double>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVectorAlloc")

public actual fun propVariantToDoubleWithDefault(propvarin: ConstPtr<Propvariant>, dbldefault: Double): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleWithDefault")

public actual fun propVariantToFileTime(propvar: ConstPtr<Propvariant>, pstfout: Variant.PstimeFlags, pftout: MutPtr<Filetime>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTime")

public actual fun propVariantToFileTimeVector(propvar: ConstPtr<Propvariant>, prgft: MutPtr<Filetime>, crgft: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVector")

public actual fun propVariantToFileTimeVectorAlloc(propvar: ConstPtr<Propvariant>, pprgft: MutPtr<MutPtr<Filetime>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVectorAlloc")

public actual fun propVariantToGUID(propvar: ConstPtr<Propvariant>, pguid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToGUID")

public actual fun propVariantToInt16(propvarin: ConstPtr<Propvariant>, piret: MutPtr<Short>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16")

public actual fun propVariantToInt16Vector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<Short>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16Vector")

public actual fun propVariantToInt16VectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<Short>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16VectorAlloc")

public actual fun propVariantToInt16WithDefault(propvarin: ConstPtr<Propvariant>, idefault: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16WithDefault")

public actual fun propVariantToInt32(propvarin: ConstPtr<Propvariant>, plret: MutPtr<Int>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32")

public actual fun propVariantToInt32Vector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<Int>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32Vector")

public actual fun propVariantToInt32VectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<Int>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32VectorAlloc")

public actual fun propVariantToInt32WithDefault(propvarin: ConstPtr<Propvariant>, ldefault: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32WithDefault")

public actual fun propVariantToInt64(propvarin: ConstPtr<Propvariant>, pllret: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64")

public actual fun propVariantToInt64Vector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<Long>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64Vector")

public actual fun propVariantToInt64VectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<Long>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64VectorAlloc")

public actual fun propVariantToInt64WithDefault(propvarin: ConstPtr<Propvariant>, lldefault: Long): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64WithDefault")

public actual fun propVariantToString(propvar: ConstPtr<Propvariant>, psz: Pwstr, cch: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToString")

public actual fun propVariantToStringAlloc(propvar: ConstPtr<Propvariant>, ppszout: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringAlloc")

public actual fun propVariantToStringVector(propvar: ConstPtr<Propvariant>, prgsz: MutPtr<Pwstr>, crgsz: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVector")

public actual fun propVariantToStringVectorAlloc(propvar: ConstPtr<Propvariant>, pprgsz: MutPtr<MutPtr<Pwstr>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVectorAlloc")

public actual fun propVariantToStringWithDefault(propvarin: ConstPtr<Propvariant>, pszdefault: Pcwstr): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringWithDefault")

public actual fun propVariantToUInt16(propvarin: ConstPtr<Propvariant>, puiret: MutPtr<UShort>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16")

public actual fun propVariantToUInt16Vector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<UShort>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16Vector")

public actual fun propVariantToUInt16VectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<UShort>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16VectorAlloc")

public actual fun propVariantToUInt16WithDefault(propvarin: ConstPtr<Propvariant>, uidefault: UShort): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16WithDefault")

public actual fun propVariantToUInt32(propvarin: ConstPtr<Propvariant>, pulret: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32")

public actual fun propVariantToUInt32Vector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<UInt>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32Vector")

public actual fun propVariantToUInt32VectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<UInt>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32VectorAlloc")

public actual fun propVariantToUInt32WithDefault(propvarin: ConstPtr<Propvariant>, uldefault: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32WithDefault")

public actual fun propVariantToUInt64(propvarin: ConstPtr<Propvariant>, pullret: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64")

public actual fun propVariantToUInt64Vector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<ULong>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64Vector")

public actual fun propVariantToUInt64VectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<ULong>>, pcelem: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64VectorAlloc")

public actual fun propVariantToUInt64WithDefault(propvarin: ConstPtr<Propvariant>, ulldefault: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64WithDefault")

public actual fun propVariantToVariant(ppropvar: ConstPtr<Propvariant>, pvar: MutPtr<Variant.Variant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToVariant")

public actual fun propVariantToWinRTPropertyValue(propvar: ConstPtr<Propvariant>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToWinRTPropertyValue")

public actual fun readClassStg(pstg: MutPtr<CVoid>, pclsid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageReadClassStg")

public actual fun readClassStm(pstm: MutPtr<CVoid>, pclsid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageReadClassStm")

public actual fun readFmtUserTypeStg(pstg: MutPtr<CVoid>, pcf: MutPtr<UShort>, lplpszusertype: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageReadFmtUserTypeStg")

public actual fun setConvertStg(pstg: MutPtr<CVoid>, fconvert: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageSetConvertStg")

public actual fun stgConvertPropertyToVariant(pprop: ConstPtr<Serializedpropertyvalue>, codepage: UShort, pvar: MutPtr<Propvariant>, pma: MutPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgConvertPropertyToVariant")

public actual fun stgConvertVariantToProperty(pvar: ConstPtr<Propvariant>, codepage: UShort, pprop: MutPtr<Serializedpropertyvalue>, pcb: MutPtr<UInt>, pid: UInt, freserved: Boolean, pcindirect: MutPtr<UInt>): MutPtr<Serializedpropertyvalue> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgConvertVariantToProperty")

public actual fun stgCreateDocfile(pwcsname: Pcwstr, grfmode: Stgm, reserved: UInt, ppstgopen: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfile")

public actual fun stgCreateDocfileOnILockBytes(plkbyt: MutPtr<CVoid>, grfmode: Stgm, reserved: UInt, ppstgopen: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfileOnILockBytes")

public actual fun stgCreatePropSetStg(pstorage: MutPtr<CVoid>, dwreserved: UInt, pppropsetstg: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgCreatePropSetStg")

public actual fun stgCreatePropStg(punk: MutPtr<CVoid>, fmtid: ConstPtr<Guid>, pclsid: ConstPtr<Guid>, grfflags: UInt, dwreserved: UInt, pppropstg: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgCreatePropStg")

public actual fun stgCreateStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: MutPtr<Stgoptions>, psecuritydescriptor: PsecurityDescriptor, riid: ConstPtr<Guid>, ppobjectopen: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgCreateStorageEx")

public actual fun stgDeserializePropVariant(pprop: ConstPtr<Serializedpropertyvalue>, cbmax: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgDeserializePropVariant")

public actual fun stgGetIFillLockBytesOnFile(pwcsname: Pcwstr, ppflb: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnFile")

public actual fun stgGetIFillLockBytesOnILockBytes(pilb: MutPtr<CVoid>, ppflb: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnILockBytes")

public actual fun stgIsStorageFile(pwcsname: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgIsStorageFile")

public actual fun stgIsStorageILockBytes(plkbyt: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgIsStorageILockBytes")

public actual fun stgOpenAsyncDocfileOnIFillLockBytes(pflb: MutPtr<CVoid>, grfmode: UInt, asyncflags: UInt, ppstgopen: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgOpenAsyncDocfileOnIFillLockBytes")

public actual fun stgOpenLayoutDocfile(pwcsdfname: Pcwstr, grfmode: UInt, reserved: UInt, ppstgopen: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgOpenLayoutDocfile")

public actual fun stgOpenPropStg(punk: MutPtr<CVoid>, fmtid: ConstPtr<Guid>, grfflags: UInt, dwreserved: UInt, pppropstg: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgOpenPropStg")

public actual fun stgOpenStorage(pwcsname: Pcwstr, pstgpriority: MutPtr<CVoid>, grfmode: Stgm, snbexclude: ConstPtr<ConstPtr<UShort>>, reserved: UInt, ppstgopen: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgOpenStorage")

public actual fun stgOpenStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: MutPtr<Stgoptions>, psecuritydescriptor: PsecurityDescriptor, riid: ConstPtr<Guid>, ppobjectopen: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageEx")

public actual fun stgOpenStorageOnILockBytes(plkbyt: MutPtr<CVoid>, pstgpriority: MutPtr<CVoid>, grfmode: Stgm, snbexclude: ConstPtr<ConstPtr<UShort>>, reserved: UInt, ppstgopen: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageOnILockBytes")

public actual fun stgPropertyLengthAsVariant(pprop: ConstPtr<Serializedpropertyvalue>, cbprop: UInt, codepage: UShort, breserved: UByte): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgPropertyLengthAsVariant")

public actual fun stgSerializePropVariant(ppropvar: ConstPtr<Propvariant>, ppprop: MutPtr<MutPtr<Serializedpropertyvalue>>, pcb: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgSerializePropVariant")

public actual fun stgSetTimes(lpszname: Pcwstr, pctime: ConstPtr<Filetime>, patime: ConstPtr<Filetime>, pmtime: ConstPtr<Filetime>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgSetTimes")

public actual fun variantToPropVariant(pvar: ConstPtr<Variant.Variant>, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageVariantToPropVariant")

public actual fun winRTPropertyValueToPropVariant(punkpropertyvalue: MutPtr<CVoid>, ppropvar: MutPtr<Propvariant>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageWinRTPropertyValueToPropVariant")

public actual fun writeClassStg(pstg: MutPtr<CVoid>, rclsid: ConstPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageWriteClassStg")

public actual fun writeClassStm(pstm: MutPtr<CVoid>, rclsid: ConstPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageWriteClassStm")

public actual fun writeFmtUserTypeStg(pstg: MutPtr<CVoid>, cf: UShort, lpszusertype: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageWriteFmtUserTypeStg")
