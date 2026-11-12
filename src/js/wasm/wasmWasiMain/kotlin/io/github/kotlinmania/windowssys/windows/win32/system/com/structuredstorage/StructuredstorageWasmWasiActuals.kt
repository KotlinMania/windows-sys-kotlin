@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.com.Clsctx
import io.github.kotlinmania.windowssys.windows.win32.system.com.Stgm
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun clearPropVariantArray(rgpropvar: MutPtr, cvars: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageClearPropVariantArray")

public actual fun coGetInstanceFromFile(pserverinfo: ConstPtr, pclsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, grfmode: UInt, pwszname: Pcwstr, dwcount: UInt, presults: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromFile")

public actual fun coGetInstanceFromIStorage(pserverinfo: ConstPtr, pclsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, pstg: MutPtr, dwcount: UInt, presults: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromIStorage")

public actual fun coGetInterfaceAndReleaseStream(pstm: MutPtr, iid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageCoGetInterfaceAndReleaseStream")

public actual fun createILockBytesOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, pplkbyt: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageCreateILockBytesOnHGlobal")

public actual fun createStreamOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, ppstm: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageCreateStreamOnHGlobal")

public actual fun fmtIdToPropStgName(pfmtid: ConstPtr, oszname: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageFmtIdToPropStgName")

public actual fun freePropVariantArray(cvariants: UInt, rgvars: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageFreePropVariantArray")

public actual fun getConvertStg(pstg: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageGetConvertStg")

public actual fun getHGlobalFromILockBytes(plkbyt: MutPtr, phglobal: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromILockBytes")

public actual fun getHGlobalFromStream(pstm: MutPtr, phglobal: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromStream")

public actual fun initPropVariantFromBooleanVector(prgf: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBooleanVector")

public actual fun initPropVariantFromBuffer(pv: ConstPtr, cb: UInt, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBuffer")

public actual fun initPropVariantFromCLSID(clsid: ConstPtr, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromCLSID")

public actual fun initPropVariantFromDoubleVector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromDoubleVector")

public actual fun initPropVariantFromFileTime(pftin: ConstPtr, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTime")

public actual fun initPropVariantFromFileTimeVector(prgft: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTimeVector")

public actual fun initPropVariantFromGUIDAsString(guid: ConstPtr, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromGUIDAsString")

public actual fun initPropVariantFromInt16Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt16Vector")

public actual fun initPropVariantFromInt32Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt32Vector")

public actual fun initPropVariantFromInt64Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt64Vector")

public actual fun initPropVariantFromPropVariantVectorElem(propvarin: ConstPtr, ielem: UInt, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromPropVariantVectorElem")

public actual fun initPropVariantFromResource(hinst: Hinstance, id: UInt, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromResource")

public actual fun initPropVariantFromStringAsVector(psz: Pcwstr, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringAsVector")

public actual fun initPropVariantFromStringVector(prgsz: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringVector")

public actual fun initPropVariantFromUInt16Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt16Vector")

public actual fun initPropVariantFromUInt32Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt32Vector")

public actual fun initPropVariantFromUInt64Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt64Vector")

public actual fun initPropVariantVectorFromPropVariant(propvarsingle: ConstPtr, ppropvarvector: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageInitPropVariantVectorFromPropVariant")

public actual fun oleConvertIStorageToOLESTREAM(pstg: MutPtr, lpolestream: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAM")

public actual fun oleConvertIStorageToOLESTREAMEx(pstg: MutPtr, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: ConstPtr, polestm: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAMEx")

public actual fun oleConvertOLESTREAMToIStorage(lpolestream: ConstPtr, pstg: MutPtr, ptd: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorage")

public actual fun oleConvertOLESTREAMToIStorageEx(polestm: ConstPtr, pstg: MutPtr, pcfformat: MutPtr, plwwidth: MutPtr, plheight: MutPtr, pdwsize: MutPtr, pmedium: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorageEx")

public actual fun propStgNameToFmtId(oszname: Pcwstr, pfmtid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropStgNameToFmtId")

public actual fun propVariantChangeType(ppropvardest: MutPtr, propvarsrc: ConstPtr, flags: PropvarChangeFlags, vt: Variant.Varenum): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantChangeType")

public actual fun propVariantClear(pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantClear")

public actual fun propVariantCompareEx(propvar1: ConstPtr, propvar2: ConstPtr, unit: PropvarCompareUnit, flags: PropvarCompareFlags): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantCompareEx")

public actual fun propVariantCopy(pvardest: MutPtr, pvarsrc: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantCopy")

public actual fun propVariantGetBooleanElem(propvar: ConstPtr, ielem: UInt, pfval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetBooleanElem")

public actual fun propVariantGetDoubleElem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetDoubleElem")

public actual fun propVariantGetElementCount(propvar: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetElementCount")

public actual fun propVariantGetFileTimeElem(propvar: ConstPtr, ielem: UInt, pftval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetFileTimeElem")

public actual fun propVariantGetInt16Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt16Elem")

public actual fun propVariantGetInt32Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt32Elem")

public actual fun propVariantGetInt64Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt64Elem")

public actual fun propVariantGetStringElem(propvar: ConstPtr, ielem: UInt, ppszval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetStringElem")

public actual fun propVariantGetUInt16Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt16Elem")

public actual fun propVariantGetUInt32Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt32Elem")

public actual fun propVariantGetUInt64Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt64Elem")

public actual fun propVariantToBSTR(propvar: ConstPtr, pbstrout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToBSTR")

public actual fun propVariantToBoolean(propvarin: ConstPtr, pfret: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToBoolean")

public actual fun propVariantToBooleanVector(propvar: ConstPtr, prgf: MutPtr, crgf: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVector")

public actual fun propVariantToBooleanVectorAlloc(propvar: ConstPtr, pprgf: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVectorAlloc")

public actual fun propVariantToBooleanWithDefault(propvarin: ConstPtr, fdefault: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanWithDefault")

public actual fun propVariantToBuffer(propvar: ConstPtr, pv: MutPtr, cb: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToBuffer")

public actual fun propVariantToDouble(propvarin: ConstPtr, pdblret: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToDouble")

public actual fun propVariantToDoubleVector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVector")

public actual fun propVariantToDoubleVectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVectorAlloc")

public actual fun propVariantToDoubleWithDefault(propvarin: ConstPtr, dbldefault: Double): Double =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleWithDefault")

public actual fun propVariantToFileTime(propvar: ConstPtr, pstfout: Variant.PstimeFlags, pftout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTime")

public actual fun propVariantToFileTimeVector(propvar: ConstPtr, prgft: MutPtr, crgft: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVector")

public actual fun propVariantToFileTimeVectorAlloc(propvar: ConstPtr, pprgft: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVectorAlloc")

public actual fun propVariantToGUID(propvar: ConstPtr, pguid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToGUID")

public actual fun propVariantToInt16(propvarin: ConstPtr, piret: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16")

public actual fun propVariantToInt16Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16Vector")

public actual fun propVariantToInt16VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16VectorAlloc")

public actual fun propVariantToInt16WithDefault(propvarin: ConstPtr, idefault: Short): Short =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16WithDefault")

public actual fun propVariantToInt32(propvarin: ConstPtr, plret: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32")

public actual fun propVariantToInt32Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32Vector")

public actual fun propVariantToInt32VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32VectorAlloc")

public actual fun propVariantToInt32WithDefault(propvarin: ConstPtr, ldefault: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32WithDefault")

public actual fun propVariantToInt64(propvarin: ConstPtr, pllret: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64")

public actual fun propVariantToInt64Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64Vector")

public actual fun propVariantToInt64VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64VectorAlloc")

public actual fun propVariantToInt64WithDefault(propvarin: ConstPtr, lldefault: Long): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64WithDefault")

public actual fun propVariantToString(propvar: ConstPtr, psz: Pwstr, cch: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToString")

public actual fun propVariantToStringAlloc(propvar: ConstPtr, ppszout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringAlloc")

public actual fun propVariantToStringVector(propvar: ConstPtr, prgsz: MutPtr, crgsz: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVector")

public actual fun propVariantToStringVectorAlloc(propvar: ConstPtr, pprgsz: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVectorAlloc")

public actual fun propVariantToStringWithDefault(propvarin: ConstPtr, pszdefault: Pcwstr): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringWithDefault")

public actual fun propVariantToUInt16(propvarin: ConstPtr, puiret: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16")

public actual fun propVariantToUInt16Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16Vector")

public actual fun propVariantToUInt16VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16VectorAlloc")

public actual fun propVariantToUInt16WithDefault(propvarin: ConstPtr, uidefault: UShort): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16WithDefault")

public actual fun propVariantToUInt32(propvarin: ConstPtr, pulret: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32")

public actual fun propVariantToUInt32Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32Vector")

public actual fun propVariantToUInt32VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32VectorAlloc")

public actual fun propVariantToUInt32WithDefault(propvarin: ConstPtr, uldefault: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32WithDefault")

public actual fun propVariantToUInt64(propvarin: ConstPtr, pullret: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64")

public actual fun propVariantToUInt64Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64Vector")

public actual fun propVariantToUInt64VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64VectorAlloc")

public actual fun propVariantToUInt64WithDefault(propvarin: ConstPtr, ulldefault: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64WithDefault")

public actual fun propVariantToVariant(ppropvar: ConstPtr, pvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToVariant")

public actual fun propVariantToWinRTPropertyValue(propvar: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstoragePropVariantToWinRTPropertyValue")

public actual fun readClassStg(pstg: MutPtr, pclsid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageReadClassStg")

public actual fun readClassStm(pstm: MutPtr, pclsid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageReadClassStm")

public actual fun readFmtUserTypeStg(pstg: MutPtr, pcf: MutPtr, lplpszusertype: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageReadFmtUserTypeStg")

public actual fun setConvertStg(pstg: MutPtr, fconvert: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageSetConvertStg")

public actual fun stgConvertPropertyToVariant(pprop: ConstPtr, codepage: UShort, pvar: MutPtr, pma: MutPtr): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgConvertPropertyToVariant")

public actual fun stgConvertVariantToProperty(pvar: ConstPtr, codepage: UShort, pprop: MutPtr, pcb: MutPtr, pid: UInt, freserved: Boolean, pcindirect: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgConvertVariantToProperty")

public actual fun stgCreateDocfile(pwcsname: Pcwstr, grfmode: Stgm, reserved: UInt, ppstgopen: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfile")

public actual fun stgCreateDocfileOnILockBytes(plkbyt: MutPtr, grfmode: Stgm, reserved: UInt, ppstgopen: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfileOnILockBytes")

public actual fun stgCreatePropSetStg(pstorage: MutPtr, dwreserved: UInt, pppropsetstg: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgCreatePropSetStg")

public actual fun stgCreatePropStg(punk: MutPtr, fmtid: ConstPtr, pclsid: ConstPtr, grfflags: UInt, dwreserved: UInt, pppropstg: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgCreatePropStg")

public actual fun stgCreateStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: MutPtr, psecuritydescriptor: PsecurityDescriptor, riid: ConstPtr, ppobjectopen: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgCreateStorageEx")

public actual fun stgDeserializePropVariant(pprop: ConstPtr, cbmax: UInt, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgDeserializePropVariant")

public actual fun stgGetIFillLockBytesOnFile(pwcsname: Pcwstr, ppflb: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnFile")

public actual fun stgGetIFillLockBytesOnILockBytes(pilb: MutPtr, ppflb: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnILockBytes")

public actual fun stgIsStorageFile(pwcsname: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgIsStorageFile")

public actual fun stgIsStorageILockBytes(plkbyt: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgIsStorageILockBytes")

public actual fun stgOpenAsyncDocfileOnIFillLockBytes(pflb: MutPtr, grfmode: UInt, asyncflags: UInt, ppstgopen: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgOpenAsyncDocfileOnIFillLockBytes")

public actual fun stgOpenLayoutDocfile(pwcsdfname: Pcwstr, grfmode: UInt, reserved: UInt, ppstgopen: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgOpenLayoutDocfile")

public actual fun stgOpenPropStg(punk: MutPtr, fmtid: ConstPtr, grfflags: UInt, dwreserved: UInt, pppropstg: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgOpenPropStg")

public actual fun stgOpenStorage(pwcsname: Pcwstr, pstgpriority: MutPtr, grfmode: Stgm, snbexclude: ConstPtr, reserved: UInt, ppstgopen: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgOpenStorage")

public actual fun stgOpenStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: MutPtr, psecuritydescriptor: PsecurityDescriptor, riid: ConstPtr, ppobjectopen: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageEx")

public actual fun stgOpenStorageOnILockBytes(plkbyt: MutPtr, pstgpriority: MutPtr, grfmode: Stgm, snbexclude: ConstPtr, reserved: UInt, ppstgopen: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageOnILockBytes")

public actual fun stgPropertyLengthAsVariant(pprop: ConstPtr, cbprop: UInt, codepage: UShort, breserved: UByte): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgPropertyLengthAsVariant")

public actual fun stgSerializePropVariant(ppropvar: ConstPtr, ppprop: MutPtr, pcb: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgSerializePropVariant")

public actual fun stgSetTimes(lpszname: Pcwstr, pctime: ConstPtr, patime: ConstPtr, pmtime: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageStgSetTimes")

public actual fun variantToPropVariant(pvar: ConstPtr, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageVariantToPropVariant")

public actual fun winRTPropertyValueToPropVariant(punkpropertyvalue: MutPtr, ppropvar: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageWinRTPropertyValueToPropVariant")

public actual fun writeClassStg(pstg: MutPtr, rclsid: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageWriteClassStg")

public actual fun writeClassStm(pstm: MutPtr, rclsid: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageWriteClassStm")

public actual fun writeFmtUserTypeStg(pstg: MutPtr, cf: UShort, lpszusertype: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStructuredstorageWriteFmtUserTypeStg")
