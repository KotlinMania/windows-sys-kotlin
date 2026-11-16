@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.ime

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.Hkl

private val windowsWin32UiInputImeNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun immAssociateContext(param0: Hwnd, param1: Himc): Himc =
    if (windowsWin32UiInputImeNapiAddon != null) MutPtr((windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmAssociateContext(param0.rawAddress.toString(), param1.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immAssociateContextEx(param0: Hwnd, param1: Himc, param2: UInt): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmAssociateContextEx(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immConfigureIMEA(param0: Hkl, param1: Hwnd, param2: UInt, param3: MutPtr): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmConfigureIMEA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immConfigureIMEW(param0: Hkl, param1: Hwnd, param2: UInt, param3: MutPtr): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmConfigureIMEW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immCreateContext(): Himc =
    if (windowsWin32UiInputImeNapiAddon != null) MutPtr((windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmCreateContext() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immCreateIMCC(param0: UInt): Himcc =
    if (windowsWin32UiInputImeNapiAddon != null) MutPtr((windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmCreateIMCC(param0.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immCreateSoftKeyboard(param0: UInt, param1: Hwnd, param2: Int, param3: Int): Hwnd =
    if (windowsWin32UiInputImeNapiAddon != null) MutPtr((windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmCreateSoftKeyboard(param0.toInt(), param1.rawAddress.toString(), param2, param3) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immDestroyContext(param0: Himc): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmDestroyContext(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immDestroyIMCC(param0: Himcc): Himcc =
    if (windowsWin32UiInputImeNapiAddon != null) MutPtr((windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmDestroyIMCC(param0.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immDestroySoftKeyboard(param0: Hwnd): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmDestroySoftKeyboard(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immDisableIME(param0: UInt): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmDisableIME(param0.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immDisableLegacyIME(): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmDisableLegacyIME() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immDisableTextFrameService(idthread: UInt): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmDisableTextFrameService(idthread.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immEnumInputContext(idthread: UInt, lpfn: Imcenumproc, lparam: Lparam): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmEnumInputContext(idthread.toInt(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immEnumRegisterWordA(param0: Hkl, param1: Registerwordenumproca, lpszreading: Pcstr, param3: UInt, lpszregister: Pcstr, param5: MutPtr): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmEnumRegisterWordA(param0.rawAddress.toString(), 0L.toString(), lpszreading.rawAddress.toString(), param3.toInt(), lpszregister.rawAddress.toString(), param5.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immEnumRegisterWordW(param0: Hkl, param1: Registerwordenumprocw, lpszreading: Pcwstr, param3: UInt, lpszregister: Pcwstr, param5: MutPtr): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmEnumRegisterWordW(param0.rawAddress.toString(), 0L.toString(), lpszreading.rawAddress.toString(), param3.toInt(), lpszregister.rawAddress.toString(), param5.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immEscapeA(param0: Hkl, param1: Himc, param2: ImeEscape, param3: MutPtr): Lresult =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmEscapeA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immEscapeW(param0: Hkl, param1: Himc, param2: ImeEscape, param3: MutPtr): Lresult =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmEscapeW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGenerateMessage(param0: Himc): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGenerateMessage(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCandidateListA(param0: Himc, deindex: UInt, lpcandlist: MutPtr, dwbuflen: UInt): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetCandidateListA(param0.rawAddress.toString(), deindex.toInt(), lpcandlist.rawAddress.toString(), dwbuflen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCandidateListCountA(param0: Himc, lpdwlistcount: MutPtr): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetCandidateListCountA(param0.rawAddress.toString(), lpdwlistcount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCandidateListCountW(param0: Himc, lpdwlistcount: MutPtr): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetCandidateListCountW(param0.rawAddress.toString(), lpdwlistcount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCandidateListW(param0: Himc, deindex: UInt, lpcandlist: MutPtr, dwbuflen: UInt): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetCandidateListW(param0.rawAddress.toString(), deindex.toInt(), lpcandlist.rawAddress.toString(), dwbuflen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCandidateWindow(param0: Himc, param1: UInt, lpcandidate: MutPtr): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetCandidateWindow(param0.rawAddress.toString(), param1.toInt(), lpcandidate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCompositionFontA(param0: Himc, lplf: MutPtr): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetCompositionFontA(param0.rawAddress.toString(), lplf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCompositionFontW(param0: Himc, lplf: MutPtr): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetCompositionFontW(param0.rawAddress.toString(), lplf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCompositionStringA(param0: Himc, param1: ImeCompositionString, lpbuf: MutPtr, dwbuflen: UInt): Int =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetCompositionStringA(param0.rawAddress.toString(), param1.toInt(), lpbuf.rawAddress.toString(), dwbuflen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCompositionStringW(param0: Himc, param1: ImeCompositionString, lpbuf: MutPtr, dwbuflen: UInt): Int =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetCompositionStringW(param0.rawAddress.toString(), param1.toInt(), lpbuf.rawAddress.toString(), dwbuflen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetCompositionWindow(param0: Himc, lpcompform: MutPtr): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetCompositionWindow(param0.rawAddress.toString(), lpcompform.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetContext(param0: Hwnd): Himc =
    if (windowsWin32UiInputImeNapiAddon != null) MutPtr((windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetContext(param0.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetConversionListA(param0: Hkl, param1: Himc, lpsrc: Pcstr, lpdst: MutPtr, dwbuflen: UInt, uflag: GetConversionListFlag): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetConversionListA(param0.rawAddress.toString(), param1.rawAddress.toString(), lpsrc.rawAddress.toString(), lpdst.rawAddress.toString(), dwbuflen.toInt(), uflag.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetConversionListW(param0: Hkl, param1: Himc, lpsrc: Pcwstr, lpdst: MutPtr, dwbuflen: UInt, uflag: GetConversionListFlag): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetConversionListW(param0.rawAddress.toString(), param1.rawAddress.toString(), lpsrc.rawAddress.toString(), lpdst.rawAddress.toString(), dwbuflen.toInt(), uflag.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetConversionStatus(param0: Himc, lpfdwconversion: MutPtr, lpfdwsentence: MutPtr): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetConversionStatus(param0.rawAddress.toString(), lpfdwconversion.rawAddress.toString(), lpfdwsentence.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetDefaultIMEWnd(param0: Hwnd): Hwnd =
    if (windowsWin32UiInputImeNapiAddon != null) MutPtr((windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetDefaultIMEWnd(param0.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetDescriptionA(param0: Hkl, lpszdescription: Pstr, ubuflen: UInt): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetDescriptionA(param0.rawAddress.toString(), lpszdescription.rawAddress.toString(), ubuflen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetDescriptionW(param0: Hkl, lpszdescription: Pwstr, ubuflen: UInt): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetDescriptionW(param0.rawAddress.toString(), lpszdescription.rawAddress.toString(), ubuflen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetGuideLineA(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pstr, dwbuflen: UInt): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetGuideLineA(param0.rawAddress.toString(), dwindex.toInt(), lpbuf.rawAddress.toString(), dwbuflen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetGuideLineW(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pwstr, dwbuflen: UInt): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetGuideLineW(param0.rawAddress.toString(), dwindex.toInt(), lpbuf.rawAddress.toString(), dwbuflen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetHotKey(param0: UInt, lpumodifiers: MutPtr, lpuvkey: MutPtr, phkl: MutPtr): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetHotKey(param0.toInt(), lpumodifiers.rawAddress.toString(), lpuvkey.rawAddress.toString(), phkl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetIMCCLockCount(param0: Himcc): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetIMCCLockCount(param0.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetIMCCSize(param0: Himcc): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetIMCCSize(param0.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetIMCLockCount(param0: Himc): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetIMCLockCount(param0.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetIMEFileNameA(param0: Hkl, lpszfilename: Pstr, ubuflen: UInt): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetIMEFileNameA(param0.rawAddress.toString(), lpszfilename.rawAddress.toString(), ubuflen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetIMEFileNameW(param0: Hkl, lpszfilename: Pwstr, ubuflen: UInt): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetIMEFileNameW(param0.rawAddress.toString(), lpszfilename.rawAddress.toString(), ubuflen.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetImeMenuItemsA(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: MutPtr, lpimemenu: MutPtr, dwsize: UInt): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetImeMenuItemsA(param0.rawAddress.toString(), param1.toInt(), param2.toInt(), lpimeparentmenu.rawAddress.toString(), lpimemenu.rawAddress.toString(), dwsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetImeMenuItemsW(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: MutPtr, lpimemenu: MutPtr, dwsize: UInt): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetImeMenuItemsW(param0.rawAddress.toString(), param1.toInt(), param2.toInt(), lpimeparentmenu.rawAddress.toString(), lpimemenu.rawAddress.toString(), dwsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetOpenStatus(param0: Himc): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetOpenStatus(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetProperty(param0: Hkl, param1: UInt): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetProperty(param0.rawAddress.toString(), param1.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetRegisterWordStyleA(param0: Hkl, nitem: UInt, lpstylebuf: MutPtr): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetRegisterWordStyleA(param0.rawAddress.toString(), nitem.toInt(), lpstylebuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetRegisterWordStyleW(param0: Hkl, nitem: UInt, lpstylebuf: MutPtr): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetRegisterWordStyleW(param0.rawAddress.toString(), nitem.toInt(), lpstylebuf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetStatusWindowPos(param0: Himc, lpptpos: MutPtr): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetStatusWindowPos(param0.rawAddress.toString(), lpptpos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immGetVirtualKey(param0: Hwnd): UInt =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmGetVirtualKey(param0.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immInstallIMEA(lpszimefilename: Pcstr, lpszlayouttext: Pcstr): Hkl =
    if (windowsWin32UiInputImeNapiAddon != null) MutPtr((windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmInstallIMEA(lpszimefilename.rawAddress.toString(), lpszlayouttext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immInstallIMEW(lpszimefilename: Pcwstr, lpszlayouttext: Pcwstr): Hkl =
    if (windowsWin32UiInputImeNapiAddon != null) MutPtr((windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmInstallIMEW(lpszimefilename.rawAddress.toString(), lpszlayouttext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immIsIME(param0: Hkl): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmIsIME(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immIsUIMessageA(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmIsUIMessageA(param0.rawAddress.toString(), param1.toInt(), param2.toString(), param3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immIsUIMessageW(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmIsUIMessageW(param0.rawAddress.toString(), param1.toInt(), param2.toString(), param3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immLockIMC(param0: Himc): MutPtr =
    if (windowsWin32UiInputImeNapiAddon != null) MutPtr((windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmLockIMC(param0.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immLockIMCC(param0: Himcc): MutPtr =
    if (windowsWin32UiInputImeNapiAddon != null) MutPtr((windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmLockIMCC(param0.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immNotifyIME(param0: Himc, dwaction: NotifyImeAction, dwindex: NotifyImeIndex, dwvalue: UInt): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmNotifyIME(param0.rawAddress.toString(), dwaction.toInt(), dwindex.toInt(), dwvalue.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immReSizeIMCC(param0: Himcc, param1: UInt): Himcc =
    if (windowsWin32UiInputImeNapiAddon != null) MutPtr((windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmReSizeIMCC(param0.rawAddress.toString(), param1.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immRegisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszregister: Pcstr): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmRegisterWordA(param0.rawAddress.toString(), lpszreading.rawAddress.toString(), param2.toInt(), lpszregister.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immRegisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszregister: Pcwstr): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmRegisterWordW(param0.rawAddress.toString(), lpszreading.rawAddress.toString(), param2.toInt(), lpszregister.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immReleaseContext(param0: Hwnd, param1: Himc): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmReleaseContext(param0.rawAddress.toString(), param1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immRequestMessageA(param0: Himc, param1: Wparam, param2: Lparam): Lresult =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmRequestMessageA(param0.rawAddress.toString(), param1.toString(), param2.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immRequestMessageW(param0: Himc, param1: Wparam, param2: Lparam): Lresult =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmRequestMessageW(param0.rawAddress.toString(), param1.toString(), param2.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetCandidateWindow(param0: Himc, lpcandidate: ConstPtr): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmSetCandidateWindow(param0.rawAddress.toString(), lpcandidate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetCompositionFontA(param0: Himc, lplf: ConstPtr): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmSetCompositionFontA(param0.rawAddress.toString(), lplf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetCompositionFontW(param0: Himc, lplf: ConstPtr): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmSetCompositionFontW(param0.rawAddress.toString(), lplf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetCompositionStringA(param0: Himc, dwindex: SetCompositionStringType, lpcomp: ConstPtr, dwcomplen: UInt, lpread: ConstPtr, dwreadlen: UInt): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmSetCompositionStringA(param0.rawAddress.toString(), dwindex.toInt(), lpcomp.rawAddress.toString(), dwcomplen.toInt(), lpread.rawAddress.toString(), dwreadlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetCompositionStringW(param0: Himc, dwindex: SetCompositionStringType, lpcomp: ConstPtr, dwcomplen: UInt, lpread: ConstPtr, dwreadlen: UInt): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmSetCompositionStringW(param0.rawAddress.toString(), dwindex.toInt(), lpcomp.rawAddress.toString(), dwcomplen.toInt(), lpread.rawAddress.toString(), dwreadlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetCompositionWindow(param0: Himc, lpcompform: ConstPtr): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmSetCompositionWindow(param0.rawAddress.toString(), lpcompform.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetConversionStatus(param0: Himc, param1: ImeConversionMode, param2: ImeSentenceMode): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmSetConversionStatus(param0.rawAddress.toString(), param1.toInt(), param2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetHotKey(param0: UInt, param1: UInt, param2: UInt, param3: Hkl): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmSetHotKey(param0.toInt(), param1.toInt(), param2.toInt(), param3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetOpenStatus(param0: Himc, param1: Bool): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmSetOpenStatus(param0.rawAddress.toString(), param1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSetStatusWindowPos(param0: Himc, lpptpos: ConstPtr): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmSetStatusWindowPos(param0.rawAddress.toString(), lpptpos.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immShowSoftKeyboard(param0: Hwnd, param1: Int): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmShowSoftKeyboard(param0.rawAddress.toString(), param1) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immSimulateHotKey(param0: Hwnd, param1: ImeHotkeyIdentifier): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmSimulateHotKey(param0.rawAddress.toString(), param1.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immUnlockIMC(param0: Himc): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmUnlockIMC(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immUnlockIMCC(param0: Himcc): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmUnlockIMCC(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immUnregisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszunregister: Pcstr): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmUnregisterWordA(param0.rawAddress.toString(), lpszreading.rawAddress.toString(), param2.toInt(), lpszunregister.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun immUnregisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszunregister: Pcwstr): Bool =
    if (windowsWin32UiInputImeNapiAddon != null) (windowsWin32UiInputImeNapiAddon.windowssysWindowsWin32UiInputImeImmUnregisterWordW(param0.rawAddress.toString(), lpszreading.rawAddress.toString(), param2.toInt(), lpszunregister.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
