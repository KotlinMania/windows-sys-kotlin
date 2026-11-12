package io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp

import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias HhGpropid = Int

public typealias HtmlHelpCommand = Int

public fun interface PfncolheapfreeFn {
    public operator fun invoke(param0: MutPtr): Int
}

public typealias Pfncolheapfree = PfncolheapfreeFn?

public typealias Priority = Int
