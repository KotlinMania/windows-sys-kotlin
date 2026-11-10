package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

public typealias ChoosecolorFlags = UInt

public typealias ChoosefontFlags = UInt

public typealias ChoosefontFontType = UShort

public typealias CommonDlgErrors = UInt

public typealias FindreplaceFlags = UInt

public fun interface LpcchookprocFn {
    public operator fun invoke(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): ULong
}

public typealias Lpcchookproc = LpcchookprocFn?

public fun interface LpcfhookprocFn {
    public operator fun invoke(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): ULong
}

public typealias Lpcfhookproc = LpcfhookprocFn?

public fun interface LpfrhookprocFn {
    public operator fun invoke(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): ULong
}

public typealias Lpfrhookproc = LpfrhookprocFn?

public fun interface LpofnhookprocFn {
    public operator fun invoke(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): ULong
}

public typealias Lpofnhookproc = LpofnhookprocFn?

public fun interface LppagepainthookFn {
    public operator fun invoke(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): ULong
}

public typealias Lppagepainthook = LppagepainthookFn?

public fun interface LppagesetuphookFn {
    public operator fun invoke(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): ULong
}

public typealias Lppagesetuphook = LppagesetuphookFn?

public fun interface LpprinthookprocFn {
    public operator fun invoke(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): ULong
}

public typealias Lpprinthookproc = LpprinthookprocFn?

public fun interface LpsetuphookprocFn {
    public operator fun invoke(param0: Hwnd, param1: UInt, param2: Wparam, param3: Lparam): ULong
}

public typealias Lpsetuphookproc = LpsetuphookprocFn?

public typealias OpenFilenameFlags = UInt

public typealias OpenFilenameFlagsEx = UInt

public typealias PagesetupdlgFlags = UInt

public typealias PrintdlgexFlags = UInt
