@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HGLOBAL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.system.com.CLSCTX
import io.github.kotlinmania.windowssys.windows.win32.system.com.STGM
import io.github.kotlinmania.windowssys.windows.win32.system.variant.PSTIME_FLAGS
import io.github.kotlinmania.windowssys.windows.win32.system.variant.VARENUM
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ClearPropVariantArray(rgpropvar: Long, cvars: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_ClearPropVariantArray(rgpropvar.toCPointer<ByteVar>(), cvars)
}

public actual fun CoGetInstanceFromFile(pserverinfo: Long, pclsid: Long, punkouter: Long, dwclsctx: CLSCTX, grfmode: UInt, pwszname: PCWSTR, dwcount: UInt, presults: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_CoGetInstanceFromFile(pserverinfo.toCPointer<ByteVar>(), pclsid.toCPointer<ByteVar>(), punkouter.toCPointer<ByteVar>(), dwclsctx, grfmode, pwszname.toCPointer<ByteVar>(), dwcount, presults.toCPointer<ByteVar>())

public actual fun CoGetInstanceFromIStorage(pserverinfo: Long, pclsid: Long, punkouter: Long, dwclsctx: CLSCTX, pstg: Long, dwcount: UInt, presults: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_CoGetInstanceFromIStorage(pserverinfo.toCPointer<ByteVar>(), pclsid.toCPointer<ByteVar>(), punkouter.toCPointer<ByteVar>(), dwclsctx, pstg.toCPointer<ByteVar>(), dwcount, presults.toCPointer<ByteVar>())

public actual fun CoGetInterfaceAndReleaseStream(pstm: Long, iid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_CoGetInterfaceAndReleaseStream(pstm.toCPointer<ByteVar>(), iid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun CreateILockBytesOnHGlobal(hglobal: HGLOBAL, fdeleteonrelease: BOOL, pplkbyt: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_CreateILockBytesOnHGlobal(hglobal.toCPointer<ByteVar>(), fdeleteonrelease, pplkbyt.toCPointer<ByteVar>())

public actual fun CreateStreamOnHGlobal(hglobal: HGLOBAL, fdeleteonrelease: BOOL, ppstm: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_CreateStreamOnHGlobal(hglobal.toCPointer<ByteVar>(), fdeleteonrelease, ppstm.toCPointer<ByteVar>())

public actual fun FmtIdToPropStgName(pfmtid: Long, oszname: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_FmtIdToPropStgName(pfmtid.toCPointer<ByteVar>(), oszname.toCPointer<ByteVar>())

public actual fun FreePropVariantArray(cvariants: UInt, rgvars: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_FreePropVariantArray(cvariants, rgvars.toCPointer<ByteVar>())

public actual fun GetConvertStg(pstg: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_GetConvertStg(pstg.toCPointer<ByteVar>())

public actual fun GetHGlobalFromILockBytes(plkbyt: Long, phglobal: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_GetHGlobalFromILockBytes(plkbyt.toCPointer<ByteVar>(), phglobal.toCPointer<ByteVar>())

public actual fun GetHGlobalFromStream(pstm: Long, phglobal: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_GetHGlobalFromStream(pstm.toCPointer<ByteVar>(), phglobal.toCPointer<ByteVar>())

public actual fun InitPropVariantFromBooleanVector(prgf: Long, celems: UInt, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromBooleanVector(prgf.toCPointer<ByteVar>(), celems, ppropvar.toCPointer<ByteVar>())

public actual fun InitPropVariantFromBuffer(pv: Long, cb: UInt, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromBuffer(pv.toCPointer<ByteVar>(), cb, ppropvar.toCPointer<ByteVar>())

public actual fun InitPropVariantFromCLSID(clsid: Long, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromCLSID(clsid.toCPointer<ByteVar>(), ppropvar.toCPointer<ByteVar>())

public actual fun InitPropVariantFromDoubleVector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromDoubleVector(prgn.toCPointer<ByteVar>(), celems, ppropvar.toCPointer<ByteVar>())

public actual fun InitPropVariantFromFileTime(pftin: Long, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromFileTime(pftin.toCPointer<ByteVar>(), ppropvar.toCPointer<ByteVar>())

public actual fun InitPropVariantFromFileTimeVector(prgft: Long, celems: UInt, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromFileTimeVector(prgft.toCPointer<ByteVar>(), celems, ppropvar.toCPointer<ByteVar>())

public actual fun InitPropVariantFromGUIDAsString(guid: Long, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromGUIDAsString(guid.toCPointer<ByteVar>(), ppropvar.toCPointer<ByteVar>())

public actual fun InitPropVariantFromInt16Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt16Vector(prgn.toCPointer<ByteVar>(), celems, ppropvar.toCPointer<ByteVar>())

public actual fun InitPropVariantFromInt32Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt32Vector(prgn.toCPointer<ByteVar>(), celems, ppropvar.toCPointer<ByteVar>())

public actual fun InitPropVariantFromInt64Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt64Vector(prgn.toCPointer<ByteVar>(), celems, ppropvar.toCPointer<ByteVar>())

public actual fun InitPropVariantFromPropVariantVectorElem(propvarin: Long, ielem: UInt, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromPropVariantVectorElem(propvarin.toCPointer<ByteVar>(), ielem, ppropvar.toCPointer<ByteVar>())

public actual fun InitPropVariantFromResource(hinst: HINSTANCE, id: UInt, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromResource(hinst.toCPointer<ByteVar>(), id, ppropvar.toCPointer<ByteVar>())

public actual fun InitPropVariantFromStringAsVector(psz: PCWSTR, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromStringAsVector(psz.toCPointer<ByteVar>(), ppropvar.toCPointer<ByteVar>())

public actual fun InitPropVariantFromStringVector(prgsz: Long, celems: UInt, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromStringVector(prgsz.toCPointer<ByteVar>(), celems, ppropvar.toCPointer<ByteVar>())

public actual fun InitPropVariantFromUInt16Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt16Vector(prgn.toCPointer<ByteVar>(), celems, ppropvar.toCPointer<ByteVar>())

public actual fun InitPropVariantFromUInt32Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt32Vector(prgn.toCPointer<ByteVar>(), celems, ppropvar.toCPointer<ByteVar>())

public actual fun InitPropVariantFromUInt64Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt64Vector(prgn.toCPointer<ByteVar>(), celems, ppropvar.toCPointer<ByteVar>())

public actual fun InitPropVariantVectorFromPropVariant(propvarsingle: Long, ppropvarvector: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantVectorFromPropVariant(propvarsingle.toCPointer<ByteVar>(), ppropvarvector.toCPointer<ByteVar>())

public actual fun OleConvertIStorageToOLESTREAM(pstg: Long, lpolestream: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_OleConvertIStorageToOLESTREAM(pstg.toCPointer<ByteVar>(), lpolestream.toCPointer<ByteVar>())

public actual fun OleConvertIStorageToOLESTREAMEx(pstg: Long, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: Long, polestm: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_OleConvertIStorageToOLESTREAMEx(pstg.toCPointer<ByteVar>(), cfformat, lwidth, lheight, dwsize, pmedium.toCPointer<ByteVar>(), polestm.toCPointer<ByteVar>())

public actual fun OleConvertOLESTREAMToIStorage(lpolestream: Long, pstg: Long, ptd: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_OleConvertOLESTREAMToIStorage(lpolestream.toCPointer<ByteVar>(), pstg.toCPointer<ByteVar>(), ptd.toCPointer<ByteVar>())

public actual fun OleConvertOLESTREAMToIStorageEx(polestm: Long, pstg: Long, pcfformat: Long, plwwidth: Long, plheight: Long, pdwsize: Long, pmedium: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_OleConvertOLESTREAMToIStorageEx(polestm.toCPointer<ByteVar>(), pstg.toCPointer<ByteVar>(), pcfformat.toCPointer<ByteVar>(), plwwidth.toCPointer<ByteVar>(), plheight.toCPointer<ByteVar>(), pdwsize.toCPointer<ByteVar>(), pmedium.toCPointer<ByteVar>())

public actual fun PropStgNameToFmtId(oszname: PCWSTR, pfmtid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropStgNameToFmtId(oszname.toCPointer<ByteVar>(), pfmtid.toCPointer<ByteVar>())

public actual fun PropVariantChangeType(ppropvardest: Long, propvarsrc: Long, flags: PROPVAR_CHANGE_FLAGS, vt: VARENUM): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantChangeType(ppropvardest.toCPointer<ByteVar>(), propvarsrc.toCPointer<ByteVar>(), flags, vt)

public actual fun PropVariantClear(pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantClear(pvar.toCPointer<ByteVar>())

public actual fun PropVariantCompareEx(propvar1: Long, propvar2: Long, unit: PROPVAR_COMPARE_UNIT, flags: PROPVAR_COMPARE_FLAGS): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantCompareEx(propvar1.toCPointer<ByteVar>(), propvar2.toCPointer<ByteVar>(), unit, flags)

public actual fun PropVariantCopy(pvardest: Long, pvarsrc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantCopy(pvardest.toCPointer<ByteVar>(), pvarsrc.toCPointer<ByteVar>())

public actual fun PropVariantGetBooleanElem(propvar: Long, ielem: UInt, pfval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetBooleanElem(propvar.toCPointer<ByteVar>(), ielem, pfval.toCPointer<ByteVar>())

public actual fun PropVariantGetDoubleElem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetDoubleElem(propvar.toCPointer<ByteVar>(), ielem, pnval.toCPointer<ByteVar>())

public actual fun PropVariantGetElementCount(propvar: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetElementCount(propvar.toCPointer<ByteVar>())

public actual fun PropVariantGetFileTimeElem(propvar: Long, ielem: UInt, pftval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetFileTimeElem(propvar.toCPointer<ByteVar>(), ielem, pftval.toCPointer<ByteVar>())

public actual fun PropVariantGetInt16Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt16Elem(propvar.toCPointer<ByteVar>(), ielem, pnval.toCPointer<ByteVar>())

public actual fun PropVariantGetInt32Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt32Elem(propvar.toCPointer<ByteVar>(), ielem, pnval.toCPointer<ByteVar>())

public actual fun PropVariantGetInt64Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt64Elem(propvar.toCPointer<ByteVar>(), ielem, pnval.toCPointer<ByteVar>())

public actual fun PropVariantGetStringElem(propvar: Long, ielem: UInt, ppszval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetStringElem(propvar.toCPointer<ByteVar>(), ielem, ppszval.toCPointer<ByteVar>())

public actual fun PropVariantGetUInt16Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt16Elem(propvar.toCPointer<ByteVar>(), ielem, pnval.toCPointer<ByteVar>())

public actual fun PropVariantGetUInt32Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt32Elem(propvar.toCPointer<ByteVar>(), ielem, pnval.toCPointer<ByteVar>())

public actual fun PropVariantGetUInt64Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt64Elem(propvar.toCPointer<ByteVar>(), ielem, pnval.toCPointer<ByteVar>())

public actual fun PropVariantToBSTR(propvar: Long, pbstrout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToBSTR(propvar.toCPointer<ByteVar>(), pbstrout.toCPointer<ByteVar>())

public actual fun PropVariantToBoolean(propvarin: Long, pfret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToBoolean(propvarin.toCPointer<ByteVar>(), pfret.toCPointer<ByteVar>())

public actual fun PropVariantToBooleanVector(propvar: Long, prgf: Long, crgf: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanVector(propvar.toCPointer<ByteVar>(), prgf.toCPointer<ByteVar>(), crgf, pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToBooleanVectorAlloc(propvar: Long, pprgf: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanVectorAlloc(propvar.toCPointer<ByteVar>(), pprgf.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToBooleanWithDefault(propvarin: Long, fdefault: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanWithDefault(propvarin.toCPointer<ByteVar>(), fdefault)

public actual fun PropVariantToBuffer(propvar: Long, pv: Long, cb: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToBuffer(propvar.toCPointer<ByteVar>(), pv.toCPointer<ByteVar>(), cb)

public actual fun PropVariantToDouble(propvarin: Long, pdblret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToDouble(propvarin.toCPointer<ByteVar>(), pdblret.toCPointer<ByteVar>())

public actual fun PropVariantToDoubleVector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleVector(propvar.toCPointer<ByteVar>(), prgn.toCPointer<ByteVar>(), crgn, pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToDoubleVectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleVectorAlloc(propvar.toCPointer<ByteVar>(), pprgn.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToDoubleWithDefault(propvarin: Long, dbldefault: Double): Double =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleWithDefault(propvarin.toCPointer<ByteVar>(), dbldefault)

public actual fun PropVariantToFileTime(propvar: Long, pstfout: PSTIME_FLAGS, pftout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTime(propvar.toCPointer<ByteVar>(), pstfout, pftout.toCPointer<ByteVar>())

public actual fun PropVariantToFileTimeVector(propvar: Long, prgft: Long, crgft: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTimeVector(propvar.toCPointer<ByteVar>(), prgft.toCPointer<ByteVar>(), crgft, pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToFileTimeVectorAlloc(propvar: Long, pprgft: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTimeVectorAlloc(propvar.toCPointer<ByteVar>(), pprgft.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToGUID(propvar: Long, pguid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToGUID(propvar.toCPointer<ByteVar>(), pguid.toCPointer<ByteVar>())

public actual fun PropVariantToInt16(propvarin: Long, piret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16(propvarin.toCPointer<ByteVar>(), piret.toCPointer<ByteVar>())

public actual fun PropVariantToInt16Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16Vector(propvar.toCPointer<ByteVar>(), prgn.toCPointer<ByteVar>(), crgn, pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToInt16VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16VectorAlloc(propvar.toCPointer<ByteVar>(), pprgn.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToInt16WithDefault(propvarin: Long, idefault: Short): Short =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16WithDefault(propvarin.toCPointer<ByteVar>(), idefault)

public actual fun PropVariantToInt32(propvarin: Long, plret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32(propvarin.toCPointer<ByteVar>(), plret.toCPointer<ByteVar>())

public actual fun PropVariantToInt32Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32Vector(propvar.toCPointer<ByteVar>(), prgn.toCPointer<ByteVar>(), crgn, pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToInt32VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32VectorAlloc(propvar.toCPointer<ByteVar>(), pprgn.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToInt32WithDefault(propvarin: Long, ldefault: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32WithDefault(propvarin.toCPointer<ByteVar>(), ldefault)

public actual fun PropVariantToInt64(propvarin: Long, pllret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64(propvarin.toCPointer<ByteVar>(), pllret.toCPointer<ByteVar>())

public actual fun PropVariantToInt64Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64Vector(propvar.toCPointer<ByteVar>(), prgn.toCPointer<ByteVar>(), crgn, pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToInt64VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64VectorAlloc(propvar.toCPointer<ByteVar>(), pprgn.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToInt64WithDefault(propvarin: Long, lldefault: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64WithDefault(propvarin.toCPointer<ByteVar>(), lldefault)

public actual fun PropVariantToString(propvar: Long, psz: PWSTR, cch: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToString(propvar.toCPointer<ByteVar>(), psz.toCPointer<ByteVar>(), cch)

public actual fun PropVariantToStringAlloc(propvar: Long, ppszout: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringAlloc(propvar.toCPointer<ByteVar>(), ppszout.toCPointer<ByteVar>())

public actual fun PropVariantToStringVector(propvar: Long, prgsz: Long, crgsz: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringVector(propvar.toCPointer<ByteVar>(), prgsz.toCPointer<ByteVar>(), crgsz, pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToStringVectorAlloc(propvar: Long, pprgsz: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringVectorAlloc(propvar.toCPointer<ByteVar>(), pprgsz.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToStringWithDefault(propvarin: Long, pszdefault: PCWSTR): PCWSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringWithDefault(propvarin.toCPointer<ByteVar>(), pszdefault.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun PropVariantToUInt16(propvarin: Long, puiret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16(propvarin.toCPointer<ByteVar>(), puiret.toCPointer<ByteVar>())

public actual fun PropVariantToUInt16Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16Vector(propvar.toCPointer<ByteVar>(), prgn.toCPointer<ByteVar>(), crgn, pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToUInt16VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16VectorAlloc(propvar.toCPointer<ByteVar>(), pprgn.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToUInt16WithDefault(propvarin: Long, uidefault: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16WithDefault(propvarin.toCPointer<ByteVar>(), uidefault)

public actual fun PropVariantToUInt32(propvarin: Long, pulret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32(propvarin.toCPointer<ByteVar>(), pulret.toCPointer<ByteVar>())

public actual fun PropVariantToUInt32Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32Vector(propvar.toCPointer<ByteVar>(), prgn.toCPointer<ByteVar>(), crgn, pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToUInt32VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32VectorAlloc(propvar.toCPointer<ByteVar>(), pprgn.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToUInt32WithDefault(propvarin: Long, uldefault: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32WithDefault(propvarin.toCPointer<ByteVar>(), uldefault)

public actual fun PropVariantToUInt64(propvarin: Long, pullret: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64(propvarin.toCPointer<ByteVar>(), pullret.toCPointer<ByteVar>())

public actual fun PropVariantToUInt64Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64Vector(propvar.toCPointer<ByteVar>(), prgn.toCPointer<ByteVar>(), crgn, pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToUInt64VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64VectorAlloc(propvar.toCPointer<ByteVar>(), pprgn.toCPointer<ByteVar>(), pcelem.toCPointer<ByteVar>())

public actual fun PropVariantToUInt64WithDefault(propvarin: Long, ulldefault: ULong): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64WithDefault(propvarin.toCPointer<ByteVar>(), ulldefault)

public actual fun PropVariantToVariant(ppropvar: Long, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToVariant(ppropvar.toCPointer<ByteVar>(), pvar.toCPointer<ByteVar>())

public actual fun PropVariantToWinRTPropertyValue(propvar: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_PropVariantToWinRTPropertyValue(propvar.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun ReadClassStg(pstg: Long, pclsid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_ReadClassStg(pstg.toCPointer<ByteVar>(), pclsid.toCPointer<ByteVar>())

public actual fun ReadClassStm(pstm: Long, pclsid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_ReadClassStm(pstm.toCPointer<ByteVar>(), pclsid.toCPointer<ByteVar>())

public actual fun ReadFmtUserTypeStg(pstg: Long, pcf: Long, lplpszusertype: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_ReadFmtUserTypeStg(pstg.toCPointer<ByteVar>(), pcf.toCPointer<ByteVar>(), lplpszusertype.toCPointer<ByteVar>())

public actual fun SetConvertStg(pstg: Long, fconvert: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_SetConvertStg(pstg.toCPointer<ByteVar>(), fconvert)

public actual fun StgConvertPropertyToVariant(pprop: Long, codepage: UShort, pvar: Long, pma: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgConvertPropertyToVariant(pprop.toCPointer<ByteVar>(), codepage, pvar.toCPointer<ByteVar>(), pma.toCPointer<ByteVar>())

public actual fun StgConvertVariantToProperty(pvar: Long, codepage: UShort, pprop: Long, pcb: Long, pid: UInt, freserved: Boolean, pcindirect: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgConvertVariantToProperty(pvar.toCPointer<ByteVar>(), codepage, pprop.toCPointer<ByteVar>(), pcb.toCPointer<ByteVar>(), pid, freserved, pcindirect.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun StgCreateDocfile(pwcsname: PCWSTR, grfmode: STGM, reserved: UInt, ppstgopen: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgCreateDocfile(pwcsname.toCPointer<ByteVar>(), grfmode, reserved, ppstgopen.toCPointer<ByteVar>())

public actual fun StgCreateDocfileOnILockBytes(plkbyt: Long, grfmode: STGM, reserved: UInt, ppstgopen: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgCreateDocfileOnILockBytes(plkbyt.toCPointer<ByteVar>(), grfmode, reserved, ppstgopen.toCPointer<ByteVar>())

public actual fun StgCreatePropSetStg(pstorage: Long, dwreserved: UInt, pppropsetstg: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgCreatePropSetStg(pstorage.toCPointer<ByteVar>(), dwreserved, pppropsetstg.toCPointer<ByteVar>())

public actual fun StgCreatePropStg(punk: Long, fmtid: Long, pclsid: Long, grfflags: UInt, dwreserved: UInt, pppropstg: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgCreatePropStg(punk.toCPointer<ByteVar>(), fmtid.toCPointer<ByteVar>(), pclsid.toCPointer<ByteVar>(), grfflags, dwreserved, pppropstg.toCPointer<ByteVar>())

public actual fun StgCreateStorageEx(pwcsname: PCWSTR, grfmode: STGM, stgfmt: STGFMT, grfattrs: UInt, pstgoptions: Long, psecuritydescriptor: PSECURITY_DESCRIPTOR, riid: Long, ppobjectopen: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgCreateStorageEx(pwcsname.toCPointer<ByteVar>(), grfmode, stgfmt, grfattrs, pstgoptions.toCPointer<ByteVar>(), psecuritydescriptor.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppobjectopen.toCPointer<ByteVar>())

public actual fun StgDeserializePropVariant(pprop: Long, cbmax: UInt, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgDeserializePropVariant(pprop.toCPointer<ByteVar>(), cbmax, ppropvar.toCPointer<ByteVar>())

public actual fun StgGetIFillLockBytesOnFile(pwcsname: PCWSTR, ppflb: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgGetIFillLockBytesOnFile(pwcsname.toCPointer<ByteVar>(), ppflb.toCPointer<ByteVar>())

public actual fun StgGetIFillLockBytesOnILockBytes(pilb: Long, ppflb: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgGetIFillLockBytesOnILockBytes(pilb.toCPointer<ByteVar>(), ppflb.toCPointer<ByteVar>())

public actual fun StgIsStorageFile(pwcsname: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgIsStorageFile(pwcsname.toCPointer<ByteVar>())

public actual fun StgIsStorageILockBytes(plkbyt: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgIsStorageILockBytes(plkbyt.toCPointer<ByteVar>())

public actual fun StgOpenAsyncDocfileOnIFillLockBytes(pflb: Long, grfmode: UInt, asyncflags: UInt, ppstgopen: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgOpenAsyncDocfileOnIFillLockBytes(pflb.toCPointer<ByteVar>(), grfmode, asyncflags, ppstgopen.toCPointer<ByteVar>())

public actual fun StgOpenLayoutDocfile(pwcsdfname: PCWSTR, grfmode: UInt, reserved: UInt, ppstgopen: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgOpenLayoutDocfile(pwcsdfname.toCPointer<ByteVar>(), grfmode, reserved, ppstgopen.toCPointer<ByteVar>())

public actual fun StgOpenPropStg(punk: Long, fmtid: Long, grfflags: UInt, dwreserved: UInt, pppropstg: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgOpenPropStg(punk.toCPointer<ByteVar>(), fmtid.toCPointer<ByteVar>(), grfflags, dwreserved, pppropstg.toCPointer<ByteVar>())

public actual fun StgOpenStorage(pwcsname: PCWSTR, pstgpriority: Long, grfmode: STGM, snbexclude: Long, reserved: UInt, ppstgopen: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgOpenStorage(pwcsname.toCPointer<ByteVar>(), pstgpriority.toCPointer<ByteVar>(), grfmode, snbexclude.toCPointer<ByteVar>(), reserved, ppstgopen.toCPointer<ByteVar>())

public actual fun StgOpenStorageEx(pwcsname: PCWSTR, grfmode: STGM, stgfmt: STGFMT, grfattrs: UInt, pstgoptions: Long, psecuritydescriptor: PSECURITY_DESCRIPTOR, riid: Long, ppobjectopen: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgOpenStorageEx(pwcsname.toCPointer<ByteVar>(), grfmode, stgfmt, grfattrs, pstgoptions.toCPointer<ByteVar>(), psecuritydescriptor.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppobjectopen.toCPointer<ByteVar>())

public actual fun StgOpenStorageOnILockBytes(plkbyt: Long, pstgpriority: Long, grfmode: STGM, snbexclude: Long, reserved: UInt, ppstgopen: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgOpenStorageOnILockBytes(plkbyt.toCPointer<ByteVar>(), pstgpriority.toCPointer<ByteVar>(), grfmode, snbexclude.toCPointer<ByteVar>(), reserved, ppstgopen.toCPointer<ByteVar>())

public actual fun StgPropertyLengthAsVariant(pprop: Long, cbprop: UInt, codepage: UShort, breserved: UByte): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgPropertyLengthAsVariant(pprop.toCPointer<ByteVar>(), cbprop, codepage, breserved)

public actual fun StgSerializePropVariant(ppropvar: Long, ppprop: Long, pcb: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgSerializePropVariant(ppropvar.toCPointer<ByteVar>(), ppprop.toCPointer<ByteVar>(), pcb.toCPointer<ByteVar>())

public actual fun StgSetTimes(lpszname: PCWSTR, pctime: Long, patime: Long, pmtime: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_StgSetTimes(lpszname.toCPointer<ByteVar>(), pctime.toCPointer<ByteVar>(), patime.toCPointer<ByteVar>(), pmtime.toCPointer<ByteVar>())

public actual fun VariantToPropVariant(pvar: Long, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_VariantToPropVariant(pvar.toCPointer<ByteVar>(), ppropvar.toCPointer<ByteVar>())

public actual fun WinRTPropertyValueToPropVariant(punkpropertyvalue: Long, ppropvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_WinRTPropertyValueToPropVariant(punkpropertyvalue.toCPointer<ByteVar>(), ppropvar.toCPointer<ByteVar>())

public actual fun WriteClassStg(pstg: Long, rclsid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_WriteClassStg(pstg.toCPointer<ByteVar>(), rclsid.toCPointer<ByteVar>())

public actual fun WriteClassStm(pstm: Long, rclsid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_WriteClassStm(pstm.toCPointer<ByteVar>(), rclsid.toCPointer<ByteVar>())

public actual fun WriteFmtUserTypeStg(pstg: Long, cf: UShort, lpszusertype: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.cinterop.windowssys_windows_win32_system_com_structuredstorage_WriteFmtUserTypeStg(pstg.toCPointer<ByteVar>(), cf, lpszusertype.toCPointer<ByteVar>())
