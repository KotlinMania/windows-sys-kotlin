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

public expect fun ClearPropVariantArray(rgpropvar: Long, cvars: UInt)

public expect fun CoGetInstanceFromFile(pserverinfo: Long, pclsid: Long, punkouter: Long, dwclsctx: CLSCTX, grfmode: UInt, pwszname: PCWSTR, dwcount: UInt, presults: Long): HRESULT

public expect fun CoGetInstanceFromIStorage(pserverinfo: Long, pclsid: Long, punkouter: Long, dwclsctx: CLSCTX, pstg: Long, dwcount: UInt, presults: Long): HRESULT

public expect fun CoGetInterfaceAndReleaseStream(pstm: Long, iid: Long, ppv: Long): HRESULT

public expect fun CreateILockBytesOnHGlobal(hglobal: HGLOBAL, fdeleteonrelease: BOOL, pplkbyt: Long): HRESULT

public expect fun CreateStreamOnHGlobal(hglobal: HGLOBAL, fdeleteonrelease: BOOL, ppstm: Long): HRESULT

public expect fun FmtIdToPropStgName(pfmtid: Long, oszname: PWSTR): HRESULT

public expect fun FreePropVariantArray(cvariants: UInt, rgvars: Long): HRESULT

public expect fun GetConvertStg(pstg: Long): HRESULT

public expect fun GetHGlobalFromILockBytes(plkbyt: Long, phglobal: Long): HRESULT

public expect fun GetHGlobalFromStream(pstm: Long, phglobal: Long): HRESULT

public expect fun InitPropVariantFromBooleanVector(prgf: Long, celems: UInt, ppropvar: Long): HRESULT

public expect fun InitPropVariantFromBuffer(pv: Long, cb: UInt, ppropvar: Long): HRESULT

public expect fun InitPropVariantFromCLSID(clsid: Long, ppropvar: Long): HRESULT

public expect fun InitPropVariantFromDoubleVector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT

public expect fun InitPropVariantFromFileTime(pftin: Long, ppropvar: Long): HRESULT

public expect fun InitPropVariantFromFileTimeVector(prgft: Long, celems: UInt, ppropvar: Long): HRESULT

public expect fun InitPropVariantFromGUIDAsString(guid: Long, ppropvar: Long): HRESULT

public expect fun InitPropVariantFromInt16Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT

public expect fun InitPropVariantFromInt32Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT

public expect fun InitPropVariantFromInt64Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT

public expect fun InitPropVariantFromPropVariantVectorElem(propvarin: Long, ielem: UInt, ppropvar: Long): HRESULT

public expect fun InitPropVariantFromResource(hinst: HINSTANCE, id: UInt, ppropvar: Long): HRESULT

public expect fun InitPropVariantFromStringAsVector(psz: PCWSTR, ppropvar: Long): HRESULT

public expect fun InitPropVariantFromStringVector(prgsz: Long, celems: UInt, ppropvar: Long): HRESULT

public expect fun InitPropVariantFromUInt16Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT

public expect fun InitPropVariantFromUInt32Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT

public expect fun InitPropVariantFromUInt64Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT

public expect fun InitPropVariantVectorFromPropVariant(propvarsingle: Long, ppropvarvector: Long): HRESULT

public expect fun OleConvertIStorageToOLESTREAM(pstg: Long, lpolestream: Long): HRESULT

public expect fun OleConvertIStorageToOLESTREAMEx(pstg: Long, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: Long, polestm: Long): HRESULT

public expect fun OleConvertOLESTREAMToIStorage(lpolestream: Long, pstg: Long, ptd: Long): HRESULT

public expect fun OleConvertOLESTREAMToIStorageEx(polestm: Long, pstg: Long, pcfformat: Long, plwwidth: Long, plheight: Long, pdwsize: Long, pmedium: Long): HRESULT

public expect fun PropStgNameToFmtId(oszname: PCWSTR, pfmtid: Long): HRESULT

public expect fun PropVariantChangeType(ppropvardest: Long, propvarsrc: Long, flags: PROPVAR_CHANGE_FLAGS, vt: VARENUM): HRESULT

public expect fun PropVariantClear(pvar: Long): HRESULT

public expect fun PropVariantCompareEx(propvar1: Long, propvar2: Long, unit: PROPVAR_COMPARE_UNIT, flags: PROPVAR_COMPARE_FLAGS): Int

public expect fun PropVariantCopy(pvardest: Long, pvarsrc: Long): HRESULT

public expect fun PropVariantGetBooleanElem(propvar: Long, ielem: UInt, pfval: Long): HRESULT

public expect fun PropVariantGetDoubleElem(propvar: Long, ielem: UInt, pnval: Long): HRESULT

public expect fun PropVariantGetElementCount(propvar: Long): UInt

public expect fun PropVariantGetFileTimeElem(propvar: Long, ielem: UInt, pftval: Long): HRESULT

public expect fun PropVariantGetInt16Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT

public expect fun PropVariantGetInt32Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT

public expect fun PropVariantGetInt64Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT

public expect fun PropVariantGetStringElem(propvar: Long, ielem: UInt, ppszval: Long): HRESULT

public expect fun PropVariantGetUInt16Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT

public expect fun PropVariantGetUInt32Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT

public expect fun PropVariantGetUInt64Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT

public expect fun PropVariantToBSTR(propvar: Long, pbstrout: Long): HRESULT

public expect fun PropVariantToBoolean(propvarin: Long, pfret: Long): HRESULT

public expect fun PropVariantToBooleanVector(propvar: Long, prgf: Long, crgf: UInt, pcelem: Long): HRESULT

public expect fun PropVariantToBooleanVectorAlloc(propvar: Long, pprgf: Long, pcelem: Long): HRESULT

public expect fun PropVariantToBooleanWithDefault(propvarin: Long, fdefault: BOOL): BOOL

public expect fun PropVariantToBuffer(propvar: Long, pv: Long, cb: UInt): HRESULT

public expect fun PropVariantToDouble(propvarin: Long, pdblret: Long): HRESULT

public expect fun PropVariantToDoubleVector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT

public expect fun PropVariantToDoubleVectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT

public expect fun PropVariantToDoubleWithDefault(propvarin: Long, dbldefault: Double): Double

public expect fun PropVariantToFileTime(propvar: Long, pstfout: PSTIME_FLAGS, pftout: Long): HRESULT

public expect fun PropVariantToFileTimeVector(propvar: Long, prgft: Long, crgft: UInt, pcelem: Long): HRESULT

public expect fun PropVariantToFileTimeVectorAlloc(propvar: Long, pprgft: Long, pcelem: Long): HRESULT

public expect fun PropVariantToGUID(propvar: Long, pguid: Long): HRESULT

public expect fun PropVariantToInt16(propvarin: Long, piret: Long): HRESULT

public expect fun PropVariantToInt16Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT

public expect fun PropVariantToInt16VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT

public expect fun PropVariantToInt16WithDefault(propvarin: Long, idefault: Short): Short

public expect fun PropVariantToInt32(propvarin: Long, plret: Long): HRESULT

public expect fun PropVariantToInt32Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT

public expect fun PropVariantToInt32VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT

public expect fun PropVariantToInt32WithDefault(propvarin: Long, ldefault: Int): Int

public expect fun PropVariantToInt64(propvarin: Long, pllret: Long): HRESULT

public expect fun PropVariantToInt64Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT

public expect fun PropVariantToInt64VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT

public expect fun PropVariantToInt64WithDefault(propvarin: Long, lldefault: Long): Long

public expect fun PropVariantToString(propvar: Long, psz: PWSTR, cch: UInt): HRESULT

public expect fun PropVariantToStringAlloc(propvar: Long, ppszout: Long): HRESULT

public expect fun PropVariantToStringVector(propvar: Long, prgsz: Long, crgsz: UInt, pcelem: Long): HRESULT

public expect fun PropVariantToStringVectorAlloc(propvar: Long, pprgsz: Long, pcelem: Long): HRESULT

public expect fun PropVariantToStringWithDefault(propvarin: Long, pszdefault: PCWSTR): PCWSTR

public expect fun PropVariantToUInt16(propvarin: Long, puiret: Long): HRESULT

public expect fun PropVariantToUInt16Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT

public expect fun PropVariantToUInt16VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT

public expect fun PropVariantToUInt16WithDefault(propvarin: Long, uidefault: UShort): UShort

public expect fun PropVariantToUInt32(propvarin: Long, pulret: Long): HRESULT

public expect fun PropVariantToUInt32Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT

public expect fun PropVariantToUInt32VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT

public expect fun PropVariantToUInt32WithDefault(propvarin: Long, uldefault: UInt): UInt

public expect fun PropVariantToUInt64(propvarin: Long, pullret: Long): HRESULT

public expect fun PropVariantToUInt64Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT

public expect fun PropVariantToUInt64VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT

public expect fun PropVariantToUInt64WithDefault(propvarin: Long, ulldefault: ULong): ULong

public expect fun PropVariantToVariant(ppropvar: Long, pvar: Long): HRESULT

public expect fun PropVariantToWinRTPropertyValue(propvar: Long, riid: Long, ppv: Long): HRESULT

public expect fun ReadClassStg(pstg: Long, pclsid: Long): HRESULT

public expect fun ReadClassStm(pstm: Long, pclsid: Long): HRESULT

public expect fun ReadFmtUserTypeStg(pstg: Long, pcf: Long, lplpszusertype: Long): HRESULT

public expect fun SetConvertStg(pstg: Long, fconvert: BOOL): HRESULT

public expect fun StgConvertPropertyToVariant(pprop: Long, codepage: UShort, pvar: Long, pma: Long): Boolean

public expect fun StgConvertVariantToProperty(pvar: Long, codepage: UShort, pprop: Long, pcb: Long, pid: UInt, freserved: Boolean, pcindirect: Long): Long

public expect fun StgCreateDocfile(pwcsname: PCWSTR, grfmode: STGM, reserved: UInt, ppstgopen: Long): HRESULT

public expect fun StgCreateDocfileOnILockBytes(plkbyt: Long, grfmode: STGM, reserved: UInt, ppstgopen: Long): HRESULT

public expect fun StgCreatePropSetStg(pstorage: Long, dwreserved: UInt, pppropsetstg: Long): HRESULT

public expect fun StgCreatePropStg(punk: Long, fmtid: Long, pclsid: Long, grfflags: UInt, dwreserved: UInt, pppropstg: Long): HRESULT

public expect fun StgCreateStorageEx(pwcsname: PCWSTR, grfmode: STGM, stgfmt: STGFMT, grfattrs: UInt, pstgoptions: Long, psecuritydescriptor: PSECURITY_DESCRIPTOR, riid: Long, ppobjectopen: Long): HRESULT

public expect fun StgDeserializePropVariant(pprop: Long, cbmax: UInt, ppropvar: Long): HRESULT

public expect fun StgGetIFillLockBytesOnFile(pwcsname: PCWSTR, ppflb: Long): HRESULT

public expect fun StgGetIFillLockBytesOnILockBytes(pilb: Long, ppflb: Long): HRESULT

public expect fun StgIsStorageFile(pwcsname: PCWSTR): HRESULT

public expect fun StgIsStorageILockBytes(plkbyt: Long): HRESULT

public expect fun StgOpenAsyncDocfileOnIFillLockBytes(pflb: Long, grfmode: UInt, asyncflags: UInt, ppstgopen: Long): HRESULT

public expect fun StgOpenLayoutDocfile(pwcsdfname: PCWSTR, grfmode: UInt, reserved: UInt, ppstgopen: Long): HRESULT

public expect fun StgOpenPropStg(punk: Long, fmtid: Long, grfflags: UInt, dwreserved: UInt, pppropstg: Long): HRESULT

public expect fun StgOpenStorage(pwcsname: PCWSTR, pstgpriority: Long, grfmode: STGM, snbexclude: Long, reserved: UInt, ppstgopen: Long): HRESULT

public expect fun StgOpenStorageEx(pwcsname: PCWSTR, grfmode: STGM, stgfmt: STGFMT, grfattrs: UInt, pstgoptions: Long, psecuritydescriptor: PSECURITY_DESCRIPTOR, riid: Long, ppobjectopen: Long): HRESULT

public expect fun StgOpenStorageOnILockBytes(plkbyt: Long, pstgpriority: Long, grfmode: STGM, snbexclude: Long, reserved: UInt, ppstgopen: Long): HRESULT

public expect fun StgPropertyLengthAsVariant(pprop: Long, cbprop: UInt, codepage: UShort, breserved: UByte): UInt

public expect fun StgSerializePropVariant(ppropvar: Long, ppprop: Long, pcb: Long): HRESULT

public expect fun StgSetTimes(lpszname: PCWSTR, pctime: Long, patime: Long, pmtime: Long): HRESULT

public expect fun VariantToPropVariant(pvar: Long, ppropvar: Long): HRESULT

public expect fun WinRTPropertyValueToPropVariant(punkpropertyvalue: Long, ppropvar: Long): HRESULT

public expect fun WriteClassStg(pstg: Long, rclsid: Long): HRESULT

public expect fun WriteClassStm(pstm: Long, rclsid: Long): HRESULT

public expect fun WriteFmtUserTypeStg(pstg: Long, cf: UShort, lpszusertype: PCWSTR): HRESULT
