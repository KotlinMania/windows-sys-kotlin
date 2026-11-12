@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.variant

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance

private val windowsWin32SystemVariantNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun clearVariantArray(pvars: MutPtr, cvars: UInt) {
    if (windowsWin32SystemVariantNapiAddon != null) {
        windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantClearVariantArray(pvars.rawAddress.toString(), cvars.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dosDateTimeToVariantTime(wdosdate: UShort, wdostime: UShort, pvtime: MutPtr): Int =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantDosDateTimeToVariantTime(wdosdate.toInt(), wdostime.toInt(), pvtime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromBooleanArray(prgf: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantInitVariantFromBooleanArray(prgf.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromBuffer(pv: ConstPtr, cb: UInt, pvar: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantInitVariantFromBuffer(pv.rawAddress.toString(), cb.toInt(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromDoubleArray(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantInitVariantFromDoubleArray(prgn.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromFileTime(pft: ConstPtr, pvar: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantInitVariantFromFileTime(pft.rawAddress.toString(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromFileTimeArray(prgft: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantInitVariantFromFileTimeArray(prgft.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromGUIDAsString(guid: ConstPtr, pvar: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantInitVariantFromGUIDAsString(guid.rawAddress.toString(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromInt16Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantInitVariantFromInt16Array(prgn.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromInt32Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantInitVariantFromInt32Array(prgn.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromInt64Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantInitVariantFromInt64Array(prgn.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromResource(hinst: Hinstance, id: UInt, pvar: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantInitVariantFromResource(hinst.rawAddress.toString(), id.toInt(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromStringArray(prgsz: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantInitVariantFromStringArray(prgsz.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromUInt16Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantInitVariantFromUInt16Array(prgn.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromUInt32Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantInitVariantFromUInt32Array(prgn.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromUInt64Array(prgn: ConstPtr, celems: UInt, pvar: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantInitVariantFromUInt64Array(prgn.rawAddress.toString(), celems.toInt(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromVariantArrayElem(varin: ConstPtr, ielem: UInt, pvar: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantInitVariantFromVariantArrayElem(varin.rawAddress.toString(), ielem.toInt(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemTimeToVariantTime(lpsystemtime: ConstPtr, pvtime: MutPtr): Int =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantSystemTimeToVariantTime(lpsystemtime.rawAddress.toString(), pvtime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantUserFree(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemVariantNapiAddon != null) {
        windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun variantUserFree64(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemVariantNapiAddon != null) {
        windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun variantUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemVariantNapiAddon != null) MutPtr((windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemVariantNapiAddon != null) MutPtr((windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemVariantNapiAddon != null) MutPtr((windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemVariantNapiAddon != null) MutPtr((windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantChangeType(pvargdest: MutPtr, pvarsrc: ConstPtr, wflags: VarChangeFlags, vt: Varenum): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantChangeType(pvargdest.rawAddress.toString(), pvarsrc.rawAddress.toString(), wflags.toInt(), vt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantChangeTypeEx(pvargdest: MutPtr, pvarsrc: ConstPtr, lcid: UInt, wflags: VarChangeFlags, vt: Varenum): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantChangeTypeEx(pvargdest.rawAddress.toString(), pvarsrc.rawAddress.toString(), lcid.toInt(), wflags.toInt(), vt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantClear(pvarg: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantClear(pvarg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantCompare(var1: ConstPtr, var2: ConstPtr): Int =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantCompare(var1.rawAddress.toString(), var2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantCopy(pvargdest: MutPtr, pvargsrc: ConstPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantCopy(pvargdest.rawAddress.toString(), pvargsrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantCopyInd(pvardest: MutPtr, pvargsrc: ConstPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantCopyInd(pvardest.rawAddress.toString(), pvargsrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetBooleanElem(variable: ConstPtr, ielem: UInt, pfval: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantGetBooleanElem(variable.rawAddress.toString(), ielem.toInt(), pfval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetDoubleElem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantGetDoubleElem(variable.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetElementCount(varin: ConstPtr): UInt =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantGetElementCount(varin.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetInt16Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantGetInt16Elem(variable.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetInt32Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantGetInt32Elem(variable.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetInt64Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantGetInt64Elem(variable.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetStringElem(variable: ConstPtr, ielem: UInt, ppszval: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantGetStringElem(variable.rawAddress.toString(), ielem.toInt(), ppszval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetUInt16Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantGetUInt16Elem(variable.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetUInt32Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantGetUInt32Elem(variable.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantGetUInt64Elem(variable: ConstPtr, ielem: UInt, pnval: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantGetUInt64Elem(variable.rawAddress.toString(), ielem.toInt(), pnval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantInit(pvarg: MutPtr) {
    if (windowsWin32SystemVariantNapiAddon != null) {
        windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantInit(pvarg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun variantTimeToDosDateTime(vtime: Double, pwdosdate: MutPtr, pwdostime: MutPtr): Int =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantTimeToDosDateTime(vtime, pwdosdate.rawAddress.toString(), pwdostime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantTimeToSystemTime(vtime: Double, lpsystemtime: MutPtr): Int =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantTimeToSystemTime(vtime, lpsystemtime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToBoolean(varin: ConstPtr, pfret: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToBoolean(varin.rawAddress.toString(), pfret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToBooleanArray(variable: ConstPtr, prgf: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToBooleanArray(variable.rawAddress.toString(), prgf.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToBooleanArrayAlloc(variable: ConstPtr, pprgf: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToBooleanArrayAlloc(variable.rawAddress.toString(), pprgf.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToBooleanWithDefault(varin: ConstPtr, fdefault: Bool): Bool =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToBooleanWithDefault(varin.rawAddress.toString(), fdefault) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToBuffer(varin: ConstPtr, pv: MutPtr, cb: UInt): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToBuffer(varin.rawAddress.toString(), pv.rawAddress.toString(), cb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToDosDateTime(varin: ConstPtr, pwdate: MutPtr, pwtime: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToDosDateTime(varin.rawAddress.toString(), pwdate.rawAddress.toString(), pwtime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToDouble(varin: ConstPtr, pdblret: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToDouble(varin.rawAddress.toString(), pdblret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToDoubleArray(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToDoubleArray(variable.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToDoubleArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToDoubleArrayAlloc(variable.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToDoubleWithDefault(varin: ConstPtr, dbldefault: Double): Double =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToDoubleWithDefault(varin.rawAddress.toString(), dbldefault) as Double) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToFileTime(varin: ConstPtr, stfout: PstimeFlags, pftout: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToFileTime(varin.rawAddress.toString(), stfout, pftout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToGUID(varin: ConstPtr, pguid: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToGUID(varin.rawAddress.toString(), pguid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt16(varin: ConstPtr, piret: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToInt16(varin.rawAddress.toString(), piret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt16Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToInt16Array(variable.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt16ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToInt16ArrayAlloc(variable.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt16WithDefault(varin: ConstPtr, idefault: Short): Short =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToInt16WithDefault(varin.rawAddress.toString(), idefault.toInt()) as Int).toShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt32(varin: ConstPtr, plret: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToInt32(varin.rawAddress.toString(), plret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt32Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToInt32Array(variable.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt32ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToInt32ArrayAlloc(variable.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt32WithDefault(varin: ConstPtr, ldefault: Int): Int =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToInt32WithDefault(varin.rawAddress.toString(), ldefault) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt64(varin: ConstPtr, pllret: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToInt64(varin.rawAddress.toString(), pllret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt64Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToInt64Array(variable.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt64ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToInt64ArrayAlloc(variable.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToInt64WithDefault(varin: ConstPtr, lldefault: Long): Long =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToInt64WithDefault(varin.rawAddress.toString(), lldefault.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToString(varin: ConstPtr, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToString(varin.rawAddress.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToStringAlloc(varin: ConstPtr, ppszbuf: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToStringAlloc(varin.rawAddress.toString(), ppszbuf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToStringArray(variable: ConstPtr, prgsz: MutPtr, crgsz: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToStringArray(variable.rawAddress.toString(), prgsz.rawAddress.toString(), crgsz.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToStringArrayAlloc(variable: ConstPtr, pprgsz: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToStringArrayAlloc(variable.rawAddress.toString(), pprgsz.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToStringWithDefault(varin: ConstPtr, pszdefault: Pcwstr): Pcwstr =
    if (windowsWin32SystemVariantNapiAddon != null) ConstPtr((windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToStringWithDefault(varin.rawAddress.toString(), pszdefault.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt16(varin: ConstPtr, puiret: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToUInt16(varin.rawAddress.toString(), puiret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt16Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToUInt16Array(variable.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt16ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToUInt16ArrayAlloc(variable.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt16WithDefault(varin: ConstPtr, uidefault: UShort): UShort =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToUInt16WithDefault(varin.rawAddress.toString(), uidefault.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt32(varin: ConstPtr, pulret: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToUInt32(varin.rawAddress.toString(), pulret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt32Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToUInt32Array(variable.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt32ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToUInt32ArrayAlloc(variable.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt32WithDefault(varin: ConstPtr, uldefault: UInt): UInt =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToUInt32WithDefault(varin.rawAddress.toString(), uldefault.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt64(varin: ConstPtr, pullret: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToUInt64(varin.rawAddress.toString(), pullret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt64Array(variable: ConstPtr, prgn: MutPtr, crgn: UInt, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToUInt64Array(variable.rawAddress.toString(), prgn.rawAddress.toString(), crgn.toInt(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt64ArrayAlloc(variable: ConstPtr, pprgn: MutPtr, pcelem: MutPtr): Hresult =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToUInt64ArrayAlloc(variable.rawAddress.toString(), pprgn.rawAddress.toString(), pcelem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToUInt64WithDefault(varin: ConstPtr, ulldefault: ULong): ULong =
    if (windowsWin32SystemVariantNapiAddon != null) (windowsWin32SystemVariantNapiAddon.windowssysWindowsWin32SystemVariantVariantToUInt64WithDefault(varin.rawAddress.toString(), ulldefault.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")
