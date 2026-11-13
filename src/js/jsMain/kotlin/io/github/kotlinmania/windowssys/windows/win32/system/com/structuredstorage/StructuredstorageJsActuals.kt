@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32SystemComStructuredstorageNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun clearPropVariantArray(rgpropvar: MutPtr, cvars: UInt) {
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) {
        windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageClearPropVariantArray(rgpropvar.rawAddress.toString(), cvars.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coGetInstanceFromFile(pserverinfo: ConstPtr, pclsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, grfmode: UInt, pwszname: Pcwstr, dwcount: UInt, presults: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromFile(pserverinfo.rawAddress.toString(), pclsid.rawAddress.toString(), punkouter.rawAddress.toString(), dwclsctx.toInt(), grfmode.toInt(), pwszname.rawAddress.toString(), dwcount.toInt(), presults.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetInstanceFromIStorage(pserverinfo: ConstPtr, pclsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, pstg: MutPtr, dwcount: UInt, presults: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromIStorage(pserverinfo.rawAddress.toString(), pclsid.rawAddress.toString(), punkouter.rawAddress.toString(), dwclsctx.toInt(), pstg.rawAddress.toString(), dwcount.toInt(), presults.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetInterfaceAndReleaseStream(pstm: MutPtr, iid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageCoGetInterfaceAndReleaseStream(pstm.rawAddress.toString(), iid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createILockBytesOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, pplkbyt: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageCreateILockBytesOnHGlobal(hglobal.rawAddress.toString(), fdeleteonrelease, pplkbyt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStreamOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, ppstm: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageCreateStreamOnHGlobal(hglobal.rawAddress.toString(), fdeleteonrelease, ppstm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fmtIdToPropStgName(pfmtid: ConstPtr, oszname: Pwstr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageFmtIdToPropStgName(pfmtid.rawAddress.toString(), oszname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freePropVariantArray(cvariants: UInt, rgvars: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageFreePropVariantArray(cvariants.toInt(), rgvars.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConvertStg(pstg: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageGetConvertStg(pstg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHGlobalFromILockBytes(plkbyt: MutPtr, phglobal: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromILockBytes(plkbyt.rawAddress.toString(), phglobal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHGlobalFromStream(pstm: MutPtr, phglobal: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromStream(pstm.rawAddress.toString(), phglobal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromBooleanVector(prgf: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBooleanVector(prgf.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromBuffer(pv: ConstPtr, cb: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBuffer(pv.rawAddress.toString(), cb.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromCLSID(clsid: ConstPtr, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromCLSID(clsid.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromDoubleVector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromDoubleVector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromFileTime(pftin: ConstPtr, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTime(pftin.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromFileTimeVector(prgft: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTimeVector(prgft.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromGUIDAsString(guid: ConstPtr, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromGUIDAsString(guid.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromInt16Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt16Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromInt32Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt32Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromInt64Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt64Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromPropVariantVectorElem(propvarin: ConstPtr, ielem: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromPropVariantVectorElem(propvarin.rawAddress.toString(), ielem.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromResource(hinst: Hinstance, id: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromResource(hinst.rawAddress.toString(), id.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromStringAsVector(psz: Pcwstr, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringAsVector(psz.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromStringVector(prgsz: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringVector(prgsz.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromUInt16Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt16Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromUInt32Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt32Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromUInt64Vector(prgn: ConstPtr, celems: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt64Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantVectorFromPropVariant(propvarsingle: ConstPtr, ppropvarvector: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantVectorFromPropVariant(propvarsingle.rawAddress.toString(), ppropvarvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertIStorageToOLESTREAM(pstg: MutPtr, lpolestream: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAM(pstg.rawAddress.toString(), lpolestream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertIStorageToOLESTREAMEx(pstg: MutPtr, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: ConstPtr, polestm: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAMEx(pstg.rawAddress.toString(), cfformat.toInt(), lwidth, lheight, dwsize.toInt(), pmedium.rawAddress.toString(), polestm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertOLESTREAMToIStorage(lpolestream: ConstPtr, pstg: MutPtr, ptd: ConstPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorage(lpolestream.rawAddress.toString(), pstg.rawAddress.toString(), ptd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertOLESTREAMToIStorageEx(polestm: ConstPtr, pstg: MutPtr, pcfformat: MutPtr, plwwidth: MutPtr, plheight: MutPtr, pdwsize: MutPtr, pmedium: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorageEx(polestm.rawAddress.toString(), pstg.rawAddress.toString(), pcfformat.rawAddress.toString(), plwwidth.rawAddress.toString(), plheight.rawAddress.toString(), pdwsize.rawAddress.toString(), pmedium.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propStgNameToFmtId(oszname: Pcwstr, pfmtid: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropStgNameToFmtId(oszname.rawAddress.toString(), pfmtid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantChangeType(ppropvardest: MutPtr, propvarsrc: ConstPtr, flags: PropvarChangeFlags, vt: Varenum): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantChangeType(ppropvardest.rawAddress.toString(), propvarsrc.rawAddress.toString(), flags, vt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantClear(pvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantClear(pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantCompareEx(propvar1: ConstPtr, propvar2: ConstPtr, unit: PropvarCompareUnit, flags: PropvarCompareFlags): Int =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantCompareEx(propvar1.rawAddress.toString(), propvar2.rawAddress.toString(), unit, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantCopy(pvardest: MutPtr, pvarsrc: ConstPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantCopy(pvardest.rawAddress.toString(), pvarsrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetBooleanElem(propvar: ConstPtr, ielem: UInt, pfval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetBooleanElem(propvar.rawAddress.toString(), ielem.toInt(), pfval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetDoubleElem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetDoubleElem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetElementCount(propvar: ConstPtr): UInt =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetElementCount(propvar.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetFileTimeElem(propvar: ConstPtr, ielem: UInt, pftval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetFileTimeElem(propvar.rawAddress.toString(), ielem.toInt(), pftval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInt16Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt16Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInt32Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt32Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInt64Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt64Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetStringElem(propvar: ConstPtr, ielem: UInt, ppszval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetStringElem(propvar.rawAddress.toString(), ielem.toInt(), ppszval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetUInt16Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt16Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetUInt32Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt32Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetUInt64Elem(propvar: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt64Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBSTR(propvar: ConstPtr, pbstrout: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBSTR(propvar.rawAddress.toString(), pbstrout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBoolean(propvarin: ConstPtr, pfret: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBoolean(propvarin.rawAddress.toString(), pfret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBooleanVector(propvar: ConstPtr, prgf: MutPtr, crgf: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVector(propvar.rawAddress.toString(), prgf.rawAddress.toString(), crgf.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBooleanVectorAlloc(propvar: ConstPtr, pprgf: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVectorAlloc(propvar.rawAddress.toString(), pprgf.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBooleanWithDefault(propvarin: ConstPtr, fdefault: Bool): Bool =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanWithDefault(propvarin.rawAddress.toString(), fdefault) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBuffer(propvar: ConstPtr, pv: MutPtr, cb: UInt): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBuffer(propvar.rawAddress.toString(), pv.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDouble(propvarin: ConstPtr, pdblret: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDouble(propvarin.rawAddress.toString(), pdblret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDoubleVector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDoubleVectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDoubleWithDefault(propvarin: ConstPtr, dbldefault: Double): Double =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleWithDefault(propvarin.rawAddress.toString(), dbldefault) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToFileTime(propvar: ConstPtr, pstfout: PstimeFlags, pftout: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTime(propvar.rawAddress.toString(), pstfout, pftout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToFileTimeVector(propvar: ConstPtr, prgft: MutPtr, crgft: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVector(propvar.rawAddress.toString(), prgft.rawAddress.toString(), crgft.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToFileTimeVectorAlloc(propvar: ConstPtr, pprgft: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVectorAlloc(propvar.rawAddress.toString(), pprgft.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToGUID(propvar: ConstPtr, pguid: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToGUID(propvar.rawAddress.toString(), pguid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16(propvarin: ConstPtr, piret: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16(propvarin.rawAddress.toString(), piret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16WithDefault(propvarin: ConstPtr, idefault: Short): Short =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16WithDefault(propvarin.rawAddress.toString(), idefault.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32(propvarin: ConstPtr, plret: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32(propvarin.rawAddress.toString(), plret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32WithDefault(propvarin: ConstPtr, ldefault: Int): Int =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32WithDefault(propvarin.rawAddress.toString(), ldefault) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64(propvarin: ConstPtr, pllret: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64(propvarin.rawAddress.toString(), pllret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64WithDefault(propvarin: ConstPtr, lldefault: Long): Long =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64WithDefault(propvarin.rawAddress.toString(), lldefault.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToString(propvar: ConstPtr, psz: Pwstr, cch: UInt): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToString(propvar.rawAddress.toString(), psz.rawAddress.toString(), cch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringAlloc(propvar: ConstPtr, ppszout: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringAlloc(propvar.rawAddress.toString(), ppszout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringVector(propvar: ConstPtr, prgsz: MutPtr, crgsz: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVector(propvar.rawAddress.toString(), prgsz.rawAddress.toString(), crgsz.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringVectorAlloc(propvar: ConstPtr, pprgsz: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVectorAlloc(propvar.rawAddress.toString(), pprgsz.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringWithDefault(propvarin: ConstPtr, pszdefault: Pcwstr): Pcwstr =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) ConstPtr((windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringWithDefault(propvarin.rawAddress.toString(), pszdefault.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16(propvarin: ConstPtr, puiret: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16(propvarin.rawAddress.toString(), puiret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16WithDefault(propvarin: ConstPtr, uidefault: UShort): UShort =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16WithDefault(propvarin.rawAddress.toString(), uidefault.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32(propvarin: ConstPtr, pulret: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32(propvarin.rawAddress.toString(), pulret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32WithDefault(propvarin: ConstPtr, uldefault: UInt): UInt =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32WithDefault(propvarin.rawAddress.toString(), uldefault.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64(propvarin: ConstPtr, pullret: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64(propvarin.rawAddress.toString(), pullret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64Vector(propvar: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64VectorAlloc(propvar: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64WithDefault(propvarin: ConstPtr, ulldefault: ULong): ULong =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64WithDefault(propvarin.rawAddress.toString(), ulldefault.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToVariant(ppropvar: ConstPtr, pvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToVariant(ppropvar.rawAddress.toString(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToWinRTPropertyValue(propvar: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToWinRTPropertyValue(propvar.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readClassStg(pstg: MutPtr, pclsid: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageReadClassStg(pstg.rawAddress.toString(), pclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readClassStm(pstm: MutPtr, pclsid: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageReadClassStm(pstm.rawAddress.toString(), pclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readFmtUserTypeStg(pstg: MutPtr, pcf: MutPtr, lplpszusertype: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageReadFmtUserTypeStg(pstg.rawAddress.toString(), pcf.rawAddress.toString(), lplpszusertype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConvertStg(pstg: MutPtr, fconvert: Bool): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageSetConvertStg(pstg.rawAddress.toString(), fconvert) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgConvertPropertyToVariant(pprop: ConstPtr, codepage: UShort, pvar: MutPtr, pma: MutPtr): Boolean =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgConvertPropertyToVariant(pprop.rawAddress.toString(), codepage.toInt(), pvar.rawAddress.toString(), pma.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgConvertVariantToProperty(pvar: ConstPtr, codepage: UShort, pprop: MutPtr, pcb: MutPtr, pid: UInt, freserved: Boolean, pcindirect: MutPtr): MutPtr =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) MutPtr((windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgConvertVariantToProperty(pvar.rawAddress.toString(), codepage.toInt(), pprop.rawAddress.toString(), pcb.rawAddress.toString(), pid.toInt(), freserved, pcindirect.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreateDocfile(pwcsname: Pcwstr, grfmode: Stgm, reserved: UInt, ppstgopen: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfile(pwcsname.rawAddress.toString(), grfmode.toInt(), reserved.toInt(), ppstgopen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreateDocfileOnILockBytes(plkbyt: MutPtr, grfmode: Stgm, reserved: UInt, ppstgopen: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfileOnILockBytes(plkbyt.rawAddress.toString(), grfmode.toInt(), reserved.toInt(), ppstgopen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreatePropSetStg(pstorage: MutPtr, dwreserved: UInt, pppropsetstg: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgCreatePropSetStg(pstorage.rawAddress.toString(), dwreserved.toInt(), pppropsetstg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreatePropStg(punk: MutPtr, fmtid: ConstPtr, pclsid: ConstPtr, grfflags: UInt, dwreserved: UInt, pppropstg: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgCreatePropStg(punk.rawAddress.toString(), fmtid.rawAddress.toString(), pclsid.rawAddress.toString(), grfflags.toInt(), dwreserved.toInt(), pppropstg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreateStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: MutPtr, psecuritydescriptor: PsecurityDescriptor, riid: ConstPtr, ppobjectopen: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgCreateStorageEx(pwcsname.rawAddress.toString(), grfmode.toInt(), stgfmt.toInt(), grfattrs.toInt(), pstgoptions.rawAddress.toString(), psecuritydescriptor.rawAddress.toString(), riid.rawAddress.toString(), ppobjectopen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgDeserializePropVariant(pprop: ConstPtr, cbmax: UInt, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgDeserializePropVariant(pprop.rawAddress.toString(), cbmax.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgGetIFillLockBytesOnFile(pwcsname: Pcwstr, ppflb: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnFile(pwcsname.rawAddress.toString(), ppflb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgGetIFillLockBytesOnILockBytes(pilb: MutPtr, ppflb: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnILockBytes(pilb.rawAddress.toString(), ppflb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgIsStorageFile(pwcsname: Pcwstr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgIsStorageFile(pwcsname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgIsStorageILockBytes(plkbyt: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgIsStorageILockBytes(plkbyt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenAsyncDocfileOnIFillLockBytes(pflb: MutPtr, grfmode: UInt, asyncflags: UInt, ppstgopen: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgOpenAsyncDocfileOnIFillLockBytes(pflb.rawAddress.toString(), grfmode.toInt(), asyncflags.toInt(), ppstgopen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenLayoutDocfile(pwcsdfname: Pcwstr, grfmode: UInt, reserved: UInt, ppstgopen: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgOpenLayoutDocfile(pwcsdfname.rawAddress.toString(), grfmode.toInt(), reserved.toInt(), ppstgopen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenPropStg(punk: MutPtr, fmtid: ConstPtr, grfflags: UInt, dwreserved: UInt, pppropstg: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgOpenPropStg(punk.rawAddress.toString(), fmtid.rawAddress.toString(), grfflags.toInt(), dwreserved.toInt(), pppropstg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenStorage(pwcsname: Pcwstr, pstgpriority: MutPtr, grfmode: Stgm, snbexclude: ConstPtr, reserved: UInt, ppstgopen: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgOpenStorage(pwcsname.rawAddress.toString(), pstgpriority.rawAddress.toString(), grfmode.toInt(), snbexclude.rawAddress.toString(), reserved.toInt(), ppstgopen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: MutPtr, psecuritydescriptor: PsecurityDescriptor, riid: ConstPtr, ppobjectopen: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageEx(pwcsname.rawAddress.toString(), grfmode.toInt(), stgfmt.toInt(), grfattrs.toInt(), pstgoptions.rawAddress.toString(), psecuritydescriptor.rawAddress.toString(), riid.rawAddress.toString(), ppobjectopen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenStorageOnILockBytes(plkbyt: MutPtr, pstgpriority: MutPtr, grfmode: Stgm, snbexclude: ConstPtr, reserved: UInt, ppstgopen: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageOnILockBytes(plkbyt.rawAddress.toString(), pstgpriority.rawAddress.toString(), grfmode.toInt(), snbexclude.rawAddress.toString(), reserved.toInt(), ppstgopen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgPropertyLengthAsVariant(pprop: ConstPtr, cbprop: UInt, codepage: UShort, breserved: UByte): UInt =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgPropertyLengthAsVariant(pprop.rawAddress.toString(), cbprop.toInt(), codepage.toInt(), breserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgSerializePropVariant(ppropvar: ConstPtr, ppprop: MutPtr, pcb: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgSerializePropVariant(ppropvar.rawAddress.toString(), ppprop.rawAddress.toString(), pcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgSetTimes(lpszname: Pcwstr, pctime: ConstPtr, patime: ConstPtr, pmtime: ConstPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgSetTimes(lpszname.rawAddress.toString(), pctime.rawAddress.toString(), patime.rawAddress.toString(), pmtime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToPropVariant(pvar: ConstPtr, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageVariantToPropVariant(pvar.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winRTPropertyValueToPropVariant(punkpropertyvalue: MutPtr, ppropvar: MutPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageWinRTPropertyValueToPropVariant(punkpropertyvalue.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeClassStg(pstg: MutPtr, rclsid: ConstPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageWriteClassStg(pstg.rawAddress.toString(), rclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeClassStm(pstm: MutPtr, rclsid: ConstPtr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageWriteClassStm(pstm.rawAddress.toString(), rclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeFmtUserTypeStg(pstg: MutPtr, cf: UShort, lpszusertype: Pcwstr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageWriteFmtUserTypeStg(pstg.rawAddress.toString(), cf.toInt(), lpszusertype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
