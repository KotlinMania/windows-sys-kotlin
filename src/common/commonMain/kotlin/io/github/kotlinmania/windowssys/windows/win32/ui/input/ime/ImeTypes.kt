package io.github.kotlinmania.windowssys.windows.win32.ui.input.ime

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias GET_CONVERSION_LIST_FLAG = UInt

public typealias GET_GUIDE_LINE_TYPE = UInt

public typealias HIMC = Long

public typealias HIMCC = Long

public fun interface IMCENUMPROCFn {
    public operator fun invoke(param0: HIMC, param1: Foundation.LPARAM): BOOL
}

public typealias IMCENUMPROC = IMCENUMPROCFn?

public typealias IMEFMT = Int

public typealias IMEREG = Int

public typealias IMEREL = Int

public typealias IMEUCT = Int

public typealias IME_COMPOSITION_STRING = UInt

public typealias IME_CONVERSION_MODE = UInt

public typealias IME_ESCAPE = UInt

public typealias IME_HOTKEY_IDENTIFIER = UInt

public typealias IME_PAD_REQUEST_FLAGS = UInt

public typealias IME_SENTENCE_MODE = UInt

public typealias NOTIFY_IME_ACTION = UInt

public typealias NOTIFY_IME_INDEX = UInt

public fun interface PFNLOGFn {
    public operator fun invoke(param0: Long, param1: HRESULT): BOOL
}

public typealias PFNLOG = PFNLOGFn?

public fun interface REGISTERWORDENUMPROCAFn {
    public operator fun invoke(lpszreading: PCSTR, param1: UInt, lpszstring: PCSTR, param3: Long): Int
}

public typealias REGISTERWORDENUMPROCA = REGISTERWORDENUMPROCAFn?

public fun interface REGISTERWORDENUMPROCWFn {
    public operator fun invoke(lpszreading: PCWSTR, param1: UInt, lpszstring: PCWSTR, param3: Long): Int
}

public typealias REGISTERWORDENUMPROCW = REGISTERWORDENUMPROCWFn?

public typealias SET_COMPOSITION_STRING_TYPE = UInt

public fun interface fpCreateIFECommonInstanceTypeFn {
    public operator fun invoke(ppvobj: Long): HRESULT
}

public typealias fpCreateIFECommonInstanceType = fpCreateIFECommonInstanceTypeFn?

public fun interface fpCreateIFEDictionaryInstanceTypeFn {
    public operator fun invoke(ppvobj: Long): HRESULT
}

public typealias fpCreateIFEDictionaryInstanceType = fpCreateIFEDictionaryInstanceTypeFn?

public fun interface fpCreateIFELanguageInstanceTypeFn {
    public operator fun invoke(clsid: Long, ppvobj: Long): HRESULT
}

public typealias fpCreateIFELanguageInstanceType = fpCreateIFELanguageInstanceTypeFn?
