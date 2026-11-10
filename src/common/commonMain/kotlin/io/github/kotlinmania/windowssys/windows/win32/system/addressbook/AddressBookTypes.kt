package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult

public fun interface CallerreleaseFn {
    public operator fun invoke(ulcallerdata: UInt, lptbldata: COpaquePointer?, lpvue: COpaquePointer?)
}

public typealias Callerrelease = CallerreleaseFn?

public typealias Gender = Int

public fun interface LpallocatebufferFn {
    public operator fun invoke(cbsize: UInt, lppbuffer: COpaquePointer?): Int
}

public typealias Lpallocatebuffer = LpallocatebufferFn?

public fun interface LpallocatemoreFn {
    public operator fun invoke(cbsize: UInt, lpobject: COpaquePointer?, lppbuffer: COpaquePointer?): Int
}

public typealias Lpallocatemore = LpallocatemoreFn?

public fun interface LpcreateconversationindexFn {
    public operator fun invoke(cbparent: UInt, lpbparent: COpaquePointer?, lpcbconvindex: COpaquePointer?, lppbconvindex: COpaquePointer?): Int
}

public typealias Lpcreateconversationindex = LpcreateconversationindexFn?

public fun interface LpdispatchnotificationsFn {
    public operator fun invoke(ulflags: UInt): Hresult
}

public typealias Lpdispatchnotifications = LpdispatchnotificationsFn?

public fun interface LpfnabsdiFn {
    public operator fun invoke(uluiparam: ULong, lpvmsg: COpaquePointer?): Bool
}

public typealias Lpfnabsdi = LpfnabsdiFn?

public fun interface LpfnbuttonFn {
    public operator fun invoke(uluiparam: ULong, lpvcontext: COpaquePointer?, cbentryid: UInt, lpselection: COpaquePointer?, ulflags: UInt): Int
}

public typealias Lpfnbutton = LpfnbuttonFn?

public fun interface LpfndismissFn {
    public operator fun invoke(uluiparam: ULong, lpvcontext: COpaquePointer?)
}

public typealias Lpfndismiss = LpfndismissFn?

public fun interface LpfreebufferFn {
    public operator fun invoke(lpbuffer: COpaquePointer?): UInt
}

public typealias Lpfreebuffer = LpfreebufferFn?

public fun interface LpnotifcallbackFn {
    public operator fun invoke(lpvcontext: COpaquePointer?, cnotification: UInt, lpnotifications: COpaquePointer?): Int
}

public typealias Lpnotifcallback = LpnotifcallbackFn?

public fun interface LpopenstreamonfileFn {
    public operator fun invoke(lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, ulflags: UInt, lpszfilename: COpaquePointer?, lpszprefix: COpaquePointer?, lppstream: COpaquePointer?): Hresult
}

public typealias Lpopenstreamonfile = LpopenstreamonfileFn?

public typealias Lpwabactionitem = Long

public fun interface LpwaballocatebufferFn {
    public operator fun invoke(lpwabobject: COpaquePointer?, cbsize: UInt, lppbuffer: COpaquePointer?): Int
}

public typealias Lpwaballocatebuffer = LpwaballocatebufferFn?

public fun interface LpwaballocatemoreFn {
    public operator fun invoke(lpwabobject: COpaquePointer?, cbsize: UInt, lpobject: COpaquePointer?, lppbuffer: COpaquePointer?): Int
}

public typealias Lpwaballocatemore = LpwaballocatemoreFn?

public fun interface LpwabfreebufferFn {
    public operator fun invoke(lpwabobject: COpaquePointer?, lpbuffer: COpaquePointer?): UInt
}

public typealias Lpwabfreebuffer = LpwabfreebufferFn?

public fun interface LpwabopenFn {
    public operator fun invoke(lppadrbook: COpaquePointer?, lppwabobject: COpaquePointer?, lpwp: COpaquePointer?, reserved2: UInt): Hresult
}

public typealias Lpwabopen = LpwabopenFn?

public fun interface LpwabopenexFn {
    public operator fun invoke(lppadrbook: COpaquePointer?, lppwabobject: COpaquePointer?, lpwp: COpaquePointer?, reserved: UInt, fnallocatebuffer: Lpallocatebuffer, fnallocatemore: Lpallocatemore, fnfreebuffer: Lpfreebuffer): Hresult
}

public typealias Lpwabopenex = LpwabopenexFn?

public fun interface PfnidleFn {
    public operator fun invoke(param0: COpaquePointer?): Bool
}

public typealias Pfnidle = PfnidleFn?
