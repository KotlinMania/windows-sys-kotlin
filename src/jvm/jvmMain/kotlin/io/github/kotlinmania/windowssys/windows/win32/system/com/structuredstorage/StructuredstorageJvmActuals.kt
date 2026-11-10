@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SystemComStructuredstorageJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_clearPropVariantArray(rgpropvar: Long, cvars: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_coGetInstanceFromFile(pserverinfo: Long, pclsid: Long, punkouter: Long, dwclsctx: Int, grfmode: Int, pwszname: Long, dwcount: Int, presults: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_coGetInstanceFromIStorage(pserverinfo: Long, pclsid: Long, punkouter: Long, dwclsctx: Int, pstg: Long, dwcount: Int, presults: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_coGetInterfaceAndReleaseStream(pstm: Long, iid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_createILockBytesOnHGlobal(hglobal: Long, fdeleteonrelease: Int, pplkbyt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_createStreamOnHGlobal(hglobal: Long, fdeleteonrelease: Int, ppstm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_fmtIdToPropStgName(pfmtid: Long, oszname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_freePropVariantArray(cvariants: Int, rgvars: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_getConvertStg(pstg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_getHGlobalFromILockBytes(plkbyt: Long, phglobal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_getHGlobalFromStream(pstm: Long, phglobal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromBooleanVector(prgf: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromBuffer(pv: Long, cb: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromCLSID(clsid: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromDoubleVector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromFileTime(pftin: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromFileTimeVector(prgft: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromGUIDAsString(guid: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromInt16Vector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromInt32Vector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromInt64Vector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromPropVariantVectorElem(propvarin: Long, ielem: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromResource(hinst: Long, id: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromStringAsVector(psz: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromStringVector(prgsz: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromUInt16Vector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromUInt32Vector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromUInt64Vector(prgn: Long, celems: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_initPropVariantVectorFromPropVariant(propvarsingle: Long, ppropvarvector: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_oleConvertIStorageToOLESTREAM(pstg: Long, lpolestream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_oleConvertIStorageToOLESTREAMEx(pstg: Long, cfformat: Short, lwidth: Int, lheight: Int, dwsize: Int, pmedium: Long, polestm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_oleConvertOLESTREAMToIStorage(lpolestream: Long, pstg: Long, ptd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_oleConvertOLESTREAMToIStorageEx(polestm: Long, pstg: Long, pcfformat: Long, plwwidth: Long, plheight: Long, pdwsize: Long, pmedium: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propStgNameToFmtId(oszname: Long, pfmtid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantChangeType(ppropvardest: Long, propvarsrc: Long, flags: Int, vt: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantClear(pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantCompareEx(propvar1: Long, propvar2: Long, unit: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantCopy(pvardest: Long, pvarsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantGetBooleanElem(propvar: Long, ielem: Int, pfval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantGetDoubleElem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantGetElementCount(propvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantGetFileTimeElem(propvar: Long, ielem: Int, pftval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantGetInt16Elem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantGetInt32Elem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantGetInt64Elem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantGetStringElem(propvar: Long, ielem: Int, ppszval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantGetUInt16Elem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantGetUInt32Elem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantGetUInt64Elem(propvar: Long, ielem: Int, pnval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToBSTR(propvar: Long, pbstrout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToBoolean(propvarin: Long, pfret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToBooleanVector(propvar: Long, prgf: Long, crgf: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToBooleanVectorAlloc(propvar: Long, pprgf: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToBooleanWithDefault(propvarin: Long, fdefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToBuffer(propvar: Long, pv: Long, cb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToDouble(propvarin: Long, pdblret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToDoubleVector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToDoubleVectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToDoubleWithDefault(propvarin: Long, dbldefault: Double): Double

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToFileTime(propvar: Long, pstfout: Int, pftout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToFileTimeVector(propvar: Long, prgft: Long, crgft: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToFileTimeVectorAlloc(propvar: Long, pprgft: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToGUID(propvar: Long, pguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16(propvarin: Long, piret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16Vector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16WithDefault(propvarin: Long, idefault: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32(propvarin: Long, plret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32Vector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32WithDefault(propvarin: Long, ldefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64(propvarin: Long, pllret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64Vector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64WithDefault(propvarin: Long, lldefault: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToString(propvar: Long, psz: Long, cch: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToStringAlloc(propvar: Long, ppszout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToStringVector(propvar: Long, prgsz: Long, crgsz: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToStringVectorAlloc(propvar: Long, pprgsz: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToStringWithDefault(propvarin: Long, pszdefault: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16(propvarin: Long, puiret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16Vector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16WithDefault(propvarin: Long, uidefault: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32(propvarin: Long, pulret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32Vector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32WithDefault(propvarin: Long, uldefault: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64(propvarin: Long, pullret: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64Vector(propvar: Long, prgn: Long, crgn: Int, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64WithDefault(propvarin: Long, ulldefault: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToVariant(ppropvar: Long, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_propVariantToWinRTPropertyValue(propvar: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_readClassStg(pstg: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_readClassStm(pstm: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_readFmtUserTypeStg(pstg: Long, pcf: Long, lplpszusertype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_setConvertStg(pstg: Long, fconvert: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgConvertPropertyToVariant(pprop: Long, codepage: Short, pvar: Long, pma: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgConvertVariantToProperty(pvar: Long, codepage: Short, pprop: Long, pcb: Long, pid: Int, freserved: Boolean, pcindirect: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgCreateDocfile(pwcsname: Long, grfmode: Int, reserved: Int, ppstgopen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgCreateDocfileOnILockBytes(plkbyt: Long, grfmode: Int, reserved: Int, ppstgopen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgCreatePropSetStg(pstorage: Long, dwreserved: Int, pppropsetstg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgCreatePropStg(punk: Long, fmtid: Long, pclsid: Long, grfflags: Int, dwreserved: Int, pppropstg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgCreateStorageEx(pwcsname: Long, grfmode: Int, stgfmt: Int, grfattrs: Int, pstgoptions: Long, psecuritydescriptor: Long, riid: Long, ppobjectopen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgDeserializePropVariant(pprop: Long, cbmax: Int, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgGetIFillLockBytesOnFile(pwcsname: Long, ppflb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgGetIFillLockBytesOnILockBytes(pilb: Long, ppflb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgIsStorageFile(pwcsname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgIsStorageILockBytes(plkbyt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgOpenAsyncDocfileOnIFillLockBytes(pflb: Long, grfmode: Int, asyncflags: Int, ppstgopen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgOpenLayoutDocfile(pwcsdfname: Long, grfmode: Int, reserved: Int, ppstgopen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgOpenPropStg(punk: Long, fmtid: Long, grfflags: Int, dwreserved: Int, pppropstg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgOpenStorage(pwcsname: Long, pstgpriority: Long, grfmode: Int, snbexclude: Long, reserved: Int, ppstgopen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgOpenStorageEx(pwcsname: Long, grfmode: Int, stgfmt: Int, grfattrs: Int, pstgoptions: Long, psecuritydescriptor: Long, riid: Long, ppobjectopen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgOpenStorageOnILockBytes(plkbyt: Long, pstgpriority: Long, grfmode: Int, snbexclude: Long, reserved: Int, ppstgopen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgPropertyLengthAsVariant(pprop: Long, cbprop: Int, codepage: Short, breserved: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgSerializePropVariant(ppropvar: Long, ppprop: Long, pcb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_stgSetTimes(lpszname: Long, pctime: Long, patime: Long, pmtime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_variantToPropVariant(pvar: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_winRTPropertyValueToPropVariant(punkpropertyvalue: Long, ppropvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_writeClassStg(pstg: Long, rclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_writeClassStm(pstm: Long, rclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_structuredstorage_writeFmtUserTypeStg(pstg: Long, cf: Short, lpszusertype: Long): Int
}

public actual fun clearPropVariantArray(rgpropvar: COpaquePointer?, cvars: UInt) {
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_clearPropVariantArray((rgpropvar?.value ?: 0L), cvars.toInt())
}

public actual fun coGetInstanceFromFile(pserverinfo: COpaquePointer?, pclsid: COpaquePointer?, punkouter: COpaquePointer?, dwclsctx: Clsctx, grfmode: UInt, pwszname: Pcwstr, dwcount: UInt, presults: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_coGetInstanceFromFile((pserverinfo?.value ?: 0L), (pclsid?.value ?: 0L), (punkouter?.value ?: 0L), dwclsctx.toInt(), grfmode.toInt(), (pwszname?.value ?: 0L), dwcount.toInt(), (presults?.value ?: 0L))

public actual fun coGetInstanceFromIStorage(pserverinfo: COpaquePointer?, pclsid: COpaquePointer?, punkouter: COpaquePointer?, dwclsctx: Clsctx, pstg: COpaquePointer?, dwcount: UInt, presults: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_coGetInstanceFromIStorage((pserverinfo?.value ?: 0L), (pclsid?.value ?: 0L), (punkouter?.value ?: 0L), dwclsctx.toInt(), (pstg?.value ?: 0L), dwcount.toInt(), (presults?.value ?: 0L))

public actual fun coGetInterfaceAndReleaseStream(pstm: COpaquePointer?, iid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_coGetInterfaceAndReleaseStream((pstm?.value ?: 0L), (iid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun createILockBytesOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, pplkbyt: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_createILockBytesOnHGlobal((hglobal?.value ?: 0L), fdeleteonrelease, (pplkbyt?.value ?: 0L))

public actual fun createStreamOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, ppstm: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_createStreamOnHGlobal((hglobal?.value ?: 0L), fdeleteonrelease, (ppstm?.value ?: 0L))

public actual fun fmtIdToPropStgName(pfmtid: COpaquePointer?, oszname: Pwstr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_fmtIdToPropStgName((pfmtid?.value ?: 0L), (oszname?.value ?: 0L))

public actual fun freePropVariantArray(cvariants: UInt, rgvars: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_freePropVariantArray(cvariants.toInt(), (rgvars?.value ?: 0L))

public actual fun getConvertStg(pstg: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_getConvertStg((pstg?.value ?: 0L))

public actual fun getHGlobalFromILockBytes(plkbyt: COpaquePointer?, phglobal: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_getHGlobalFromILockBytes((plkbyt?.value ?: 0L), (phglobal?.value ?: 0L))

public actual fun getHGlobalFromStream(pstm: COpaquePointer?, phglobal: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_getHGlobalFromStream((pstm?.value ?: 0L), (phglobal?.value ?: 0L))

public actual fun initPropVariantFromBooleanVector(prgf: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromBooleanVector((prgf?.value ?: 0L), celems.toInt(), (ppropvar?.value ?: 0L))

public actual fun initPropVariantFromBuffer(pv: COpaquePointer?, cb: UInt, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromBuffer((pv?.value ?: 0L), cb.toInt(), (ppropvar?.value ?: 0L))

public actual fun initPropVariantFromCLSID(clsid: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromCLSID((clsid?.value ?: 0L), (ppropvar?.value ?: 0L))

public actual fun initPropVariantFromDoubleVector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromDoubleVector((prgn?.value ?: 0L), celems.toInt(), (ppropvar?.value ?: 0L))

public actual fun initPropVariantFromFileTime(pftin: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromFileTime((pftin?.value ?: 0L), (ppropvar?.value ?: 0L))

public actual fun initPropVariantFromFileTimeVector(prgft: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromFileTimeVector((prgft?.value ?: 0L), celems.toInt(), (ppropvar?.value ?: 0L))

public actual fun initPropVariantFromGUIDAsString(guid: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromGUIDAsString((guid?.value ?: 0L), (ppropvar?.value ?: 0L))

public actual fun initPropVariantFromInt16Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromInt16Vector((prgn?.value ?: 0L), celems.toInt(), (ppropvar?.value ?: 0L))

public actual fun initPropVariantFromInt32Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromInt32Vector((prgn?.value ?: 0L), celems.toInt(), (ppropvar?.value ?: 0L))

public actual fun initPropVariantFromInt64Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromInt64Vector((prgn?.value ?: 0L), celems.toInt(), (ppropvar?.value ?: 0L))

public actual fun initPropVariantFromPropVariantVectorElem(propvarin: COpaquePointer?, ielem: UInt, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromPropVariantVectorElem((propvarin?.value ?: 0L), ielem.toInt(), (ppropvar?.value ?: 0L))

public actual fun initPropVariantFromResource(hinst: Hinstance, id: UInt, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromResource((hinst?.value ?: 0L), id.toInt(), (ppropvar?.value ?: 0L))

public actual fun initPropVariantFromStringAsVector(psz: Pcwstr, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromStringAsVector((psz?.value ?: 0L), (ppropvar?.value ?: 0L))

public actual fun initPropVariantFromStringVector(prgsz: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromStringVector((prgsz?.value ?: 0L), celems.toInt(), (ppropvar?.value ?: 0L))

public actual fun initPropVariantFromUInt16Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromUInt16Vector((prgn?.value ?: 0L), celems.toInt(), (ppropvar?.value ?: 0L))

public actual fun initPropVariantFromUInt32Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromUInt32Vector((prgn?.value ?: 0L), celems.toInt(), (ppropvar?.value ?: 0L))

public actual fun initPropVariantFromUInt64Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromUInt64Vector((prgn?.value ?: 0L), celems.toInt(), (ppropvar?.value ?: 0L))

public actual fun initPropVariantVectorFromPropVariant(propvarsingle: COpaquePointer?, ppropvarvector: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_initPropVariantVectorFromPropVariant((propvarsingle?.value ?: 0L), (ppropvarvector?.value ?: 0L))

public actual fun oleConvertIStorageToOLESTREAM(pstg: COpaquePointer?, lpolestream: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_oleConvertIStorageToOLESTREAM((pstg?.value ?: 0L), (lpolestream?.value ?: 0L))

public actual fun oleConvertIStorageToOLESTREAMEx(pstg: COpaquePointer?, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: COpaquePointer?, polestm: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_oleConvertIStorageToOLESTREAMEx((pstg?.value ?: 0L), cfformat.toShort(), lwidth, lheight, dwsize.toInt(), (pmedium?.value ?: 0L), (polestm?.value ?: 0L))

public actual fun oleConvertOLESTREAMToIStorage(lpolestream: COpaquePointer?, pstg: COpaquePointer?, ptd: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_oleConvertOLESTREAMToIStorage((lpolestream?.value ?: 0L), (pstg?.value ?: 0L), (ptd?.value ?: 0L))

public actual fun oleConvertOLESTREAMToIStorageEx(polestm: COpaquePointer?, pstg: COpaquePointer?, pcfformat: COpaquePointer?, plwwidth: COpaquePointer?, plheight: COpaquePointer?, pdwsize: COpaquePointer?, pmedium: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_oleConvertOLESTREAMToIStorageEx((polestm?.value ?: 0L), (pstg?.value ?: 0L), (pcfformat?.value ?: 0L), (plwwidth?.value ?: 0L), (plheight?.value ?: 0L), (pdwsize?.value ?: 0L), (pmedium?.value ?: 0L))

public actual fun propStgNameToFmtId(oszname: Pcwstr, pfmtid: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propStgNameToFmtId((oszname?.value ?: 0L), (pfmtid?.value ?: 0L))

public actual fun propVariantChangeType(ppropvardest: COpaquePointer?, propvarsrc: COpaquePointer?, flags: PropvarChangeFlags, vt: Varenum): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantChangeType((ppropvardest?.value ?: 0L), (propvarsrc?.value ?: 0L), flags, vt.toShort())

public actual fun propVariantClear(pvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantClear((pvar?.value ?: 0L))

public actual fun propVariantCompareEx(propvar1: COpaquePointer?, propvar2: COpaquePointer?, unit: PropvarCompareUnit, flags: PropvarCompareFlags): Int =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantCompareEx((propvar1?.value ?: 0L), (propvar2?.value ?: 0L), unit, flags)

public actual fun propVariantCopy(pvardest: COpaquePointer?, pvarsrc: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantCopy((pvardest?.value ?: 0L), (pvarsrc?.value ?: 0L))

public actual fun propVariantGetBooleanElem(propvar: COpaquePointer?, ielem: UInt, pfval: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantGetBooleanElem((propvar?.value ?: 0L), ielem.toInt(), (pfval?.value ?: 0L))

public actual fun propVariantGetDoubleElem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantGetDoubleElem((propvar?.value ?: 0L), ielem.toInt(), (pnval?.value ?: 0L))

public actual fun propVariantGetElementCount(propvar: COpaquePointer?): UInt =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantGetElementCount((propvar?.value ?: 0L)).toUInt()

public actual fun propVariantGetFileTimeElem(propvar: COpaquePointer?, ielem: UInt, pftval: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantGetFileTimeElem((propvar?.value ?: 0L), ielem.toInt(), (pftval?.value ?: 0L))

public actual fun propVariantGetInt16Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantGetInt16Elem((propvar?.value ?: 0L), ielem.toInt(), (pnval?.value ?: 0L))

public actual fun propVariantGetInt32Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantGetInt32Elem((propvar?.value ?: 0L), ielem.toInt(), (pnval?.value ?: 0L))

public actual fun propVariantGetInt64Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantGetInt64Elem((propvar?.value ?: 0L), ielem.toInt(), (pnval?.value ?: 0L))

public actual fun propVariantGetStringElem(propvar: COpaquePointer?, ielem: UInt, ppszval: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantGetStringElem((propvar?.value ?: 0L), ielem.toInt(), (ppszval?.value ?: 0L))

public actual fun propVariantGetUInt16Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantGetUInt16Elem((propvar?.value ?: 0L), ielem.toInt(), (pnval?.value ?: 0L))

public actual fun propVariantGetUInt32Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantGetUInt32Elem((propvar?.value ?: 0L), ielem.toInt(), (pnval?.value ?: 0L))

public actual fun propVariantGetUInt64Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantGetUInt64Elem((propvar?.value ?: 0L), ielem.toInt(), (pnval?.value ?: 0L))

public actual fun propVariantToBSTR(propvar: COpaquePointer?, pbstrout: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToBSTR((propvar?.value ?: 0L), (pbstrout?.value ?: 0L))

public actual fun propVariantToBoolean(propvarin: COpaquePointer?, pfret: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToBoolean((propvarin?.value ?: 0L), (pfret?.value ?: 0L))

public actual fun propVariantToBooleanVector(propvar: COpaquePointer?, prgf: COpaquePointer?, crgf: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToBooleanVector((propvar?.value ?: 0L), (prgf?.value ?: 0L), crgf.toInt(), (pcelem?.value ?: 0L))

public actual fun propVariantToBooleanVectorAlloc(propvar: COpaquePointer?, pprgf: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToBooleanVectorAlloc((propvar?.value ?: 0L), (pprgf?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun propVariantToBooleanWithDefault(propvarin: COpaquePointer?, fdefault: Bool): Bool =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToBooleanWithDefault((propvarin?.value ?: 0L), fdefault)

public actual fun propVariantToBuffer(propvar: COpaquePointer?, pv: COpaquePointer?, cb: UInt): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToBuffer((propvar?.value ?: 0L), (pv?.value ?: 0L), cb.toInt())

public actual fun propVariantToDouble(propvarin: COpaquePointer?, pdblret: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToDouble((propvarin?.value ?: 0L), (pdblret?.value ?: 0L))

public actual fun propVariantToDoubleVector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToDoubleVector((propvar?.value ?: 0L), (prgn?.value ?: 0L), crgn.toInt(), (pcelem?.value ?: 0L))

public actual fun propVariantToDoubleVectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToDoubleVectorAlloc((propvar?.value ?: 0L), (pprgn?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun propVariantToDoubleWithDefault(propvarin: COpaquePointer?, dbldefault: Double): Double =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToDoubleWithDefault((propvarin?.value ?: 0L), dbldefault)

public actual fun propVariantToFileTime(propvar: COpaquePointer?, pstfout: PstimeFlags, pftout: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToFileTime((propvar?.value ?: 0L), pstfout, (pftout?.value ?: 0L))

public actual fun propVariantToFileTimeVector(propvar: COpaquePointer?, prgft: COpaquePointer?, crgft: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToFileTimeVector((propvar?.value ?: 0L), (prgft?.value ?: 0L), crgft.toInt(), (pcelem?.value ?: 0L))

public actual fun propVariantToFileTimeVectorAlloc(propvar: COpaquePointer?, pprgft: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToFileTimeVectorAlloc((propvar?.value ?: 0L), (pprgft?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun propVariantToGUID(propvar: COpaquePointer?, pguid: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToGUID((propvar?.value ?: 0L), (pguid?.value ?: 0L))

public actual fun propVariantToInt16(propvarin: COpaquePointer?, piret: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16((propvarin?.value ?: 0L), (piret?.value ?: 0L))

public actual fun propVariantToInt16Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16Vector((propvar?.value ?: 0L), (prgn?.value ?: 0L), crgn.toInt(), (pcelem?.value ?: 0L))

public actual fun propVariantToInt16VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16VectorAlloc((propvar?.value ?: 0L), (pprgn?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun propVariantToInt16WithDefault(propvarin: COpaquePointer?, idefault: Short): Short =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16WithDefault((propvarin?.value ?: 0L), idefault)

public actual fun propVariantToInt32(propvarin: COpaquePointer?, plret: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32((propvarin?.value ?: 0L), (plret?.value ?: 0L))

public actual fun propVariantToInt32Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32Vector((propvar?.value ?: 0L), (prgn?.value ?: 0L), crgn.toInt(), (pcelem?.value ?: 0L))

public actual fun propVariantToInt32VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32VectorAlloc((propvar?.value ?: 0L), (pprgn?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun propVariantToInt32WithDefault(propvarin: COpaquePointer?, ldefault: Int): Int =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32WithDefault((propvarin?.value ?: 0L), ldefault)

public actual fun propVariantToInt64(propvarin: COpaquePointer?, pllret: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64((propvarin?.value ?: 0L), (pllret?.value ?: 0L))

public actual fun propVariantToInt64Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64Vector((propvar?.value ?: 0L), (prgn?.value ?: 0L), crgn.toInt(), (pcelem?.value ?: 0L))

public actual fun propVariantToInt64VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64VectorAlloc((propvar?.value ?: 0L), (pprgn?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun propVariantToInt64WithDefault(propvarin: COpaquePointer?, lldefault: Long): Long =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64WithDefault((propvarin?.value ?: 0L), lldefault)

public actual fun propVariantToString(propvar: COpaquePointer?, psz: Pwstr, cch: UInt): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToString((propvar?.value ?: 0L), (psz?.value ?: 0L), cch.toInt())

public actual fun propVariantToStringAlloc(propvar: COpaquePointer?, ppszout: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToStringAlloc((propvar?.value ?: 0L), (ppszout?.value ?: 0L))

public actual fun propVariantToStringVector(propvar: COpaquePointer?, prgsz: COpaquePointer?, crgsz: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToStringVector((propvar?.value ?: 0L), (prgsz?.value ?: 0L), crgsz.toInt(), (pcelem?.value ?: 0L))

public actual fun propVariantToStringVectorAlloc(propvar: COpaquePointer?, pprgsz: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToStringVectorAlloc((propvar?.value ?: 0L), (pprgsz?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun propVariantToStringWithDefault(propvarin: COpaquePointer?, pszdefault: Pcwstr): Pcwstr =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToStringWithDefault((propvarin?.value ?: 0L), (pszdefault?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun propVariantToUInt16(propvarin: COpaquePointer?, puiret: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16((propvarin?.value ?: 0L), (puiret?.value ?: 0L))

public actual fun propVariantToUInt16Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16Vector((propvar?.value ?: 0L), (prgn?.value ?: 0L), crgn.toInt(), (pcelem?.value ?: 0L))

public actual fun propVariantToUInt16VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16VectorAlloc((propvar?.value ?: 0L), (pprgn?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun propVariantToUInt16WithDefault(propvarin: COpaquePointer?, uidefault: UShort): UShort =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16WithDefault((propvarin?.value ?: 0L), uidefault.toShort()).toUShort()

public actual fun propVariantToUInt32(propvarin: COpaquePointer?, pulret: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32((propvarin?.value ?: 0L), (pulret?.value ?: 0L))

public actual fun propVariantToUInt32Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32Vector((propvar?.value ?: 0L), (prgn?.value ?: 0L), crgn.toInt(), (pcelem?.value ?: 0L))

public actual fun propVariantToUInt32VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32VectorAlloc((propvar?.value ?: 0L), (pprgn?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun propVariantToUInt32WithDefault(propvarin: COpaquePointer?, uldefault: UInt): UInt =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32WithDefault((propvarin?.value ?: 0L), uldefault.toInt()).toUInt()

public actual fun propVariantToUInt64(propvarin: COpaquePointer?, pullret: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64((propvarin?.value ?: 0L), (pullret?.value ?: 0L))

public actual fun propVariantToUInt64Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64Vector((propvar?.value ?: 0L), (prgn?.value ?: 0L), crgn.toInt(), (pcelem?.value ?: 0L))

public actual fun propVariantToUInt64VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64VectorAlloc((propvar?.value ?: 0L), (pprgn?.value ?: 0L), (pcelem?.value ?: 0L))

public actual fun propVariantToUInt64WithDefault(propvarin: COpaquePointer?, ulldefault: ULong): ULong =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64WithDefault((propvarin?.value ?: 0L), ulldefault.toLong()).toULong()

public actual fun propVariantToVariant(ppropvar: COpaquePointer?, pvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToVariant((ppropvar?.value ?: 0L), (pvar?.value ?: 0L))

public actual fun propVariantToWinRTPropertyValue(propvar: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_propVariantToWinRTPropertyValue((propvar?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun readClassStg(pstg: COpaquePointer?, pclsid: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_readClassStg((pstg?.value ?: 0L), (pclsid?.value ?: 0L))

public actual fun readClassStm(pstm: COpaquePointer?, pclsid: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_readClassStm((pstm?.value ?: 0L), (pclsid?.value ?: 0L))

public actual fun readFmtUserTypeStg(pstg: COpaquePointer?, pcf: COpaquePointer?, lplpszusertype: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_readFmtUserTypeStg((pstg?.value ?: 0L), (pcf?.value ?: 0L), (lplpszusertype?.value ?: 0L))

public actual fun setConvertStg(pstg: COpaquePointer?, fconvert: Bool): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_setConvertStg((pstg?.value ?: 0L), fconvert)

public actual fun stgConvertPropertyToVariant(pprop: COpaquePointer?, codepage: UShort, pvar: COpaquePointer?, pma: COpaquePointer?): Boolean =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgConvertPropertyToVariant((pprop?.value ?: 0L), codepage.toShort(), (pvar?.value ?: 0L), (pma?.value ?: 0L))

public actual fun stgConvertVariantToProperty(pvar: COpaquePointer?, codepage: UShort, pprop: COpaquePointer?, pcb: COpaquePointer?, pid: UInt, freserved: Boolean, pcindirect: COpaquePointer?): COpaquePointer? =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgConvertVariantToProperty((pvar?.value ?: 0L), codepage.toShort(), (pprop?.value ?: 0L), (pcb?.value ?: 0L), pid.toInt(), freserved, (pcindirect?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun stgCreateDocfile(pwcsname: Pcwstr, grfmode: Stgm, reserved: UInt, ppstgopen: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgCreateDocfile((pwcsname?.value ?: 0L), grfmode.toInt(), reserved.toInt(), (ppstgopen?.value ?: 0L))

public actual fun stgCreateDocfileOnILockBytes(plkbyt: COpaquePointer?, grfmode: Stgm, reserved: UInt, ppstgopen: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgCreateDocfileOnILockBytes((plkbyt?.value ?: 0L), grfmode.toInt(), reserved.toInt(), (ppstgopen?.value ?: 0L))

public actual fun stgCreatePropSetStg(pstorage: COpaquePointer?, dwreserved: UInt, pppropsetstg: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgCreatePropSetStg((pstorage?.value ?: 0L), dwreserved.toInt(), (pppropsetstg?.value ?: 0L))

public actual fun stgCreatePropStg(punk: COpaquePointer?, fmtid: COpaquePointer?, pclsid: COpaquePointer?, grfflags: UInt, dwreserved: UInt, pppropstg: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgCreatePropStg((punk?.value ?: 0L), (fmtid?.value ?: 0L), (pclsid?.value ?: 0L), grfflags.toInt(), dwreserved.toInt(), (pppropstg?.value ?: 0L))

public actual fun stgCreateStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: COpaquePointer?, psecuritydescriptor: PsecurityDescriptor, riid: COpaquePointer?, ppobjectopen: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgCreateStorageEx((pwcsname?.value ?: 0L), grfmode.toInt(), stgfmt.toInt(), grfattrs.toInt(), (pstgoptions?.value ?: 0L), (psecuritydescriptor?.value ?: 0L), (riid?.value ?: 0L), (ppobjectopen?.value ?: 0L))

public actual fun stgDeserializePropVariant(pprop: COpaquePointer?, cbmax: UInt, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgDeserializePropVariant((pprop?.value ?: 0L), cbmax.toInt(), (ppropvar?.value ?: 0L))

public actual fun stgGetIFillLockBytesOnFile(pwcsname: Pcwstr, ppflb: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgGetIFillLockBytesOnFile((pwcsname?.value ?: 0L), (ppflb?.value ?: 0L))

public actual fun stgGetIFillLockBytesOnILockBytes(pilb: COpaquePointer?, ppflb: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgGetIFillLockBytesOnILockBytes((pilb?.value ?: 0L), (ppflb?.value ?: 0L))

public actual fun stgIsStorageFile(pwcsname: Pcwstr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgIsStorageFile((pwcsname?.value ?: 0L))

public actual fun stgIsStorageILockBytes(plkbyt: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgIsStorageILockBytes((plkbyt?.value ?: 0L))

public actual fun stgOpenAsyncDocfileOnIFillLockBytes(pflb: COpaquePointer?, grfmode: UInt, asyncflags: UInt, ppstgopen: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgOpenAsyncDocfileOnIFillLockBytes((pflb?.value ?: 0L), grfmode.toInt(), asyncflags.toInt(), (ppstgopen?.value ?: 0L))

public actual fun stgOpenLayoutDocfile(pwcsdfname: Pcwstr, grfmode: UInt, reserved: UInt, ppstgopen: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgOpenLayoutDocfile((pwcsdfname?.value ?: 0L), grfmode.toInt(), reserved.toInt(), (ppstgopen?.value ?: 0L))

public actual fun stgOpenPropStg(punk: COpaquePointer?, fmtid: COpaquePointer?, grfflags: UInt, dwreserved: UInt, pppropstg: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgOpenPropStg((punk?.value ?: 0L), (fmtid?.value ?: 0L), grfflags.toInt(), dwreserved.toInt(), (pppropstg?.value ?: 0L))

public actual fun stgOpenStorage(pwcsname: Pcwstr, pstgpriority: COpaquePointer?, grfmode: Stgm, snbexclude: COpaquePointer?, reserved: UInt, ppstgopen: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgOpenStorage((pwcsname?.value ?: 0L), (pstgpriority?.value ?: 0L), grfmode.toInt(), (snbexclude?.value ?: 0L), reserved.toInt(), (ppstgopen?.value ?: 0L))

public actual fun stgOpenStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: COpaquePointer?, psecuritydescriptor: PsecurityDescriptor, riid: COpaquePointer?, ppobjectopen: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgOpenStorageEx((pwcsname?.value ?: 0L), grfmode.toInt(), stgfmt.toInt(), grfattrs.toInt(), (pstgoptions?.value ?: 0L), (psecuritydescriptor?.value ?: 0L), (riid?.value ?: 0L), (ppobjectopen?.value ?: 0L))

public actual fun stgOpenStorageOnILockBytes(plkbyt: COpaquePointer?, pstgpriority: COpaquePointer?, grfmode: Stgm, snbexclude: COpaquePointer?, reserved: UInt, ppstgopen: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgOpenStorageOnILockBytes((plkbyt?.value ?: 0L), (pstgpriority?.value ?: 0L), grfmode.toInt(), (snbexclude?.value ?: 0L), reserved.toInt(), (ppstgopen?.value ?: 0L))

public actual fun stgPropertyLengthAsVariant(pprop: COpaquePointer?, cbprop: UInt, codepage: UShort, breserved: UByte): UInt =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgPropertyLengthAsVariant((pprop?.value ?: 0L), cbprop.toInt(), codepage.toShort(), breserved.toByte()).toUInt()

public actual fun stgSerializePropVariant(ppropvar: COpaquePointer?, ppprop: COpaquePointer?, pcb: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgSerializePropVariant((ppropvar?.value ?: 0L), (ppprop?.value ?: 0L), (pcb?.value ?: 0L))

public actual fun stgSetTimes(lpszname: Pcwstr, pctime: COpaquePointer?, patime: COpaquePointer?, pmtime: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_stgSetTimes((lpszname?.value ?: 0L), (pctime?.value ?: 0L), (patime?.value ?: 0L), (pmtime?.value ?: 0L))

public actual fun variantToPropVariant(pvar: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_variantToPropVariant((pvar?.value ?: 0L), (ppropvar?.value ?: 0L))

public actual fun winRTPropertyValueToPropVariant(punkpropertyvalue: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_winRTPropertyValueToPropVariant((punkpropertyvalue?.value ?: 0L), (ppropvar?.value ?: 0L))

public actual fun writeClassStg(pstg: COpaquePointer?, rclsid: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_writeClassStg((pstg?.value ?: 0L), (rclsid?.value ?: 0L))

public actual fun writeClassStm(pstm: COpaquePointer?, rclsid: COpaquePointer?): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_writeClassStm((pstm?.value ?: 0L), (rclsid?.value ?: 0L))

public actual fun writeFmtUserTypeStg(pstg: COpaquePointer?, cf: UShort, lpszusertype: Pcwstr): Hresult =
    WindowsWin32SystemComStructuredstorageJniBridge.windowssys_windows_win32_system_com_structuredstorage_writeFmtUserTypeStg((pstg?.value ?: 0L), cf.toShort(), (lpszusertype?.value ?: 0L))
