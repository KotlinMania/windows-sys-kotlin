package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun ChooseColorA(param0: Long): BOOL {
    return Win32DynamicFfi.invoke("comdlg32.dll", "ChooseColorA", longArrayOf(param0)).toInt()
}

public fun ChooseColorW(param0: Long): BOOL {
    return Win32DynamicFfi.invoke("comdlg32.dll", "ChooseColorW", longArrayOf(param0)).toInt()
}

public fun ChooseFontA(param0: Long): BOOL {
    return Win32DynamicFfi.invoke("comdlg32.dll", "ChooseFontA", longArrayOf(param0)).toInt()
}

public fun ChooseFontW(param0: Long): BOOL {
    return Win32DynamicFfi.invoke("comdlg32.dll", "ChooseFontW", longArrayOf(param0)).toInt()
}

public fun CommDlgExtendedError(): COMMON_DLG_ERRORS {
    return Win32DynamicFfi.invoke("comdlg32.dll", "CommDlgExtendedError", longArrayOf()).toUInt()
}

public fun FindTextA(param0: Long): Foundation.HWND {
    Win32DynamicFfi.invoke("comdlg32.dll", "FindTextA", longArrayOf(param0))
    return Foundation.HWND()
}

public fun FindTextW(param0: Long): Foundation.HWND {
    Win32DynamicFfi.invoke("comdlg32.dll", "FindTextW", longArrayOf(param0))
    return Foundation.HWND()
}

public fun GetFileTitleA(param0: PCSTR, buf: PSTR, cchsize: UShort): Short {
    return Win32DynamicFfi.invoke("comdlg32.dll", "GetFileTitleA", longArrayOf(param0, buf, cchsize.toLong())).toShort()
}

public fun GetFileTitleW(param0: PCWSTR, buf: PWSTR, cchsize: UShort): Short {
    return Win32DynamicFfi.invoke("comdlg32.dll", "GetFileTitleW", longArrayOf(param0, buf, cchsize.toLong())).toShort()
}

public fun GetOpenFileNameA(param0: Long): BOOL {
    return Win32DynamicFfi.invoke("comdlg32.dll", "GetOpenFileNameA", longArrayOf(param0)).toInt()
}

public fun GetOpenFileNameW(param0: Long): BOOL {
    return Win32DynamicFfi.invoke("comdlg32.dll", "GetOpenFileNameW", longArrayOf(param0)).toInt()
}

public fun GetSaveFileNameA(param0: Long): BOOL {
    return Win32DynamicFfi.invoke("comdlg32.dll", "GetSaveFileNameA", longArrayOf(param0)).toInt()
}

public fun GetSaveFileNameW(param0: Long): BOOL {
    return Win32DynamicFfi.invoke("comdlg32.dll", "GetSaveFileNameW", longArrayOf(param0)).toInt()
}

public fun PageSetupDlgA(param0: Long): BOOL {
    return Win32DynamicFfi.invoke("comdlg32.dll", "PageSetupDlgA", longArrayOf(param0)).toInt()
}

public fun PageSetupDlgW(param0: Long): BOOL {
    return Win32DynamicFfi.invoke("comdlg32.dll", "PageSetupDlgW", longArrayOf(param0)).toInt()
}

public fun PrintDlgA(ppd: Long): BOOL {
    return Win32DynamicFfi.invoke("comdlg32.dll", "PrintDlgA", longArrayOf(ppd)).toInt()
}

public fun PrintDlgExA(ppd: Long): HRESULT {
    return Win32DynamicFfi.invoke("comdlg32.dll", "PrintDlgExA", longArrayOf(ppd)).toInt()
}

public fun PrintDlgExW(ppd: Long): HRESULT {
    return Win32DynamicFfi.invoke("comdlg32.dll", "PrintDlgExW", longArrayOf(ppd)).toInt()
}

public fun PrintDlgW(ppd: Long): BOOL {
    return Win32DynamicFfi.invoke("comdlg32.dll", "PrintDlgW", longArrayOf(ppd)).toInt()
}

public fun ReplaceTextA(param0: Long): Foundation.HWND {
    Win32DynamicFfi.invoke("comdlg32.dll", "ReplaceTextA", longArrayOf(param0))
    return Foundation.HWND()
}

public fun ReplaceTextW(param0: Long): Foundation.HWND {
    Win32DynamicFfi.invoke("comdlg32.dll", "ReplaceTextW", longArrayOf(param0))
    return Foundation.HWND()
}
