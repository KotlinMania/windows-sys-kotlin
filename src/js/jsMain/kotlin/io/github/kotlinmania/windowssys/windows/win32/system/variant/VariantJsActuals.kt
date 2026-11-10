@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance

private val _windowsWin32SystemVariantNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun clearVariantArray(pvars: COpaquePointer?, cvars: UInt) {
    if (_windowsWin32SystemVariantNapiAddon != null) {
        _windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_clearVariantArray((pvars?.value ?: 0L).toString(), cvars.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dosDateTimeToVariantTime(wdosdate: UShort, wdostime: UShort, pvtime: COpaquePointer?): Int =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_dosDateTimeToVariantTime(wdosdate.toInt(), wdostime.toInt(), (pvtime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromBooleanArray(prgf: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_initVariantFromBooleanArray((prgf?.value ?: 0L).toString(), celems.toInt(), (pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromBuffer(pv: COpaquePointer?, cb: UInt, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_initVariantFromBuffer((pv?.value ?: 0L).toString(), cb.toInt(), (pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromDoubleArray(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_initVariantFromDoubleArray((prgn?.value ?: 0L).toString(), celems.toInt(), (pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromFileTime(pft: COpaquePointer?, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_initVariantFromFileTime((pft?.value ?: 0L).toString(), (pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromFileTimeArray(prgft: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_initVariantFromFileTimeArray((prgft?.value ?: 0L).toString(), celems.toInt(), (pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromGUIDAsString(guid: COpaquePointer?, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_initVariantFromGUIDAsString((guid?.value ?: 0L).toString(), (pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromInt16Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_initVariantFromInt16Array((prgn?.value ?: 0L).toString(), celems.toInt(), (pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromInt32Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_initVariantFromInt32Array((prgn?.value ?: 0L).toString(), celems.toInt(), (pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromInt64Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_initVariantFromInt64Array((prgn?.value ?: 0L).toString(), celems.toInt(), (pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromResource(hinst: Hinstance, id: UInt, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_initVariantFromResource((hinst?.value ?: 0L).toString(), id.toInt(), (pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromStringArray(prgsz: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_initVariantFromStringArray((prgsz?.value ?: 0L).toString(), celems.toInt(), (pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromUInt16Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_initVariantFromUInt16Array((prgn?.value ?: 0L).toString(), celems.toInt(), (pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromUInt32Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_initVariantFromUInt32Array((prgn?.value ?: 0L).toString(), celems.toInt(), (pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromUInt64Array(prgn: COpaquePointer?, celems: UInt, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_initVariantFromUInt64Array((prgn?.value ?: 0L).toString(), celems.toInt(), (pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromVariantArrayElem(varin: COpaquePointer?, ielem: UInt, pvar: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_initVariantFromVariantArrayElem((varin?.value ?: 0L).toString(), ielem.toInt(), (pvar?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTimeToVariantTime(lpsystemtime: COpaquePointer?, pvtime: COpaquePointer?): Int =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_systemTimeToVariantTime((lpsystemtime?.value ?: 0L).toString(), (pvtime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemVariantNapiAddon != null) {
        _windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantUserFree((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun variantUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemVariantNapiAddon != null) {
        _windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantUserFree64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun variantUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantUserMarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantUserMarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantUserSize((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantUserSize64((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantUserUnmarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantUserUnmarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantChangeType(pvargdest: COpaquePointer?, pvarsrc: COpaquePointer?, wflags: VarChangeFlags, vt: Varenum): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantChangeType((pvargdest?.value ?: 0L).toString(), (pvarsrc?.value ?: 0L).toString(), wflags.toInt(), vt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantChangeTypeEx(pvargdest: COpaquePointer?, pvarsrc: COpaquePointer?, lcid: UInt, wflags: VarChangeFlags, vt: Varenum): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantChangeTypeEx((pvargdest?.value ?: 0L).toString(), (pvarsrc?.value ?: 0L).toString(), lcid.toInt(), wflags.toInt(), vt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantClear(pvarg: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantClear((pvarg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantCompare(var1: COpaquePointer?, var2: COpaquePointer?): Int =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantCompare((var1?.value ?: 0L).toString(), (var2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantCopy(pvargdest: COpaquePointer?, pvargsrc: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantCopy((pvargdest?.value ?: 0L).toString(), (pvargsrc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantCopyInd(pvardest: COpaquePointer?, pvargsrc: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantCopyInd((pvardest?.value ?: 0L).toString(), (pvargsrc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetBooleanElem(variable: COpaquePointer?, ielem: UInt, pfval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantGetBooleanElem((variable?.value ?: 0L).toString(), ielem.toInt(), (pfval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetDoubleElem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantGetDoubleElem((variable?.value ?: 0L).toString(), ielem.toInt(), (pnval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetElementCount(varin: COpaquePointer?): UInt =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantGetElementCount((varin?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetInt16Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantGetInt16Elem((variable?.value ?: 0L).toString(), ielem.toInt(), (pnval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetInt32Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantGetInt32Elem((variable?.value ?: 0L).toString(), ielem.toInt(), (pnval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetInt64Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantGetInt64Elem((variable?.value ?: 0L).toString(), ielem.toInt(), (pnval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetStringElem(variable: COpaquePointer?, ielem: UInt, ppszval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantGetStringElem((variable?.value ?: 0L).toString(), ielem.toInt(), (ppszval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetUInt16Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantGetUInt16Elem((variable?.value ?: 0L).toString(), ielem.toInt(), (pnval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetUInt32Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantGetUInt32Elem((variable?.value ?: 0L).toString(), ielem.toInt(), (pnval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetUInt64Elem(variable: COpaquePointer?, ielem: UInt, pnval: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantGetUInt64Elem((variable?.value ?: 0L).toString(), ielem.toInt(), (pnval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantInit(pvarg: COpaquePointer?) {
    if (_windowsWin32SystemVariantNapiAddon != null) {
        _windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantInit((pvarg?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun variantTimeToDosDateTime(vtime: Double, pwdosdate: COpaquePointer?, pwdostime: COpaquePointer?): Int =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantTimeToDosDateTime(vtime, (pwdosdate?.value ?: 0L).toString(), (pwdostime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantTimeToSystemTime(vtime: Double, lpsystemtime: COpaquePointer?): Int =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantTimeToSystemTime(vtime, (lpsystemtime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToBoolean(varin: COpaquePointer?, pfret: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToBoolean((varin?.value ?: 0L).toString(), (pfret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToBooleanArray(variable: COpaquePointer?, prgf: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToBooleanArray((variable?.value ?: 0L).toString(), (prgf?.value ?: 0L).toString(), crgn.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToBooleanArrayAlloc(variable: COpaquePointer?, pprgf: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToBooleanArrayAlloc((variable?.value ?: 0L).toString(), (pprgf?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToBooleanWithDefault(varin: COpaquePointer?, fdefault: Bool): Bool =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToBooleanWithDefault((varin?.value ?: 0L).toString(), fdefault) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToBuffer(varin: COpaquePointer?, pv: COpaquePointer?, cb: UInt): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToBuffer((varin?.value ?: 0L).toString(), (pv?.value ?: 0L).toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToDosDateTime(varin: COpaquePointer?, pwdate: COpaquePointer?, pwtime: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToDosDateTime((varin?.value ?: 0L).toString(), (pwdate?.value ?: 0L).toString(), (pwtime?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToDouble(varin: COpaquePointer?, pdblret: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToDouble((varin?.value ?: 0L).toString(), (pdblret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToDoubleArray(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToDoubleArray((variable?.value ?: 0L).toString(), (prgn?.value ?: 0L).toString(), crgn.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToDoubleArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToDoubleArrayAlloc((variable?.value ?: 0L).toString(), (pprgn?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToDoubleWithDefault(varin: COpaquePointer?, dbldefault: Double): Double =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToDoubleWithDefault((varin?.value ?: 0L).toString(), dbldefault) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToFileTime(varin: COpaquePointer?, stfout: PstimeFlags, pftout: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToFileTime((varin?.value ?: 0L).toString(), stfout, (pftout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToGUID(varin: COpaquePointer?, pguid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToGUID((varin?.value ?: 0L).toString(), (pguid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt16(varin: COpaquePointer?, piret: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToInt16((varin?.value ?: 0L).toString(), (piret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt16Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToInt16Array((variable?.value ?: 0L).toString(), (prgn?.value ?: 0L).toString(), crgn.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt16ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToInt16ArrayAlloc((variable?.value ?: 0L).toString(), (pprgn?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt16WithDefault(varin: COpaquePointer?, idefault: Short): Short =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToInt16WithDefault((varin?.value ?: 0L).toString(), idefault.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt32(varin: COpaquePointer?, plret: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToInt32((varin?.value ?: 0L).toString(), (plret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt32Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToInt32Array((variable?.value ?: 0L).toString(), (prgn?.value ?: 0L).toString(), crgn.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt32ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToInt32ArrayAlloc((variable?.value ?: 0L).toString(), (pprgn?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt32WithDefault(varin: COpaquePointer?, ldefault: Int): Int =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToInt32WithDefault((varin?.value ?: 0L).toString(), ldefault) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt64(varin: COpaquePointer?, pllret: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToInt64((varin?.value ?: 0L).toString(), (pllret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt64Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToInt64Array((variable?.value ?: 0L).toString(), (prgn?.value ?: 0L).toString(), crgn.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt64ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToInt64ArrayAlloc((variable?.value ?: 0L).toString(), (pprgn?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt64WithDefault(varin: COpaquePointer?, lldefault: Long): Long =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToInt64WithDefault((varin?.value ?: 0L).toString(), lldefault.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToString(varin: COpaquePointer?, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToString((varin?.value ?: 0L).toString(), (pszbuf?.value ?: 0L).toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToStringAlloc(varin: COpaquePointer?, ppszbuf: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToStringAlloc((varin?.value ?: 0L).toString(), (ppszbuf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToStringArray(variable: COpaquePointer?, prgsz: COpaquePointer?, crgsz: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToStringArray((variable?.value ?: 0L).toString(), (prgsz?.value ?: 0L).toString(), crgsz.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToStringArrayAlloc(variable: COpaquePointer?, pprgsz: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToStringArrayAlloc((variable?.value ?: 0L).toString(), (pprgsz?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToStringWithDefault(varin: COpaquePointer?, pszdefault: Pcwstr): Pcwstr =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToStringWithDefault((varin?.value ?: 0L).toString(), (pszdefault?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt16(varin: COpaquePointer?, puiret: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToUInt16((varin?.value ?: 0L).toString(), (puiret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt16Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToUInt16Array((variable?.value ?: 0L).toString(), (prgn?.value ?: 0L).toString(), crgn.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt16ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToUInt16ArrayAlloc((variable?.value ?: 0L).toString(), (pprgn?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt16WithDefault(varin: COpaquePointer?, uidefault: UShort): UShort =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToUInt16WithDefault((varin?.value ?: 0L).toString(), uidefault.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt32(varin: COpaquePointer?, pulret: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToUInt32((varin?.value ?: 0L).toString(), (pulret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt32Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToUInt32Array((variable?.value ?: 0L).toString(), (prgn?.value ?: 0L).toString(), crgn.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt32ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToUInt32ArrayAlloc((variable?.value ?: 0L).toString(), (pprgn?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt32WithDefault(varin: COpaquePointer?, uldefault: UInt): UInt =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToUInt32WithDefault((varin?.value ?: 0L).toString(), uldefault.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt64(varin: COpaquePointer?, pullret: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToUInt64((varin?.value ?: 0L).toString(), (pullret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt64Array(variable: COpaquePointer?, prgn: COpaquePointer?, crgn: UInt, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToUInt64Array((variable?.value ?: 0L).toString(), (prgn?.value ?: 0L).toString(), crgn.toInt(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt64ArrayAlloc(variable: COpaquePointer?, pprgn: COpaquePointer?, pcelem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToUInt64ArrayAlloc((variable?.value ?: 0L).toString(), (pprgn?.value ?: 0L).toString(), (pcelem?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt64WithDefault(varin: COpaquePointer?, ulldefault: ULong): ULong =
    if (_windowsWin32SystemVariantNapiAddon != null) (_windowsWin32SystemVariantNapiAddon.windowssys_windows_win32_system_variant_variantToUInt64WithDefault((varin?.value ?: 0L).toString(), ulldefault.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")
