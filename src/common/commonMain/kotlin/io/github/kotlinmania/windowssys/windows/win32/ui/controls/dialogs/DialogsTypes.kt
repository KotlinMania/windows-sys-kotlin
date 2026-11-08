package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM

public typealias CHOOSECOLOR_FLAGS = UInt

public typealias CHOOSEFONT_FLAGS = UInt

public typealias CHOOSEFONT_FONT_TYPE = UShort

public typealias COMMON_DLG_ERRORS = UInt

public typealias FINDREPLACE_FLAGS = UInt

public fun interface LPCCHOOKPROCFn {
    public operator fun invoke(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): ULong
}

public typealias LPCCHOOKPROC = LPCCHOOKPROCFn?

public fun interface LPCFHOOKPROCFn {
    public operator fun invoke(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): ULong
}

public typealias LPCFHOOKPROC = LPCFHOOKPROCFn?

public fun interface LPFRHOOKPROCFn {
    public operator fun invoke(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): ULong
}

public typealias LPFRHOOKPROC = LPFRHOOKPROCFn?

public fun interface LPOFNHOOKPROCFn {
    public operator fun invoke(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): ULong
}

public typealias LPOFNHOOKPROC = LPOFNHOOKPROCFn?

public fun interface LPPAGEPAINTHOOKFn {
    public operator fun invoke(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): ULong
}

public typealias LPPAGEPAINTHOOK = LPPAGEPAINTHOOKFn?

public fun interface LPPAGESETUPHOOKFn {
    public operator fun invoke(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): ULong
}

public typealias LPPAGESETUPHOOK = LPPAGESETUPHOOKFn?

public fun interface LPPRINTHOOKPROCFn {
    public operator fun invoke(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): ULong
}

public typealias LPPRINTHOOKPROC = LPPRINTHOOKPROCFn?

public fun interface LPSETUPHOOKPROCFn {
    public operator fun invoke(param0: HWND, param1: UInt, param2: WPARAM, param3: LPARAM): ULong
}

public typealias LPSETUPHOOKPROC = LPSETUPHOOKPROCFn?

public typealias OPEN_FILENAME_FLAGS = UInt

public typealias OPEN_FILENAME_FLAGS_EX = UInt

public typealias PAGESETUPDLG_FLAGS = UInt

public typealias PRINTDLGEX_FLAGS = UInt
