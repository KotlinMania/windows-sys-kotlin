@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.ime

import io.github.kotlinmania.rustlang.core.ffi.CVoid
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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfonta
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfontw
import io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse.Hkl

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun immAssociateContext(param0: Hwnd, param1: Himc): Himc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmAssociateContext")

public actual fun immAssociateContextEx(param0: Hwnd, param1: Himc, param2: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmAssociateContextEx")

public actual fun immConfigureIMEA(param0: Hkl, param1: Hwnd, param2: UInt, param3: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmConfigureIMEA")

public actual fun immConfigureIMEW(param0: Hkl, param1: Hwnd, param2: UInt, param3: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmConfigureIMEW")

public actual fun immCreateContext(): Himc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmCreateContext")

public actual fun immCreateIMCC(param0: UInt): Himcc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmCreateIMCC")

public actual fun immCreateSoftKeyboard(param0: UInt, param1: Hwnd, param2: Int, param3: Int): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmCreateSoftKeyboard")

public actual fun immDestroyContext(param0: Himc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmDestroyContext")

public actual fun immDestroyIMCC(param0: Himcc): Himcc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmDestroyIMCC")

public actual fun immDestroySoftKeyboard(param0: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmDestroySoftKeyboard")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputImeImmDisableIME")
private external fun wasiWindowssysWindowsWin32UiInputImeImmDisableIME(param0: Int): Int

public actual fun immDisableIME(param0: UInt): Bool =
    wasiWindowssysWindowsWin32UiInputImeImmDisableIME(param0.toInt()).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputImeImmDisableLegacyIME")
private external fun wasiWindowssysWindowsWin32UiInputImeImmDisableLegacyIME(): Int

public actual fun immDisableLegacyIME(): Bool =
    wasiWindowssysWindowsWin32UiInputImeImmDisableLegacyIME().toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiInputImeImmDisableTextFrameService")
private external fun wasiWindowssysWindowsWin32UiInputImeImmDisableTextFrameService(idthread: Int): Int

public actual fun immDisableTextFrameService(idthread: UInt): Bool =
    wasiWindowssysWindowsWin32UiInputImeImmDisableTextFrameService(idthread.toInt()).toInt()

public actual fun immEnumInputContext(idthread: UInt, lpfn: Imcenumproc, lparam: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmEnumInputContext")

public actual fun immEnumRegisterWordA(param0: Hkl, param1: Registerwordenumproca, lpszreading: Pcstr, param3: UInt, lpszregister: Pcstr, param5: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmEnumRegisterWordA")

public actual fun immEnumRegisterWordW(param0: Hkl, param1: Registerwordenumprocw, lpszreading: Pcwstr, param3: UInt, lpszregister: Pcwstr, param5: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmEnumRegisterWordW")

public actual fun immEscapeA(param0: Hkl, param1: Himc, param2: ImeEscape, param3: MutPtr<CVoid>): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmEscapeA")

public actual fun immEscapeW(param0: Hkl, param1: Himc, param2: ImeEscape, param3: MutPtr<CVoid>): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmEscapeW")

public actual fun immGenerateMessage(param0: Himc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGenerateMessage")

public actual fun immGetCandidateListA(param0: Himc, deindex: UInt, lpcandlist: MutPtr<Candidatelist>, dwbuflen: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetCandidateListA")

public actual fun immGetCandidateListCountA(param0: Himc, lpdwlistcount: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetCandidateListCountA")

public actual fun immGetCandidateListCountW(param0: Himc, lpdwlistcount: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetCandidateListCountW")

public actual fun immGetCandidateListW(param0: Himc, deindex: UInt, lpcandlist: MutPtr<Candidatelist>, dwbuflen: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetCandidateListW")

public actual fun immGetCandidateWindow(param0: Himc, param1: UInt, lpcandidate: MutPtr<Candidateform>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetCandidateWindow")

public actual fun immGetCompositionFontA(param0: Himc, lplf: MutPtr<Logfonta>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetCompositionFontA")

public actual fun immGetCompositionFontW(param0: Himc, lplf: MutPtr<Logfontw>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetCompositionFontW")

public actual fun immGetCompositionStringA(param0: Himc, param1: ImeCompositionString, lpbuf: MutPtr<CVoid>, dwbuflen: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetCompositionStringA")

public actual fun immGetCompositionStringW(param0: Himc, param1: ImeCompositionString, lpbuf: MutPtr<CVoid>, dwbuflen: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetCompositionStringW")

public actual fun immGetCompositionWindow(param0: Himc, lpcompform: MutPtr<Compositionform>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetCompositionWindow")

public actual fun immGetContext(param0: Hwnd): Himc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetContext")

public actual fun immGetConversionListA(param0: Hkl, param1: Himc, lpsrc: Pcstr, lpdst: MutPtr<Candidatelist>, dwbuflen: UInt, uflag: GetConversionListFlag): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetConversionListA")

public actual fun immGetConversionListW(param0: Hkl, param1: Himc, lpsrc: Pcwstr, lpdst: MutPtr<Candidatelist>, dwbuflen: UInt, uflag: GetConversionListFlag): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetConversionListW")

public actual fun immGetConversionStatus(param0: Himc, lpfdwconversion: MutPtr<ImeConversionMode>, lpfdwsentence: MutPtr<ImeSentenceMode>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetConversionStatus")

public actual fun immGetDefaultIMEWnd(param0: Hwnd): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetDefaultIMEWnd")

public actual fun immGetDescriptionA(param0: Hkl, lpszdescription: Pstr, ubuflen: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetDescriptionA")

public actual fun immGetDescriptionW(param0: Hkl, lpszdescription: Pwstr, ubuflen: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetDescriptionW")

public actual fun immGetGuideLineA(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pstr, dwbuflen: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetGuideLineA")

public actual fun immGetGuideLineW(param0: Himc, dwindex: GetGuideLineType, lpbuf: Pwstr, dwbuflen: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetGuideLineW")

public actual fun immGetHotKey(param0: UInt, lpumodifiers: MutPtr<UInt>, lpuvkey: MutPtr<UInt>, phkl: MutPtr<Hkl>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetHotKey")

public actual fun immGetIMCCLockCount(param0: Himcc): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetIMCCLockCount")

public actual fun immGetIMCCSize(param0: Himcc): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetIMCCSize")

public actual fun immGetIMCLockCount(param0: Himc): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetIMCLockCount")

public actual fun immGetIMEFileNameA(param0: Hkl, lpszfilename: Pstr, ubuflen: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetIMEFileNameA")

public actual fun immGetIMEFileNameW(param0: Hkl, lpszfilename: Pwstr, ubuflen: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetIMEFileNameW")

public actual fun immGetImeMenuItemsA(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: MutPtr<Imemenuiteminfoa>, lpimemenu: MutPtr<Imemenuiteminfoa>, dwsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetImeMenuItemsA")

public actual fun immGetImeMenuItemsW(param0: Himc, param1: UInt, param2: UInt, lpimeparentmenu: MutPtr<Imemenuiteminfow>, lpimemenu: MutPtr<Imemenuiteminfow>, dwsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetImeMenuItemsW")

public actual fun immGetOpenStatus(param0: Himc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetOpenStatus")

public actual fun immGetProperty(param0: Hkl, param1: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetProperty")

public actual fun immGetRegisterWordStyleA(param0: Hkl, nitem: UInt, lpstylebuf: MutPtr<Stylebufa>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetRegisterWordStyleA")

public actual fun immGetRegisterWordStyleW(param0: Hkl, nitem: UInt, lpstylebuf: MutPtr<Stylebufw>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetRegisterWordStyleW")

public actual fun immGetStatusWindowPos(param0: Himc, lpptpos: MutPtr<Point>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetStatusWindowPos")

public actual fun immGetVirtualKey(param0: Hwnd): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmGetVirtualKey")

public actual fun immInstallIMEA(lpszimefilename: Pcstr, lpszlayouttext: Pcstr): Hkl =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmInstallIMEA")

public actual fun immInstallIMEW(lpszimefilename: Pcwstr, lpszlayouttext: Pcwstr): Hkl =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmInstallIMEW")

public actual fun immIsIME(param0: Hkl): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmIsIME")

public actual fun immIsUIMessageA(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmIsUIMessageA")

public actual fun immIsUIMessageW(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmIsUIMessageW")

public actual fun immLockIMC(param0: Himc): MutPtr<Inputcontext> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmLockIMC")

public actual fun immLockIMCC(param0: Himcc): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmLockIMCC")

public actual fun immNotifyIME(param0: Himc, dwaction: NotifyImeAction, dwindex: NotifyImeIndex, dwvalue: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmNotifyIME")

public actual fun immReSizeIMCC(param0: Himcc, param1: UInt): Himcc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmReSizeIMCC")

public actual fun immRegisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszregister: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmRegisterWordA")

public actual fun immRegisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszregister: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmRegisterWordW")

public actual fun immReleaseContext(param0: Hwnd, param1: Himc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmReleaseContext")

public actual fun immRequestMessageA(param0: Himc, param1: Wparam, param2: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmRequestMessageA")

public actual fun immRequestMessageW(param0: Himc, param1: Wparam, param2: Lparam): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmRequestMessageW")

public actual fun immSetCandidateWindow(param0: Himc, lpcandidate: ConstPtr<Candidateform>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmSetCandidateWindow")

public actual fun immSetCompositionFontA(param0: Himc, lplf: ConstPtr<Logfonta>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmSetCompositionFontA")

public actual fun immSetCompositionFontW(param0: Himc, lplf: ConstPtr<Logfontw>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmSetCompositionFontW")

public actual fun immSetCompositionStringA(param0: Himc, dwindex: SetCompositionStringType, lpcomp: ConstPtr<CVoid>, dwcomplen: UInt, lpread: ConstPtr<CVoid>, dwreadlen: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmSetCompositionStringA")

public actual fun immSetCompositionStringW(param0: Himc, dwindex: SetCompositionStringType, lpcomp: ConstPtr<CVoid>, dwcomplen: UInt, lpread: ConstPtr<CVoid>, dwreadlen: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmSetCompositionStringW")

public actual fun immSetCompositionWindow(param0: Himc, lpcompform: ConstPtr<Compositionform>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmSetCompositionWindow")

public actual fun immSetConversionStatus(param0: Himc, param1: ImeConversionMode, param2: ImeSentenceMode): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmSetConversionStatus")

public actual fun immSetHotKey(param0: UInt, param1: UInt, param2: UInt, param3: Hkl): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmSetHotKey")

public actual fun immSetOpenStatus(param0: Himc, param1: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmSetOpenStatus")

public actual fun immSetStatusWindowPos(param0: Himc, lpptpos: ConstPtr<Point>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmSetStatusWindowPos")

public actual fun immShowSoftKeyboard(param0: Hwnd, param1: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmShowSoftKeyboard")

public actual fun immSimulateHotKey(param0: Hwnd, param1: ImeHotkeyIdentifier): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmSimulateHotKey")

public actual fun immUnlockIMC(param0: Himc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmUnlockIMC")

public actual fun immUnlockIMCC(param0: Himcc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmUnlockIMCC")

public actual fun immUnregisterWordA(param0: Hkl, lpszreading: Pcstr, param2: UInt, lpszunregister: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmUnregisterWordA")

public actual fun immUnregisterWordW(param0: Hkl, lpszreading: Pcwstr, param2: UInt, lpszunregister: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiInputImeImmUnregisterWordW")
