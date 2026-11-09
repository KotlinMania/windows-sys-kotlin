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

private val _windowsWin32SystemComStructuredstorageNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun ClearPropVariantArray(rgpropvar: Long, cvars: UInt) {
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) {
        _windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_ClearPropVariantArray(rgpropvar.toString(), cvars.toInt())
    }
}

public actual fun CoGetInstanceFromFile(pserverinfo: Long, pclsid: Long, punkouter: Long, dwclsctx: CLSCTX, grfmode: UInt, pwszname: PCWSTR, dwcount: UInt, presults: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_CoGetInstanceFromFile(pserverinfo.toString(), pclsid.toString(), punkouter.toString(), dwclsctx.toInt(), grfmode.toInt(), pwszname.toString(), dwcount.toInt(), presults.toString()) as Int) else 0

public actual fun CoGetInstanceFromIStorage(pserverinfo: Long, pclsid: Long, punkouter: Long, dwclsctx: CLSCTX, pstg: Long, dwcount: UInt, presults: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_CoGetInstanceFromIStorage(pserverinfo.toString(), pclsid.toString(), punkouter.toString(), dwclsctx.toInt(), pstg.toString(), dwcount.toInt(), presults.toString()) as Int) else 0

public actual fun CoGetInterfaceAndReleaseStream(pstm: Long, iid: Long, ppv: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_CoGetInterfaceAndReleaseStream(pstm.toString(), iid.toString(), ppv.toString()) as Int) else 0

public actual fun CreateILockBytesOnHGlobal(hglobal: HGLOBAL, fdeleteonrelease: BOOL, pplkbyt: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_CreateILockBytesOnHGlobal(hglobal.toString(), fdeleteonrelease, pplkbyt.toString()) as Int) else 0

public actual fun CreateStreamOnHGlobal(hglobal: HGLOBAL, fdeleteonrelease: BOOL, ppstm: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_CreateStreamOnHGlobal(hglobal.toString(), fdeleteonrelease, ppstm.toString()) as Int) else 0

public actual fun FmtIdToPropStgName(pfmtid: Long, oszname: PWSTR): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_FmtIdToPropStgName(pfmtid.toString(), oszname.toString()) as Int) else 0

public actual fun FreePropVariantArray(cvariants: UInt, rgvars: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_FreePropVariantArray(cvariants.toInt(), rgvars.toString()) as Int) else 0

public actual fun GetConvertStg(pstg: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_GetConvertStg(pstg.toString()) as Int) else 0

public actual fun GetHGlobalFromILockBytes(plkbyt: Long, phglobal: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_GetHGlobalFromILockBytes(plkbyt.toString(), phglobal.toString()) as Int) else 0

public actual fun GetHGlobalFromStream(pstm: Long, phglobal: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_GetHGlobalFromStream(pstm.toString(), phglobal.toString()) as Int) else 0

public actual fun InitPropVariantFromBooleanVector(prgf: Long, celems: UInt, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromBooleanVector(prgf.toString(), celems.toInt(), ppropvar.toString()) as Int) else 0

public actual fun InitPropVariantFromBuffer(pv: Long, cb: UInt, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromBuffer(pv.toString(), cb.toInt(), ppropvar.toString()) as Int) else 0

public actual fun InitPropVariantFromCLSID(clsid: Long, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromCLSID(clsid.toString(), ppropvar.toString()) as Int) else 0

public actual fun InitPropVariantFromDoubleVector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromDoubleVector(prgn.toString(), celems.toInt(), ppropvar.toString()) as Int) else 0

public actual fun InitPropVariantFromFileTime(pftin: Long, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromFileTime(pftin.toString(), ppropvar.toString()) as Int) else 0

public actual fun InitPropVariantFromFileTimeVector(prgft: Long, celems: UInt, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromFileTimeVector(prgft.toString(), celems.toInt(), ppropvar.toString()) as Int) else 0

public actual fun InitPropVariantFromGUIDAsString(guid: Long, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromGUIDAsString(guid.toString(), ppropvar.toString()) as Int) else 0

public actual fun InitPropVariantFromInt16Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt16Vector(prgn.toString(), celems.toInt(), ppropvar.toString()) as Int) else 0

public actual fun InitPropVariantFromInt32Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt32Vector(prgn.toString(), celems.toInt(), ppropvar.toString()) as Int) else 0

public actual fun InitPropVariantFromInt64Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromInt64Vector(prgn.toString(), celems.toInt(), ppropvar.toString()) as Int) else 0

public actual fun InitPropVariantFromPropVariantVectorElem(propvarin: Long, ielem: UInt, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromPropVariantVectorElem(propvarin.toString(), ielem.toInt(), ppropvar.toString()) as Int) else 0

public actual fun InitPropVariantFromResource(hinst: HINSTANCE, id: UInt, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromResource(hinst.toString(), id.toInt(), ppropvar.toString()) as Int) else 0

public actual fun InitPropVariantFromStringAsVector(psz: PCWSTR, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromStringAsVector(psz.toString(), ppropvar.toString()) as Int) else 0

public actual fun InitPropVariantFromStringVector(prgsz: Long, celems: UInt, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromStringVector(prgsz.toString(), celems.toInt(), ppropvar.toString()) as Int) else 0

public actual fun InitPropVariantFromUInt16Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt16Vector(prgn.toString(), celems.toInt(), ppropvar.toString()) as Int) else 0

public actual fun InitPropVariantFromUInt32Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt32Vector(prgn.toString(), celems.toInt(), ppropvar.toString()) as Int) else 0

public actual fun InitPropVariantFromUInt64Vector(prgn: Long, celems: UInt, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantFromUInt64Vector(prgn.toString(), celems.toInt(), ppropvar.toString()) as Int) else 0

public actual fun InitPropVariantVectorFromPropVariant(propvarsingle: Long, ppropvarvector: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_InitPropVariantVectorFromPropVariant(propvarsingle.toString(), ppropvarvector.toString()) as Int) else 0

public actual fun OleConvertIStorageToOLESTREAM(pstg: Long, lpolestream: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_OleConvertIStorageToOLESTREAM(pstg.toString(), lpolestream.toString()) as Int) else 0

public actual fun OleConvertIStorageToOLESTREAMEx(pstg: Long, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: Long, polestm: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_OleConvertIStorageToOLESTREAMEx(pstg.toString(), cfformat.toInt(), lwidth, lheight, dwsize.toInt(), pmedium.toString(), polestm.toString()) as Int) else 0

public actual fun OleConvertOLESTREAMToIStorage(lpolestream: Long, pstg: Long, ptd: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_OleConvertOLESTREAMToIStorage(lpolestream.toString(), pstg.toString(), ptd.toString()) as Int) else 0

public actual fun OleConvertOLESTREAMToIStorageEx(polestm: Long, pstg: Long, pcfformat: Long, plwwidth: Long, plheight: Long, pdwsize: Long, pmedium: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_OleConvertOLESTREAMToIStorageEx(polestm.toString(), pstg.toString(), pcfformat.toString(), plwwidth.toString(), plheight.toString(), pdwsize.toString(), pmedium.toString()) as Int) else 0

public actual fun PropStgNameToFmtId(oszname: PCWSTR, pfmtid: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropStgNameToFmtId(oszname.toString(), pfmtid.toString()) as Int) else 0

public actual fun PropVariantChangeType(ppropvardest: Long, propvarsrc: Long, flags: PROPVAR_CHANGE_FLAGS, vt: VARENUM): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantChangeType(ppropvardest.toString(), propvarsrc.toString(), flags, vt.toInt()) as Int) else 0

public actual fun PropVariantClear(pvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantClear(pvar.toString()) as Int) else 0

public actual fun PropVariantCompareEx(propvar1: Long, propvar2: Long, unit: PROPVAR_COMPARE_UNIT, flags: PROPVAR_COMPARE_FLAGS): Int =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantCompareEx(propvar1.toString(), propvar2.toString(), unit, flags) as Int) else 0

public actual fun PropVariantCopy(pvardest: Long, pvarsrc: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantCopy(pvardest.toString(), pvarsrc.toString()) as Int) else 0

public actual fun PropVariantGetBooleanElem(propvar: Long, ielem: UInt, pfval: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetBooleanElem(propvar.toString(), ielem.toInt(), pfval.toString()) as Int) else 0

public actual fun PropVariantGetDoubleElem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetDoubleElem(propvar.toString(), ielem.toInt(), pnval.toString()) as Int) else 0

public actual fun PropVariantGetElementCount(propvar: Long): UInt =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetElementCount(propvar.toString()) as Int).toUInt() else 0u

public actual fun PropVariantGetFileTimeElem(propvar: Long, ielem: UInt, pftval: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetFileTimeElem(propvar.toString(), ielem.toInt(), pftval.toString()) as Int) else 0

public actual fun PropVariantGetInt16Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt16Elem(propvar.toString(), ielem.toInt(), pnval.toString()) as Int) else 0

public actual fun PropVariantGetInt32Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt32Elem(propvar.toString(), ielem.toInt(), pnval.toString()) as Int) else 0

public actual fun PropVariantGetInt64Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetInt64Elem(propvar.toString(), ielem.toInt(), pnval.toString()) as Int) else 0

public actual fun PropVariantGetStringElem(propvar: Long, ielem: UInt, ppszval: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetStringElem(propvar.toString(), ielem.toInt(), ppszval.toString()) as Int) else 0

public actual fun PropVariantGetUInt16Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt16Elem(propvar.toString(), ielem.toInt(), pnval.toString()) as Int) else 0

public actual fun PropVariantGetUInt32Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt32Elem(propvar.toString(), ielem.toInt(), pnval.toString()) as Int) else 0

public actual fun PropVariantGetUInt64Elem(propvar: Long, ielem: UInt, pnval: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantGetUInt64Elem(propvar.toString(), ielem.toInt(), pnval.toString()) as Int) else 0

public actual fun PropVariantToBSTR(propvar: Long, pbstrout: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToBSTR(propvar.toString(), pbstrout.toString()) as Int) else 0

public actual fun PropVariantToBoolean(propvarin: Long, pfret: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToBoolean(propvarin.toString(), pfret.toString()) as Int) else 0

public actual fun PropVariantToBooleanVector(propvar: Long, prgf: Long, crgf: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanVector(propvar.toString(), prgf.toString(), crgf.toInt(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToBooleanVectorAlloc(propvar: Long, pprgf: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanVectorAlloc(propvar.toString(), pprgf.toString(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToBooleanWithDefault(propvarin: Long, fdefault: BOOL): BOOL =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToBooleanWithDefault(propvarin.toString(), fdefault) as Int) else 0

public actual fun PropVariantToBuffer(propvar: Long, pv: Long, cb: UInt): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToBuffer(propvar.toString(), pv.toString(), cb.toInt()) as Int) else 0

public actual fun PropVariantToDouble(propvarin: Long, pdblret: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToDouble(propvarin.toString(), pdblret.toString()) as Int) else 0

public actual fun PropVariantToDoubleVector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleVector(propvar.toString(), prgn.toString(), crgn.toInt(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToDoubleVectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleVectorAlloc(propvar.toString(), pprgn.toString(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToDoubleWithDefault(propvarin: Long, dbldefault: Double): Double =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToDoubleWithDefault(propvarin.toString(), dbldefault) as Double) else 0.0

public actual fun PropVariantToFileTime(propvar: Long, pstfout: PSTIME_FLAGS, pftout: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTime(propvar.toString(), pstfout, pftout.toString()) as Int) else 0

public actual fun PropVariantToFileTimeVector(propvar: Long, prgft: Long, crgft: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTimeVector(propvar.toString(), prgft.toString(), crgft.toInt(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToFileTimeVectorAlloc(propvar: Long, pprgft: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToFileTimeVectorAlloc(propvar.toString(), pprgft.toString(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToGUID(propvar: Long, pguid: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToGUID(propvar.toString(), pguid.toString()) as Int) else 0

public actual fun PropVariantToInt16(propvarin: Long, piret: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16(propvarin.toString(), piret.toString()) as Int) else 0

public actual fun PropVariantToInt16Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16Vector(propvar.toString(), prgn.toString(), crgn.toInt(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToInt16VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16VectorAlloc(propvar.toString(), pprgn.toString(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToInt16WithDefault(propvarin: Long, idefault: Short): Short =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt16WithDefault(propvarin.toString(), idefault.toInt()) as Int).toShort() else 0

public actual fun PropVariantToInt32(propvarin: Long, plret: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32(propvarin.toString(), plret.toString()) as Int) else 0

public actual fun PropVariantToInt32Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32Vector(propvar.toString(), prgn.toString(), crgn.toInt(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToInt32VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32VectorAlloc(propvar.toString(), pprgn.toString(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToInt32WithDefault(propvarin: Long, ldefault: Int): Int =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt32WithDefault(propvarin.toString(), ldefault) as Int) else 0

public actual fun PropVariantToInt64(propvarin: Long, pllret: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64(propvarin.toString(), pllret.toString()) as Int) else 0

public actual fun PropVariantToInt64Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64Vector(propvar.toString(), prgn.toString(), crgn.toInt(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToInt64VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64VectorAlloc(propvar.toString(), pprgn.toString(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToInt64WithDefault(propvarin: Long, lldefault: Long): Long =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToInt64WithDefault(propvarin.toString(), lldefault.toString()) as String).toLong() else 0L

public actual fun PropVariantToString(propvar: Long, psz: PWSTR, cch: UInt): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToString(propvar.toString(), psz.toString(), cch.toInt()) as Int) else 0

public actual fun PropVariantToStringAlloc(propvar: Long, ppszout: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringAlloc(propvar.toString(), ppszout.toString()) as Int) else 0

public actual fun PropVariantToStringVector(propvar: Long, prgsz: Long, crgsz: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringVector(propvar.toString(), prgsz.toString(), crgsz.toInt(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToStringVectorAlloc(propvar: Long, pprgsz: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringVectorAlloc(propvar.toString(), pprgsz.toString(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToStringWithDefault(propvarin: Long, pszdefault: PCWSTR): PCWSTR =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToStringWithDefault(propvarin.toString(), pszdefault.toString()) as String).toLong() else 0L

public actual fun PropVariantToUInt16(propvarin: Long, puiret: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16(propvarin.toString(), puiret.toString()) as Int) else 0

public actual fun PropVariantToUInt16Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16Vector(propvar.toString(), prgn.toString(), crgn.toInt(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToUInt16VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16VectorAlloc(propvar.toString(), pprgn.toString(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToUInt16WithDefault(propvarin: Long, uidefault: UShort): UShort =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt16WithDefault(propvarin.toString(), uidefault.toInt()) as Int).toUShort() else 0u

public actual fun PropVariantToUInt32(propvarin: Long, pulret: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32(propvarin.toString(), pulret.toString()) as Int) else 0

public actual fun PropVariantToUInt32Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32Vector(propvar.toString(), prgn.toString(), crgn.toInt(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToUInt32VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32VectorAlloc(propvar.toString(), pprgn.toString(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToUInt32WithDefault(propvarin: Long, uldefault: UInt): UInt =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt32WithDefault(propvarin.toString(), uldefault.toInt()) as Int).toUInt() else 0u

public actual fun PropVariantToUInt64(propvarin: Long, pullret: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64(propvarin.toString(), pullret.toString()) as Int) else 0

public actual fun PropVariantToUInt64Vector(propvar: Long, prgn: Long, crgn: UInt, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64Vector(propvar.toString(), prgn.toString(), crgn.toInt(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToUInt64VectorAlloc(propvar: Long, pprgn: Long, pcelem: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64VectorAlloc(propvar.toString(), pprgn.toString(), pcelem.toString()) as Int) else 0

public actual fun PropVariantToUInt64WithDefault(propvarin: Long, ulldefault: ULong): ULong =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToUInt64WithDefault(propvarin.toString(), ulldefault.toString()) as String).toULong() else 0uL

public actual fun PropVariantToVariant(ppropvar: Long, pvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToVariant(ppropvar.toString(), pvar.toString()) as Int) else 0

public actual fun PropVariantToWinRTPropertyValue(propvar: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_PropVariantToWinRTPropertyValue(propvar.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun ReadClassStg(pstg: Long, pclsid: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_ReadClassStg(pstg.toString(), pclsid.toString()) as Int) else 0

public actual fun ReadClassStm(pstm: Long, pclsid: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_ReadClassStm(pstm.toString(), pclsid.toString()) as Int) else 0

public actual fun ReadFmtUserTypeStg(pstg: Long, pcf: Long, lplpszusertype: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_ReadFmtUserTypeStg(pstg.toString(), pcf.toString(), lplpszusertype.toString()) as Int) else 0

public actual fun SetConvertStg(pstg: Long, fconvert: BOOL): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_SetConvertStg(pstg.toString(), fconvert) as Int) else 0

public actual fun StgConvertPropertyToVariant(pprop: Long, codepage: UShort, pvar: Long, pma: Long): Boolean =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgConvertPropertyToVariant(pprop.toString(), codepage.toInt(), pvar.toString(), pma.toString()) as Boolean) else false

public actual fun StgConvertVariantToProperty(pvar: Long, codepage: UShort, pprop: Long, pcb: Long, pid: UInt, freserved: Boolean, pcindirect: Long): Long =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgConvertVariantToProperty(pvar.toString(), codepage.toInt(), pprop.toString(), pcb.toString(), pid.toInt(), freserved, pcindirect.toString()) as String).toLong() else 0L

public actual fun StgCreateDocfile(pwcsname: PCWSTR, grfmode: STGM, reserved: UInt, ppstgopen: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgCreateDocfile(pwcsname.toString(), grfmode.toInt(), reserved.toInt(), ppstgopen.toString()) as Int) else 0

public actual fun StgCreateDocfileOnILockBytes(plkbyt: Long, grfmode: STGM, reserved: UInt, ppstgopen: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgCreateDocfileOnILockBytes(plkbyt.toString(), grfmode.toInt(), reserved.toInt(), ppstgopen.toString()) as Int) else 0

public actual fun StgCreatePropSetStg(pstorage: Long, dwreserved: UInt, pppropsetstg: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgCreatePropSetStg(pstorage.toString(), dwreserved.toInt(), pppropsetstg.toString()) as Int) else 0

public actual fun StgCreatePropStg(punk: Long, fmtid: Long, pclsid: Long, grfflags: UInt, dwreserved: UInt, pppropstg: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgCreatePropStg(punk.toString(), fmtid.toString(), pclsid.toString(), grfflags.toInt(), dwreserved.toInt(), pppropstg.toString()) as Int) else 0

public actual fun StgCreateStorageEx(pwcsname: PCWSTR, grfmode: STGM, stgfmt: STGFMT, grfattrs: UInt, pstgoptions: Long, psecuritydescriptor: PSECURITY_DESCRIPTOR, riid: Long, ppobjectopen: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgCreateStorageEx(pwcsname.toString(), grfmode.toInt(), stgfmt.toInt(), grfattrs.toInt(), pstgoptions.toString(), psecuritydescriptor.toString(), riid.toString(), ppobjectopen.toString()) as Int) else 0

public actual fun StgDeserializePropVariant(pprop: Long, cbmax: UInt, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgDeserializePropVariant(pprop.toString(), cbmax.toInt(), ppropvar.toString()) as Int) else 0

public actual fun StgGetIFillLockBytesOnFile(pwcsname: PCWSTR, ppflb: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgGetIFillLockBytesOnFile(pwcsname.toString(), ppflb.toString()) as Int) else 0

public actual fun StgGetIFillLockBytesOnILockBytes(pilb: Long, ppflb: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgGetIFillLockBytesOnILockBytes(pilb.toString(), ppflb.toString()) as Int) else 0

public actual fun StgIsStorageFile(pwcsname: PCWSTR): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgIsStorageFile(pwcsname.toString()) as Int) else 0

public actual fun StgIsStorageILockBytes(plkbyt: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgIsStorageILockBytes(plkbyt.toString()) as Int) else 0

public actual fun StgOpenAsyncDocfileOnIFillLockBytes(pflb: Long, grfmode: UInt, asyncflags: UInt, ppstgopen: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgOpenAsyncDocfileOnIFillLockBytes(pflb.toString(), grfmode.toInt(), asyncflags.toInt(), ppstgopen.toString()) as Int) else 0

public actual fun StgOpenLayoutDocfile(pwcsdfname: PCWSTR, grfmode: UInt, reserved: UInt, ppstgopen: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgOpenLayoutDocfile(pwcsdfname.toString(), grfmode.toInt(), reserved.toInt(), ppstgopen.toString()) as Int) else 0

public actual fun StgOpenPropStg(punk: Long, fmtid: Long, grfflags: UInt, dwreserved: UInt, pppropstg: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgOpenPropStg(punk.toString(), fmtid.toString(), grfflags.toInt(), dwreserved.toInt(), pppropstg.toString()) as Int) else 0

public actual fun StgOpenStorage(pwcsname: PCWSTR, pstgpriority: Long, grfmode: STGM, snbexclude: Long, reserved: UInt, ppstgopen: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgOpenStorage(pwcsname.toString(), pstgpriority.toString(), grfmode.toInt(), snbexclude.toString(), reserved.toInt(), ppstgopen.toString()) as Int) else 0

public actual fun StgOpenStorageEx(pwcsname: PCWSTR, grfmode: STGM, stgfmt: STGFMT, grfattrs: UInt, pstgoptions: Long, psecuritydescriptor: PSECURITY_DESCRIPTOR, riid: Long, ppobjectopen: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgOpenStorageEx(pwcsname.toString(), grfmode.toInt(), stgfmt.toInt(), grfattrs.toInt(), pstgoptions.toString(), psecuritydescriptor.toString(), riid.toString(), ppobjectopen.toString()) as Int) else 0

public actual fun StgOpenStorageOnILockBytes(plkbyt: Long, pstgpriority: Long, grfmode: STGM, snbexclude: Long, reserved: UInt, ppstgopen: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgOpenStorageOnILockBytes(plkbyt.toString(), pstgpriority.toString(), grfmode.toInt(), snbexclude.toString(), reserved.toInt(), ppstgopen.toString()) as Int) else 0

public actual fun StgPropertyLengthAsVariant(pprop: Long, cbprop: UInt, codepage: UShort, breserved: UByte): UInt =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgPropertyLengthAsVariant(pprop.toString(), cbprop.toInt(), codepage.toInt(), breserved.toInt()) as Int).toUInt() else 0u

public actual fun StgSerializePropVariant(ppropvar: Long, ppprop: Long, pcb: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgSerializePropVariant(ppropvar.toString(), ppprop.toString(), pcb.toString()) as Int) else 0

public actual fun StgSetTimes(lpszname: PCWSTR, pctime: Long, patime: Long, pmtime: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_StgSetTimes(lpszname.toString(), pctime.toString(), patime.toString(), pmtime.toString()) as Int) else 0

public actual fun VariantToPropVariant(pvar: Long, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_VariantToPropVariant(pvar.toString(), ppropvar.toString()) as Int) else 0

public actual fun WinRTPropertyValueToPropVariant(punkpropertyvalue: Long, ppropvar: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_WinRTPropertyValueToPropVariant(punkpropertyvalue.toString(), ppropvar.toString()) as Int) else 0

public actual fun WriteClassStg(pstg: Long, rclsid: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_WriteClassStg(pstg.toString(), rclsid.toString()) as Int) else 0

public actual fun WriteClassStm(pstm: Long, rclsid: Long): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_WriteClassStm(pstm.toString(), rclsid.toString()) as Int) else 0

public actual fun WriteFmtUserTypeStg(pstg: Long, cf: UShort, lpszusertype: PCWSTR): HRESULT =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_WriteFmtUserTypeStg(pstg.toString(), cf.toInt(), lpszusertype.toString()) as Int) else 0
