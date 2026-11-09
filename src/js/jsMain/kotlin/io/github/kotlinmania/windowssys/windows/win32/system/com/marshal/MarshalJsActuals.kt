@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.marshal

import io.github.kotlinmania.windowssys.core.HRESULT

private val _windowsWin32SystemComMarshalNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun BSTR_UserFree(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_BSTR_UserFree(param0.toString(), param1.toString())
    }
}

public actual fun BSTR_UserFree64(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_BSTR_UserFree64(param0.toString(), param1.toString())
    }
}

public actual fun BSTR_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_BSTR_UserMarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun BSTR_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_BSTR_UserMarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun BSTR_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_BSTR_UserSize(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun BSTR_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_BSTR_UserSize64(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun BSTR_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_BSTR_UserUnmarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun BSTR_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_BSTR_UserUnmarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun CLIPFORMAT_UserFree(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserFree(param0.toString(), param1.toString())
    }
}

public actual fun CLIPFORMAT_UserFree64(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserFree64(param0.toString(), param1.toString())
    }
}

public actual fun CLIPFORMAT_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserMarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun CLIPFORMAT_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserMarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun CLIPFORMAT_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserSize(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun CLIPFORMAT_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserSize64(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun CLIPFORMAT_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserUnmarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun CLIPFORMAT_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserUnmarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun CoGetMarshalSizeMax(pulsize: Long, riid: Long, punk: Long, dwdestcontext: UInt, pvdestcontext: Long, mshlflags: UInt): HRESULT =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_CoGetMarshalSizeMax(pulsize.toString(), riid.toString(), punk.toString(), dwdestcontext.toInt(), pvdestcontext.toString(), mshlflags.toInt()) as Int) else 0

public actual fun CoGetStandardMarshal(riid: Long, punk: Long, dwdestcontext: UInt, pvdestcontext: Long, mshlflags: UInt, ppmarshal: Long): HRESULT =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_CoGetStandardMarshal(riid.toString(), punk.toString(), dwdestcontext.toInt(), pvdestcontext.toString(), mshlflags.toInt(), ppmarshal.toString()) as Int) else 0

public actual fun CoGetStdMarshalEx(punkouter: Long, smexflags: UInt, ppunkinner: Long): HRESULT =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_CoGetStdMarshalEx(punkouter.toString(), smexflags.toInt(), ppunkinner.toString()) as Int) else 0

public actual fun CoMarshalHresult(pstm: Long, hresult: HRESULT): HRESULT =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_CoMarshalHresult(pstm.toString(), hresult) as Int) else 0

public actual fun CoMarshalInterThreadInterfaceInStream(riid: Long, punk: Long, ppstm: Long): HRESULT =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_CoMarshalInterThreadInterfaceInStream(riid.toString(), punk.toString(), ppstm.toString()) as Int) else 0

public actual fun CoMarshalInterface(pstm: Long, riid: Long, punk: Long, dwdestcontext: UInt, pvdestcontext: Long, mshlflags: UInt): HRESULT =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_CoMarshalInterface(pstm.toString(), riid.toString(), punk.toString(), dwdestcontext.toInt(), pvdestcontext.toString(), mshlflags.toInt()) as Int) else 0

public actual fun CoReleaseMarshalData(pstm: Long): HRESULT =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_CoReleaseMarshalData(pstm.toString()) as Int) else 0

public actual fun CoUnmarshalHresult(pstm: Long, phresult: Long): HRESULT =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_CoUnmarshalHresult(pstm.toString(), phresult.toString()) as Int) else 0

public actual fun CoUnmarshalInterface(pstm: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_CoUnmarshalInterface(pstm.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun HACCEL_UserFree(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HACCEL_UserFree(param0.toString(), param1.toString())
    }
}

public actual fun HACCEL_UserFree64(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HACCEL_UserFree64(param0.toString(), param1.toString())
    }
}

public actual fun HACCEL_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HACCEL_UserMarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HACCEL_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HACCEL_UserMarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HACCEL_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HACCEL_UserSize(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HACCEL_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HACCEL_UserSize64(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HACCEL_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HACCEL_UserUnmarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HACCEL_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HACCEL_UserUnmarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HBITMAP_UserFree(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HBITMAP_UserFree(param0.toString(), param1.toString())
    }
}

public actual fun HBITMAP_UserFree64(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HBITMAP_UserFree64(param0.toString(), param1.toString())
    }
}

public actual fun HBITMAP_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HBITMAP_UserMarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HBITMAP_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HBITMAP_UserMarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HBITMAP_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HBITMAP_UserSize(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HBITMAP_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HBITMAP_UserSize64(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HBITMAP_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HBITMAP_UserUnmarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HBITMAP_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HBITMAP_UserUnmarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HDC_UserFree(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HDC_UserFree(param0.toString(), param1.toString())
    }
}

public actual fun HDC_UserFree64(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HDC_UserFree64(param0.toString(), param1.toString())
    }
}

public actual fun HDC_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HDC_UserMarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HDC_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HDC_UserMarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HDC_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HDC_UserSize(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HDC_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HDC_UserSize64(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HDC_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HDC_UserUnmarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HDC_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HDC_UserUnmarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HGLOBAL_UserFree(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserFree(param0.toString(), param1.toString())
    }
}

public actual fun HGLOBAL_UserFree64(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserFree64(param0.toString(), param1.toString())
    }
}

public actual fun HGLOBAL_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserMarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HGLOBAL_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserMarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HGLOBAL_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserSize(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HGLOBAL_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserSize64(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HGLOBAL_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserUnmarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HGLOBAL_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HGLOBAL_UserUnmarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HICON_UserFree(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HICON_UserFree(param0.toString(), param1.toString())
    }
}

public actual fun HICON_UserFree64(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HICON_UserFree64(param0.toString(), param1.toString())
    }
}

public actual fun HICON_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HICON_UserMarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HICON_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HICON_UserMarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HICON_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HICON_UserSize(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HICON_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HICON_UserSize64(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HICON_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HICON_UserUnmarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HICON_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HICON_UserUnmarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HMENU_UserFree(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HMENU_UserFree(param0.toString(), param1.toString())
    }
}

public actual fun HMENU_UserFree64(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HMENU_UserFree64(param0.toString(), param1.toString())
    }
}

public actual fun HMENU_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HMENU_UserMarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HMENU_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HMENU_UserMarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HMENU_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HMENU_UserSize(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HMENU_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HMENU_UserSize64(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HMENU_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HMENU_UserUnmarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HMENU_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HMENU_UserUnmarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HPALETTE_UserFree(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HPALETTE_UserFree(param0.toString(), param1.toString())
    }
}

public actual fun HPALETTE_UserFree64(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HPALETTE_UserFree64(param0.toString(), param1.toString())
    }
}

public actual fun HPALETTE_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HPALETTE_UserMarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HPALETTE_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HPALETTE_UserMarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HPALETTE_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HPALETTE_UserSize(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HPALETTE_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HPALETTE_UserSize64(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HPALETTE_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HPALETTE_UserUnmarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HPALETTE_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HPALETTE_UserUnmarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HWND_UserFree(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HWND_UserFree(param0.toString(), param1.toString())
    }
}

public actual fun HWND_UserFree64(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HWND_UserFree64(param0.toString(), param1.toString())
    }
}

public actual fun HWND_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HWND_UserMarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HWND_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HWND_UserMarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HWND_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HWND_UserSize(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HWND_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HWND_UserSize64(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun HWND_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HWND_UserUnmarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun HWND_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_HWND_UserUnmarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun LPSAFEARRAY_UserFree(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserFree(param0.toString(), param1.toString())
    }
}

public actual fun LPSAFEARRAY_UserFree64(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserFree64(param0.toString(), param1.toString())
    }
}

public actual fun LPSAFEARRAY_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserMarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun LPSAFEARRAY_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserMarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun LPSAFEARRAY_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserSize(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun LPSAFEARRAY_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserSize64(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun LPSAFEARRAY_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserUnmarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun LPSAFEARRAY_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserUnmarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun SNB_UserFree(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_SNB_UserFree(param0.toString(), param1.toString())
    }
}

public actual fun SNB_UserFree64(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_SNB_UserFree64(param0.toString(), param1.toString())
    }
}

public actual fun SNB_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_SNB_UserMarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun SNB_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_SNB_UserMarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun SNB_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_SNB_UserSize(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun SNB_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_SNB_UserSize64(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun SNB_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_SNB_UserUnmarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun SNB_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_SNB_UserUnmarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun STGMEDIUM_UserFree(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserFree(param0.toString(), param1.toString())
    }
}

public actual fun STGMEDIUM_UserFree64(param0: Long, param1: Long) {
    if (_windowsWin32SystemComMarshalNapiAddon != null) {
        _windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserFree64(param0.toString(), param1.toString())
    }
}

public actual fun STGMEDIUM_UserMarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserMarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun STGMEDIUM_UserMarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserMarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun STGMEDIUM_UserSize(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserSize(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun STGMEDIUM_UserSize64(param0: Long, param1: UInt, param2: Long): UInt =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserSize64(param0.toString(), param1.toInt(), param2.toString()) as Int).toUInt() else 0u

public actual fun STGMEDIUM_UserUnmarshal(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserUnmarshal(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L

public actual fun STGMEDIUM_UserUnmarshal64(param0: Long, param1: Long, param2: Long): Long =
    if (_windowsWin32SystemComMarshalNapiAddon != null) (_windowsWin32SystemComMarshalNapiAddon.windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserUnmarshal64(param0.toString(), param1.toString(), param2.toString()) as String).toLong() else 0L
