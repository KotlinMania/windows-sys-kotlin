package io.github.kotlinmania.windowssys.windows.win32.ui.input.ime

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam

public typealias GetConversionListFlag = UInt

public typealias GetGuideLineType = UInt

public typealias Himc = MutPtr<CVoid>

public typealias Himcc = MutPtr<CVoid>

public fun interface ImcenumprocFn {
    public operator fun invoke(param0: Himc, param1: Lparam): Bool
}

public typealias Imcenumproc = ImcenumprocFn?

public typealias Imefmt = Int

public typealias Imereg = Int

public typealias Imerel = Int

public typealias Imeuct = Int

public typealias ImeCompositionString = UInt

public typealias ImeConversionMode = UInt

public typealias ImeEscape = UInt

public typealias ImeHotkeyIdentifier = UInt

public typealias ImePadRequestFlags = UInt

public typealias ImeSentenceMode = UInt

public typealias NotifyImeAction = UInt

public typealias NotifyImeIndex = UInt

public fun interface PfnlogFn {
    public operator fun invoke(param0: MutPtr<Imedp>, param1: Hresult): Bool
}

public typealias Pfnlog = PfnlogFn?

public fun interface RegisterwordenumprocaFn {
    public operator fun invoke(lpszreading: Pcstr, param1: UInt, lpszstring: Pcstr, param3: MutPtr<CVoid>): Int
}

public typealias Registerwordenumproca = RegisterwordenumprocaFn?

public fun interface RegisterwordenumprocwFn {
    public operator fun invoke(lpszreading: Pcwstr, param1: UInt, lpszstring: Pcwstr, param3: MutPtr<CVoid>): Int
}

public typealias Registerwordenumprocw = RegisterwordenumprocwFn?

public typealias SetCompositionStringType = UInt

public fun interface FpCreateIfecommonInstanceTypeFn {
    public operator fun invoke(ppvobj: MutPtr<MutPtr<CVoid>>): Hresult
}

public typealias FpCreateIfecommonInstanceType = FpCreateIfecommonInstanceTypeFn?

public fun interface FpCreateIfedictionaryInstanceTypeFn {
    public operator fun invoke(ppvobj: MutPtr<MutPtr<CVoid>>): Hresult
}

public typealias FpCreateIfedictionaryInstanceType = FpCreateIfedictionaryInstanceTypeFn?

public fun interface FpCreateIfelanguageInstanceTypeFn {
    public operator fun invoke(clsid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult
}

public typealias FpCreateIfelanguageInstanceType = FpCreateIfelanguageInstanceTypeFn?
