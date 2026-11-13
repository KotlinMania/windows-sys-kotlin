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
import io.github.kotlinmania.windowssys.windows.win32.system.variant.PstimeFlags
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Varenum

public expect fun clearPropVariantArray(rgpropvar: MutPtr, cvars: UInt)

public expect fun coGetInstanceFromFile(pserverinfo: ConstPtr, pclsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, grfmode: UInt, pwszname: Pcwstr, dwcount: UInt, presults: MutPtr): Hresult

public expect fun coGetInstanceFromIStorage(pserverinfo: ConstPtr, pclsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, pstg: MutPtr, dwcount: UInt, presults: MutPtr): Hresult

public expect fun coGetInterfaceAndReleaseStream(pstm: MutPtr, iid: ConstPtr, ppv: MutPtr): Hresult

public expect fun createILockBytesOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, pplkbyt: MutPtr): Hresult

public expect fun createStreamOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, ppstm: MutPtr): Hresult

public expect fun fmtIdToPropStgName(pfmtid: ConstPtr, oszname: Pwstr): Hresult

public expect fun freePropVariantArray(cvariants: UInt, rgvars: MutPtr): Hresult

public expect fun getConvertStg(pstg: MutPtr): Hresult

public expect fun getHGlobalFromILockBytes(plkbyt: MutPtr, phglobal: MutPtr): Hresult

public expect fun getHGlobalFromStream(pstm: MutPtr, phglobal: MutPtr): Hresult

public expect fun initPropVariantFromBooleanVector(prgf: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult

public expect fun initPropVariantFromBuffer(pv: ConstPtr, cb: UInt, ppropvar: MutPtr): Hresult

public expect fun initPropVariantFromCLSID(clsid: ConstPtr, ppropvar: MutPtr): Hresult

public expect fun initPropVariantFromDoubleVector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult

public expect fun initPropVariantFromFileTime(pftin: ConstPtr, ppropvar: MutPtr): Hresult

public expect fun initPropVariantFromFileTimeVector(prgft: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult

public expect fun initPropVariantFromGUIDAsString(guid: ConstPtr, ppropvar: MutPtr): Hresult

public expect fun initPropVariantFromInt16Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult

public expect fun initPropVariantFromInt32Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult

public expect fun initPropVariantFromInt64Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult

public expect fun initPropVariantFromPropVariantVectorElem(propvarin: ConstPtr, ielem: UInt, ppropvar: MutPtr): Hresult

public expect fun initPropVariantFromResource(hinst: Hinstance, id: UInt, ppropvar: MutPtr): Hresult

public expect fun initPropVariantFromStringAsVector(psz: Pcwstr, ppropvar: MutPtr): Hresult

public expect fun initPropVariantFromStringVector(prgsz: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult

public expect fun initPropVariantFromUInt16Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult

public expect fun initPropVariantFromUInt32Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult

public expect fun initPropVariantFromUInt64Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult

public expect fun initPropVariantVectorFromPropVariant(propvarsingle: ConstPtr, ppropvarvector: MutPtr): Hresult

public expect fun oleConvertIStorageToOLESTREAM(pstg: MutPtr, lpolestream: MutPtr): Hresult

public expect fun oleConvertIStorageToOLESTREAMEx(pstg: MutPtr, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: ConstPtr, polestm: MutPtr): Hresult

public expect fun oleConvertOLESTREAMToIStorage(lpolestream: ConstPtr, pstg: MutPtr, ptd: ConstPtr): Hresult

public expect fun oleConvertOLESTREAMToIStorageEx(polestm: ConstPtr, pstg: MutPtr, pcfformat: MutPtr, plwwidth: MutPtr, plheight: MutPtr, pdwsize: MutPtr, pmedium: MutPtr): Hresult

public expect fun propStgNameToFmtId(oszname: Pcwstr, pfmtid: MutPtr): Hresult

public expect fun propVariantChangeType(ppropvardest: MutPtr, propvarsrc: ConstPtr, flags: PropvarChangeFlags, vt: Varenum): Hresult

public expect fun propVariantClear(pvar: MutPtr): Hresult

public expect fun propVariantCompareEx(propvar1: ConstPtr, propvar2: ConstPtr, unit: PropvarCompareUnit, flags: PropvarCompareFlags): Int

public expect fun propVariantCopy(pvardest: MutPtr, pvarsrc: ConstPtr): Hresult

public expect fun propVariantGetBooleanElem(propvar: ConstPtr, ielem: UInt, pfval: MutPtr): Hresult

public expect fun propVariantGetDoubleElem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult

public expect fun propVariantGetElementCount(propvar: ConstPtr): UInt

public expect fun propVariantGetFileTimeElem(propvar: ConstPtr, ielem: UInt, pftval: MutPtr): Hresult

public expect fun propVariantGetInt16Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult

public expect fun propVariantGetInt32Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult

public expect fun propVariantGetInt64Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult

public expect fun propVariantGetStringElem(propvar: ConstPtr, ielem: UInt, ppszval: MutPtr): Hresult

public expect fun propVariantGetUInt16Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult

public expect fun propVariantGetUInt32Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult

public expect fun propVariantGetUInt64Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult

public expect fun propVariantToBSTR(propvar: ConstPtr, pbstrout: MutPtr): Hresult

public expect fun propVariantToBoolean(propvarin: ConstPtr, pfret: MutPtr): Hresult

public expect fun propVariantToBooleanVector(propvar: ConstPtr, prgf: MutPtr, crgf: UInt, pcelem: MutPtr): Hresult

public expect fun propVariantToBooleanVectorAlloc(propvar: ConstPtr, pprgf: MutPtr, pcelem: MutPtr): Hresult

public expect fun propVariantToBooleanWithDefault(propvarin: ConstPtr, fdefault: Bool): Bool

public expect fun propVariantToBuffer(propvar: ConstPtr, pv: MutPtr, cb: UInt): Hresult

public expect fun propVariantToDouble(propvarin: ConstPtr, pdblret: MutPtr): Hresult

public expect fun propVariantToDoubleVector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult

public expect fun propVariantToDoubleVectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult

public expect fun propVariantToDoubleWithDefault(propvarin: ConstPtr, dbldefault: Double): Double

public expect fun propVariantToFileTime(propvar: ConstPtr, pstfout: PstimeFlags, pftout: MutPtr): Hresult

public expect fun propVariantToFileTimeVector(propvar: ConstPtr, prgft: MutPtr, crgft: UInt, pcelem: MutPtr): Hresult

public expect fun propVariantToFileTimeVectorAlloc(propvar: ConstPtr, pprgft: MutPtr, pcelem: MutPtr): Hresult

public expect fun propVariantToGUID(propvar: ConstPtr, pguid: MutPtr): Hresult

public expect fun propVariantToInt16(propvarin: ConstPtr, piret: MutPtr): Hresult

public expect fun propVariantToInt16Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult

public expect fun propVariantToInt16VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult

public expect fun propVariantToInt16WithDefault(propvarin: ConstPtr, idefault: Short): Short

public expect fun propVariantToInt32(propvarin: ConstPtr, plret: MutPtr): Hresult

public expect fun propVariantToInt32Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult

public expect fun propVariantToInt32VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult

public expect fun propVariantToInt32WithDefault(propvarin: ConstPtr, ldefault: Int): Int

public expect fun propVariantToInt64(propvarin: ConstPtr, pllret: MutPtr): Hresult

public expect fun propVariantToInt64Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult

public expect fun propVariantToInt64VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult

public expect fun propVariantToInt64WithDefault(propvarin: ConstPtr, lldefault: Long): Long

public expect fun propVariantToString(propvar: ConstPtr, psz: Pwstr, cch: UInt): Hresult

public expect fun propVariantToStringAlloc(propvar: ConstPtr, ppszout: MutPtr): Hresult

public expect fun propVariantToStringVector(propvar: ConstPtr, prgsz: MutPtr, crgsz: UInt, pcelem: MutPtr): Hresult

public expect fun propVariantToStringVectorAlloc(propvar: ConstPtr, pprgsz: MutPtr, pcelem: MutPtr): Hresult

public expect fun propVariantToStringWithDefault(propvarin: ConstPtr, pszdefault: Pcwstr): Pcwstr

public expect fun propVariantToUInt16(propvarin: ConstPtr, puiret: MutPtr): Hresult

public expect fun propVariantToUInt16Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult

public expect fun propVariantToUInt16VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult

public expect fun propVariantToUInt16WithDefault(propvarin: ConstPtr, uidefault: UShort): UShort

public expect fun propVariantToUInt32(propvarin: ConstPtr, pulret: MutPtr): Hresult

public expect fun propVariantToUInt32Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult

public expect fun propVariantToUInt32VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult

public expect fun propVariantToUInt32WithDefault(propvarin: ConstPtr, uldefault: UInt): UInt

public expect fun propVariantToUInt64(propvarin: ConstPtr, pullret: MutPtr): Hresult

public expect fun propVariantToUInt64Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult

public expect fun propVariantToUInt64VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult

public expect fun propVariantToUInt64WithDefault(propvarin: ConstPtr, ulldefault: ULong): ULong

public expect fun propVariantToVariant(ppropvar: ConstPtr, pvar: MutPtr): Hresult

public expect fun propVariantToWinRTPropertyValue(propvar: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun readClassStg(pstg: MutPtr, pclsid: MutPtr): Hresult

public expect fun readClassStm(pstm: MutPtr, pclsid: MutPtr): Hresult

public expect fun readFmtUserTypeStg(pstg: MutPtr, pcf: MutPtr, lplpszusertype: MutPtr): Hresult

public expect fun setConvertStg(pstg: MutPtr, fconvert: Bool): Hresult

public expect fun stgConvertPropertyToVariant(pprop: ConstPtr, codepage: UShort, pvar: MutPtr, pma: MutPtr): Boolean

public expect fun stgConvertVariantToProperty(pvar: ConstPtr, codepage: UShort, pprop: MutPtr, pcb: MutPtr, pid: UInt, freserved: Boolean, pcindirect: MutPtr): MutPtr

public expect fun stgCreateDocfile(pwcsname: Pcwstr, grfmode: Stgm, reserved: UInt, ppstgopen: MutPtr): Hresult

public expect fun stgCreateDocfileOnILockBytes(plkbyt: MutPtr, grfmode: Stgm, reserved: UInt, ppstgopen: MutPtr): Hresult

public expect fun stgCreatePropSetStg(pstorage: MutPtr, dwreserved: UInt, pppropsetstg: MutPtr): Hresult

public expect fun stgCreatePropStg(punk: MutPtr, fmtid: ConstPtr, pclsid: ConstPtr, grfflags: UInt, dwreserved: UInt, pppropstg: MutPtr): Hresult

public expect fun stgCreateStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: MutPtr, psecuritydescriptor: PsecurityDescriptor, riid: ConstPtr, ppobjectopen: MutPtr): Hresult

public expect fun stgDeserializePropVariant(pprop: ConstPtr, cbmax: UInt, ppropvar: MutPtr): Hresult

public expect fun stgGetIFillLockBytesOnFile(pwcsname: Pcwstr, ppflb: MutPtr): Hresult

public expect fun stgGetIFillLockBytesOnILockBytes(pilb: MutPtr, ppflb: MutPtr): Hresult

public expect fun stgIsStorageFile(pwcsname: Pcwstr): Hresult

public expect fun stgIsStorageILockBytes(plkbyt: MutPtr): Hresult

public expect fun stgOpenAsyncDocfileOnIFillLockBytes(pflb: MutPtr, grfmode: UInt, asyncflags: UInt, ppstgopen: MutPtr): Hresult

public expect fun stgOpenLayoutDocfile(pwcsdfname: Pcwstr, grfmode: UInt, reserved: UInt, ppstgopen: MutPtr): Hresult

public expect fun stgOpenPropStg(punk: MutPtr, fmtid: ConstPtr, grfflags: UInt, dwreserved: UInt, pppropstg: MutPtr): Hresult

public expect fun stgOpenStorage(pwcsname: Pcwstr, pstgpriority: MutPtr, grfmode: Stgm, snbexclude: ConstPtr, reserved: UInt, ppstgopen: MutPtr): Hresult

public expect fun stgOpenStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: MutPtr, psecuritydescriptor: PsecurityDescriptor, riid: ConstPtr, ppobjectopen: MutPtr): Hresult

public expect fun stgOpenStorageOnILockBytes(plkbyt: MutPtr, pstgpriority: MutPtr, grfmode: Stgm, snbexclude: ConstPtr, reserved: UInt, ppstgopen: MutPtr): Hresult

public expect fun stgPropertyLengthAsVariant(pprop: ConstPtr, cbprop: UInt, codepage: UShort, breserved: UByte): UInt

public expect fun stgSerializePropVariant(ppropvar: ConstPtr, ppprop: MutPtr, pcb: MutPtr): Hresult

public expect fun stgSetTimes(lpszname: Pcwstr, pctime: ConstPtr, patime: ConstPtr, pmtime: ConstPtr): Hresult

public expect fun variantToPropVariant(pvar: ConstPtr, ppropvar: MutPtr): Hresult

public expect fun winRTPropertyValueToPropVariant(punkpropertyvalue: MutPtr, ppropvar: MutPtr): Hresult

public expect fun writeClassStg(pstg: MutPtr, rclsid: ConstPtr): Hresult

public expect fun writeClassStm(pstm: MutPtr, rclsid: ConstPtr): Hresult

public expect fun writeFmtUserTypeStg(pstg: MutPtr, cf: UShort, lpszusertype: Pcwstr): Hresult
