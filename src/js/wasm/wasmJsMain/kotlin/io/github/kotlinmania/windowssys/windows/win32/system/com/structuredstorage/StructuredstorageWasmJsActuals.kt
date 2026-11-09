@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

public actual fun ClearPropVariantArray(rgpropvar: Long, cvars: UInt) {
}

public actual fun CoGetInstanceFromFile(pserverinfo: Long, pclsid: Long, punkouter: Long, dwclsctx: CLSCTX, grfmode: UInt, pwszname: PCWSTR, dwcount: UInt, presults: Long): HRESULT =
    0

public actual fun CoGetInstanceFromIStorage(pserverinfo: Long, pclsid: Long, punkouter: Long, dwclsctx: CLSCTX, pstg: Long, dwcount: UInt, presults: Long): HRESULT =
    0

public actual fun CoGetInterfaceAndReleaseStream(pstm: Long, iid: Long, ppv: Long): HRESULT =
    0

public actual fun CreateILockBytesOnHGlobal(hglobal: HGLOBAL, fdeleteonrelease: BOOL, pplkbyt: Long): HRESULT =
    0

public actual fun CreateStreamOnHGlobal(hglobal: HGLOBAL, fdeleteonrelease: BOOL, ppstm: Long): HRESULT =
    0

public actual fun FmtIdToPropStgName(pfmtid: Long, oszname: PWSTR): HRESULT =
    0

public actual fun FreePropVariantArray(cvariants: UInt, rgvars: Long): HRESULT =
    0

public actual fun GetConvertStg(pstg: Long): HRESULT =
    0

public actual fun GetHGlobalFromILockBytes(plkbyt: Long, phglobal: Long): HRESULT =
    0

public actual fun GetHGlobalFromStream(pstm: Long, phglobal: Long): HRESULT =
    0

public actual fun InitPropVariantFromBooleanVector(prgf: Long, celems: UInt, ppropvar: Long): HRESULT =
    0

public actual fun InitPropVariantFromBuffer(pv: Long, cb: UInt, ppropvar: Long): HRESULT =
    0

public actual fun InitPropVariantFromCLSID(clsid: Long, ppropvar: Long): HRESULT =
    0

public actual fun InitPropVariantFromDoubleVector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    0

public actual fun InitPropVariantFromFileTime(pftin: Long, ppropvar: Long): HRESULT =
    0

public actual fun InitPropVariantFromFileTimeVector(prgft: Long, celems: UInt, ppropvar: Long): HRESULT =
    0

public actual fun InitPropVariantFromGUIDAsString(guid: Long, ppropvar: Long): HRESULT =
    0

public actual fun InitPropVariantFromInt16Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    0

public actual fun InitPropVariantFromInt32Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    0

public actual fun InitPropVariantFromInt64Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    0

public actual fun InitPropVariantFromPropVariantVectorElem(propvarin: Long, ielem: UInt, ppropvar: Long): HRESULT =
    0

public actual fun InitPropVariantFromResource(hinst: HINSTANCE, id: UInt, ppropvar: Long): HRESULT =
    0

public actual fun InitPropVariantFromStringAsVector(psz: PCWSTR, ppropvar: Long): HRESULT =
    0

public actual fun InitPropVariantFromStringVector(prgsz: Long, celems: UInt, ppropvar: Long): HRESULT =
    0

public actual fun InitPropVariantFromUInt16Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    0

public actual fun InitPropVariantFromUInt32Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    0

public actual fun InitPropVariantFromUInt64Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    0

public actual fun InitPropVariantVectorFromPropVariant(propvarsingle: Long, ppropvarvector: Long): HRESULT =
    0

public actual fun OleConvertIStorageToOLESTREAM(pstg: Long, lpolestream: Long): HRESULT =
    0

public actual fun OleConvertIStorageToOLESTREAMEx(pstg: Long, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: Long, polestm: Long): HRESULT =
    0

public actual fun OleConvertOLESTREAMToIStorage(lpolestream: Long, pstg: Long, ptd: Long): HRESULT =
    0

public actual fun OleConvertOLESTREAMToIStorageEx(polestm: Long, pstg: Long, pcfformat: Long, plwwidth: Long, plheight: Long, pdwsize: Long, pmedium: Long): HRESULT =
    0

public actual fun PropStgNameToFmtId(oszname: PCWSTR, pfmtid: Long): HRESULT =
    0

public actual fun PropVariantChangeType(ppropvardest: Long, propvarsrc: Long, flags: PROPVAR_CHANGE_FLAGS, vt: VARENUM): HRESULT =
    0

public actual fun PropVariantClear(pvar: Long): HRESULT =
    0

public actual fun PropVariantCompareEx(propvar1: Long, propvar2: Long, unit: PROPVAR_COMPARE_UNIT, flags: PROPVAR_COMPARE_FLAGS): Int =
    0

public actual fun PropVariantCopy(pvardest: Long, pvarsrc: Long): HRESULT =
    0

public actual fun PropVariantGetBooleanElem(propvar: Long, ielem: UInt, pfval: Long): HRESULT =
    0

public actual fun PropVariantGetDoubleElem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    0

public actual fun PropVariantGetElementCount(propvar: Long): UInt =
    0u

public actual fun PropVariantGetFileTimeElem(propvar: Long, ielem: UInt, pftval: Long): HRESULT =
    0

public actual fun PropVariantGetInt16Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    0

public actual fun PropVariantGetInt32Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    0

public actual fun PropVariantGetInt64Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    0

public actual fun PropVariantGetStringElem(propvar: Long, ielem: UInt, ppszval: Long): HRESULT =
    0

public actual fun PropVariantGetUInt16Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    0

public actual fun PropVariantGetUInt32Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    0

public actual fun PropVariantGetUInt64Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    0

public actual fun PropVariantToBSTR(propvar: Long, pbstrout: Long): HRESULT =
    0

public actual fun PropVariantToBoolean(propvarin: Long, pfret: Long): HRESULT =
    0

public actual fun PropVariantToBooleanVector(propvar: Long, prgf: Long, crgf: UInt, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToBooleanVectorAlloc(propvar: Long, pprgf: Long, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToBooleanWithDefault(propvarin: Long, fdefault: BOOL): BOOL =
    0

public actual fun PropVariantToBuffer(propvar: Long, pv: Long, cb: UInt): HRESULT =
    0

public actual fun PropVariantToDouble(propvarin: Long, pdblret: Long): HRESULT =
    0

public actual fun PropVariantToDoubleVector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToDoubleVectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToDoubleWithDefault(propvarin: Long, dbldefault: Double): Double =
    0.0

public actual fun PropVariantToFileTime(propvar: Long, pstfout: PSTIME_FLAGS, pftout: Long): HRESULT =
    0

public actual fun PropVariantToFileTimeVector(propvar: Long, prgft: Long, crgft: UInt, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToFileTimeVectorAlloc(propvar: Long, pprgft: Long, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToGUID(propvar: Long, pguid: Long): HRESULT =
    0

public actual fun PropVariantToInt16(propvarin: Long, piret: Long): HRESULT =
    0

public actual fun PropVariantToInt16Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToInt16VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToInt16WithDefault(propvarin: Long, idefault: Short): Short =
    0

public actual fun PropVariantToInt32(propvarin: Long, plret: Long): HRESULT =
    0

public actual fun PropVariantToInt32Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToInt32VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToInt32WithDefault(propvarin: Long, ldefault: Int): Int =
    0

public actual fun PropVariantToInt64(propvarin: Long, pllret: Long): HRESULT =
    0

public actual fun PropVariantToInt64Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToInt64VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToInt64WithDefault(propvarin: Long, lldefault: Long): Long =
    0L

public actual fun PropVariantToString(propvar: Long, psz: PWSTR, cch: UInt): HRESULT =
    0

public actual fun PropVariantToStringAlloc(propvar: Long, ppszout: Long): HRESULT =
    0

public actual fun PropVariantToStringVector(propvar: Long, prgsz: Long, crgsz: UInt, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToStringVectorAlloc(propvar: Long, pprgsz: Long, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToStringWithDefault(propvarin: Long, pszdefault: PCWSTR): PCWSTR =
    0L

public actual fun PropVariantToUInt16(propvarin: Long, puiret: Long): HRESULT =
    0

public actual fun PropVariantToUInt16Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToUInt16VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToUInt16WithDefault(propvarin: Long, uidefault: UShort): UShort =
    0u

public actual fun PropVariantToUInt32(propvarin: Long, pulret: Long): HRESULT =
    0

public actual fun PropVariantToUInt32Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToUInt32VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToUInt32WithDefault(propvarin: Long, uldefault: UInt): UInt =
    0u

public actual fun PropVariantToUInt64(propvarin: Long, pullret: Long): HRESULT =
    0

public actual fun PropVariantToUInt64Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToUInt64VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    0

public actual fun PropVariantToUInt64WithDefault(propvarin: Long, ulldefault: ULong): ULong =
    0uL

public actual fun PropVariantToVariant(ppropvar: Long, pvar: Long): HRESULT =
    0

public actual fun PropVariantToWinRTPropertyValue(propvar: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun ReadClassStg(pstg: Long, pclsid: Long): HRESULT =
    0

public actual fun ReadClassStm(pstm: Long, pclsid: Long): HRESULT =
    0

public actual fun ReadFmtUserTypeStg(pstg: Long, pcf: Long, lplpszusertype: Long): HRESULT =
    0

public actual fun SetConvertStg(pstg: Long, fconvert: BOOL): HRESULT =
    0

public actual fun StgConvertPropertyToVariant(pprop: Long, codepage: UShort, pvar: Long, pma: Long): Boolean =
    false

public actual fun StgConvertVariantToProperty(pvar: Long, codepage: UShort, pprop: Long, pcb: Long, pid: UInt, freserved: Boolean, pcindirect: Long): Long =
    0L

public actual fun StgCreateDocfile(pwcsname: PCWSTR, grfmode: STGM, reserved: UInt, ppstgopen: Long): HRESULT =
    0

public actual fun StgCreateDocfileOnILockBytes(plkbyt: Long, grfmode: STGM, reserved: UInt, ppstgopen: Long): HRESULT =
    0

public actual fun StgCreatePropSetStg(pstorage: Long, dwreserved: UInt, pppropsetstg: Long): HRESULT =
    0

public actual fun StgCreatePropStg(punk: Long, fmtid: Long, pclsid: Long, grfflags: UInt, dwreserved: UInt, pppropstg: Long): HRESULT =
    0

public actual fun StgCreateStorageEx(pwcsname: PCWSTR, grfmode: STGM, stgfmt: STGFMT, grfattrs: UInt, pstgoptions: Long, psecuritydescriptor: PSECURITY_DESCRIPTOR, riid: Long, ppobjectopen: Long): HRESULT =
    0

public actual fun StgDeserializePropVariant(pprop: Long, cbmax: UInt, ppropvar: Long): HRESULT =
    0

public actual fun StgGetIFillLockBytesOnFile(pwcsname: PCWSTR, ppflb: Long): HRESULT =
    0

public actual fun StgGetIFillLockBytesOnILockBytes(pilb: Long, ppflb: Long): HRESULT =
    0

public actual fun StgIsStorageFile(pwcsname: PCWSTR): HRESULT =
    0

public actual fun StgIsStorageILockBytes(plkbyt: Long): HRESULT =
    0

public actual fun StgOpenAsyncDocfileOnIFillLockBytes(pflb: Long, grfmode: UInt, asyncflags: UInt, ppstgopen: Long): HRESULT =
    0

public actual fun StgOpenLayoutDocfile(pwcsdfname: PCWSTR, grfmode: UInt, reserved: UInt, ppstgopen: Long): HRESULT =
    0

public actual fun StgOpenPropStg(punk: Long, fmtid: Long, grfflags: UInt, dwreserved: UInt, pppropstg: Long): HRESULT =
    0

public actual fun StgOpenStorage(pwcsname: PCWSTR, pstgpriority: Long, grfmode: STGM, snbexclude: Long, reserved: UInt, ppstgopen: Long): HRESULT =
    0

public actual fun StgOpenStorageEx(pwcsname: PCWSTR, grfmode: STGM, stgfmt: STGFMT, grfattrs: UInt, pstgoptions: Long, psecuritydescriptor: PSECURITY_DESCRIPTOR, riid: Long, ppobjectopen: Long): HRESULT =
    0

public actual fun StgOpenStorageOnILockBytes(plkbyt: Long, pstgpriority: Long, grfmode: STGM, snbexclude: Long, reserved: UInt, ppstgopen: Long): HRESULT =
    0

public actual fun StgPropertyLengthAsVariant(pprop: Long, cbprop: UInt, codepage: UShort, breserved: UByte): UInt =
    0u

public actual fun StgSerializePropVariant(ppropvar: Long, ppprop: Long, pcb: Long): HRESULT =
    0

public actual fun StgSetTimes(lpszname: PCWSTR, pctime: Long, patime: Long, pmtime: Long): HRESULT =
    0

public actual fun VariantToPropVariant(pvar: Long, ppropvar: Long): HRESULT =
    0

public actual fun WinRTPropertyValueToPropVariant(punkpropertyvalue: Long, ppropvar: Long): HRESULT =
    0

public actual fun WriteClassStg(pstg: Long, rclsid: Long): HRESULT =
    0

public actual fun WriteClassStm(pstm: Long, rclsid: Long): HRESULT =
    0

public actual fun WriteFmtUserTypeStg(pstg: Long, cf: UShort, lpszusertype: PCWSTR): HRESULT =
    0
