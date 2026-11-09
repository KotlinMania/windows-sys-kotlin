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

private object WindowsWin32SystemComStructuredstorageJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_ClearPropVariantArray(rgpropvar: Long, cvars: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_CoGetInstanceFromFile(pserverinfo: Long, pclsid: Long, punkouter: Long, dwclsctx: Int, grfmode: Int, pwszname: Long, dwcount: Int, presults: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_CoGetInstanceFromIStorage(pserverinfo: Long, pclsid: Long, punkouter: Long, dwclsctx: Int, pstg: Long, dwcount: Int, presults: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_CoGetInterfaceAndReleaseStream(pstm: Long, iid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_CreateILockBytesOnHGlobal(hglobal: Long, fdeleteonrelease: Int, pplkbyt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_CreateStreamOnHGlobal(hglobal: Long, fdeleteonrelease: Int, ppstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_FmtIdToPropStgName(pfmtid: Long, oszname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_FreePropVariantArray(cvariants: Int, rgvars: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_GetConvertStg(pstg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_GetHGlobalFromILockBytes(plkbyt: Long, phglobal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_GetHGlobalFromStream(pstm: Long, phglobal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromBooleanVector(prgf: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromBuffer(pv: Long, cb: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromCLSID(clsid: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromDoubleVector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromFileTime(pftin: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromFileTimeVector(prgft: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromGUIDAsString(guid: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt16Vector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt32Vector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt64Vector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromPropVariantVectorElem(propvarin: Long, ielem: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromResource(hinst: Long, id: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromStringAsVector(psz: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromStringVector(prgsz: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt16Vector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt32Vector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt64Vector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_InitPropVariantVectorFromPropVariant(propvarsingle: Long, ppropvarvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_OleConvertIStorageToOLESTREAM(pstg: Long, lpolestream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_OleConvertIStorageToOLESTREAMEx(pstg: Long, cfformat: Short, lwidth: Int, lheight: Int, dwsize: Int, pmedium: Long, polestm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_OleConvertOLESTREAMToIStorage(lpolestream: Long, pstg: Long, ptd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_OleConvertOLESTREAMToIStorageEx(polestm: Long, pstg: Long, pcfformat: Long, plwwidth: Long, plheight: Long, pdwsize: Long, pmedium: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropStgNameToFmtId(oszname: Long, pfmtid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantChangeType(ppropvardest: Long, propvarsrc: Long, flags: Int, vt: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantClear(pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantCompareEx(propvar1: Long, propvar2: Long, unit: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantCopy(pvardest: Long, pvarsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantGetBooleanElem(propvar: Long, ielem: Int, pfval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantGetDoubleElem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantGetElementCount(propvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantGetFileTimeElem(propvar: Long, ielem: Int, pftval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt16Elem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt32Elem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt64Elem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantGetStringElem(propvar: Long, ielem: Int, ppszval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt16Elem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt32Elem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt64Elem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToBSTR(propvar: Long, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToBoolean(propvarin: Long, pfret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanVector(propvar: Long, prgf: Long, crgf: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanVectorAlloc(propvar: Long, pprgf: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanWithDefault(propvarin: Long, fdefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToBuffer(propvar: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToDouble(propvarin: Long, pdblret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleVector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleVectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleWithDefault(propvarin: Long, dbldefault: Double): Double

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTime(propvar: Long, pstfout: Int, pftout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTimeVector(propvar: Long, prgft: Long, crgft: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTimeVectorAlloc(propvar: Long, pprgft: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToGUID(propvar: Long, pguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16(propvarin: Long, piret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16Vector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16WithDefault(propvarin: Long, idefault: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32(propvarin: Long, plret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32Vector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32WithDefault(propvarin: Long, ldefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64(propvarin: Long, pllret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64Vector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64WithDefault(propvarin: Long, lldefault: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToString(propvar: Long, psz: Long, cch: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringAlloc(propvar: Long, ppszout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringVector(propvar: Long, prgsz: Long, crgsz: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringVectorAlloc(propvar: Long, pprgsz: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringWithDefault(propvarin: Long, pszdefault: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16(propvarin: Long, puiret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16Vector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16WithDefault(propvarin: Long, uidefault: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32(propvarin: Long, pulret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32Vector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32WithDefault(propvarin: Long, uldefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64(propvarin: Long, pullret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64Vector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64WithDefault(propvarin: Long, ulldefault: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToVariant(ppropvar: Long, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_PropVariantToWinRTPropertyValue(propvar: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_ReadClassStg(pstg: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_ReadClassStm(pstm: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_ReadFmtUserTypeStg(pstg: Long, pcf: Long, lplpszusertype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_SetConvertStg(pstg: Long, fconvert: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgConvertPropertyToVariant(pprop: Long, codepage: Short, pvar: Long, pma: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgConvertVariantToProperty(pvar: Long, codepage: Short, pprop: Long, pcb: Long, pid: Int, freserved: Boolean, pcindirect: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgCreateDocfile(pwcsname: Long, grfmode: Int, reserved: Int, ppstgopen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgCreateDocfileOnILockBytes(plkbyt: Long, grfmode: Int, reserved: Int, ppstgopen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgCreatePropSetStg(pstorage: Long, dwreserved: Int, pppropsetstg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgCreatePropStg(punk: Long, fmtid: Long, pclsid: Long, grfflags: Int, dwreserved: Int, pppropstg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgCreateStorageEx(pwcsname: Long, grfmode: Int, stgfmt: Int, grfattrs: Int, pstgoptions: Long, psecuritydescriptor: Long, riid: Long, ppobjectopen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgDeserializePropVariant(pprop: Long, cbmax: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgGetIFillLockBytesOnFile(pwcsname: Long, ppflb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgGetIFillLockBytesOnILockBytes(pilb: Long, ppflb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgIsStorageFile(pwcsname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgIsStorageILockBytes(plkbyt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgOpenAsyncDocfileOnIFillLockBytes(pflb: Long, grfmode: Int, asyncflags: Int, ppstgopen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgOpenLayoutDocfile(pwcsdfname: Long, grfmode: Int, reserved: Int, ppstgopen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgOpenPropStg(punk: Long, fmtid: Long, grfflags: Int, dwreserved: Int, pppropstg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgOpenStorage(pwcsname: Long, pstgpriority: Long, grfmode: Int, snbexclude: Long, reserved: Int, ppstgopen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgOpenStorageEx(pwcsname: Long, grfmode: Int, stgfmt: Int, grfattrs: Int, pstgoptions: Long, psecuritydescriptor: Long, riid: Long, ppobjectopen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgOpenStorageOnILockBytes(plkbyt: Long, pstgpriority: Long, grfmode: Int, snbexclude: Long, reserved: Int, ppstgopen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgPropertyLengthAsVariant(pprop: Long, cbprop: Int, codepage: Short, breserved: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgSerializePropVariant(ppropvar: Long, ppprop: Long, pcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_StgSetTimes(lpszname: Long, pctime: Long, patime: Long, pmtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_VariantToPropVariant(pvar: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_WinRTPropertyValueToPropVariant(punkpropertyvalue: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_WriteClassStg(pstg: Long, rclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_WriteClassStm(pstm: Long, rclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_WriteFmtUserTypeStg(pstg: Long, cf: Short, lpszusertype: Long): Int
}

public actual fun ClearPropVariantArray(rgpropvar: Long, cvars: UInt) {
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_ClearPropVariantArray(rgpropvar, cvars.toInt())
}

public actual fun CoGetInstanceFromFile(pserverinfo: Long, pclsid: Long, punkouter: Long, dwclsctx: CLSCTX, grfmode: UInt, pwszname: PCWSTR, dwcount: UInt, presults: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_CoGetInstanceFromFile(pserverinfo, pclsid, punkouter, dwclsctx.toInt(), grfmode.toInt(), pwszname, dwcount.toInt(), presults)

public actual fun CoGetInstanceFromIStorage(pserverinfo: Long, pclsid: Long, punkouter: Long, dwclsctx: CLSCTX, pstg: Long, dwcount: UInt, presults: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_CoGetInstanceFromIStorage(pserverinfo, pclsid, punkouter, dwclsctx.toInt(), pstg, dwcount.toInt(), presults)

public actual fun CoGetInterfaceAndReleaseStream(pstm: Long, iid: Long, ppv: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_CoGetInterfaceAndReleaseStream(pstm, iid, ppv)

public actual fun CreateILockBytesOnHGlobal(hglobal: HGLOBAL, fdeleteonrelease: BOOL, pplkbyt: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_CreateILockBytesOnHGlobal(hglobal, fdeleteonrelease, pplkbyt)

public actual fun CreateStreamOnHGlobal(hglobal: HGLOBAL, fdeleteonrelease: BOOL, ppstm: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_CreateStreamOnHGlobal(hglobal, fdeleteonrelease, ppstm)

public actual fun FmtIdToPropStgName(pfmtid: Long, oszname: PWSTR): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_FmtIdToPropStgName(pfmtid, oszname)

public actual fun FreePropVariantArray(cvariants: UInt, rgvars: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_FreePropVariantArray(cvariants.toInt(), rgvars)

public actual fun GetConvertStg(pstg: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_GetConvertStg(pstg)

public actual fun GetHGlobalFromILockBytes(plkbyt: Long, phglobal: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_GetHGlobalFromILockBytes(plkbyt, phglobal)

public actual fun GetHGlobalFromStream(pstm: Long, phglobal: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_GetHGlobalFromStream(pstm, phglobal)

public actual fun InitPropVariantFromBooleanVector(prgf: Long, celems: UInt, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromBooleanVector(prgf, celems.toInt(), ppropvar)

public actual fun InitPropVariantFromBuffer(pv: Long, cb: UInt, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromBuffer(pv, cb.toInt(), ppropvar)

public actual fun InitPropVariantFromCLSID(clsid: Long, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromCLSID(clsid, ppropvar)

public actual fun InitPropVariantFromDoubleVector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromDoubleVector(prgn, celems.toInt(), ppropvar)

public actual fun InitPropVariantFromFileTime(pftin: Long, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromFileTime(pftin, ppropvar)

public actual fun InitPropVariantFromFileTimeVector(prgft: Long, celems: UInt, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromFileTimeVector(prgft, celems.toInt(), ppropvar)

public actual fun InitPropVariantFromGUIDAsString(guid: Long, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromGUIDAsString(guid, ppropvar)

public actual fun InitPropVariantFromInt16Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt16Vector(prgn, celems.toInt(), ppropvar)

public actual fun InitPropVariantFromInt32Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt32Vector(prgn, celems.toInt(), ppropvar)

public actual fun InitPropVariantFromInt64Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt64Vector(prgn, celems.toInt(), ppropvar)

public actual fun InitPropVariantFromPropVariantVectorElem(propvarin: Long, ielem: UInt, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromPropVariantVectorElem(propvarin, ielem.toInt(), ppropvar)

public actual fun InitPropVariantFromResource(hinst: HINSTANCE, id: UInt, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromResource(hinst, id.toInt(), ppropvar)

public actual fun InitPropVariantFromStringAsVector(psz: PCWSTR, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromStringAsVector(psz, ppropvar)

public actual fun InitPropVariantFromStringVector(prgsz: Long, celems: UInt, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromStringVector(prgsz, celems.toInt(), ppropvar)

public actual fun InitPropVariantFromUInt16Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt16Vector(prgn, celems.toInt(), ppropvar)

public actual fun InitPropVariantFromUInt32Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt32Vector(prgn, celems.toInt(), ppropvar)

public actual fun InitPropVariantFromUInt64Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt64Vector(prgn, celems.toInt(), ppropvar)

public actual fun InitPropVariantVectorFromPropVariant(propvarsingle: Long, ppropvarvector: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantVectorFromPropVariant(propvarsingle, ppropvarvector)

public actual fun OleConvertIStorageToOLESTREAM(pstg: Long, lpolestream: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_OleConvertIStorageToOLESTREAM(pstg, lpolestream)

public actual fun OleConvertIStorageToOLESTREAMEx(pstg: Long, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: Long, polestm: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_OleConvertIStorageToOLESTREAMEx(pstg, cfformat.toShort(), lwidth, lheight, dwsize.toInt(), pmedium, polestm)

public actual fun OleConvertOLESTREAMToIStorage(lpolestream: Long, pstg: Long, ptd: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_OleConvertOLESTREAMToIStorage(lpolestream, pstg, ptd)

public actual fun OleConvertOLESTREAMToIStorageEx(polestm: Long, pstg: Long, pcfformat: Long, plwwidth: Long, plheight: Long, pdwsize: Long, pmedium: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_OleConvertOLESTREAMToIStorageEx(polestm, pstg, pcfformat, plwwidth, plheight, pdwsize, pmedium)

public actual fun PropStgNameToFmtId(oszname: PCWSTR, pfmtid: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropStgNameToFmtId(oszname, pfmtid)

public actual fun PropVariantChangeType(ppropvardest: Long, propvarsrc: Long, flags: PROPVAR_CHANGE_FLAGS, vt: VARENUM): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantChangeType(ppropvardest, propvarsrc, flags, vt.toShort())

public actual fun PropVariantClear(pvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantClear(pvar)

public actual fun PropVariantCompareEx(propvar1: Long, propvar2: Long, unit: PROPVAR_COMPARE_UNIT, flags: PROPVAR_COMPARE_FLAGS): Int =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantCompareEx(propvar1, propvar2, unit, flags)

public actual fun PropVariantCopy(pvardest: Long, pvarsrc: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantCopy(pvardest, pvarsrc)

public actual fun PropVariantGetBooleanElem(propvar: Long, ielem: UInt, pfval: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetBooleanElem(propvar, ielem.toInt(), pfval)

public actual fun PropVariantGetDoubleElem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetDoubleElem(propvar, ielem.toInt(), pnval)

public actual fun PropVariantGetElementCount(propvar: Long): UInt =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetElementCount(propvar).toUInt()

public actual fun PropVariantGetFileTimeElem(propvar: Long, ielem: UInt, pftval: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetFileTimeElem(propvar, ielem.toInt(), pftval)

public actual fun PropVariantGetInt16Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt16Elem(propvar, ielem.toInt(), pnval)

public actual fun PropVariantGetInt32Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt32Elem(propvar, ielem.toInt(), pnval)

public actual fun PropVariantGetInt64Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt64Elem(propvar, ielem.toInt(), pnval)

public actual fun PropVariantGetStringElem(propvar: Long, ielem: UInt, ppszval: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetStringElem(propvar, ielem.toInt(), ppszval)

public actual fun PropVariantGetUInt16Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt16Elem(propvar, ielem.toInt(), pnval)

public actual fun PropVariantGetUInt32Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt32Elem(propvar, ielem.toInt(), pnval)

public actual fun PropVariantGetUInt64Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt64Elem(propvar, ielem.toInt(), pnval)

public actual fun PropVariantToBSTR(propvar: Long, pbstrout: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToBSTR(propvar, pbstrout)

public actual fun PropVariantToBoolean(propvarin: Long, pfret: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToBoolean(propvarin, pfret)

public actual fun PropVariantToBooleanVector(propvar: Long, prgf: Long, crgf: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanVector(propvar, prgf, crgf.toInt(), pcelem)

public actual fun PropVariantToBooleanVectorAlloc(propvar: Long, pprgf: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanVectorAlloc(propvar, pprgf, pcelem)

public actual fun PropVariantToBooleanWithDefault(propvarin: Long, fdefault: BOOL): BOOL =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanWithDefault(propvarin, fdefault)

public actual fun PropVariantToBuffer(propvar: Long, pv: Long, cb: UInt): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToBuffer(propvar, pv, cb.toInt())

public actual fun PropVariantToDouble(propvarin: Long, pdblret: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToDouble(propvarin, pdblret)

public actual fun PropVariantToDoubleVector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleVector(propvar, prgn, crgn.toInt(), pcelem)

public actual fun PropVariantToDoubleVectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleVectorAlloc(propvar, pprgn, pcelem)

public actual fun PropVariantToDoubleWithDefault(propvarin: Long, dbldefault: Double): Double =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleWithDefault(propvarin, dbldefault)

public actual fun PropVariantToFileTime(propvar: Long, pstfout: PSTIME_FLAGS, pftout: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTime(propvar, pstfout, pftout)

public actual fun PropVariantToFileTimeVector(propvar: Long, prgft: Long, crgft: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTimeVector(propvar, prgft, crgft.toInt(), pcelem)

public actual fun PropVariantToFileTimeVectorAlloc(propvar: Long, pprgft: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTimeVectorAlloc(propvar, pprgft, pcelem)

public actual fun PropVariantToGUID(propvar: Long, pguid: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToGUID(propvar, pguid)

public actual fun PropVariantToInt16(propvarin: Long, piret: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16(propvarin, piret)

public actual fun PropVariantToInt16Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16Vector(propvar, prgn, crgn.toInt(), pcelem)

public actual fun PropVariantToInt16VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16VectorAlloc(propvar, pprgn, pcelem)

public actual fun PropVariantToInt16WithDefault(propvarin: Long, idefault: Short): Short =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16WithDefault(propvarin, idefault)

public actual fun PropVariantToInt32(propvarin: Long, plret: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32(propvarin, plret)

public actual fun PropVariantToInt32Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32Vector(propvar, prgn, crgn.toInt(), pcelem)

public actual fun PropVariantToInt32VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32VectorAlloc(propvar, pprgn, pcelem)

public actual fun PropVariantToInt32WithDefault(propvarin: Long, ldefault: Int): Int =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32WithDefault(propvarin, ldefault)

public actual fun PropVariantToInt64(propvarin: Long, pllret: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64(propvarin, pllret)

public actual fun PropVariantToInt64Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64Vector(propvar, prgn, crgn.toInt(), pcelem)

public actual fun PropVariantToInt64VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64VectorAlloc(propvar, pprgn, pcelem)

public actual fun PropVariantToInt64WithDefault(propvarin: Long, lldefault: Long): Long =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64WithDefault(propvarin, lldefault)

public actual fun PropVariantToString(propvar: Long, psz: PWSTR, cch: UInt): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToString(propvar, psz, cch.toInt())

public actual fun PropVariantToStringAlloc(propvar: Long, ppszout: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringAlloc(propvar, ppszout)

public actual fun PropVariantToStringVector(propvar: Long, prgsz: Long, crgsz: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringVector(propvar, prgsz, crgsz.toInt(), pcelem)

public actual fun PropVariantToStringVectorAlloc(propvar: Long, pprgsz: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringVectorAlloc(propvar, pprgsz, pcelem)

public actual fun PropVariantToStringWithDefault(propvarin: Long, pszdefault: PCWSTR): PCWSTR =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringWithDefault(propvarin, pszdefault)

public actual fun PropVariantToUInt16(propvarin: Long, puiret: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16(propvarin, puiret)

public actual fun PropVariantToUInt16Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16Vector(propvar, prgn, crgn.toInt(), pcelem)

public actual fun PropVariantToUInt16VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16VectorAlloc(propvar, pprgn, pcelem)

public actual fun PropVariantToUInt16WithDefault(propvarin: Long, uidefault: UShort): UShort =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16WithDefault(propvarin, uidefault.toShort()).toUShort()

public actual fun PropVariantToUInt32(propvarin: Long, pulret: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32(propvarin, pulret)

public actual fun PropVariantToUInt32Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32Vector(propvar, prgn, crgn.toInt(), pcelem)

public actual fun PropVariantToUInt32VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32VectorAlloc(propvar, pprgn, pcelem)

public actual fun PropVariantToUInt32WithDefault(propvarin: Long, uldefault: UInt): UInt =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32WithDefault(propvarin, uldefault.toInt()).toUInt()

public actual fun PropVariantToUInt64(propvarin: Long, pullret: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64(propvarin, pullret)

public actual fun PropVariantToUInt64Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64Vector(propvar, prgn, crgn.toInt(), pcelem)

public actual fun PropVariantToUInt64VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64VectorAlloc(propvar, pprgn, pcelem)

public actual fun PropVariantToUInt64WithDefault(propvarin: Long, ulldefault: ULong): ULong =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64WithDefault(propvarin, ulldefault.toLong()).toULong()

public actual fun PropVariantToVariant(ppropvar: Long, pvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToVariant(ppropvar, pvar)

public actual fun PropVariantToWinRTPropertyValue(propvar: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_PropVariantToWinRTPropertyValue(propvar, riid, ppv)

public actual fun ReadClassStg(pstg: Long, pclsid: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_ReadClassStg(pstg, pclsid)

public actual fun ReadClassStm(pstm: Long, pclsid: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_ReadClassStm(pstm, pclsid)

public actual fun ReadFmtUserTypeStg(pstg: Long, pcf: Long, lplpszusertype: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_ReadFmtUserTypeStg(pstg, pcf, lplpszusertype)

public actual fun SetConvertStg(pstg: Long, fconvert: BOOL): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_SetConvertStg(pstg, fconvert)

public actual fun StgConvertPropertyToVariant(pprop: Long, codepage: UShort, pvar: Long, pma: Long): Boolean =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgConvertPropertyToVariant(pprop, codepage.toShort(), pvar, pma)

public actual fun StgConvertVariantToProperty(pvar: Long, codepage: UShort, pprop: Long, pcb: Long, pid: UInt, freserved: Boolean, pcindirect: Long): Long =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgConvertVariantToProperty(pvar, codepage.toShort(), pprop, pcb, pid.toInt(), freserved, pcindirect)

public actual fun StgCreateDocfile(pwcsname: PCWSTR, grfmode: STGM, reserved: UInt, ppstgopen: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgCreateDocfile(pwcsname, grfmode.toInt(), reserved.toInt(), ppstgopen)

public actual fun StgCreateDocfileOnILockBytes(plkbyt: Long, grfmode: STGM, reserved: UInt, ppstgopen: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgCreateDocfileOnILockBytes(plkbyt, grfmode.toInt(), reserved.toInt(), ppstgopen)

public actual fun StgCreatePropSetStg(pstorage: Long, dwreserved: UInt, pppropsetstg: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgCreatePropSetStg(pstorage, dwreserved.toInt(), pppropsetstg)

public actual fun StgCreatePropStg(punk: Long, fmtid: Long, pclsid: Long, grfflags: UInt, dwreserved: UInt, pppropstg: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgCreatePropStg(punk, fmtid, pclsid, grfflags.toInt(), dwreserved.toInt(), pppropstg)

public actual fun StgCreateStorageEx(pwcsname: PCWSTR, grfmode: STGM, stgfmt: STGFMT, grfattrs: UInt, pstgoptions: Long, psecuritydescriptor: PSECURITY_DESCRIPTOR, riid: Long, ppobjectopen: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgCreateStorageEx(pwcsname, grfmode.toInt(), stgfmt.toInt(), grfattrs.toInt(), pstgoptions, psecuritydescriptor, riid, ppobjectopen)

public actual fun StgDeserializePropVariant(pprop: Long, cbmax: UInt, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgDeserializePropVariant(pprop, cbmax.toInt(), ppropvar)

public actual fun StgGetIFillLockBytesOnFile(pwcsname: PCWSTR, ppflb: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgGetIFillLockBytesOnFile(pwcsname, ppflb)

public actual fun StgGetIFillLockBytesOnILockBytes(pilb: Long, ppflb: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgGetIFillLockBytesOnILockBytes(pilb, ppflb)

public actual fun StgIsStorageFile(pwcsname: PCWSTR): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgIsStorageFile(pwcsname)

public actual fun StgIsStorageILockBytes(plkbyt: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgIsStorageILockBytes(plkbyt)

public actual fun StgOpenAsyncDocfileOnIFillLockBytes(pflb: Long, grfmode: UInt, asyncflags: UInt, ppstgopen: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgOpenAsyncDocfileOnIFillLockBytes(pflb, grfmode.toInt(), asyncflags.toInt(), ppstgopen)

public actual fun StgOpenLayoutDocfile(pwcsdfname: PCWSTR, grfmode: UInt, reserved: UInt, ppstgopen: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgOpenLayoutDocfile(pwcsdfname, grfmode.toInt(), reserved.toInt(), ppstgopen)

public actual fun StgOpenPropStg(punk: Long, fmtid: Long, grfflags: UInt, dwreserved: UInt, pppropstg: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgOpenPropStg(punk, fmtid, grfflags.toInt(), dwreserved.toInt(), pppropstg)

public actual fun StgOpenStorage(pwcsname: PCWSTR, pstgpriority: Long, grfmode: STGM, snbexclude: Long, reserved: UInt, ppstgopen: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgOpenStorage(pwcsname, pstgpriority, grfmode.toInt(), snbexclude, reserved.toInt(), ppstgopen)

public actual fun StgOpenStorageEx(pwcsname: PCWSTR, grfmode: STGM, stgfmt: STGFMT, grfattrs: UInt, pstgoptions: Long, psecuritydescriptor: PSECURITY_DESCRIPTOR, riid: Long, ppobjectopen: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgOpenStorageEx(pwcsname, grfmode.toInt(), stgfmt.toInt(), grfattrs.toInt(), pstgoptions, psecuritydescriptor, riid, ppobjectopen)

public actual fun StgOpenStorageOnILockBytes(plkbyt: Long, pstgpriority: Long, grfmode: STGM, snbexclude: Long, reserved: UInt, ppstgopen: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgOpenStorageOnILockBytes(plkbyt, pstgpriority, grfmode.toInt(), snbexclude, reserved.toInt(), ppstgopen)

public actual fun StgPropertyLengthAsVariant(pprop: Long, cbprop: UInt, codepage: UShort, breserved: UByte): UInt =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgPropertyLengthAsVariant(pprop, cbprop.toInt(), codepage.toShort(), breserved.toByte()).toUInt()

public actual fun StgSerializePropVariant(ppropvar: Long, ppprop: Long, pcb: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgSerializePropVariant(ppropvar, ppprop, pcb)

public actual fun StgSetTimes(lpszname: PCWSTR, pctime: Long, patime: Long, pmtime: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_StgSetTimes(lpszname, pctime, patime, pmtime)

public actual fun VariantToPropVariant(pvar: Long, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_VariantToPropVariant(pvar, ppropvar)

public actual fun WinRTPropertyValueToPropVariant(punkpropertyvalue: Long, ppropvar: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_WinRTPropertyValueToPropVariant(punkpropertyvalue, ppropvar)

public actual fun WriteClassStg(pstg: Long, rclsid: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_WriteClassStg(pstg, rclsid)

public actual fun WriteClassStm(pstm: Long, rclsid: Long): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_WriteClassStm(pstm, rclsid)

public actual fun WriteFmtUserTypeStg(pstg: Long, cf: UShort, lpszusertype: PCWSTR): HRESULT =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_WriteFmtUserTypeStg(pstg, cf.toShort(), lpszusertype)
