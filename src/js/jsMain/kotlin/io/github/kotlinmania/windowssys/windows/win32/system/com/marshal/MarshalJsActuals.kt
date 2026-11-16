@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.marshal

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult

private val windowsWin32SystemComMarshalNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun bstrUserFree(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalBstrUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bstrUserFree64(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalBstrUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bstrUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalBstrUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bstrUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalBstrUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bstrUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalBstrUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bstrUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalBstrUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bstrUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalBstrUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bstrUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalBstrUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipformatUserFree(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalClipformatUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun clipformatUserFree64(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalClipformatUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun clipformatUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalClipformatUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipformatUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalClipformatUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipformatUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalClipformatUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipformatUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalClipformatUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipformatUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipformatUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalClipformatUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetMarshalSizeMax(pulsize: MutPtr, riid: ConstPtr, punk: MutPtr, dwdestcontext: UInt, pvdestcontext: ConstPtr, mshlflags: UInt): Hresult =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalCoGetMarshalSizeMax(pulsize.rawAddress.toString(), riid.rawAddress.toString(), punk.rawAddress.toString(), dwdestcontext.toInt(), pvdestcontext.rawAddress.toString(), mshlflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetStandardMarshal(riid: ConstPtr, punk: MutPtr, dwdestcontext: UInt, pvdestcontext: ConstPtr, mshlflags: UInt, ppmarshal: MutPtr): Hresult =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalCoGetStandardMarshal(riid.rawAddress.toString(), punk.rawAddress.toString(), dwdestcontext.toInt(), pvdestcontext.rawAddress.toString(), mshlflags.toInt(), ppmarshal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetStdMarshalEx(punkouter: MutPtr, smexflags: UInt, ppunkinner: MutPtr): Hresult =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalCoGetStdMarshalEx(punkouter.rawAddress.toString(), smexflags.toInt(), ppunkinner.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coMarshalHresult(pstm: MutPtr, hresult: Hresult): Hresult =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalCoMarshalHresult(pstm.rawAddress.toString(), hresult) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coMarshalInterThreadInterfaceInStream(riid: ConstPtr, punk: MutPtr, ppstm: MutPtr): Hresult =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalCoMarshalInterThreadInterfaceInStream(riid.rawAddress.toString(), punk.rawAddress.toString(), ppstm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coMarshalInterface(pstm: MutPtr, riid: ConstPtr, punk: MutPtr, dwdestcontext: UInt, pvdestcontext: ConstPtr, mshlflags: UInt): Hresult =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalCoMarshalInterface(pstm.rawAddress.toString(), riid.rawAddress.toString(), punk.rawAddress.toString(), dwdestcontext.toInt(), pvdestcontext.rawAddress.toString(), mshlflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coReleaseMarshalData(pstm: MutPtr): Hresult =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalCoReleaseMarshalData(pstm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coUnmarshalHresult(pstm: MutPtr, phresult: MutPtr): Hresult =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalCoUnmarshalHresult(pstm.rawAddress.toString(), phresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coUnmarshalInterface(pstm: MutPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalCoUnmarshalInterface(pstm.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun haccelUserFree(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHaccelUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun haccelUserFree64(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHaccelUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun haccelUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHaccelUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun haccelUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHaccelUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun haccelUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHaccelUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun haccelUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHaccelUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun haccelUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun haccelUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHaccelUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hbitmapUserFree(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHbitmapUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hbitmapUserFree64(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHbitmapUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hbitmapUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHbitmapUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hbitmapUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHbitmapUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hbitmapUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHbitmapUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hbitmapUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHbitmapUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hbitmapUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hbitmapUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHbitmapUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdcUserFree(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHdcUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hdcUserFree64(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHdcUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hdcUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHdcUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdcUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHdcUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdcUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHdcUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdcUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHdcUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdcUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHdcUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdcUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHdcUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hglobalUserFree(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHglobalUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hglobalUserFree64(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHglobalUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hglobalUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHglobalUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hglobalUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHglobalUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hglobalUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHglobalUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hglobalUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHglobalUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hglobalUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hglobalUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHglobalUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiconUserFree(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHiconUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hiconUserFree64(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHiconUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hiconUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHiconUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiconUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHiconUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiconUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHiconUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiconUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHiconUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiconUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHiconUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiconUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHiconUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmenuUserFree(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHmenuUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hmenuUserFree64(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHmenuUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hmenuUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHmenuUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmenuUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHmenuUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmenuUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHmenuUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmenuUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHmenuUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmenuUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmenuUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHmenuUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hpaletteUserFree(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHpaletteUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hpaletteUserFree64(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHpaletteUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hpaletteUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHpaletteUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hpaletteUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHpaletteUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hpaletteUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHpaletteUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hpaletteUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHpaletteUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hpaletteUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hpaletteUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHpaletteUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwndUserFree(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHwndUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hwndUserFree64(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHwndUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hwndUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHwndUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwndUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHwndUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwndUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHwndUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwndUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHwndUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwndUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHwndUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwndUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalHwndUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpsafearrayUserFree(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalLpsafearrayUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lpsafearrayUserFree64(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalLpsafearrayUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lpsafearrayUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpsafearrayUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalLpsafearrayUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpsafearrayUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalLpsafearrayUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpsafearrayUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalLpsafearrayUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpsafearrayUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpsafearrayUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalLpsafearrayUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snbUserFree(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalSnbUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snbUserFree64(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalSnbUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snbUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalSnbUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snbUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalSnbUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snbUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalSnbUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snbUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalSnbUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snbUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalSnbUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snbUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalSnbUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgmediumUserFree(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalStgmediumUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun stgmediumUserFree64(param0: ConstPtr, param1: ConstPtr) {
    if (windowsWin32SystemComMarshalNapiAddon != null) {
        windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalStgmediumUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun stgmediumUserMarshal(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalStgmediumUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgmediumUserMarshal64(param0: ConstPtr, param1: MutPtr, param2: ConstPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalStgmediumUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgmediumUserSize(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalStgmediumUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgmediumUserSize64(param0: ConstPtr, param1: UInt, param2: ConstPtr): UInt =
    if (windowsWin32SystemComMarshalNapiAddon != null) (windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalStgmediumUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgmediumUserUnmarshal(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgmediumUserUnmarshal64(param0: ConstPtr, param1: ConstPtr, param2: MutPtr): MutPtr =
    if (windowsWin32SystemComMarshalNapiAddon != null) MutPtr((windowsWin32SystemComMarshalNapiAddon.windowssysWindowsWin32SystemComMarshalStgmediumUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
