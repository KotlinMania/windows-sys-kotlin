package io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage

import io.github.kotlinmania.windowssys.COpaquePointer
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

public expect fun clearPropVariantArray(rgpropvar: COpaquePointer?, cvars: UInt)

public expect fun coGetInstanceFromFile(pserverinfo: COpaquePointer?, pclsid: COpaquePointer?, punkouter: COpaquePointer?, dwclsctx: Clsctx, grfmode: UInt, pwszname: Pcwstr, dwcount: UInt, presults: COpaquePointer?): Hresult

public expect fun coGetInstanceFromIStorage(pserverinfo: COpaquePointer?, pclsid: COpaquePointer?, punkouter: COpaquePointer?, dwclsctx: Clsctx, pstg: COpaquePointer?, dwcount: UInt, presults: COpaquePointer?): Hresult

public expect fun coGetInterfaceAndReleaseStream(pstm: COpaquePointer?, iid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun createILockBytesOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, pplkbyt: COpaquePointer?): Hresult

public expect fun createStreamOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, ppstm: COpaquePointer?): Hresult

public expect fun fmtIdToPropStgName(pfmtid: COpaquePointer?, oszname: Pwstr): Hresult

public expect fun freePropVariantArray(cvariants: UInt, rgvars: COpaquePointer?): Hresult

public expect fun getConvertStg(pstg: COpaquePointer?): Hresult

public expect fun getHGlobalFromILockBytes(plkbyt: COpaquePointer?, phglobal: COpaquePointer?): Hresult

public expect fun getHGlobalFromStream(pstm: COpaquePointer?, phglobal: COpaquePointer?): Hresult

public expect fun initPropVariantFromBooleanVector(prgf: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult

public expect fun initPropVariantFromBuffer(pv: COpaquePointer?, cb: UInt, ppropvar: COpaquePointer?): Hresult

public expect fun initPropVariantFromCLSID(clsid: COpaquePointer?, ppropvar: COpaquePointer?): Hresult

public expect fun initPropVariantFromDoubleVector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult

public expect fun initPropVariantFromFileTime(pftin: COpaquePointer?, ppropvar: COpaquePointer?): Hresult

public expect fun initPropVariantFromFileTimeVector(prgft: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult

public expect fun initPropVariantFromGUIDAsString(guid: COpaquePointer?, ppropvar: COpaquePointer?): Hresult

public expect fun initPropVariantFromInt16Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult

public expect fun initPropVariantFromInt32Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult

public expect fun initPropVariantFromInt64Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult

public expect fun initPropVariantFromPropVariantVectorElem(propvarin: COpaquePointer?, ielem: UInt, ppropvar: COpaquePointer?): Hresult

public expect fun initPropVariantFromResource(hinst: Hinstance, id: UInt, ppropvar: COpaquePointer?): Hresult

public expect fun initPropVariantFromStringAsVector(psz: Pcwstr, ppropvar: COpaquePointer?): Hresult

public expect fun initPropVariantFromStringVector(prgsz: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult

public expect fun initPropVariantFromUInt16Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult

public expect fun initPropVariantFromUInt32Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult

public expect fun initPropVariantFromUInt64Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult

public expect fun initPropVariantVectorFromPropVariant(propvarsingle: COpaquePointer?, ppropvarvector: COpaquePointer?): Hresult

public expect fun oleConvertIStorageToOLESTREAM(pstg: COpaquePointer?, lpolestream: COpaquePointer?): Hresult

public expect fun oleConvertIStorageToOLESTREAMEx(pstg: COpaquePointer?, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: COpaquePointer?, polestm: COpaquePointer?): Hresult

public expect fun oleConvertOLESTREAMToIStorage(lpolestream: COpaquePointer?, pstg: COpaquePointer?, ptd: COpaquePointer?): Hresult

public expect fun oleConvertOLESTREAMToIStorageEx(polestm: COpaquePointer?, pstg: COpaquePointer?, pcfformat: COpaquePointer?, plwwidth: COpaquePointer?, plheight: COpaquePointer?, pdwsize: COpaquePointer?, pmedium: COpaquePointer?): Hresult

public expect fun propStgNameToFmtId(oszname: Pcwstr, pfmtid: COpaquePointer?): Hresult

public expect fun propVariantChangeType(ppropvardest: COpaquePointer?, propvarsrc: COpaquePointer?, flags: PropvarChangeFlags, vt: Varenum): Hresult

public expect fun propVariantClear(pvar: COpaquePointer?): Hresult

public expect fun propVariantCompareEx(propvar1: COpaquePointer?, propvar2: COpaquePointer?, unit: PropvarCompareUnit, flags: PropvarCompareFlags): Int

public expect fun propVariantCopy(pvardest: COpaquePointer?, pvarsrc: COpaquePointer?): Hresult

public expect fun propVariantGetBooleanElem(propvar: COpaquePointer?, ielem: UInt, pfval: COpaquePointer?): Hresult

public expect fun propVariantGetDoubleElem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult

public expect fun propVariantGetElementCount(propvar: COpaquePointer?): UInt

public expect fun propVariantGetFileTimeElem(propvar: COpaquePointer?, ielem: UInt, pftval: COpaquePointer?): Hresult

public expect fun propVariantGetInt16Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult

public expect fun propVariantGetInt32Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult

public expect fun propVariantGetInt64Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult

public expect fun propVariantGetStringElem(propvar: COpaquePointer?, ielem: UInt, ppszval: COpaquePointer?): Hresult

public expect fun propVariantGetUInt16Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult

public expect fun propVariantGetUInt32Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult

public expect fun propVariantGetUInt64Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult

public expect fun propVariantToBSTR(propvar: COpaquePointer?, pbstrout: COpaquePointer?): Hresult

public expect fun propVariantToBoolean(propvarin: COpaquePointer?, pfret: COpaquePointer?): Hresult

public expect fun propVariantToBooleanVector(propvar: COpaquePointer?, prgf: COpaquePointer?, crgf: UInt, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToBooleanVectorAlloc(propvar: COpaquePointer?, pprgf: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToBooleanWithDefault(propvarin: COpaquePointer?, fdefault: Bool): Bool

public expect fun propVariantToBuffer(propvar: COpaquePointer?, pv: COpaquePointer?, cb: UInt): Hresult

public expect fun propVariantToDouble(propvarin: COpaquePointer?, pdblret: COpaquePointer?): Hresult

public expect fun propVariantToDoubleVector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToDoubleVectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToDoubleWithDefault(propvarin: COpaquePointer?, dbldefault: Double): Double

public expect fun propVariantToFileTime(propvar: COpaquePointer?, pstfout: PstimeFlags, pftout: COpaquePointer?): Hresult

public expect fun propVariantToFileTimeVector(propvar: COpaquePointer?, prgft: COpaquePointer?, crgft: UInt, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToFileTimeVectorAlloc(propvar: COpaquePointer?, pprgft: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToGUID(propvar: COpaquePointer?, pguid: COpaquePointer?): Hresult

public expect fun propVariantToInt16(propvarin: COpaquePointer?, piret: COpaquePointer?): Hresult

public expect fun propVariantToInt16Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToInt16VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToInt16WithDefault(propvarin: COpaquePointer?, idefault: Short): Short

public expect fun propVariantToInt32(propvarin: COpaquePointer?, plret: COpaquePointer?): Hresult

public expect fun propVariantToInt32Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToInt32VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToInt32WithDefault(propvarin: COpaquePointer?, ldefault: Int): Int

public expect fun propVariantToInt64(propvarin: COpaquePointer?, pllret: COpaquePointer?): Hresult

public expect fun propVariantToInt64Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToInt64VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToInt64WithDefault(propvarin: COpaquePointer?, lldefault: Long): Long

public expect fun propVariantToString(propvar: COpaquePointer?, psz: Pwstr, cch: UInt): Hresult

public expect fun propVariantToStringAlloc(propvar: COpaquePointer?, ppszout: COpaquePointer?): Hresult

public expect fun propVariantToStringVector(propvar: COpaquePointer?, prgsz: COpaquePointer?, crgsz: UInt, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToStringVectorAlloc(propvar: COpaquePointer?, pprgsz: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToStringWithDefault(propvarin: COpaquePointer?, pszdefault: Pcwstr): Pcwstr

public expect fun propVariantToUInt16(propvarin: COpaquePointer?, puiret: COpaquePointer?): Hresult

public expect fun propVariantToUInt16Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToUInt16VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToUInt16WithDefault(propvarin: COpaquePointer?, uidefault: UShort): UShort

public expect fun propVariantToUInt32(propvarin: COpaquePointer?, pulret: COpaquePointer?): Hresult

public expect fun propVariantToUInt32Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToUInt32VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToUInt32WithDefault(propvarin: COpaquePointer?, uldefault: UInt): UInt

public expect fun propVariantToUInt64(propvarin: COpaquePointer?, pullret: COpaquePointer?): Hresult

public expect fun propVariantToUInt64Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToUInt64VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult

public expect fun propVariantToUInt64WithDefault(propvarin: COpaquePointer?, ulldefault: ULong): ULong

public expect fun propVariantToVariant(ppropvar: COpaquePointer?, pvar: COpaquePointer?): Hresult

public expect fun propVariantToWinRTPropertyValue(propvar: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun readClassStg(pstg: COpaquePointer?, pclsid: COpaquePointer?): Hresult

public expect fun readClassStm(pstm: COpaquePointer?, pclsid: COpaquePointer?): Hresult

public expect fun readFmtUserTypeStg(pstg: COpaquePointer?, pcf: COpaquePointer?, lplpszusertype: COpaquePointer?): Hresult

public expect fun setConvertStg(pstg: COpaquePointer?, fconvert: Bool): Hresult

public expect fun stgConvertPropertyToVariant(pprop: COpaquePointer?, codepage: UShort, pvar: COpaquePointer?, pma: COpaquePointer?): Boolean

public expect fun stgConvertVariantToProperty(pvar: COpaquePointer?, codepage: UShort, pprop: COpaquePointer?, pcb: COpaquePointer?, pid: UInt, freserved: Boolean, pcindirect: COpaquePointer?): COpaquePointer?

public expect fun stgCreateDocfile(pwcsname: Pcwstr, grfmode: Stgm, reserved: UInt, ppstgopen: COpaquePointer?): Hresult

public expect fun stgCreateDocfileOnILockBytes(plkbyt: COpaquePointer?, grfmode: Stgm, reserved: UInt, ppstgopen: COpaquePointer?): Hresult

public expect fun stgCreatePropSetStg(pstorage: COpaquePointer?, dwreserved: UInt, pppropsetstg: COpaquePointer?): Hresult

public expect fun stgCreatePropStg(punk: COpaquePointer?, fmtid: COpaquePointer?, pclsid: COpaquePointer?, grfflags: UInt, dwreserved: UInt, pppropstg: COpaquePointer?): Hresult

public expect fun stgCreateStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: COpaquePointer?, psecuritydescriptor: PsecurityDescriptor, riid: COpaquePointer?, ppobjectopen: COpaquePointer?): Hresult

public expect fun stgDeserializePropVariant(pprop: COpaquePointer?, cbmax: UInt, ppropvar: COpaquePointer?): Hresult

public expect fun stgGetIFillLockBytesOnFile(pwcsname: Pcwstr, ppflb: COpaquePointer?): Hresult

public expect fun stgGetIFillLockBytesOnILockBytes(pilb: COpaquePointer?, ppflb: COpaquePointer?): Hresult

public expect fun stgIsStorageFile(pwcsname: Pcwstr): Hresult

public expect fun stgIsStorageILockBytes(plkbyt: COpaquePointer?): Hresult

public expect fun stgOpenAsyncDocfileOnIFillLockBytes(pflb: COpaquePointer?, grfmode: UInt, asyncflags: UInt, ppstgopen: COpaquePointer?): Hresult

public expect fun stgOpenLayoutDocfile(pwcsdfname: Pcwstr, grfmode: UInt, reserved: UInt, ppstgopen: COpaquePointer?): Hresult

public expect fun stgOpenPropStg(punk: COpaquePointer?, fmtid: COpaquePointer?, grfflags: UInt, dwreserved: UInt, pppropstg: COpaquePointer?): Hresult

public expect fun stgOpenStorage(pwcsname: Pcwstr, pstgpriority: COpaquePointer?, grfmode: Stgm, snbexclude: COpaquePointer?, reserved: UInt, ppstgopen: COpaquePointer?): Hresult

public expect fun stgOpenStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: COpaquePointer?, psecuritydescriptor: PsecurityDescriptor, riid: COpaquePointer?, ppobjectopen: COpaquePointer?): Hresult

public expect fun stgOpenStorageOnILockBytes(plkbyt: COpaquePointer?, pstgpriority: COpaquePointer?, grfmode: Stgm, snbexclude: COpaquePointer?, reserved: UInt, ppstgopen: COpaquePointer?): Hresult

public expect fun stgPropertyLengthAsVariant(pprop: COpaquePointer?, cbprop: UInt, codepage: UShort, breserved: UByte): UInt

public expect fun stgSerializePropVariant(ppropvar: COpaquePointer?, ppprop: COpaquePointer?, pcb: COpaquePointer?): Hresult

public expect fun stgSetTimes(lpszname: Pcwstr, pctime: COpaquePointer?, patime: COpaquePointer?, pmtime: COpaquePointer?): Hresult

public expect fun variantToPropVariant(pvar: COpaquePointer?, ppropvar: COpaquePointer?): Hresult

public expect fun winRTPropertyValueToPropVariant(punkpropertyvalue: COpaquePointer?, ppropvar: COpaquePointer?): Hresult

public expect fun writeClassStg(pstg: COpaquePointer?, rclsid: COpaquePointer?): Hresult

public expect fun writeClassStm(pstm: COpaquePointer?, rclsid: COpaquePointer?): Hresult

public expect fun writeFmtUserTypeStg(pstg: COpaquePointer?, cf: UShort, lpszusertype: Pcwstr): Hresult
