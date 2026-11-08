package io.github.kotlinmania.windowssys.windows.win32.media.multimedia

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.LPFNSVADDPROPSHEETPAGE

public fun interface AVISAVECALLBACKFn {
    public operator fun invoke(param0: Int): BOOL
}

public typealias AVISAVECALLBACK = AVISAVECALLBACKFn?

public fun interface CAPCONTROLCALLBACKFn {
    public operator fun invoke(hwnd: HWND, nstate: Int): LRESULT
}

public typealias CAPCONTROLCALLBACK = CAPCONTROLCALLBACKFn?

public fun interface CAPERRORCALLBACKAFn {
    public operator fun invoke(hwnd: HWND, nid: Int, lpsz: PCSTR): LRESULT
}

public typealias CAPERRORCALLBACKA = CAPERRORCALLBACKAFn?

public fun interface CAPERRORCALLBACKWFn {
    public operator fun invoke(hwnd: HWND, nid: Int, lpsz: PCWSTR): LRESULT
}

public typealias CAPERRORCALLBACKW = CAPERRORCALLBACKWFn?

public fun interface CAPSTATUSCALLBACKAFn {
    public operator fun invoke(hwnd: HWND, nid: Int, lpsz: PCSTR): LRESULT
}

public typealias CAPSTATUSCALLBACKA = CAPSTATUSCALLBACKAFn?

public fun interface CAPSTATUSCALLBACKWFn {
    public operator fun invoke(hwnd: HWND, nid: Int, lpsz: PCWSTR): LRESULT
}

public typealias CAPSTATUSCALLBACKW = CAPSTATUSCALLBACKWFn?

public fun interface CAPVIDEOCALLBACKFn {
    public operator fun invoke(hwnd: HWND, lpvhdr: Long): LRESULT
}

public typealias CAPVIDEOCALLBACK = CAPVIDEOCALLBACKFn?

public fun interface CAPWAVECALLBACKFn {
    public operator fun invoke(hwnd: HWND, lpwhdr: Long): LRESULT
}

public typealias CAPWAVECALLBACK = CAPWAVECALLBACKFn?

public fun interface CAPYIELDCALLBACKFn {
    public operator fun invoke(hwnd: HWND): LRESULT
}

public typealias CAPYIELDCALLBACK = CAPYIELDCALLBACKFn?

public fun interface DRIVERMSGPROCFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: ULong, param3: ULong, param4: ULong): UInt
}

public typealias DRIVERMSGPROC = DRIVERMSGPROCFn?

public fun interface DRIVERPROCFn {
    public operator fun invoke(param0: ULong, param1: HDRVR, param2: UInt, param3: LPARAM, param4: LPARAM): LRESULT
}

public typealias DRIVERPROC = DRIVERPROCFn?

public typealias HDRVR = Long

public typealias HIC = Long

public typealias HMMIO = Long

public typealias HVIDEO = Long

public fun interface LPFNEXTDEVIOFn {
    public operator fun invoke(lparam: LPARAM, dwflags: UInt, dwiocontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpoverlapped: Long): BOOL
}

public typealias LPFNEXTDEVIO = LPFNEXTDEVIOFn?

public fun interface LPMMIOPROCFn {
    public operator fun invoke(lpmmioinfo: PCSTR, umsg: UInt, lparam1: LPARAM, lparam2: LPARAM): LRESULT
}

public typealias LPMMIOPROC = LPMMIOPROCFn?

public fun interface LPTASKCALLBACKFn {
    public operator fun invoke(dwinst: ULong)
}

public typealias LPTASKCALLBACK = LPTASKCALLBACKFn?

public fun interface VFWWDMExtensionProcFn {
    public operator fun invoke(pfndeviceiocontrol: Long, pfnaddpropertypage: LPFNSVADDPROPSHEETPAGE, lparam: LPARAM): UInt
}

public typealias VFWWDMExtensionProc = VFWWDMExtensionProcFn?

public fun interface YIELDPROCFn {
    public operator fun invoke(mciid: UInt, dwyielddata: UInt): UInt
}

public typealias YIELDPROC = YIELDPROCFn?
