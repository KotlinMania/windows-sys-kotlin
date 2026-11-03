package io.github.kotlinmania.windowssys.windows.win32.ui.input.ime

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(param0: HIMC, param1: Foundation.LPARAM): BOOL
}

public fun interface FnCallback1 {
    public operator fun invoke(lpszreading: PCSTR, param1: UInt, lpszstring: PCSTR, param3: Long): Int
}

public fun interface FnCallback2 {
    public operator fun invoke(lpszreading: PCWSTR, param1: UInt, lpszstring: PCWSTR, param3: Long): Int
}

public fun ImmAssociateContext(param0: Foundation.HWND, param1: HIMC): HIMC {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmAssociateContext", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1))
}

public fun ImmAssociateContextEx(param0: Foundation.HWND, param1: HIMC, param2: UInt): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmAssociateContextEx", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1, param2.toLong())).toInt()
}

public fun ImmConfigureIMEA(param0: KeyboardAndMouse.HKL, param1: Foundation.HWND, param2: UInt, param3: Long): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmConfigureIMEA", longArrayOf(Win32DynamicFfi.objectSlot(param0), Win32DynamicFfi.objectSlot(param1), param2.toLong(), param3)).toInt()
}

public fun ImmConfigureIMEW(param0: KeyboardAndMouse.HKL, param1: Foundation.HWND, param2: UInt, param3: Long): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmConfigureIMEW", longArrayOf(Win32DynamicFfi.objectSlot(param0), Win32DynamicFfi.objectSlot(param1), param2.toLong(), param3)).toInt()
}

public fun ImmCreateContext(): HIMC {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmCreateContext", longArrayOf())
}

public fun ImmCreateIMCC(param0: UInt): HIMCC {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmCreateIMCC", longArrayOf(param0.toLong()))
}

public fun ImmCreateSoftKeyboard(param0: UInt, param1: Foundation.HWND, param2: Int, param3: Int): Foundation.HWND {
    Win32DynamicFfi.invoke("imm32.dll", "ImmCreateSoftKeyboard", longArrayOf(param0.toLong(), Win32DynamicFfi.objectSlot(param1), param2.toLong(), param3.toLong()))
    return Foundation.HWND()
}

public fun ImmDestroyContext(param0: HIMC): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmDestroyContext", longArrayOf(param0)).toInt()
}

public fun ImmDestroyIMCC(param0: HIMCC): HIMCC {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmDestroyIMCC", longArrayOf(param0))
}

public fun ImmDestroySoftKeyboard(param0: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmDestroySoftKeyboard", longArrayOf(Win32DynamicFfi.objectSlot(param0))).toInt()
}

public fun ImmDisableIME(param0: UInt): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmDisableIME", longArrayOf(param0.toLong())).toInt()
}

public fun ImmDisableLegacyIME(): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmDisableLegacyIME", longArrayOf()).toInt()
}

public fun ImmDisableTextFrameService(idthread: UInt): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmDisableTextFrameService", longArrayOf(idthread.toLong())).toInt()
}

public fun ImmEnumInputContext(idthread: UInt, lpfn: IMCENUMPROC, lparam: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmEnumInputContext", longArrayOf(idthread.toLong(), Win32DynamicFfi.objectSlot(lpfn), Win32DynamicFfi.objectSlot(lparam))).toInt()
}

public fun ImmEnumRegisterWordA(param0: KeyboardAndMouse.HKL, param1: REGISTERWORDENUMPROCA, lpszreading: PCSTR, param3: UInt, lpszregister: PCSTR, param5: Long): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmEnumRegisterWordA", longArrayOf(Win32DynamicFfi.objectSlot(param0), Win32DynamicFfi.objectSlot(param1), lpszreading, param3.toLong(), lpszregister, param5)).toUInt()
}

public fun ImmEnumRegisterWordW(param0: KeyboardAndMouse.HKL, param1: REGISTERWORDENUMPROCW, lpszreading: PCWSTR, param3: UInt, lpszregister: PCWSTR, param5: Long): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmEnumRegisterWordW", longArrayOf(Win32DynamicFfi.objectSlot(param0), Win32DynamicFfi.objectSlot(param1), lpszreading, param3.toLong(), lpszregister, param5)).toUInt()
}

public fun ImmEscapeA(param0: KeyboardAndMouse.HKL, param1: HIMC, param2: IME_ESCAPE, param3: Long): Foundation.LRESULT {
    Win32DynamicFfi.invoke("imm32.dll", "ImmEscapeA", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1, param2.toLong(), param3))
    return Foundation.LRESULT()
}

public fun ImmEscapeW(param0: KeyboardAndMouse.HKL, param1: HIMC, param2: IME_ESCAPE, param3: Long): Foundation.LRESULT {
    Win32DynamicFfi.invoke("imm32.dll", "ImmEscapeW", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1, param2.toLong(), param3))
    return Foundation.LRESULT()
}

public fun ImmGenerateMessage(param0: HIMC): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGenerateMessage", longArrayOf(param0)).toInt()
}

public fun ImmGetCandidateListA(param0: HIMC, deindex: UInt, lpcandlist: Long, dwbuflen: UInt): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetCandidateListA", longArrayOf(param0, deindex.toLong(), lpcandlist, dwbuflen.toLong())).toUInt()
}

public fun ImmGetCandidateListCountA(param0: HIMC, lpdwlistcount: Long): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetCandidateListCountA", longArrayOf(param0, lpdwlistcount)).toUInt()
}

public fun ImmGetCandidateListCountW(param0: HIMC, lpdwlistcount: Long): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetCandidateListCountW", longArrayOf(param0, lpdwlistcount)).toUInt()
}

public fun ImmGetCandidateListW(param0: HIMC, deindex: UInt, lpcandlist: Long, dwbuflen: UInt): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetCandidateListW", longArrayOf(param0, deindex.toLong(), lpcandlist, dwbuflen.toLong())).toUInt()
}

public fun ImmGetCandidateWindow(param0: HIMC, param1: UInt, lpcandidate: Long): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetCandidateWindow", longArrayOf(param0, param1.toLong(), lpcandidate)).toInt()
}

public fun ImmGetCompositionFontA(param0: HIMC, lplf: Long): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetCompositionFontA", longArrayOf(param0, lplf)).toInt()
}

public fun ImmGetCompositionFontW(param0: HIMC, lplf: Long): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetCompositionFontW", longArrayOf(param0, lplf)).toInt()
}

public fun ImmGetCompositionStringA(param0: HIMC, param1: IME_COMPOSITION_STRING, lpbuf: Long, dwbuflen: UInt): Int {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetCompositionStringA", longArrayOf(param0, param1.toLong(), lpbuf, dwbuflen.toLong())).toInt()
}

public fun ImmGetCompositionStringW(param0: HIMC, param1: IME_COMPOSITION_STRING, lpbuf: Long, dwbuflen: UInt): Int {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetCompositionStringW", longArrayOf(param0, param1.toLong(), lpbuf, dwbuflen.toLong())).toInt()
}

public fun ImmGetCompositionWindow(param0: HIMC, lpcompform: Long): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetCompositionWindow", longArrayOf(param0, lpcompform)).toInt()
}

public fun ImmGetContext(param0: Foundation.HWND): HIMC {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetContext", longArrayOf(Win32DynamicFfi.objectSlot(param0)))
}

public fun ImmGetConversionListA(param0: KeyboardAndMouse.HKL, param1: HIMC, lpsrc: PCSTR, lpdst: Long, dwbuflen: UInt, uflag: GET_CONVERSION_LIST_FLAG): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetConversionListA", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1, lpsrc, lpdst, dwbuflen.toLong(), uflag.toLong())).toUInt()
}

public fun ImmGetConversionListW(param0: KeyboardAndMouse.HKL, param1: HIMC, lpsrc: PCWSTR, lpdst: Long, dwbuflen: UInt, uflag: GET_CONVERSION_LIST_FLAG): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetConversionListW", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1, lpsrc, lpdst, dwbuflen.toLong(), uflag.toLong())).toUInt()
}

public fun ImmGetConversionStatus(param0: HIMC, lpfdwconversion: Long, lpfdwsentence: Long): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetConversionStatus", longArrayOf(param0, lpfdwconversion, lpfdwsentence)).toInt()
}

public fun ImmGetDefaultIMEWnd(param0: Foundation.HWND): Foundation.HWND {
    Win32DynamicFfi.invoke("imm32.dll", "ImmGetDefaultIMEWnd", longArrayOf(Win32DynamicFfi.objectSlot(param0)))
    return Foundation.HWND()
}

public fun ImmGetDescriptionA(param0: KeyboardAndMouse.HKL, lpszdescription: PSTR, ubuflen: UInt): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetDescriptionA", longArrayOf(Win32DynamicFfi.objectSlot(param0), lpszdescription, ubuflen.toLong())).toUInt()
}

public fun ImmGetDescriptionW(param0: KeyboardAndMouse.HKL, lpszdescription: PWSTR, ubuflen: UInt): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetDescriptionW", longArrayOf(Win32DynamicFfi.objectSlot(param0), lpszdescription, ubuflen.toLong())).toUInt()
}

public fun ImmGetGuideLineA(param0: HIMC, dwindex: GET_GUIDE_LINE_TYPE, lpbuf: PSTR, dwbuflen: UInt): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetGuideLineA", longArrayOf(param0, dwindex.toLong(), lpbuf, dwbuflen.toLong())).toUInt()
}

public fun ImmGetGuideLineW(param0: HIMC, dwindex: GET_GUIDE_LINE_TYPE, lpbuf: PWSTR, dwbuflen: UInt): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetGuideLineW", longArrayOf(param0, dwindex.toLong(), lpbuf, dwbuflen.toLong())).toUInt()
}

public fun ImmGetHotKey(param0: UInt, lpumodifiers: Long, lpuvkey: Long, phkl: Long): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetHotKey", longArrayOf(param0.toLong(), lpumodifiers, lpuvkey, phkl)).toInt()
}

public fun ImmGetIMCCLockCount(param0: HIMCC): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetIMCCLockCount", longArrayOf(param0)).toUInt()
}

public fun ImmGetIMCCSize(param0: HIMCC): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetIMCCSize", longArrayOf(param0)).toUInt()
}

public fun ImmGetIMCLockCount(param0: HIMC): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetIMCLockCount", longArrayOf(param0)).toUInt()
}

public fun ImmGetIMEFileNameA(param0: KeyboardAndMouse.HKL, lpszfilename: PSTR, ubuflen: UInt): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetIMEFileNameA", longArrayOf(Win32DynamicFfi.objectSlot(param0), lpszfilename, ubuflen.toLong())).toUInt()
}

public fun ImmGetIMEFileNameW(param0: KeyboardAndMouse.HKL, lpszfilename: PWSTR, ubuflen: UInt): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetIMEFileNameW", longArrayOf(Win32DynamicFfi.objectSlot(param0), lpszfilename, ubuflen.toLong())).toUInt()
}

public fun ImmGetImeMenuItemsA(param0: HIMC, param1: UInt, param2: UInt, lpimeparentmenu: Long, lpimemenu: Long, dwsize: UInt): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetImeMenuItemsA", longArrayOf(param0, param1.toLong(), param2.toLong(), lpimeparentmenu, lpimemenu, dwsize.toLong())).toUInt()
}

public fun ImmGetImeMenuItemsW(param0: HIMC, param1: UInt, param2: UInt, lpimeparentmenu: Long, lpimemenu: Long, dwsize: UInt): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetImeMenuItemsW", longArrayOf(param0, param1.toLong(), param2.toLong(), lpimeparentmenu, lpimemenu, dwsize.toLong())).toUInt()
}

public fun ImmGetOpenStatus(param0: HIMC): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetOpenStatus", longArrayOf(param0)).toInt()
}

public fun ImmGetProperty(param0: KeyboardAndMouse.HKL, param1: UInt): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetProperty", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1.toLong())).toUInt()
}

public fun ImmGetRegisterWordStyleA(param0: KeyboardAndMouse.HKL, nitem: UInt, lpstylebuf: Long): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetRegisterWordStyleA", longArrayOf(Win32DynamicFfi.objectSlot(param0), nitem.toLong(), lpstylebuf)).toUInt()
}

public fun ImmGetRegisterWordStyleW(param0: KeyboardAndMouse.HKL, nitem: UInt, lpstylebuf: Long): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetRegisterWordStyleW", longArrayOf(Win32DynamicFfi.objectSlot(param0), nitem.toLong(), lpstylebuf)).toUInt()
}

public fun ImmGetStatusWindowPos(param0: HIMC, lpptpos: Long): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetStatusWindowPos", longArrayOf(param0, lpptpos)).toInt()
}

public fun ImmGetVirtualKey(param0: Foundation.HWND): UInt {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmGetVirtualKey", longArrayOf(Win32DynamicFfi.objectSlot(param0))).toUInt()
}

public fun ImmInstallIMEA(lpszimefilename: PCSTR, lpszlayouttext: PCSTR): KeyboardAndMouse.HKL {
    Win32DynamicFfi.invoke("imm32.dll", "ImmInstallIMEA", longArrayOf(lpszimefilename, lpszlayouttext))
    return KeyboardAndMouse.HKL()
}

public fun ImmInstallIMEW(lpszimefilename: PCWSTR, lpszlayouttext: PCWSTR): KeyboardAndMouse.HKL {
    Win32DynamicFfi.invoke("imm32.dll", "ImmInstallIMEW", longArrayOf(lpszimefilename, lpszlayouttext))
    return KeyboardAndMouse.HKL()
}

public fun ImmIsIME(param0: KeyboardAndMouse.HKL): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmIsIME", longArrayOf(Win32DynamicFfi.objectSlot(param0))).toInt()
}

public fun ImmIsUIMessageA(param0: Foundation.HWND, param1: UInt, param2: Foundation.WPARAM, param3: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmIsUIMessageA", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1.toLong(), Win32DynamicFfi.objectSlot(param2), Win32DynamicFfi.objectSlot(param3))).toInt()
}

public fun ImmIsUIMessageW(param0: Foundation.HWND, param1: UInt, param2: Foundation.WPARAM, param3: Foundation.LPARAM): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmIsUIMessageW", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1.toLong(), Win32DynamicFfi.objectSlot(param2), Win32DynamicFfi.objectSlot(param3))).toInt()
}

public fun ImmLockIMC(param0: HIMC): Long {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmLockIMC", longArrayOf(param0))
}

public fun ImmLockIMCC(param0: HIMCC): Long {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmLockIMCC", longArrayOf(param0))
}

public fun ImmNotifyIME(param0: HIMC, dwaction: NOTIFY_IME_ACTION, dwindex: NOTIFY_IME_INDEX, dwvalue: UInt): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmNotifyIME", longArrayOf(param0, dwaction.toLong(), dwindex.toLong(), dwvalue.toLong())).toInt()
}

public fun ImmReSizeIMCC(param0: HIMCC, param1: UInt): HIMCC {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmReSizeIMCC", longArrayOf(param0, param1.toLong()))
}

public fun ImmRegisterWordA(param0: KeyboardAndMouse.HKL, lpszreading: PCSTR, param2: UInt, lpszregister: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmRegisterWordA", longArrayOf(Win32DynamicFfi.objectSlot(param0), lpszreading, param2.toLong(), lpszregister)).toInt()
}

public fun ImmRegisterWordW(param0: KeyboardAndMouse.HKL, lpszreading: PCWSTR, param2: UInt, lpszregister: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmRegisterWordW", longArrayOf(Win32DynamicFfi.objectSlot(param0), lpszreading, param2.toLong(), lpszregister)).toInt()
}

public fun ImmReleaseContext(param0: Foundation.HWND, param1: HIMC): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmReleaseContext", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1)).toInt()
}

public fun ImmRequestMessageA(param0: HIMC, param1: Foundation.WPARAM, param2: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("imm32.dll", "ImmRequestMessageA", longArrayOf(param0, Win32DynamicFfi.objectSlot(param1), Win32DynamicFfi.objectSlot(param2)))
    return Foundation.LRESULT()
}

public fun ImmRequestMessageW(param0: HIMC, param1: Foundation.WPARAM, param2: Foundation.LPARAM): Foundation.LRESULT {
    Win32DynamicFfi.invoke("imm32.dll", "ImmRequestMessageW", longArrayOf(param0, Win32DynamicFfi.objectSlot(param1), Win32DynamicFfi.objectSlot(param2)))
    return Foundation.LRESULT()
}

public fun ImmSetCandidateWindow(param0: HIMC, lpcandidate: Long): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmSetCandidateWindow", longArrayOf(param0, lpcandidate)).toInt()
}

public fun ImmSetCompositionFontA(param0: HIMC, lplf: Long): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmSetCompositionFontA", longArrayOf(param0, lplf)).toInt()
}

public fun ImmSetCompositionFontW(param0: HIMC, lplf: Long): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmSetCompositionFontW", longArrayOf(param0, lplf)).toInt()
}

public fun ImmSetCompositionStringA(param0: HIMC, dwindex: SET_COMPOSITION_STRING_TYPE, lpcomp: Long, dwcomplen: UInt, lpread: Long, dwreadlen: UInt): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmSetCompositionStringA", longArrayOf(param0, dwindex.toLong(), lpcomp, dwcomplen.toLong(), lpread, dwreadlen.toLong())).toInt()
}

public fun ImmSetCompositionStringW(param0: HIMC, dwindex: SET_COMPOSITION_STRING_TYPE, lpcomp: Long, dwcomplen: UInt, lpread: Long, dwreadlen: UInt): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmSetCompositionStringW", longArrayOf(param0, dwindex.toLong(), lpcomp, dwcomplen.toLong(), lpread, dwreadlen.toLong())).toInt()
}

public fun ImmSetCompositionWindow(param0: HIMC, lpcompform: Long): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmSetCompositionWindow", longArrayOf(param0, lpcompform)).toInt()
}

public fun ImmSetConversionStatus(param0: HIMC, param1: IME_CONVERSION_MODE, param2: IME_SENTENCE_MODE): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmSetConversionStatus", longArrayOf(param0, param1.toLong(), param2.toLong())).toInt()
}

public fun ImmSetHotKey(param0: UInt, param1: UInt, param2: UInt, param3: KeyboardAndMouse.HKL): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmSetHotKey", longArrayOf(param0.toLong(), param1.toLong(), param2.toLong(), Win32DynamicFfi.objectSlot(param3))).toInt()
}

public fun ImmSetOpenStatus(param0: HIMC, param1: BOOL): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmSetOpenStatus", longArrayOf(param0, param1.toLong())).toInt()
}

public fun ImmSetStatusWindowPos(param0: HIMC, lpptpos: Long): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmSetStatusWindowPos", longArrayOf(param0, lpptpos)).toInt()
}

public fun ImmShowSoftKeyboard(param0: Foundation.HWND, param1: Int): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmShowSoftKeyboard", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1.toLong())).toInt()
}

public fun ImmSimulateHotKey(param0: Foundation.HWND, param1: IME_HOTKEY_IDENTIFIER): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmSimulateHotKey", longArrayOf(Win32DynamicFfi.objectSlot(param0), param1.toLong())).toInt()
}

public fun ImmUnlockIMC(param0: HIMC): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmUnlockIMC", longArrayOf(param0)).toInt()
}

public fun ImmUnlockIMCC(param0: HIMCC): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmUnlockIMCC", longArrayOf(param0)).toInt()
}

public fun ImmUnregisterWordA(param0: KeyboardAndMouse.HKL, lpszreading: PCSTR, param2: UInt, lpszunregister: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmUnregisterWordA", longArrayOf(Win32DynamicFfi.objectSlot(param0), lpszreading, param2.toLong(), lpszunregister)).toInt()
}

public fun ImmUnregisterWordW(param0: KeyboardAndMouse.HKL, lpszreading: PCWSTR, param2: UInt, lpszunregister: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("imm32.dll", "ImmUnregisterWordW", longArrayOf(Win32DynamicFfi.objectSlot(param0), lpszreading, param2.toLong(), lpszunregister)).toInt()
}
