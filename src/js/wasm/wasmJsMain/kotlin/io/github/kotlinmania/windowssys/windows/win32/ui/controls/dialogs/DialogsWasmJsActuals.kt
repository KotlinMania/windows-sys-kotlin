@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public actual fun ChooseColorA(param0: Long): BOOL =
    0

public actual fun ChooseColorW(param0: Long): BOOL =
    0

public actual fun ChooseFontA(param0: Long): BOOL =
    0

public actual fun ChooseFontW(param0: Long): BOOL =
    0

public actual fun CommDlgExtendedError(): COMMON_DLG_ERRORS =
    0u

public actual fun FindTextA(param0: Long): HWND =
    0L

public actual fun FindTextW(param0: Long): HWND =
    0L

public actual fun GetFileTitleA(param0: PCSTR, buf: PSTR, cchsize: UShort): Short =
    0

public actual fun GetFileTitleW(param0: PCWSTR, buf: PWSTR, cchsize: UShort): Short =
    0

public actual fun GetOpenFileNameA(param0: Long): BOOL =
    0

public actual fun GetOpenFileNameW(param0: Long): BOOL =
    0

public actual fun GetSaveFileNameA(param0: Long): BOOL =
    0

public actual fun GetSaveFileNameW(param0: Long): BOOL =
    0

public actual fun PageSetupDlgA(param0: Long): BOOL =
    0

public actual fun PageSetupDlgW(param0: Long): BOOL =
    0

public actual fun PrintDlgA(ppd: Long): BOOL =
    0

public actual fun PrintDlgExA(ppd: Long): HRESULT =
    0

public actual fun PrintDlgExW(ppd: Long): HRESULT =
    0

public actual fun PrintDlgW(ppd: Long): BOOL =
    0

public actual fun ReplaceTextA(param0: Long): HWND =
    0L

public actual fun ReplaceTextW(param0: Long): HWND =
    0L
