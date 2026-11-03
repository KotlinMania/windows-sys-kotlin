package io.github.kotlinmania.windowssys.windows.win32.data.htmlhelp

public typealias HH_GPROPID = Int

public typealias HTML_HELP_COMMAND = Int

public fun interface PFNCOLHEAPFREEFn {
    public operator fun invoke(param0: Long): Int
}

public typealias PFNCOLHEAPFREE = PFNCOLHEAPFREEFn?

public typealias PRIORITY = Int
