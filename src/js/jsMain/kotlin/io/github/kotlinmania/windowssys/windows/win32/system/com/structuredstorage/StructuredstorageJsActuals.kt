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

private val _windowsWin32SystemComStructuredstorageNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun clearPropVariantArray(rgpropvar: COpaquePointer?, cvars: UInt) {
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) {
        _windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_clearPropVariantArray((rgpropvar?.value ?: 0L).toString(), cvars.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coGetInstanceFromFile(pserverinfo: COpaquePointer?, pclsid: COpaquePointer?, punkouter: COpaquePointer?, dwclsctx: Clsctx, grfmode: UInt, pwszname: Pcwstr, dwcount: UInt, presults: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_coGetInstanceFromFile((pserverinfo?.value ?: 0L).toString(), (pclsid?.value ?: 0L).toString(), (punkouter?.value ?: 0L).toString(), dwclsctx.toInt(), grfmode.toInt(), (pwszname?.value ?: 0L).toString(), dwcount.toInt(), (presults?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetInstanceFromIStorage(pserverinfo: COpaquePointer?, pclsid: COpaquePointer?, punkouter: COpaquePointer?, dwclsctx: Clsctx, pstg: COpaquePointer?, dwcount: UInt, presults: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_coGetInstanceFromIStorage((pserverinfo?.value ?: 0L).toString(), (pclsid?.value ?: 0L).toString(), (punkouter?.value ?: 0L).toString(), dwclsctx.toInt(), (pstg?.value ?: 0L).toString(), dwcount.toInt(), (presults?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetInterfaceAndReleaseStream(pstm: COpaquePointer?, iid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_coGetInterfaceAndReleaseStream((pstm?.value ?: 0L).toString(), (iid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createILockBytesOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, pplkbyt: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_createILockBytesOnHGlobal((hglobal?.value ?: 0L).toString(), fdeleteonrelease, (pplkbyt?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStreamOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, ppstm: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_createStreamOnHGlobal((hglobal?.value ?: 0L).toString(), fdeleteonrelease, (ppstm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fmtIdToPropStgName(pfmtid: COpaquePointer?, oszname: Pwstr): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_fmtIdToPropStgName((pfmtid?.value ?: 0L).toString(), (oszname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freePropVariantArray(cvariants: UInt, rgvars: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_freePropVariantArray(cvariants.toInt(), (rgvars?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConvertStg(pstg: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_getConvertStg((pstg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHGlobalFromILockBytes(plkbyt: COpaquePointer?, phglobal: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_getHGlobalFromILockBytes((plkbyt?.value ?: 0L).toString(), (phglobal?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHGlobalFromStream(pstm: COpaquePointer?, phglobal: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_getHGlobalFromStream((pstm?.value ?: 0L).toString(), (phglobal?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromBooleanVector(prgf: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromBooleanVector((prgf?.value ?: 0L).toString(), celems.toInt(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromBuffer(pv: COpaquePointer?, cb: UInt, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromBuffer((pv?.value ?: 0L).toString(), cb.toInt(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromCLSID(clsid: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromCLSID((clsid?.value ?: 0L).toString(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromDoubleVector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromDoubleVector((prgn?.value ?: 0L).toString(), celems.toInt(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromFileTime(pftin: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromFileTime((pftin?.value ?: 0L).toString(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromFileTimeVector(prgft: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromFileTimeVector((prgft?.value ?: 0L).toString(), celems.toInt(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromGUIDAsString(guid: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromGUIDAsString((guid?.value ?: 0L).toString(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromInt16Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromInt16Vector((prgn?.value ?: 0L).toString(), celems.toInt(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromInt32Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromInt32Vector((prgn?.value ?: 0L).toString(), celems.toInt(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromInt64Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromInt64Vector((prgn?.value ?: 0L).toString(), celems.toInt(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromPropVariantVectorElem(propvarin: COpaquePointer?, ielem: UInt, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromPropVariantVectorElem((propvarin?.value ?: 0L).toString(), ielem.toInt(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromResource(hinst: Hinstance, id: UInt, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromResource((hinst?.value ?: 0L).toString(), id.toInt(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromStringAsVector(psz: Pcwstr, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromStringAsVector((psz?.value ?: 0L).toString(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromStringVector(prgsz: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromStringVector((prgsz?.value ?: 0L).toString(), celems.toInt(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromUInt16Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromUInt16Vector((prgn?.value ?: 0L).toString(), celems.toInt(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromUInt32Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromUInt32Vector((prgn?.value ?: 0L).toString(), celems.toInt(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromUInt64Vector(prgn: COpaquePointer?, celems: UInt, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_initPropVariantFromUInt64Vector((prgn?.value ?: 0L).toString(), celems.toInt(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantVectorFromPropVariant(propvarsingle: COpaquePointer?, ppropvarvector: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_initPropVariantVectorFromPropVariant((propvarsingle?.value ?: 0L).toString(), (ppropvarvector?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertIStorageToOLESTREAM(pstg: COpaquePointer?, lpolestream: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_oleConvertIStorageToOLESTREAM((pstg?.value ?: 0L).toString(), (lpolestream?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertIStorageToOLESTREAMEx(pstg: COpaquePointer?, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: COpaquePointer?, polestm: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_oleConvertIStorageToOLESTREAMEx((pstg?.value ?: 0L).toString(), cfformat.toInt(), lwidth, lheight, dwsize.toInt(), (pmedium?.value ?: 0L).toString(), (polestm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertOLESTREAMToIStorage(lpolestream: COpaquePointer?, pstg: COpaquePointer?, ptd: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_oleConvertOLESTREAMToIStorage((lpolestream?.value ?: 0L).toString(), (pstg?.value ?: 0L).toString(), (ptd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertOLESTREAMToIStorageEx(polestm: COpaquePointer?, pstg: COpaquePointer?, pcfformat: COpaquePointer?, plwwidth: COpaquePointer?, plheight: COpaquePointer?, pdwsize: COpaquePointer?, pmedium: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_oleConvertOLESTREAMToIStorageEx((polestm?.value ?: 0L).toString(), (pstg?.value ?: 0L).toString(), (pcfformat?.value ?: 0L).toString(), (plwwidth?.value ?: 0L).toString(), (plheight?.value ?: 0L).toString(), (pdwsize?.value ?: 0L).toString(), (pmedium?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propStgNameToFmtId(oszname: Pcwstr, pfmtid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propStgNameToFmtId((oszname?.value ?: 0L).toString(), (pfmtid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantChangeType(ppropvardest: COpaquePointer?, propvarsrc: COpaquePointer?, flags: PropvarChangeFlags, vt: Varenum): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantChangeType((ppropvardest?.value ?: 0L).toString(), (propvarsrc?.value ?: 0L).toString(), flags, vt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantClear(pvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantClear((pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantCompareEx(propvar1: COpaquePointer?, propvar2: COpaquePointer?, unit: PropvarCompareUnit, flags: PropvarCompareFlags): Int =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantCompareEx((propvar1?.value ?: 0L).toString(), (propvar2?.value ?: 0L).toString(), unit, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantCopy(pvardest: COpaquePointer?, pvarsrc: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantCopy((pvardest?.value ?: 0L).toString(), (pvarsrc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetBooleanElem(propvar: COpaquePointer?, ielem: UInt, pfval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantGetBooleanElem((propvar?.value ?: 0L).toString(), ielem.toInt(), (pfval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetDoubleElem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantGetDoubleElem((propvar?.value ?: 0L).toString(), ielem.toInt(), (pnval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetElementCount(propvar: COpaquePointer?): UInt =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantGetElementCount((propvar?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetFileTimeElem(propvar: COpaquePointer?, ielem: UInt, pftval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantGetFileTimeElem((propvar?.value ?: 0L).toString(), ielem.toInt(), (pftval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInt16Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantGetInt16Elem((propvar?.value ?: 0L).toString(), ielem.toInt(), (pnval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInt32Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantGetInt32Elem((propvar?.value ?: 0L).toString(), ielem.toInt(), (pnval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInt64Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantGetInt64Elem((propvar?.value ?: 0L).toString(), ielem.toInt(), (pnval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetStringElem(propvar: COpaquePointer?, ielem: UInt, ppszval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantGetStringElem((propvar?.value ?: 0L).toString(), ielem.toInt(), (ppszval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetUInt16Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantGetUInt16Elem((propvar?.value ?: 0L).toString(), ielem.toInt(), (pnval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetUInt32Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantGetUInt32Elem((propvar?.value ?: 0L).toString(), ielem.toInt(), (pnval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetUInt64Elem(propvar: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantGetUInt64Elem((propvar?.value ?: 0L).toString(), ielem.toInt(), (pnval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBSTR(propvar: COpaquePointer?, pbstrout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToBSTR((propvar?.value ?: 0L).toString(), (pbstrout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBoolean(propvarin: COpaquePointer?, pfret: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToBoolean((propvarin?.value ?: 0L).toString(), (pfret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBooleanVector(propvar: COpaquePointer?, prgf: COpaquePointer?, crgf: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToBooleanVector((propvar?.value ?: 0L).toString(), (prgf?.value ?: 0L).toString(), crgf.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBooleanVectorAlloc(propvar: COpaquePointer?, pprgf: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToBooleanVectorAlloc((propvar?.value ?: 0L).toString(), (pprgf?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBooleanWithDefault(propvarin: COpaquePointer?, fdefault: Bool): Bool =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToBooleanWithDefault((propvarin?.value ?: 0L).toString(), fdefault) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBuffer(propvar: COpaquePointer?, pv: COpaquePointer?, cb: UInt): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToBuffer((propvar?.value ?: 0L).toString(), (pv?.value ?: 0L).toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDouble(propvarin: COpaquePointer?, pdblret: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToDouble((propvarin?.value ?: 0L).toString(), (pdblret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDoubleVector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToDoubleVector((propvar?.value ?: 0L).toString(), (prgn?.value ?: 0L).toString(), crgn.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDoubleVectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToDoubleVectorAlloc((propvar?.value ?: 0L).toString(), (pprgn?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDoubleWithDefault(propvarin: COpaquePointer?, dbldefault: Double): Double =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToDoubleWithDefault((propvarin?.value ?: 0L).toString(), dbldefault) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToFileTime(propvar: COpaquePointer?, pstfout: PstimeFlags, pftout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToFileTime((propvar?.value ?: 0L).toString(), pstfout, (pftout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToFileTimeVector(propvar: COpaquePointer?, prgft: COpaquePointer?, crgft: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToFileTimeVector((propvar?.value ?: 0L).toString(), (prgft?.value ?: 0L).toString(), crgft.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToFileTimeVectorAlloc(propvar: COpaquePointer?, pprgft: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToFileTimeVectorAlloc((propvar?.value ?: 0L).toString(), (pprgft?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToGUID(propvar: COpaquePointer?, pguid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToGUID((propvar?.value ?: 0L).toString(), (pguid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16(propvarin: COpaquePointer?, piret: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16((propvarin?.value ?: 0L).toString(), (piret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16Vector((propvar?.value ?: 0L).toString(), (prgn?.value ?: 0L).toString(), crgn.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16VectorAlloc((propvar?.value ?: 0L).toString(), (pprgn?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16WithDefault(propvarin: COpaquePointer?, idefault: Short): Short =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt16WithDefault((propvarin?.value ?: 0L).toString(), idefault.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32(propvarin: COpaquePointer?, plret: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32((propvarin?.value ?: 0L).toString(), (plret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32Vector((propvar?.value ?: 0L).toString(), (prgn?.value ?: 0L).toString(), crgn.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32VectorAlloc((propvar?.value ?: 0L).toString(), (pprgn?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32WithDefault(propvarin: COpaquePointer?, ldefault: Int): Int =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt32WithDefault((propvarin?.value ?: 0L).toString(), ldefault) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64(propvarin: COpaquePointer?, pllret: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64((propvarin?.value ?: 0L).toString(), (pllret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64Vector((propvar?.value ?: 0L).toString(), (prgn?.value ?: 0L).toString(), crgn.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64VectorAlloc((propvar?.value ?: 0L).toString(), (pprgn?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64WithDefault(propvarin: COpaquePointer?, lldefault: Long): Long =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToInt64WithDefault((propvarin?.value ?: 0L).toString(), lldefault.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToString(propvar: COpaquePointer?, psz: Pwstr, cch: UInt): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToString((propvar?.value ?: 0L).toString(), (psz?.value ?: 0L).toString(), cch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringAlloc(propvar: COpaquePointer?, ppszout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToStringAlloc((propvar?.value ?: 0L).toString(), (ppszout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringVector(propvar: COpaquePointer?, prgsz: COpaquePointer?, crgsz: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToStringVector((propvar?.value ?: 0L).toString(), (prgsz?.value ?: 0L).toString(), crgsz.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringVectorAlloc(propvar: COpaquePointer?, pprgsz: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToStringVectorAlloc((propvar?.value ?: 0L).toString(), (pprgsz?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringWithDefault(propvarin: COpaquePointer?, pszdefault: Pcwstr): Pcwstr =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToStringWithDefault((propvarin?.value ?: 0L).toString(), (pszdefault?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16(propvarin: COpaquePointer?, puiret: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16((propvarin?.value ?: 0L).toString(), (puiret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16Vector((propvar?.value ?: 0L).toString(), (prgn?.value ?: 0L).toString(), crgn.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16VectorAlloc((propvar?.value ?: 0L).toString(), (pprgn?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16WithDefault(propvarin: COpaquePointer?, uidefault: UShort): UShort =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt16WithDefault((propvarin?.value ?: 0L).toString(), uidefault.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32(propvarin: COpaquePointer?, pulret: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32((propvarin?.value ?: 0L).toString(), (pulret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32Vector((propvar?.value ?: 0L).toString(), (prgn?.value ?: 0L).toString(), crgn.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32VectorAlloc((propvar?.value ?: 0L).toString(), (pprgn?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32WithDefault(propvarin: COpaquePointer?, uldefault: UInt): UInt =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt32WithDefault((propvarin?.value ?: 0L).toString(), uldefault.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64(propvarin: COpaquePointer?, pullret: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64((propvarin?.value ?: 0L).toString(), (pullret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64Vector(propvar: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64Vector((propvar?.value ?: 0L).toString(), (prgn?.value ?: 0L).toString(), crgn.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64VectorAlloc(propvar: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64VectorAlloc((propvar?.value ?: 0L).toString(), (pprgn?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64WithDefault(propvarin: COpaquePointer?, ulldefault: ULong): ULong =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToUInt64WithDefault((propvarin?.value ?: 0L).toString(), ulldefault.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToVariant(ppropvar: COpaquePointer?, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToVariant((ppropvar?.value ?: 0L).toString(), (pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToWinRTPropertyValue(propvar: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_propVariantToWinRTPropertyValue((propvar?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readClassStg(pstg: COpaquePointer?, pclsid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_readClassStg((pstg?.value ?: 0L).toString(), (pclsid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readClassStm(pstm: COpaquePointer?, pclsid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_readClassStm((pstm?.value ?: 0L).toString(), (pclsid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readFmtUserTypeStg(pstg: COpaquePointer?, pcf: COpaquePointer?, lplpszusertype: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_readFmtUserTypeStg((pstg?.value ?: 0L).toString(), (pcf?.value ?: 0L).toString(), (lplpszusertype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConvertStg(pstg: COpaquePointer?, fconvert: Bool): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_setConvertStg((pstg?.value ?: 0L).toString(), fconvert) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgConvertPropertyToVariant(pprop: COpaquePointer?, codepage: UShort, pvar: COpaquePointer?, pma: COpaquePointer?): Boolean =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgConvertPropertyToVariant((pprop?.value ?: 0L).toString(), codepage.toInt(), (pvar?.value ?: 0L).toString(), (pma?.value ?: 0L).toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgConvertVariantToProperty(pvar: COpaquePointer?, codepage: UShort, pprop: COpaquePointer?, pcb: COpaquePointer?, pid: UInt, freserved: Boolean, pcindirect: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgConvertVariantToProperty((pvar?.value ?: 0L).toString(), codepage.toInt(), (pprop?.value ?: 0L).toString(), (pcb?.value ?: 0L).toString(), pid.toInt(), freserved, (pcindirect?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreateDocfile(pwcsname: Pcwstr, grfmode: Stgm, reserved: UInt, ppstgopen: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgCreateDocfile((pwcsname?.value ?: 0L).toString(), grfmode.toInt(), reserved.toInt(), (ppstgopen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreateDocfileOnILockBytes(plkbyt: COpaquePointer?, grfmode: Stgm, reserved: UInt, ppstgopen: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgCreateDocfileOnILockBytes((plkbyt?.value ?: 0L).toString(), grfmode.toInt(), reserved.toInt(), (ppstgopen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreatePropSetStg(pstorage: COpaquePointer?, dwreserved: UInt, pppropsetstg: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgCreatePropSetStg((pstorage?.value ?: 0L).toString(), dwreserved.toInt(), (pppropsetstg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreatePropStg(punk: COpaquePointer?, fmtid: COpaquePointer?, pclsid: COpaquePointer?, grfflags: UInt, dwreserved: UInt, pppropstg: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgCreatePropStg((punk?.value ?: 0L).toString(), (fmtid?.value ?: 0L).toString(), (pclsid?.value ?: 0L).toString(), grfflags.toInt(), dwreserved.toInt(), (pppropstg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreateStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: COpaquePointer?, psecuritydescriptor: PsecurityDescriptor, riid: COpaquePointer?, ppobjectopen: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgCreateStorageEx((pwcsname?.value ?: 0L).toString(), grfmode.toInt(), stgfmt.toInt(), grfattrs.toInt(), (pstgoptions?.value ?: 0L).toString(), (psecuritydescriptor?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppobjectopen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgDeserializePropVariant(pprop: COpaquePointer?, cbmax: UInt, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgDeserializePropVariant((pprop?.value ?: 0L).toString(), cbmax.toInt(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgGetIFillLockBytesOnFile(pwcsname: Pcwstr, ppflb: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgGetIFillLockBytesOnFile((pwcsname?.value ?: 0L).toString(), (ppflb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgGetIFillLockBytesOnILockBytes(pilb: COpaquePointer?, ppflb: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgGetIFillLockBytesOnILockBytes((pilb?.value ?: 0L).toString(), (ppflb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgIsStorageFile(pwcsname: Pcwstr): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgIsStorageFile((pwcsname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgIsStorageILockBytes(plkbyt: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgIsStorageILockBytes((plkbyt?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenAsyncDocfileOnIFillLockBytes(pflb: COpaquePointer?, grfmode: UInt, asyncflags: UInt, ppstgopen: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgOpenAsyncDocfileOnIFillLockBytes((pflb?.value ?: 0L).toString(), grfmode.toInt(), asyncflags.toInt(), (ppstgopen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenLayoutDocfile(pwcsdfname: Pcwstr, grfmode: UInt, reserved: UInt, ppstgopen: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgOpenLayoutDocfile((pwcsdfname?.value ?: 0L).toString(), grfmode.toInt(), reserved.toInt(), (ppstgopen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenPropStg(punk: COpaquePointer?, fmtid: COpaquePointer?, grfflags: UInt, dwreserved: UInt, pppropstg: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgOpenPropStg((punk?.value ?: 0L).toString(), (fmtid?.value ?: 0L).toString(), grfflags.toInt(), dwreserved.toInt(), (pppropstg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenStorage(pwcsname: Pcwstr, pstgpriority: COpaquePointer?, grfmode: Stgm, snbexclude: COpaquePointer?, reserved: UInt, ppstgopen: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgOpenStorage((pwcsname?.value ?: 0L).toString(), (pstgpriority?.value ?: 0L).toString(), grfmode.toInt(), (snbexclude?.value ?: 0L).toString(), reserved.toInt(), (ppstgopen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: COpaquePointer?, psecuritydescriptor: PsecurityDescriptor, riid: COpaquePointer?, ppobjectopen: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgOpenStorageEx((pwcsname?.value ?: 0L).toString(), grfmode.toInt(), stgfmt.toInt(), grfattrs.toInt(), (pstgoptions?.value ?: 0L).toString(), (psecuritydescriptor?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppobjectopen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenStorageOnILockBytes(plkbyt: COpaquePointer?, pstgpriority: COpaquePointer?, grfmode: Stgm, snbexclude: COpaquePointer?, reserved: UInt, ppstgopen: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgOpenStorageOnILockBytes((plkbyt?.value ?: 0L).toString(), (pstgpriority?.value ?: 0L).toString(), grfmode.toInt(), (snbexclude?.value ?: 0L).toString(), reserved.toInt(), (ppstgopen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgPropertyLengthAsVariant(pprop: COpaquePointer?, cbprop: UInt, codepage: UShort, breserved: UByte): UInt =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgPropertyLengthAsVariant((pprop?.value ?: 0L).toString(), cbprop.toInt(), codepage.toInt(), breserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgSerializePropVariant(ppropvar: COpaquePointer?, ppprop: COpaquePointer?, pcb: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgSerializePropVariant((ppropvar?.value ?: 0L).toString(), (ppprop?.value ?: 0L).toString(), (pcb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgSetTimes(lpszname: Pcwstr, pctime: COpaquePointer?, patime: COpaquePointer?, pmtime: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_stgSetTimes((lpszname?.value ?: 0L).toString(), (pctime?.value ?: 0L).toString(), (patime?.value ?: 0L).toString(), (pmtime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToPropVariant(pvar: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_variantToPropVariant((pvar?.value ?: 0L).toString(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winRTPropertyValueToPropVariant(punkpropertyvalue: COpaquePointer?, ppropvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_winRTPropertyValueToPropVariant((punkpropertyvalue?.value ?: 0L).toString(), (ppropvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeClassStg(pstg: COpaquePointer?, rclsid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_writeClassStg((pstg?.value ?: 0L).toString(), (rclsid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeClassStm(pstm: COpaquePointer?, rclsid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_writeClassStm((pstm?.value ?: 0L).toString(), (rclsid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeFmtUserTypeStg(pstg: COpaquePointer?, cf: UShort, lpszusertype: Pcwstr): Hresult =
    if (_windowsWin32SystemComStructuredstorageNapiAddon != null) (_windowsWin32SystemComStructuredstorageNapiAddon.windowssys_windows_win32_system_com_structuredstorage_writeFmtUserTypeStg((pstg?.value ?: 0L).toString(), cf.toInt(), (lpszusertype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
