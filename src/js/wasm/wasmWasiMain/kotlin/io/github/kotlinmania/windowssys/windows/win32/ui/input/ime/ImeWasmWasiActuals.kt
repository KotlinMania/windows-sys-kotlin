@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.ime

import io.github.kotlinmania.windowssys.COpaquePointer
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

public actual fun immAssociateContext(param0: Hwnd, param1: Himc): Himc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immAssociateContextEx(param0: Hwnd, param1: Himc, param2: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immConfigureIMEA(param0: Hkl, param1: Hwnd, param2: UInt, param3: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immConfigureIMEW(param0: Hkl, param1: Hwnd, param2: UInt, param3: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immCreateContext(): Himc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immCreateIMCC(param0: UInt): Himcc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immCreateSoftKeyboard(param0: UInt, param1: Hwnd, param2: Int, param3: Int): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immDestroyContext(param0: Himc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immDestroyIMCC(param0: Himcc): Himcc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immDestroySoftKeyboard(param0: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immDisableIME(param0: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immDisableLegacyIME(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immDisableTextFrameService(idthread: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immEnumInputContext(idthread: UInt, lpfn: Imcenumproc, lparam: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immEnumRegisterWordA(param0: Hkl, param1: Registerwordenumproca, lpszreading: Pcstr, param3: UInt, lpszregister: Pcstr, param5: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immEnumRegisterWordW(param0: Hkl, param1: Registerwordenumprocw, lpszreading: Pcwstr, param3: UInt, lpszregister: Pcwstr, param5: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immEscapeA(param0: Hkl, param1: Himc, param2: ImeEscape, param3: COpaquePointer?): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immEscapeW(param0: Hkl, param1: Himc, param2: ImeEscape, param3: COpaquePointer?): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGenerateMessage(param0: Himc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetCandidateListA(param0: Himc, deindex: UInt, lpcandlist: COpaquePointer?, dwbuflen: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetCandidateListCountA(param0: Himc, lpdwlistcount: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetCandidateListCountW(param0: Himc, lpdwlistcount: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetCandidateListW(param0: Himc, deindex: UInt, lpcandlist: COpaquePointer?, dwbuflen: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetCandidateWindow(param0: Himc, param1: UInt, lpcandidate: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetCompositionFontA(param0: Himc, lplf: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetCompositionFontW(param0: Himc, lplf: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetCompositionStringA(param0: Himc, param1: ImeCompositionString, lpbuf: COpaquePointer?, dwbuflen: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetCompositionStringW(param0: Himc, param1: ImeCompositionString, lpbuf: COpaquePointer?, dwbuflen: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetCompositionWindow(param0: Himc, lpcompform: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetContext(param0: Hwnd): Himc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetConversionListA(param0: Hkl, param1: Himc, lpsrc: Pcstr, lpdst: COpaquePointer?, dwbuflen: UInt, uflag: GetConversionListFlag): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetConversionListW(param0: Hkl, param1: Himc, lpsrc: Pcwstr, lpdst: COpaquePointer?, dwbuflen: UInt, uflag: GetConversionListFlag): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetConversionStatus(param0: Himc, lpfdwconversion: COpaquePointer?, lpfdwsentence: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetDefaultIMEWnd(param0: Hwnd): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetDescriptionA(param0: Hkl, lpszdescription: Pstr, ubuflen: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetDescriptionW(param0: Hkl, lpszdescription: Pwstr, ubuflen: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetGuideLineA(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pstr, dwbuflen: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetGuideLineW(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pwstr, dwbuflen: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetHotKey(param0: UInt, lpumodifiers: COpaquePointer?, lpuvkey: COpaquePointer?, phkl: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetIMCCLockCount(param0: Himcc): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetIMCCSize(param0: Himcc): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetIMCLockCount(param0: Himc): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetIMEFileNameA(param0: Hkl, lpszfilename: Pstr, ubuflen: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetIMEFileNameW(param0: Hkl, lpszfilename: Pwstr, ubuflen: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetImeMenuItemsA(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: COpaquePointer?, lpimemenu: COpaquePointer?, dwsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetImeMenuItemsW(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: COpaquePointer?, lpimemenu: COpaquePointer?, dwsize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetOpenStatus(param0: Himc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetProperty(param0: Hkl, param1: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetRegisterWordStyleA(param0: Hkl, nitem: UInt, lpstylebuf: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetRegisterWordStyleW(param0: Hkl, nitem: UInt, lpstylebuf: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetStatusWindowPos(param0: Himc, lpptpos: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immGetVirtualKey(param0: Hwnd): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immInstallIMEA(lpszimefilename: Pcstr, lpszlayouttext: Pcstr): Hkl =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immInstallIMEW(lpszimefilename: Pcwstr, lpszlayouttext: Pcwstr): Hkl =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immIsIME(param0: Hkl): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immIsUIMessageA(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immIsUIMessageW(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immLockIMC(param0: Himc): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immLockIMCC(param0: Himcc): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immNotifyIME(param0: Himc, dwaction: NotifyImeAction, dwindex: NotifyImeIndex, dwvalue: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immReSizeIMCC(param0: Himcc, param1: UInt): Himcc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immRegisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszregister: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immRegisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszregister: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immReleaseContext(param0: Hwnd, param1: Himc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immRequestMessageA(param0: Himc, param1: Wparam, param2: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immRequestMessageW(param0: Himc, param1: Wparam, param2: Lparam): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immSetCandidateWindow(param0: Himc, lpcandidate: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immSetCompositionFontA(param0: Himc, lplf: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immSetCompositionFontW(param0: Himc, lplf: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immSetCompositionStringA(param0: Himc, dwindex: SetCompositionStringType, lpcomp: COpaquePointer?, dwcomplen: UInt, lpread: COpaquePointer?, dwreadlen: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immSetCompositionStringW(param0: Himc, dwindex: SetCompositionStringType, lpcomp: COpaquePointer?, dwcomplen: UInt, lpread: COpaquePointer?, dwreadlen: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immSetCompositionWindow(param0: Himc, lpcompform: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immSetConversionStatus(param0: Himc, param1: ImeConversionMode, param2: ImeSentenceMode): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immSetHotKey(param0: UInt, param1: UInt, param2: UInt, param3: Hkl): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immSetOpenStatus(param0: Himc, param1: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immSetStatusWindowPos(param0: Himc, lpptpos: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immShowSoftKeyboard(param0: Hwnd, param1: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immSimulateHotKey(param0: Hwnd, param1: ImeHotkeyIdentifier): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immUnlockIMC(param0: Himc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immUnlockIMCC(param0: Himcc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immUnregisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszunregister: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun immUnregisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszunregister: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
