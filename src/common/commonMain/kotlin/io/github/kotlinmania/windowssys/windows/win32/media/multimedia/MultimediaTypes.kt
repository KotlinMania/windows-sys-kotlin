package io.github.kotlinmania.windowssys.windows.win32.media.multimedia

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Lpfnsvaddpropsheetpage

public fun interface AvisavecallbackFn {
    public operator fun invoke(param0: Int): Bool
}

public typealias Avisavecallback = AvisavecallbackFn?

public fun interface CapcontrolcallbackFn {
    public operator fun invoke(hwnd: Hwnd, nstate: Int): Lresult
}

public typealias Capcontrolcallback = CapcontrolcallbackFn?

public fun interface CaperrorcallbackaFn {
    public operator fun invoke(hwnd: Hwnd, nid: Int, lpsz: Pcstr): Lresult
}

public typealias Caperrorcallbacka = CaperrorcallbackaFn?

public fun interface CaperrorcallbackwFn {
    public operator fun invoke(hwnd: Hwnd, nid: Int, lpsz: Pcwstr): Lresult
}

public typealias Caperrorcallbackw = CaperrorcallbackwFn?

public fun interface CapstatuscallbackaFn {
    public operator fun invoke(hwnd: Hwnd, nid: Int, lpsz: Pcstr): Lresult
}

public typealias Capstatuscallbacka = CapstatuscallbackaFn?

public fun interface CapstatuscallbackwFn {
    public operator fun invoke(hwnd: Hwnd, nid: Int, lpsz: Pcwstr): Lresult
}

public typealias Capstatuscallbackw = CapstatuscallbackwFn?

public fun interface CapvideocallbackFn {
    public operator fun invoke(hwnd: Hwnd, lpvhdr: ConstPtr): Lresult
}

public typealias Capvideocallback = CapvideocallbackFn?

public fun interface CapwavecallbackFn {
    public operator fun invoke(hwnd: Hwnd, lpwhdr: ConstPtr): Lresult
}

public typealias Capwavecallback = CapwavecallbackFn?

public fun interface CapyieldcallbackFn {
    public operator fun invoke(hwnd: Hwnd): Lresult
}

public typealias Capyieldcallback = CapyieldcallbackFn?

public fun interface DrivermsgprocFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: ULong, param3: ULong, param4: ULong): UInt
}

public typealias Drivermsgproc = DrivermsgprocFn?

public fun interface DriverprocFn {
    public operator fun invoke(param0: ULong, param1: Hdrvr, param2: UInt, param3: Lparam, param4: Lparam): Lresult
}

public typealias Driverproc = DriverprocFn?

public typealias Hdrvr = MutPtr

public typealias Hic = MutPtr

public typealias Hmmio = MutPtr

public typealias Hvideo = MutPtr

public fun interface LpfnextdevioFn {
    public operator fun invoke(lparam: Lparam, dwflags: UInt, dwiocontrolcode: UInt, lpinbuffer: MutPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpoverlapped: MutPtr): Bool
}

public typealias Lpfnextdevio = LpfnextdevioFn?

public fun interface LpmmioprocFn {
    public operator fun invoke(lpmmioinfo: Pcstr, umsg: UInt, lparam1: Lparam, lparam2: Lparam): Lresult
}

public typealias Lpmmioproc = LpmmioprocFn?

public fun interface LptaskcallbackFn {
    public operator fun invoke(dwinst: ULong)
}

public typealias Lptaskcallback = LptaskcallbackFn?

public fun interface VFWWDMExtensionProcFn {
    public operator fun invoke(pfndeviceiocontrol: MutPtr, pfnaddpropertypage: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt
}

public typealias VFWWDMExtensionProc = VFWWDMExtensionProcFn?

public fun interface YieldprocFn {
    public operator fun invoke(mciid: UInt, dwyielddata: UInt): UInt
}

public typealias Yieldproc = YieldprocFn?
