package io.github.kotlinmania.windowssys.windows.win32.media.multimedia

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun interface AVISAVECALLBACKFn {
    public operator fun invoke(param0: Int): BOOL
}

public typealias AVISAVECALLBACK = AVISAVECALLBACKFn?

public fun interface CAPCONTROLCALLBACKFn {
    public operator fun invoke(hwnd: Foundation.HWND, nstate: Int): Foundation.LRESULT
}

public typealias CAPCONTROLCALLBACK = CAPCONTROLCALLBACKFn?

public fun interface CAPERRORCALLBACKAFn {
    public operator fun invoke(hwnd: Foundation.HWND, nid: Int, lpsz: PCSTR): Foundation.LRESULT
}

public typealias CAPERRORCALLBACKA = CAPERRORCALLBACKAFn?

public fun interface CAPERRORCALLBACKWFn {
    public operator fun invoke(hwnd: Foundation.HWND, nid: Int, lpsz: PCWSTR): Foundation.LRESULT
}

public typealias CAPERRORCALLBACKW = CAPERRORCALLBACKWFn?

public fun interface CAPSTATUSCALLBACKAFn {
    public operator fun invoke(hwnd: Foundation.HWND, nid: Int, lpsz: PCSTR): Foundation.LRESULT
}

public typealias CAPSTATUSCALLBACKA = CAPSTATUSCALLBACKAFn?

public fun interface CAPSTATUSCALLBACKWFn {
    public operator fun invoke(hwnd: Foundation.HWND, nid: Int, lpsz: PCWSTR): Foundation.LRESULT
}

public typealias CAPSTATUSCALLBACKW = CAPSTATUSCALLBACKWFn?

public fun interface CAPVIDEOCALLBACKFn {
    public operator fun invoke(hwnd: Foundation.HWND, lpvhdr: Long): Foundation.LRESULT
}

public typealias CAPVIDEOCALLBACK = CAPVIDEOCALLBACKFn?

public fun interface CAPWAVECALLBACKFn {
    public operator fun invoke(hwnd: Foundation.HWND, lpwhdr: Long): Foundation.LRESULT
}

public typealias CAPWAVECALLBACK = CAPWAVECALLBACKFn?

public fun interface CAPYIELDCALLBACKFn {
    public operator fun invoke(hwnd: Foundation.HWND): Foundation.LRESULT
}

public typealias CAPYIELDCALLBACK = CAPYIELDCALLBACKFn?

public fun interface DRIVERMSGPROCFn {
    public operator fun invoke(param0: UInt, param1: UInt, param2: ULong, param3: ULong, param4: ULong): UInt
}

public typealias DRIVERMSGPROC = DRIVERMSGPROCFn?

public fun interface DRIVERPROCFn {
    public operator fun invoke(param0: ULong, param1: HDRVR, param2: UInt, param3: Foundation.LPARAM, param4: Foundation.LPARAM): Foundation.LRESULT
}

public typealias DRIVERPROC = DRIVERPROCFn?

public typealias HDRVR = Long

public typealias HIC = Long

public typealias HMMIO = Long

public typealias HVIDEO = Long

public fun interface LPFNEXTDEVIOFn {
    public operator fun invoke(lparam: Foundation.LPARAM, dwflags: UInt, dwiocontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpoverlapped: Long): BOOL
}

public typealias LPFNEXTDEVIO = LPFNEXTDEVIOFn?

public fun interface LPMMIOPROCFn {
    public operator fun invoke(lpmmioinfo: PCSTR, umsg: UInt, lparam1: Foundation.LPARAM, lparam2: Foundation.LPARAM): Foundation.LRESULT
}

public typealias LPMMIOPROC = LPMMIOPROCFn?

public fun interface LPTASKCALLBACKFn {
    public operator fun invoke(dwinst: ULong)
}

public typealias LPTASKCALLBACK = LPTASKCALLBACKFn?

public fun interface VFWWDMExtensionProcFn {
    public operator fun invoke(pfndeviceiocontrol: Long, pfnaddpropertypage: UI.Controls.LPFNSVADDPROPSHEETPAGE, lparam: Foundation.LPARAM): UInt
}

public typealias VFWWDMExtensionProc = VFWWDMExtensionProcFn?

public fun interface YIELDPROCFn {
    public operator fun invoke(mciid: UInt, dwyielddata: UInt): UInt
}

public typealias YIELDPROC = YIELDPROCFn?
