package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public expect fun ChooseColorA(param0: Long): BOOL

public expect fun ChooseColorW(param0: Long): BOOL

public expect fun ChooseFontA(param0: Long): BOOL

public expect fun ChooseFontW(param0: Long): BOOL

public expect fun CommDlgExtendedError(): COMMON_DLG_ERRORS

public expect fun FindTextA(param0: Long): HWND

public expect fun FindTextW(param0: Long): HWND

public expect fun GetFileTitleA(param0: PCSTR, buf: PSTR, cchsize: UShort): Short

public expect fun GetFileTitleW(param0: PCWSTR, buf: PWSTR, cchsize: UShort): Short

public expect fun GetOpenFileNameA(param0: Long): BOOL

public expect fun GetOpenFileNameW(param0: Long): BOOL

public expect fun GetSaveFileNameA(param0: Long): BOOL

public expect fun GetSaveFileNameW(param0: Long): BOOL

public expect fun PageSetupDlgA(param0: Long): BOOL

public expect fun PageSetupDlgW(param0: Long): BOOL

public expect fun PrintDlgA(ppd: Long): BOOL

public expect fun PrintDlgExA(ppd: Long): HRESULT

public expect fun PrintDlgExW(ppd: Long): HRESULT

public expect fun PrintDlgW(ppd: Long): BOOL

public expect fun ReplaceTextA(param0: Long): HWND

public expect fun ReplaceTextW(param0: Long): HWND
