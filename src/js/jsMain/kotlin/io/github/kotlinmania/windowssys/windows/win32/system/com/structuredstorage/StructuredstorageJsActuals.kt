@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.com.Clsctx
import io.github.kotlinmania.windowssys.windows.win32.system.com.Coserverinfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.Dvtargetdevice
import io.github.kotlinmania.windowssys.windows.win32.system.com.MultiQi
import io.github.kotlinmania.windowssys.windows.win32.system.com.Stgm
import io.github.kotlinmania.windowssys.windows.win32.system.com.Stgmedium
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant

private val windowsWin32SystemComStructuredstorageNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun clearPropVariantArray(rgpropvar: MutPtr<Propvariant>, cvars: UInt) {
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) {
        windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageClearPropVariantArray(rgpropvar.rawAddress.toString(), cvars.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coGetInstanceFromFile(pserverinfo: ConstPtr<Coserverinfo>, pclsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, dwclsctx: Clsctx, grfmode: UInt, pwszname: Pcwstr, dwcount: UInt, presults: MutPtr<MultiQi>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromFile(pserverinfo.rawAddress.toString(), pclsid.rawAddress.toString(), punkouter.rawAddress.toString(), dwclsctx.toInt(), grfmode.toInt(), pwszname.rawAddress.toString(), dwcount.toInt(), presults.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetInstanceFromIStorage(pserverinfo: ConstPtr<Coserverinfo>, pclsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, dwclsctx: Clsctx, pstg: MutPtr<CVoid>, dwcount: UInt, presults: MutPtr<MultiQi>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageCoGetInstanceFromIStorage(pserverinfo.rawAddress.toString(), pclsid.rawAddress.toString(), punkouter.rawAddress.toString(), dwclsctx.toInt(), pstg.rawAddress.toString(), dwcount.toInt(), presults.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetInterfaceAndReleaseStream(pstm: MutPtr<CVoid>, iid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageCoGetInterfaceAndReleaseStream(pstm.rawAddress.toString(), iid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createILockBytesOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, pplkbyt: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageCreateILockBytesOnHGlobal(hglobal.rawAddress.toString(), fdeleteonrelease, pplkbyt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStreamOnHGlobal(hglobal: Hglobal, fdeleteonrelease: Bool, ppstm: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageCreateStreamOnHGlobal(hglobal.rawAddress.toString(), fdeleteonrelease, ppstm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fmtIdToPropStgName(pfmtid: ConstPtr<Guid>, oszname: Pwstr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageFmtIdToPropStgName(pfmtid.rawAddress.toString(), oszname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freePropVariantArray(cvariants: UInt, rgvars: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageFreePropVariantArray(cvariants.toInt(), rgvars.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getConvertStg(pstg: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageGetConvertStg(pstg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHGlobalFromILockBytes(plkbyt: MutPtr<CVoid>, phglobal: MutPtr<Hglobal>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromILockBytes(plkbyt.rawAddress.toString(), phglobal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHGlobalFromStream(pstm: MutPtr<CVoid>, phglobal: MutPtr<Hglobal>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageGetHGlobalFromStream(pstm.rawAddress.toString(), phglobal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromBooleanVector(prgf: ConstPtr<Bool>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBooleanVector(prgf.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromBuffer(pv: ConstPtr<CVoid>, cb: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromBuffer(pv.rawAddress.toString(), cb.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromCLSID(clsid: ConstPtr<Guid>, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromCLSID(clsid.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromDoubleVector(prgn: ConstPtr<Double>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromDoubleVector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromFileTime(pftin: ConstPtr<Filetime>, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTime(pftin.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromFileTimeVector(prgft: ConstPtr<Filetime>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromFileTimeVector(prgft.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromGUIDAsString(guid: ConstPtr<Guid>, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromGUIDAsString(guid.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromInt16Vector(prgn: ConstPtr<Short>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt16Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromInt32Vector(prgn: ConstPtr<Int>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt32Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromInt64Vector(prgn: ConstPtr<Long>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromInt64Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromPropVariantVectorElem(propvarin: ConstPtr<Propvariant>, ielem: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromPropVariantVectorElem(propvarin.rawAddress.toString(), ielem.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromResource(hinst: Hinstance, id: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromResource(hinst.rawAddress.toString(), id.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromStringAsVector(psz: Pcwstr, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringAsVector(psz.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromStringVector(prgsz: ConstPtr<Pcwstr>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromStringVector(prgsz.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromUInt16Vector(prgn: ConstPtr<UShort>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt16Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromUInt32Vector(prgn: ConstPtr<UInt>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt32Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromUInt64Vector(prgn: ConstPtr<ULong>, celems: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantFromUInt64Vector(prgn.rawAddress.toString(), celems.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantVectorFromPropVariant(propvarsingle: ConstPtr<Propvariant>, ppropvarvector: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageInitPropVariantVectorFromPropVariant(propvarsingle.rawAddress.toString(), ppropvarvector.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertIStorageToOLESTREAM(pstg: MutPtr<CVoid>, lpolestream: MutPtr<Olestream>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAM(pstg.rawAddress.toString(), lpolestream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertIStorageToOLESTREAMEx(pstg: MutPtr<CVoid>, cfformat: UShort, lwidth: Int, lheight: Int, dwsize: UInt, pmedium: ConstPtr<Stgmedium>, polestm: MutPtr<Olestream>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageOleConvertIStorageToOLESTREAMEx(pstg.rawAddress.toString(), cfformat.toInt(), lwidth, lheight, dwsize.toInt(), pmedium.rawAddress.toString(), polestm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertOLESTREAMToIStorage(lpolestream: ConstPtr<Olestream>, pstg: MutPtr<CVoid>, ptd: ConstPtr<Dvtargetdevice>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorage(lpolestream.rawAddress.toString(), pstg.rawAddress.toString(), ptd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleConvertOLESTREAMToIStorageEx(polestm: ConstPtr<Olestream>, pstg: MutPtr<CVoid>, pcfformat: MutPtr<UShort>, plwwidth: MutPtr<Int>, plheight: MutPtr<Int>, pdwsize: MutPtr<UInt>, pmedium: MutPtr<Stgmedium>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageOleConvertOLESTREAMToIStorageEx(polestm.rawAddress.toString(), pstg.rawAddress.toString(), pcfformat.rawAddress.toString(), plwwidth.rawAddress.toString(), plheight.rawAddress.toString(), pdwsize.rawAddress.toString(), pmedium.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propStgNameToFmtId(oszname: Pcwstr, pfmtid: MutPtr<Guid>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropStgNameToFmtId(oszname.rawAddress.toString(), pfmtid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantChangeType(ppropvardest: MutPtr<Propvariant>, propvarsrc: ConstPtr<Propvariant>, flags: PropvarChangeFlags, vt: Variant.Varenum): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantChangeType(ppropvardest.rawAddress.toString(), propvarsrc.rawAddress.toString(), flags, vt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantClear(pvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantClear(pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantCompareEx(propvar1: ConstPtr<Propvariant>, propvar2: ConstPtr<Propvariant>, unit: PropvarCompareUnit, flags: PropvarCompareFlags): Int =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantCompareEx(propvar1.rawAddress.toString(), propvar2.rawAddress.toString(), unit, flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantCopy(pvardest: MutPtr<Propvariant>, pvarsrc: ConstPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantCopy(pvardest.rawAddress.toString(), pvarsrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetBooleanElem(propvar: ConstPtr<Propvariant>, ielem: UInt, pfval: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetBooleanElem(propvar.rawAddress.toString(), ielem.toInt(), pfval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetDoubleElem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<Double>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetDoubleElem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetElementCount(propvar: ConstPtr<Propvariant>): UInt =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetElementCount(propvar.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetFileTimeElem(propvar: ConstPtr<Propvariant>, ielem: UInt, pftval: MutPtr<Filetime>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetFileTimeElem(propvar.rawAddress.toString(), ielem.toInt(), pftval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInt16Elem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<Short>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt16Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInt32Elem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<Int>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt32Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetInt64Elem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<Long>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetInt64Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetStringElem(propvar: ConstPtr<Propvariant>, ielem: UInt, ppszval: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetStringElem(propvar.rawAddress.toString(), ielem.toInt(), ppszval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetUInt16Elem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<UShort>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt16Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetUInt32Elem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt32Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantGetUInt64Elem(propvar: ConstPtr<Propvariant>, ielem: UInt, pnval: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantGetUInt64Elem(propvar.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBSTR(propvar: ConstPtr<Propvariant>, pbstrout: MutPtr<Bstr>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBSTR(propvar.rawAddress.toString(), pbstrout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBoolean(propvarin: ConstPtr<Propvariant>, pfret: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBoolean(propvarin.rawAddress.toString(), pfret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBooleanVector(propvar: ConstPtr<Propvariant>, prgf: MutPtr<Bool>, crgf: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVector(propvar.rawAddress.toString(), prgf.rawAddress.toString(), crgf.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBooleanVectorAlloc(propvar: ConstPtr<Propvariant>, pprgf: MutPtr<MutPtr<Bool>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanVectorAlloc(propvar.rawAddress.toString(), pprgf.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBooleanWithDefault(propvarin: ConstPtr<Propvariant>, fdefault: Bool): Bool =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBooleanWithDefault(propvarin.rawAddress.toString(), fdefault) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToBuffer(propvar: ConstPtr<Propvariant>, pv: MutPtr<CVoid>, cb: UInt): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToBuffer(propvar.rawAddress.toString(), pv.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDouble(propvarin: ConstPtr<Propvariant>, pdblret: MutPtr<Double>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDouble(propvarin.rawAddress.toString(), pdblret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDoubleVector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<Double>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDoubleVectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<Double>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleVectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToDoubleWithDefault(propvarin: ConstPtr<Propvariant>, dbldefault: Double): Double =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToDoubleWithDefault(propvarin.rawAddress.toString(), dbldefault) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToFileTime(propvar: ConstPtr<Propvariant>, pstfout: Variant.PstimeFlags, pftout: MutPtr<Filetime>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTime(propvar.rawAddress.toString(), pstfout, pftout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToFileTimeVector(propvar: ConstPtr<Propvariant>, prgft: MutPtr<Filetime>, crgft: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVector(propvar.rawAddress.toString(), prgft.rawAddress.toString(), crgft.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToFileTimeVectorAlloc(propvar: ConstPtr<Propvariant>, pprgft: MutPtr<MutPtr<Filetime>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToFileTimeVectorAlloc(propvar.rawAddress.toString(), pprgft.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToGUID(propvar: ConstPtr<Propvariant>, pguid: MutPtr<Guid>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToGUID(propvar.rawAddress.toString(), pguid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16(propvarin: ConstPtr<Propvariant>, piret: MutPtr<Short>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16(propvarin.rawAddress.toString(), piret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16Vector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<Short>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16VectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<Short>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt16WithDefault(propvarin: ConstPtr<Propvariant>, idefault: Short): Short =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt16WithDefault(propvarin.rawAddress.toString(), idefault.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32(propvarin: ConstPtr<Propvariant>, plret: MutPtr<Int>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32(propvarin.rawAddress.toString(), plret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32Vector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<Int>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32VectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<Int>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt32WithDefault(propvarin: ConstPtr<Propvariant>, ldefault: Int): Int =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt32WithDefault(propvarin.rawAddress.toString(), ldefault) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64(propvarin: ConstPtr<Propvariant>, pllret: MutPtr<Long>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64(propvarin.rawAddress.toString(), pllret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64Vector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<Long>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64VectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<Long>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToInt64WithDefault(propvarin: ConstPtr<Propvariant>, lldefault: Long): Long =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToInt64WithDefault(propvarin.rawAddress.toString(), lldefault.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToString(propvar: ConstPtr<Propvariant>, psz: Pwstr, cch: UInt): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToString(propvar.rawAddress.toString(), psz.rawAddress.toString(), cch.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringAlloc(propvar: ConstPtr<Propvariant>, ppszout: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringAlloc(propvar.rawAddress.toString(), ppszout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringVector(propvar: ConstPtr<Propvariant>, prgsz: MutPtr<Pwstr>, crgsz: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVector(propvar.rawAddress.toString(), prgsz.rawAddress.toString(), crgsz.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringVectorAlloc(propvar: ConstPtr<Propvariant>, pprgsz: MutPtr<MutPtr<Pwstr>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringVectorAlloc(propvar.rawAddress.toString(), pprgsz.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStringWithDefault(propvarin: ConstPtr<Propvariant>, pszdefault: Pcwstr): Pcwstr =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) ConstPtr((windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToStringWithDefault(propvarin.rawAddress.toString(), pszdefault.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16(propvarin: ConstPtr<Propvariant>, puiret: MutPtr<UShort>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16(propvarin.rawAddress.toString(), puiret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16Vector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<UShort>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16VectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<UShort>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt16WithDefault(propvarin: ConstPtr<Propvariant>, uidefault: UShort): UShort =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt16WithDefault(propvarin.rawAddress.toString(), uidefault.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32(propvarin: ConstPtr<Propvariant>, pulret: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32(propvarin.rawAddress.toString(), pulret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32Vector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<UInt>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32VectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<UInt>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt32WithDefault(propvarin: ConstPtr<Propvariant>, uldefault: UInt): UInt =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt32WithDefault(propvarin.rawAddress.toString(), uldefault.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64(propvarin: ConstPtr<Propvariant>, pullret: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64(propvarin.rawAddress.toString(), pullret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64Vector(propvar: ConstPtr<Propvariant>, prgn: MutPtr<ULong>, crgn: UInt, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64Vector(propvar.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64VectorAlloc(propvar: ConstPtr<Propvariant>, pprgn: MutPtr<MutPtr<ULong>>, pcelem: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64VectorAlloc(propvar.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToUInt64WithDefault(propvarin: ConstPtr<Propvariant>, ulldefault: ULong): ULong =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToUInt64WithDefault(propvarin.rawAddress.toString(), ulldefault.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToVariant(ppropvar: ConstPtr<Propvariant>, pvar: MutPtr<Variant.Variant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToVariant(ppropvar.rawAddress.toString(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToWinRTPropertyValue(propvar: ConstPtr<Propvariant>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstoragePropVariantToWinRTPropertyValue(propvar.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readClassStg(pstg: MutPtr<CVoid>, pclsid: MutPtr<Guid>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageReadClassStg(pstg.rawAddress.toString(), pclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readClassStm(pstm: MutPtr<CVoid>, pclsid: MutPtr<Guid>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageReadClassStm(pstm.rawAddress.toString(), pclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readFmtUserTypeStg(pstg: MutPtr<CVoid>, pcf: MutPtr<UShort>, lplpszusertype: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageReadFmtUserTypeStg(pstg.rawAddress.toString(), pcf.rawAddress.toString(), lplpszusertype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setConvertStg(pstg: MutPtr<CVoid>, fconvert: Bool): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageSetConvertStg(pstg.rawAddress.toString(), fconvert) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgConvertPropertyToVariant(pprop: ConstPtr<Serializedpropertyvalue>, codepage: UShort, pvar: MutPtr<Propvariant>, pma: MutPtr<CVoid>): Boolean =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgConvertPropertyToVariant(pprop.rawAddress.toString(), codepage.toInt(), pvar.rawAddress.toString(), pma.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgConvertVariantToProperty(pvar: ConstPtr<Propvariant>, codepage: UShort, pprop: MutPtr<Serializedpropertyvalue>, pcb: MutPtr<UInt>, pid: UInt, freserved: Boolean, pcindirect: MutPtr<UInt>): MutPtr<Serializedpropertyvalue> =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) MutPtr((windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgConvertVariantToProperty(pvar.rawAddress.toString(), codepage.toInt(), pprop.rawAddress.toString(), pcb.rawAddress.toString(), pid.toInt(), freserved, pcindirect.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreateDocfile(pwcsname: Pcwstr, grfmode: Stgm, reserved: UInt, ppstgopen: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfile(pwcsname.rawAddress.toString(), grfmode.toInt(), reserved.toInt(), ppstgopen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreateDocfileOnILockBytes(plkbyt: MutPtr<CVoid>, grfmode: Stgm, reserved: UInt, ppstgopen: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgCreateDocfileOnILockBytes(plkbyt.rawAddress.toString(), grfmode.toInt(), reserved.toInt(), ppstgopen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreatePropSetStg(pstorage: MutPtr<CVoid>, dwreserved: UInt, pppropsetstg: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgCreatePropSetStg(pstorage.rawAddress.toString(), dwreserved.toInt(), pppropsetstg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreatePropStg(punk: MutPtr<CVoid>, fmtid: ConstPtr<Guid>, pclsid: ConstPtr<Guid>, grfflags: UInt, dwreserved: UInt, pppropstg: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgCreatePropStg(punk.rawAddress.toString(), fmtid.rawAddress.toString(), pclsid.rawAddress.toString(), grfflags.toInt(), dwreserved.toInt(), pppropstg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgCreateStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: MutPtr<Stgoptions>, psecuritydescriptor: PsecurityDescriptor, riid: ConstPtr<Guid>, ppobjectopen: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgCreateStorageEx(pwcsname.rawAddress.toString(), grfmode.toInt(), stgfmt.toInt(), grfattrs.toInt(), pstgoptions.rawAddress.toString(), psecuritydescriptor.rawAddress.toString(), riid.rawAddress.toString(), ppobjectopen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgDeserializePropVariant(pprop: ConstPtr<Serializedpropertyvalue>, cbmax: UInt, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgDeserializePropVariant(pprop.rawAddress.toString(), cbmax.toInt(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgGetIFillLockBytesOnFile(pwcsname: Pcwstr, ppflb: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnFile(pwcsname.rawAddress.toString(), ppflb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgGetIFillLockBytesOnILockBytes(pilb: MutPtr<CVoid>, ppflb: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgGetIFillLockBytesOnILockBytes(pilb.rawAddress.toString(), ppflb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgIsStorageFile(pwcsname: Pcwstr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgIsStorageFile(pwcsname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgIsStorageILockBytes(plkbyt: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgIsStorageILockBytes(plkbyt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenAsyncDocfileOnIFillLockBytes(pflb: MutPtr<CVoid>, grfmode: UInt, asyncflags: UInt, ppstgopen: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgOpenAsyncDocfileOnIFillLockBytes(pflb.rawAddress.toString(), grfmode.toInt(), asyncflags.toInt(), ppstgopen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenLayoutDocfile(pwcsdfname: Pcwstr, grfmode: UInt, reserved: UInt, ppstgopen: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgOpenLayoutDocfile(pwcsdfname.rawAddress.toString(), grfmode.toInt(), reserved.toInt(), ppstgopen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenPropStg(punk: MutPtr<CVoid>, fmtid: ConstPtr<Guid>, grfflags: UInt, dwreserved: UInt, pppropstg: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgOpenPropStg(punk.rawAddress.toString(), fmtid.rawAddress.toString(), grfflags.toInt(), dwreserved.toInt(), pppropstg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenStorage(pwcsname: Pcwstr, pstgpriority: MutPtr<CVoid>, grfmode: Stgm, snbexclude: ConstPtr<ConstPtr<UShort>>, reserved: UInt, ppstgopen: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgOpenStorage(pwcsname.rawAddress.toString(), pstgpriority.rawAddress.toString(), grfmode.toInt(), snbexclude.rawAddress.toString(), reserved.toInt(), ppstgopen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenStorageEx(pwcsname: Pcwstr, grfmode: Stgm, stgfmt: Stgfmt, grfattrs: UInt, pstgoptions: MutPtr<Stgoptions>, psecuritydescriptor: PsecurityDescriptor, riid: ConstPtr<Guid>, ppobjectopen: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageEx(pwcsname.rawAddress.toString(), grfmode.toInt(), stgfmt.toInt(), grfattrs.toInt(), pstgoptions.rawAddress.toString(), psecuritydescriptor.rawAddress.toString(), riid.rawAddress.toString(), ppobjectopen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgOpenStorageOnILockBytes(plkbyt: MutPtr<CVoid>, pstgpriority: MutPtr<CVoid>, grfmode: Stgm, snbexclude: ConstPtr<ConstPtr<UShort>>, reserved: UInt, ppstgopen: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgOpenStorageOnILockBytes(plkbyt.rawAddress.toString(), pstgpriority.rawAddress.toString(), grfmode.toInt(), snbexclude.rawAddress.toString(), reserved.toInt(), ppstgopen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgPropertyLengthAsVariant(pprop: ConstPtr<Serializedpropertyvalue>, cbprop: UInt, codepage: UShort, breserved: UByte): UInt =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgPropertyLengthAsVariant(pprop.rawAddress.toString(), cbprop.toInt(), codepage.toInt(), breserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgSerializePropVariant(ppropvar: ConstPtr<Propvariant>, ppprop: MutPtr<MutPtr<Serializedpropertyvalue>>, pcb: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgSerializePropVariant(ppropvar.rawAddress.toString(), ppprop.rawAddress.toString(), pcb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgSetTimes(lpszname: Pcwstr, pctime: ConstPtr<Filetime>, patime: ConstPtr<Filetime>, pmtime: ConstPtr<Filetime>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageStgSetTimes(lpszname.rawAddress.toString(), pctime.rawAddress.toString(), patime.rawAddress.toString(), pmtime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToPropVariant(pvar: ConstPtr<Variant.Variant>, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageVariantToPropVariant(pvar.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winRTPropertyValueToPropVariant(punkpropertyvalue: MutPtr<CVoid>, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageWinRTPropertyValueToPropVariant(punkpropertyvalue.rawAddress.toString(), ppropvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeClassStg(pstg: MutPtr<CVoid>, rclsid: ConstPtr<Guid>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageWriteClassStg(pstg.rawAddress.toString(), rclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeClassStm(pstm: MutPtr<CVoid>, rclsid: ConstPtr<Guid>): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageWriteClassStm(pstm.rawAddress.toString(), rclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeFmtUserTypeStg(pstg: MutPtr<CVoid>, cf: UShort, lpszusertype: Pcwstr): Hresult =
    if (windowsWin32SystemComStructuredstorageNapiAddon != null) (windowsWin32SystemComStructuredstorageNapiAddon.windowssysWindowsWin32SystemComStructuredstorageWriteFmtUserTypeStg(pstg.rawAddress.toString(), cf.toInt(), lpszusertype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
