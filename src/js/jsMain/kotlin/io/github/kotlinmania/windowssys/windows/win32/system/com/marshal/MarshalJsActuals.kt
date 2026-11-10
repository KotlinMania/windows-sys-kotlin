@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.marshal

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult

private val _windowsWin32SystemComMarshalNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun bstrUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_bstrUserFree((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bstrUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_bstrUserFree64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bstrUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_bstrUserMarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bstrUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_bstrUserMarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bstrUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_bstrUserSize((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bstrUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_bstrUserSize64((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bstrUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_bstrUserUnmarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bstrUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_bstrUserUnmarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipformatUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_clipformatUserFree((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun clipformatUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_clipformatUserFree64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun clipformatUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_clipformatUserMarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipformatUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_clipformatUserMarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipformatUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_clipformatUserSize((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipformatUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_clipformatUserSize64((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipformatUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_clipformatUserUnmarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clipformatUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_clipformatUserUnmarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetMarshalSizeMax(pulsize: COpaquePointer?, riid: COpaquePointer?, punk: COpaquePointer?, dwdestcontext: UInt, pvdestcontext: COpaquePointer?, mshlflags: UInt): Hresult =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_coGetMarshalSizeMax((pulsize?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (punk?.value ?: 0L).toString(), dwdestcontext.toInt(), (pvdestcontext?.value ?: 0L).toString(), mshlflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetStandardMarshal(riid: COpaquePointer?, punk: COpaquePointer?, dwdestcontext: UInt, pvdestcontext: COpaquePointer?, mshlflags: UInt, ppmarshal: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_coGetStandardMarshal((riid?.value ?: 0L).toString(), (punk?.value ?: 0L).toString(), dwdestcontext.toInt(), (pvdestcontext?.value ?: 0L).toString(), mshlflags.toInt(), (ppmarshal?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetStdMarshalEx(punkouter: COpaquePointer?, smexflags: UInt, ppunkinner: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_coGetStdMarshalEx((punkouter?.value ?: 0L).toString(), smexflags.toInt(), (ppunkinner?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coMarshalHresult(pstm: COpaquePointer?, hresult: Hresult): Hresult =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_coMarshalHresult((pstm?.value ?: 0L).toString(), hresult) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coMarshalInterThreadInterfaceInStream(riid: COpaquePointer?, punk: COpaquePointer?, ppstm: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_coMarshalInterThreadInterfaceInStream((riid?.value ?: 0L).toString(), (punk?.value ?: 0L).toString(), (ppstm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coMarshalInterface(pstm: COpaquePointer?, riid: COpaquePointer?, punk: COpaquePointer?, dwdestcontext: UInt, pvdestcontext: COpaquePointer?, mshlflags: UInt): Hresult =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_coMarshalInterface((pstm?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (punk?.value ?: 0L).toString(), dwdestcontext.toInt(), (pvdestcontext?.value ?: 0L).toString(), mshlflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coReleaseMarshalData(pstm: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_coReleaseMarshalData((pstm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coUnmarshalHresult(pstm: COpaquePointer?, phresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_coUnmarshalHresult((pstm?.value ?: 0L).toString(), (phresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coUnmarshalInterface(pstm: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_coUnmarshalInterface((pstm?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun haccelUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_haccelUserFree((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun haccelUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_haccelUserFree64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun haccelUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_haccelUserMarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun haccelUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_haccelUserMarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun haccelUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_haccelUserSize((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun haccelUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_haccelUserSize64((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun haccelUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_haccelUserUnmarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun haccelUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_haccelUserUnmarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hbitmapUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hbitmapUserFree((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hbitmapUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hbitmapUserFree64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hbitmapUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hbitmapUserMarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hbitmapUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hbitmapUserMarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hbitmapUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hbitmapUserSize((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hbitmapUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hbitmapUserSize64((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hbitmapUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hbitmapUserUnmarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hbitmapUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hbitmapUserUnmarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdcUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hdcUserFree((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hdcUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hdcUserFree64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hdcUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hdcUserMarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdcUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hdcUserMarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdcUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hdcUserSize((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdcUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hdcUserSize64((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdcUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hdcUserUnmarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdcUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hdcUserUnmarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hglobalUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hglobalUserFree((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hglobalUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hglobalUserFree64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hglobalUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hglobalUserMarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hglobalUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hglobalUserMarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hglobalUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hglobalUserSize((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hglobalUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hglobalUserSize64((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hglobalUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hglobalUserUnmarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hglobalUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hglobalUserUnmarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiconUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hiconUserFree((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hiconUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hiconUserFree64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hiconUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hiconUserMarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiconUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hiconUserMarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiconUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hiconUserSize((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiconUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hiconUserSize64((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiconUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hiconUserUnmarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hiconUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hiconUserUnmarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmenuUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hmenuUserFree((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hmenuUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hmenuUserFree64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hmenuUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hmenuUserMarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmenuUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hmenuUserMarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmenuUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hmenuUserSize((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmenuUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hmenuUserSize64((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmenuUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hmenuUserUnmarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmenuUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hmenuUserUnmarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hpaletteUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hpaletteUserFree((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hpaletteUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hpaletteUserFree64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hpaletteUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hpaletteUserMarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hpaletteUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hpaletteUserMarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hpaletteUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hpaletteUserSize((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hpaletteUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hpaletteUserSize64((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hpaletteUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hpaletteUserUnmarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hpaletteUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hpaletteUserUnmarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwndUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hwndUserFree((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hwndUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hwndUserFree64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hwndUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hwndUserMarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwndUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hwndUserMarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwndUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hwndUserSize((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwndUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hwndUserSize64((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwndUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hwndUserUnmarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hwndUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_hwndUserUnmarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpsafearrayUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_lpsafearrayUserFree((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lpsafearrayUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_lpsafearrayUserFree64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lpsafearrayUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_lpsafearrayUserMarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpsafearrayUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_lpsafearrayUserMarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpsafearrayUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_lpsafearrayUserSize((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpsafearrayUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_lpsafearrayUserSize64((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpsafearrayUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_lpsafearrayUserUnmarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpsafearrayUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_lpsafearrayUserUnmarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snbUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_snbUserFree((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snbUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_snbUserFree64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun snbUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_snbUserMarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snbUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_snbUserMarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snbUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_snbUserSize((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snbUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_snbUserSize64((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snbUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_snbUserUnmarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun snbUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_snbUserUnmarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgmediumUserFree(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_stgmediumUserFree((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun stgmediumUserFree64(param0: COpaquePointer?, param1: COpaquePointer?) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_stgmediumUserFree64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun stgmediumUserMarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_stgmediumUserMarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgmediumUserMarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_stgmediumUserMarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgmediumUserSize(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_stgmediumUserSize((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgmediumUserSize64(param0: COpaquePointer?, param1: UInt, param2: COpaquePointer?): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_stgmediumUserSize64((param0?.value ?: 0L).toString(), param1.toInt(), (param2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgmediumUserUnmarshal(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_stgmediumUserUnmarshal((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgmediumUserUnmarshal64(param0: COpaquePointer?, param1: COpaquePointer?, param2: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_stgmediumUserUnmarshal64((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")
