package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT

public fun interface CALLERRELEASEFn {
    public operator fun invoke(ulcallerdata: UInt, lptbldata: Long, lpvue: Long)
}

public typealias CALLERRELEASE = CALLERRELEASEFn?

public typealias Gender = Int

public fun interface LPALLOCATEBUFFERFn {
    public operator fun invoke(cbsize: UInt, lppbuffer: Long): Int
}

public typealias LPALLOCATEBUFFER = LPALLOCATEBUFFERFn?

public fun interface LPALLOCATEMOREFn {
    public operator fun invoke(cbsize: UInt, lpobject: Long, lppbuffer: Long): Int
}

public typealias LPALLOCATEMORE = LPALLOCATEMOREFn?

public fun interface LPCREATECONVERSATIONINDEXFn {
    public operator fun invoke(cbparent: UInt, lpbparent: Long, lpcbconvindex: Long, lppbconvindex: Long): Int
}

public typealias LPCREATECONVERSATIONINDEX = LPCREATECONVERSATIONINDEXFn?

public fun interface LPDISPATCHNOTIFICATIONSFn {
    public operator fun invoke(ulflags: UInt): HRESULT
}

public typealias LPDISPATCHNOTIFICATIONS = LPDISPATCHNOTIFICATIONSFn?

public fun interface LPFNABSDIFn {
    public operator fun invoke(uluiparam: ULong, lpvmsg: Long): BOOL
}

public typealias LPFNABSDI = LPFNABSDIFn?

public fun interface LPFNBUTTONFn {
    public operator fun invoke(uluiparam: ULong, lpvcontext: Long, cbentryid: UInt, lpselection: Long, ulflags: UInt): Int
}

public typealias LPFNBUTTON = LPFNBUTTONFn?

public fun interface LPFNDISMISSFn {
    public operator fun invoke(uluiparam: ULong, lpvcontext: Long)
}

public typealias LPFNDISMISS = LPFNDISMISSFn?

public fun interface LPFREEBUFFERFn {
    public operator fun invoke(lpbuffer: Long): UInt
}

public typealias LPFREEBUFFER = LPFREEBUFFERFn?

public fun interface LPNOTIFCALLBACKFn {
    public operator fun invoke(lpvcontext: Long, cnotification: UInt, lpnotifications: Long): Int
}

public typealias LPNOTIFCALLBACK = LPNOTIFCALLBACKFn?

public fun interface LPOPENSTREAMONFILEFn {
    public operator fun invoke(lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER, ulflags: UInt, lpszfilename: Long, lpszprefix: Long, lppstream: Long): HRESULT
}

public typealias LPOPENSTREAMONFILE = LPOPENSTREAMONFILEFn?

public typealias LPWABACTIONITEM = Long

public fun interface LPWABALLOCATEBUFFERFn {
    public operator fun invoke(lpwabobject: Long, cbsize: UInt, lppbuffer: Long): Int
}

public typealias LPWABALLOCATEBUFFER = LPWABALLOCATEBUFFERFn?

public fun interface LPWABALLOCATEMOREFn {
    public operator fun invoke(lpwabobject: Long, cbsize: UInt, lpobject: Long, lppbuffer: Long): Int
}

public typealias LPWABALLOCATEMORE = LPWABALLOCATEMOREFn?

public fun interface LPWABFREEBUFFERFn {
    public operator fun invoke(lpwabobject: Long, lpbuffer: Long): UInt
}

public typealias LPWABFREEBUFFER = LPWABFREEBUFFERFn?

public fun interface LPWABOPENFn {
    public operator fun invoke(lppadrbook: Long, lppwabobject: Long, lpwp: Long, reserved2: UInt): HRESULT
}

public typealias LPWABOPEN = LPWABOPENFn?

public fun interface LPWABOPENEXFn {
    public operator fun invoke(lppadrbook: Long, lppwabobject: Long, lpwp: Long, reserved: UInt, fnallocatebuffer: LPALLOCATEBUFFER, fnallocatemore: LPALLOCATEMORE, fnfreebuffer: LPFREEBUFFER): HRESULT
}

public typealias LPWABOPENEX = LPWABOPENEXFn?

public fun interface PFNIDLEFn {
    public operator fun invoke(param0: Long): BOOL
}

public typealias PFNIDLE = PFNIDLEFn?
