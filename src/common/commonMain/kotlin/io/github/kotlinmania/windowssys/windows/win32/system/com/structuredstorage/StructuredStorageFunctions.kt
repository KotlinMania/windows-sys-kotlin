package io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage

import io.github.kotlinmania.windowssys.Win32DynamicFfi
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

public fun ClearPropVariantArray(rgpropvar: Long, cvars: UInt) {
    Win32DynamicFfi.invoke("propsys.dll", "ClearPropVariantArray", longArrayOf(rgpropvar, cvars.toLong()))
}

public fun CoGetInstanceFromFile(pserverinfo: Long, pclsid: Long, punkouter: Long, dwclsctx: CLSCTX, grfmode: UInt, pwszname: PCWSTR, dwcount: UInt, presults: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetInstanceFromFile", longArrayOf(pserverinfo, pclsid, punkouter, dwclsctx.toLong(), grfmode.toLong(), pwszname, dwcount.toLong(), presults)).toInt()
}

public fun CoGetInstanceFromIStorage(pserverinfo: Long, pclsid: Long, punkouter: Long, dwclsctx: CLSCTX, pstg: Long, dwcount: UInt, presults: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetInstanceFromIStorage", longArrayOf(pserverinfo, pclsid, punkouter, dwclsctx.toLong(), pstg, dwcount.toLong(), presults)).toInt()
}

public fun CoGetInterfaceAndReleaseStream(pstm: Long, iid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetInterfaceAndReleaseStream", longArrayOf(pstm, iid, ppv)).toInt()
}

public fun CreateILockBytesOnHGlobal(hglobal: HGLOBAL, fdeleteonrelease: BOOL, pplkbyt: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CreateILockBytesOnHGlobal", longArrayOf(hglobal, fdeleteonrelease.toLong(), pplkbyt)).toInt()
}

public fun CreateStreamOnHGlobal(hglobal: HGLOBAL, fdeleteonrelease: BOOL, ppstm: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CreateStreamOnHGlobal", longArrayOf(hglobal, fdeleteonrelease.toLong(), ppstm)).toInt()
}

public fun FmtIdToPropStgName(pfmtid: Long, oszname: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "FmtIdToPropStgName", longArrayOf(pfmtid, oszname)).toInt()
}

public fun FreePropVariantArray(cvariants: UInt, rgvars: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "FreePropVariantArray", longArrayOf(cvariants.toLong(), rgvars)).toInt()
}

public fun GetConvertStg(pstg: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "GetConvertStg", longArrayOf(pstg)).toInt()
}

public fun GetHGlobalFromILockBytes(plkbyt: Long, phglobal: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "GetHGlobalFromILockBytes", longArrayOf(plkbyt, phglobal)).toInt()
}

public fun GetHGlobalFromStream(pstm: Long, phglobal: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "GetHGlobalFromStream", longArrayOf(pstm, phglobal)).toInt()
}

public fun InitPropVariantFromBooleanVector(prgf: Long, celems: UInt, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantFromBooleanVector", longArrayOf(prgf, celems.toLong(), ppropvar)).toInt()
}

public fun InitPropVariantFromBuffer(pv: Long, cb: UInt, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantFromBuffer", longArrayOf(pv, cb.toLong(), ppropvar)).toInt()
}

public fun InitPropVariantFromCLSID(clsid: Long, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantFromCLSID", longArrayOf(clsid, ppropvar)).toInt()
}

public fun InitPropVariantFromDoubleVector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantFromDoubleVector", longArrayOf(prgn, celems.toLong(), ppropvar)).toInt()
}

public fun InitPropVariantFromFileTime(pftin: Long, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantFromFileTime", longArrayOf(pftin, ppropvar)).toInt()
}

public fun InitPropVariantFromFileTimeVector(prgft: Long, celems: UInt, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantFromFileTimeVector", longArrayOf(prgft, celems.toLong(), ppropvar)).toInt()
}

public fun InitPropVariantFromGUIDAsString(guid: Long, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantFromGUIDAsString", longArrayOf(guid, ppropvar)).toInt()
}

public fun InitPropVariantFromInt16Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantFromInt16Vector", longArrayOf(prgn, celems.toLong(), ppropvar)).toInt()
}

public fun InitPropVariantFromInt32Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantFromInt32Vector", longArrayOf(prgn, celems.toLong(), ppropvar)).toInt()
}

public fun InitPropVariantFromInt64Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantFromInt64Vector", longArrayOf(prgn, celems.toLong(), ppropvar)).toInt()
}

public fun InitPropVariantFromPropVariantVectorElem(propvarin: Long, ielem: UInt, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantFromPropVariantVectorElem", longArrayOf(propvarin, ielem.toLong(), ppropvar)).toInt()
}

public fun InitPropVariantFromResource(hinst: HINSTANCE, id: UInt, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantFromResource", longArrayOf(hinst, id.toLong(), ppropvar)).toInt()
}

public fun InitPropVariantFromStringAsVector(psz: PCWSTR, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantFromStringAsVector", longArrayOf(psz, ppropvar)).toInt()
}

public fun InitPropVariantFromStringVector(prgsz: Long, celems: UInt, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantFromStringVector", longArrayOf(prgsz, celems.toLong(), ppropvar)).toInt()
}

public fun InitPropVariantFromUInt16Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantFromUInt16Vector", longArrayOf(prgn, celems.toLong(), ppropvar)).toInt()
}

public fun InitPropVariantFromUInt32Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantFromUInt32Vector", longArrayOf(prgn, celems.toLong(), ppropvar)).toInt()
}

public fun InitPropVariantFromUInt64Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantFromUInt64Vector", longArrayOf(prgn, celems.toLong(), ppropvar)).toInt()
}

public fun InitPropVariantVectorFromPropVariant(propvarsingle: Long, ppropvarvector: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "InitPropVariantVectorFromPropVariant", longArrayOf(propvarsingle, ppropvarvector)).toInt()
}

public fun OleConvertIStorageToOLESTREAM(pstg: Long, lpolestream: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleConvertIStorageToOLESTREAM", longArrayOf(pstg, lpolestream)).toInt()
}

public fun OleConvertIStorageToOLESTREAMEx(pstg: Long, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: Long, polestm: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleConvertIStorageToOLESTREAMEx", longArrayOf(pstg, cfformat.toLong(), lwidth.toLong(), lheight.toLong(), dwsize.toLong(), pmedium, polestm)).toInt()
}

public fun OleConvertOLESTREAMToIStorage(lpolestream: Long, pstg: Long, ptd: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleConvertOLESTREAMToIStorage", longArrayOf(lpolestream, pstg, ptd)).toInt()
}

public fun OleConvertOLESTREAMToIStorageEx(polestm: Long, pstg: Long, pcfformat: Long, plwwidth: Long, plheight: Long, pdwsize: Long, pmedium: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "OleConvertOLESTREAMToIStorageEx", longArrayOf(polestm, pstg, pcfformat, plwwidth, plheight, pdwsize, pmedium)).toInt()
}

public fun PropStgNameToFmtId(oszname: PCWSTR, pfmtid: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "PropStgNameToFmtId", longArrayOf(oszname, pfmtid)).toInt()
}

public fun PropVariantChangeType(ppropvardest: Long, propvarsrc: Long, flags: PROPVAR_CHANGE_FLAGS, vt: VARENUM): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantChangeType", longArrayOf(ppropvardest, propvarsrc, flags.toLong(), vt.toLong())).toInt()
}

public fun PropVariantClear(pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "PropVariantClear", longArrayOf(pvar)).toInt()
}

public fun PropVariantCompareEx(propvar1: Long, propvar2: Long, unit: PROPVAR_COMPARE_UNIT, flags: PROPVAR_COMPARE_FLAGS): Int {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantCompareEx", longArrayOf(propvar1, propvar2, unit.toLong(), flags.toLong())).toInt()
}

public fun PropVariantCopy(pvardest: Long, pvarsrc: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "PropVariantCopy", longArrayOf(pvardest, pvarsrc)).toInt()
}

public fun PropVariantGetBooleanElem(propvar: Long, ielem: UInt, pfval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantGetBooleanElem", longArrayOf(propvar, ielem.toLong(), pfval)).toInt()
}

public fun PropVariantGetDoubleElem(propvar: Long, ielem: UInt, pnval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantGetDoubleElem", longArrayOf(propvar, ielem.toLong(), pnval)).toInt()
}

public fun PropVariantGetElementCount(propvar: Long): UInt {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantGetElementCount", longArrayOf(propvar)).toUInt()
}

public fun PropVariantGetFileTimeElem(propvar: Long, ielem: UInt, pftval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantGetFileTimeElem", longArrayOf(propvar, ielem.toLong(), pftval)).toInt()
}

public fun PropVariantGetInt16Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantGetInt16Elem", longArrayOf(propvar, ielem.toLong(), pnval)).toInt()
}

public fun PropVariantGetInt32Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantGetInt32Elem", longArrayOf(propvar, ielem.toLong(), pnval)).toInt()
}

public fun PropVariantGetInt64Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantGetInt64Elem", longArrayOf(propvar, ielem.toLong(), pnval)).toInt()
}

public fun PropVariantGetStringElem(propvar: Long, ielem: UInt, ppszval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantGetStringElem", longArrayOf(propvar, ielem.toLong(), ppszval)).toInt()
}

public fun PropVariantGetUInt16Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantGetUInt16Elem", longArrayOf(propvar, ielem.toLong(), pnval)).toInt()
}

public fun PropVariantGetUInt32Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantGetUInt32Elem", longArrayOf(propvar, ielem.toLong(), pnval)).toInt()
}

public fun PropVariantGetUInt64Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantGetUInt64Elem", longArrayOf(propvar, ielem.toLong(), pnval)).toInt()
}

public fun PropVariantToBSTR(propvar: Long, pbstrout: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToBSTR", longArrayOf(propvar, pbstrout)).toInt()
}

public fun PropVariantToBoolean(propvarin: Long, pfret: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToBoolean", longArrayOf(propvarin, pfret)).toInt()
}

public fun PropVariantToBooleanVector(propvar: Long, prgf: Long, crgf: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToBooleanVector", longArrayOf(propvar, prgf, crgf.toLong(), pcelem)).toInt()
}

public fun PropVariantToBooleanVectorAlloc(propvar: Long, pprgf: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToBooleanVectorAlloc", longArrayOf(propvar, pprgf, pcelem)).toInt()
}

public fun PropVariantToBooleanWithDefault(propvarin: Long, fdefault: BOOL): BOOL {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToBooleanWithDefault", longArrayOf(propvarin, fdefault.toLong())).toInt()
}

public fun PropVariantToBuffer(propvar: Long, pv: Long, cb: UInt): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToBuffer", longArrayOf(propvar, pv, cb.toLong())).toInt()
}

public fun PropVariantToDouble(propvarin: Long, pdblret: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToDouble", longArrayOf(propvarin, pdblret)).toInt()
}

public fun PropVariantToDoubleVector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToDoubleVector", longArrayOf(propvar, prgn, crgn.toLong(), pcelem)).toInt()
}

public fun PropVariantToDoubleVectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToDoubleVectorAlloc", longArrayOf(propvar, pprgn, pcelem)).toInt()
}

public fun PropVariantToDoubleWithDefault(propvarin: Long, dbldefault: Double): Double {
    return Win32DynamicFfi.invokeFp("propsys.dll", "PropVariantToDoubleWithDefault", 8, false, longArrayOf(propvarin, dbldefault.toRawBits()))
}

public fun PropVariantToFileTime(propvar: Long, pstfout: PSTIME_FLAGS, pftout: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToFileTime", longArrayOf(propvar, pstfout.toLong(), pftout)).toInt()
}

public fun PropVariantToFileTimeVector(propvar: Long, prgft: Long, crgft: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToFileTimeVector", longArrayOf(propvar, prgft, crgft.toLong(), pcelem)).toInt()
}

public fun PropVariantToFileTimeVectorAlloc(propvar: Long, pprgft: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToFileTimeVectorAlloc", longArrayOf(propvar, pprgft, pcelem)).toInt()
}

public fun PropVariantToGUID(propvar: Long, pguid: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToGUID", longArrayOf(propvar, pguid)).toInt()
}

public fun PropVariantToInt16(propvarin: Long, piret: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToInt16", longArrayOf(propvarin, piret)).toInt()
}

public fun PropVariantToInt16Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToInt16Vector", longArrayOf(propvar, prgn, crgn.toLong(), pcelem)).toInt()
}

public fun PropVariantToInt16VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToInt16VectorAlloc", longArrayOf(propvar, pprgn, pcelem)).toInt()
}

public fun PropVariantToInt16WithDefault(propvarin: Long, idefault: Short): Short {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToInt16WithDefault", longArrayOf(propvarin, idefault.toLong())).toShort()
}

public fun PropVariantToInt32(propvarin: Long, plret: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToInt32", longArrayOf(propvarin, plret)).toInt()
}

public fun PropVariantToInt32Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToInt32Vector", longArrayOf(propvar, prgn, crgn.toLong(), pcelem)).toInt()
}

public fun PropVariantToInt32VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToInt32VectorAlloc", longArrayOf(propvar, pprgn, pcelem)).toInt()
}

public fun PropVariantToInt32WithDefault(propvarin: Long, ldefault: Int): Int {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToInt32WithDefault", longArrayOf(propvarin, ldefault.toLong())).toInt()
}

public fun PropVariantToInt64(propvarin: Long, pllret: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToInt64", longArrayOf(propvarin, pllret)).toInt()
}

public fun PropVariantToInt64Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToInt64Vector", longArrayOf(propvar, prgn, crgn.toLong(), pcelem)).toInt()
}

public fun PropVariantToInt64VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToInt64VectorAlloc", longArrayOf(propvar, pprgn, pcelem)).toInt()
}

public fun PropVariantToInt64WithDefault(propvarin: Long, lldefault: Long): Long {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToInt64WithDefault", longArrayOf(propvarin, lldefault))
}

public fun PropVariantToString(propvar: Long, psz: PWSTR, cch: UInt): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToString", longArrayOf(propvar, psz, cch.toLong())).toInt()
}

public fun PropVariantToStringAlloc(propvar: Long, ppszout: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToStringAlloc", longArrayOf(propvar, ppszout)).toInt()
}

public fun PropVariantToStringVector(propvar: Long, prgsz: Long, crgsz: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToStringVector", longArrayOf(propvar, prgsz, crgsz.toLong(), pcelem)).toInt()
}

public fun PropVariantToStringVectorAlloc(propvar: Long, pprgsz: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToStringVectorAlloc", longArrayOf(propvar, pprgsz, pcelem)).toInt()
}

public fun PropVariantToStringWithDefault(propvarin: Long, pszdefault: PCWSTR): PCWSTR {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToStringWithDefault", longArrayOf(propvarin, pszdefault))
}

public fun PropVariantToUInt16(propvarin: Long, puiret: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToUInt16", longArrayOf(propvarin, puiret)).toInt()
}

public fun PropVariantToUInt16Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToUInt16Vector", longArrayOf(propvar, prgn, crgn.toLong(), pcelem)).toInt()
}

public fun PropVariantToUInt16VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToUInt16VectorAlloc", longArrayOf(propvar, pprgn, pcelem)).toInt()
}

public fun PropVariantToUInt16WithDefault(propvarin: Long, uidefault: UShort): UShort {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToUInt16WithDefault", longArrayOf(propvarin, uidefault.toLong())).toUShort()
}

public fun PropVariantToUInt32(propvarin: Long, pulret: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToUInt32", longArrayOf(propvarin, pulret)).toInt()
}

public fun PropVariantToUInt32Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToUInt32Vector", longArrayOf(propvar, prgn, crgn.toLong(), pcelem)).toInt()
}

public fun PropVariantToUInt32VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToUInt32VectorAlloc", longArrayOf(propvar, pprgn, pcelem)).toInt()
}

public fun PropVariantToUInt32WithDefault(propvarin: Long, uldefault: UInt): UInt {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToUInt32WithDefault", longArrayOf(propvarin, uldefault.toLong())).toUInt()
}

public fun PropVariantToUInt64(propvarin: Long, pullret: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToUInt64", longArrayOf(propvarin, pullret)).toInt()
}

public fun PropVariantToUInt64Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToUInt64Vector", longArrayOf(propvar, prgn, crgn.toLong(), pcelem)).toInt()
}

public fun PropVariantToUInt64VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToUInt64VectorAlloc", longArrayOf(propvar, pprgn, pcelem)).toInt()
}

public fun PropVariantToUInt64WithDefault(propvarin: Long, ulldefault: ULong): ULong {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToUInt64WithDefault", longArrayOf(propvarin, ulldefault.toLong())).toULong()
}

public fun PropVariantToVariant(ppropvar: Long, pvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToVariant", longArrayOf(ppropvar, pvar)).toInt()
}

public fun PropVariantToWinRTPropertyValue(propvar: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "PropVariantToWinRTPropertyValue", longArrayOf(propvar, riid, ppv)).toInt()
}

public fun ReadClassStg(pstg: Long, pclsid: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "ReadClassStg", longArrayOf(pstg, pclsid)).toInt()
}

public fun ReadClassStm(pstm: Long, pclsid: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "ReadClassStm", longArrayOf(pstm, pclsid)).toInt()
}

public fun ReadFmtUserTypeStg(pstg: Long, pcf: Long, lplpszusertype: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "ReadFmtUserTypeStg", longArrayOf(pstg, pcf, lplpszusertype)).toInt()
}

public fun SetConvertStg(pstg: Long, fconvert: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "SetConvertStg", longArrayOf(pstg, fconvert.toLong())).toInt()
}

public fun StgConvertPropertyToVariant(pprop: Long, codepage: UShort, pvar: Long, pma: Long): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ole32.dll", "StgConvertPropertyToVariant", longArrayOf(pprop, codepage.toLong(), pvar, pma))
    return (rawRet and 0xFFL) != 0L
}

public fun StgConvertVariantToProperty(pvar: Long, codepage: UShort, pprop: Long, pcb: Long, pid: UInt, freserved: Boolean, pcindirect: Long): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "StgConvertVariantToProperty", longArrayOf(pvar, codepage.toLong(), pprop, pcb, pid.toLong(), if (freserved) 1L else 0L, pcindirect))
}

public fun StgCreateDocfile(pwcsname: PCWSTR, grfmode: STGM, reserved: UInt, ppstgopen: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "StgCreateDocfile", longArrayOf(pwcsname, grfmode.toLong(), reserved.toLong(), ppstgopen)).toInt()
}

public fun StgCreateDocfileOnILockBytes(plkbyt: Long, grfmode: STGM, reserved: UInt, ppstgopen: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "StgCreateDocfileOnILockBytes", longArrayOf(plkbyt, grfmode.toLong(), reserved.toLong(), ppstgopen)).toInt()
}

public fun StgCreatePropSetStg(pstorage: Long, dwreserved: UInt, pppropsetstg: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "StgCreatePropSetStg", longArrayOf(pstorage, dwreserved.toLong(), pppropsetstg)).toInt()
}

public fun StgCreatePropStg(punk: Long, fmtid: Long, pclsid: Long, grfflags: UInt, dwreserved: UInt, pppropstg: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "StgCreatePropStg", longArrayOf(punk, fmtid, pclsid, grfflags.toLong(), dwreserved.toLong(), pppropstg)).toInt()
}

public fun StgCreateStorageEx(pwcsname: PCWSTR, grfmode: STGM, stgfmt: STGFMT, grfattrs: UInt, pstgoptions: Long, psecuritydescriptor: PSECURITY_DESCRIPTOR, riid: Long, ppobjectopen: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "StgCreateStorageEx", longArrayOf(pwcsname, grfmode.toLong(), stgfmt.toLong(), grfattrs.toLong(), pstgoptions, psecuritydescriptor, riid, ppobjectopen)).toInt()
}

public fun StgDeserializePropVariant(pprop: Long, cbmax: UInt, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "StgDeserializePropVariant", longArrayOf(pprop, cbmax.toLong(), ppropvar)).toInt()
}

public fun StgGetIFillLockBytesOnFile(pwcsname: PCWSTR, ppflb: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "StgGetIFillLockBytesOnFile", longArrayOf(pwcsname, ppflb)).toInt()
}

public fun StgGetIFillLockBytesOnILockBytes(pilb: Long, ppflb: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "StgGetIFillLockBytesOnILockBytes", longArrayOf(pilb, ppflb)).toInt()
}

public fun StgIsStorageFile(pwcsname: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "StgIsStorageFile", longArrayOf(pwcsname)).toInt()
}

public fun StgIsStorageILockBytes(plkbyt: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "StgIsStorageILockBytes", longArrayOf(plkbyt)).toInt()
}

public fun StgOpenAsyncDocfileOnIFillLockBytes(pflb: Long, grfmode: UInt, asyncflags: UInt, ppstgopen: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "StgOpenAsyncDocfileOnIFillLockBytes", longArrayOf(pflb, grfmode.toLong(), asyncflags.toLong(), ppstgopen)).toInt()
}

public fun StgOpenLayoutDocfile(pwcsdfname: PCWSTR, grfmode: UInt, reserved: UInt, ppstgopen: Long): HRESULT {
    return Win32DynamicFfi.invoke("dflayout.dll", "StgOpenLayoutDocfile", longArrayOf(pwcsdfname, grfmode.toLong(), reserved.toLong(), ppstgopen)).toInt()
}

public fun StgOpenPropStg(punk: Long, fmtid: Long, grfflags: UInt, dwreserved: UInt, pppropstg: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "StgOpenPropStg", longArrayOf(punk, fmtid, grfflags.toLong(), dwreserved.toLong(), pppropstg)).toInt()
}

public fun StgOpenStorage(pwcsname: PCWSTR, pstgpriority: Long, grfmode: STGM, snbexclude: Long, reserved: UInt, ppstgopen: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "StgOpenStorage", longArrayOf(pwcsname, pstgpriority, grfmode.toLong(), snbexclude, reserved.toLong(), ppstgopen)).toInt()
}

public fun StgOpenStorageEx(pwcsname: PCWSTR, grfmode: STGM, stgfmt: STGFMT, grfattrs: UInt, pstgoptions: Long, psecuritydescriptor: PSECURITY_DESCRIPTOR, riid: Long, ppobjectopen: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "StgOpenStorageEx", longArrayOf(pwcsname, grfmode.toLong(), stgfmt.toLong(), grfattrs.toLong(), pstgoptions, psecuritydescriptor, riid, ppobjectopen)).toInt()
}

public fun StgOpenStorageOnILockBytes(plkbyt: Long, pstgpriority: Long, grfmode: STGM, snbexclude: Long, reserved: UInt, ppstgopen: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "StgOpenStorageOnILockBytes", longArrayOf(plkbyt, pstgpriority, grfmode.toLong(), snbexclude, reserved.toLong(), ppstgopen)).toInt()
}

public fun StgPropertyLengthAsVariant(pprop: Long, cbprop: UInt, codepage: UShort, breserved: UByte): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "StgPropertyLengthAsVariant", longArrayOf(pprop, cbprop.toLong(), codepage.toLong(), breserved.toLong())).toUInt()
}

public fun StgSerializePropVariant(ppropvar: Long, ppprop: Long, pcb: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "StgSerializePropVariant", longArrayOf(ppropvar, ppprop, pcb)).toInt()
}

public fun StgSetTimes(lpszname: PCWSTR, pctime: Long, patime: Long, pmtime: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "StgSetTimes", longArrayOf(lpszname, pctime, patime, pmtime)).toInt()
}

public fun VariantToPropVariant(pvar: Long, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "VariantToPropVariant", longArrayOf(pvar, ppropvar)).toInt()
}

public fun WinRTPropertyValueToPropVariant(punkpropertyvalue: Long, ppropvar: Long): HRESULT {
    return Win32DynamicFfi.invoke("propsys.dll", "WinRTPropertyValueToPropVariant", longArrayOf(punkpropertyvalue, ppropvar)).toInt()
}

public fun WriteClassStg(pstg: Long, rclsid: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "WriteClassStg", longArrayOf(pstg, rclsid)).toInt()
}

public fun WriteClassStm(pstm: Long, rclsid: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "WriteClassStm", longArrayOf(pstm, rclsid)).toInt()
}

public fun WriteFmtUserTypeStg(pstg: Long, cf: UShort, lpszusertype: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "WriteFmtUserTypeStg", longArrayOf(pstg, cf.toLong(), lpszusertype)).toInt()
}
