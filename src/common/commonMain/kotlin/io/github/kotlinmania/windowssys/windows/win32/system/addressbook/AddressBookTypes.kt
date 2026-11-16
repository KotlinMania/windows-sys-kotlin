package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult

public fun interface CallerreleaseFn {
    public operator fun invoke(ulcallerdata: UInt, lptbldata: MutPtr, lpvue: MutPtr)
}

public typealias Callerrelease = CallerreleaseFn?

public typealias Gender = Int

public fun interface LpallocatebufferFn {
    public operator fun invoke(cbsize: UInt, lppbuffer: MutPtr): Int
}

public typealias Lpallocatebuffer = LpallocatebufferFn?

public fun interface LpallocatemoreFn {
    public operator fun invoke(cbsize: UInt, lpobject: MutPtr, lppbuffer: MutPtr): Int
}

public typealias Lpallocatemore = LpallocatemoreFn?

public fun interface LpcreateconversationindexFn {
    public operator fun invoke(cbparent: UInt, lpbparent: MutPtr, lpcbconvindex: MutPtr, lppbconvindex: MutPtr): Int
}

public typealias Lpcreateconversationindex = LpcreateconversationindexFn?

public fun interface LpdispatchnotificationsFn {
    public operator fun invoke(ulflags: UInt): Hresult
}

public typealias Lpdispatchnotifications = LpdispatchnotificationsFn?

public fun interface LpfnabsdiFn {
    public operator fun invoke(uluiparam: ULong, lpvmsg: MutPtr): Bool
}

public typealias Lpfnabsdi = LpfnabsdiFn?

public fun interface LpfnbuttonFn {
    public operator fun invoke(uluiparam: ULong, lpvcontext: MutPtr, cbentryid: UInt, lpselection: MutPtr, ulflags: UInt): Int
}

public typealias Lpfnbutton = LpfnbuttonFn?

public fun interface LpfndismissFn {
    public operator fun invoke(uluiparam: ULong, lpvcontext: MutPtr)
}

public typealias Lpfndismiss = LpfndismissFn?

public fun interface LpfreebufferFn {
    public operator fun invoke(lpbuffer: MutPtr): UInt
}

public typealias Lpfreebuffer = LpfreebufferFn?

public fun interface LpnotifcallbackFn {
    public operator fun invoke(lpvcontext: MutPtr, cnotification: UInt, lpnotifications: MutPtr): Int
}

public typealias Lpnotifcallback = LpnotifcallbackFn?

public fun interface LpopenstreamonfileFn {
    public operator fun invoke(lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, ulflags: UInt, lpszfilename: ConstPtr, lpszprefix: ConstPtr, lppstream: MutPtr): Hresult
}

public typealias Lpopenstreamonfile = LpopenstreamonfileFn?

public typealias Lpwabactionitem = Long

public fun interface LpwaballocatebufferFn {
    public operator fun invoke(lpwabobject: MutPtr, cbsize: UInt, lppbuffer: MutPtr): Int
}

public typealias Lpwaballocatebuffer = LpwaballocatebufferFn?

public fun interface LpwaballocatemoreFn {
    public operator fun invoke(lpwabobject: MutPtr, cbsize: UInt, lpobject: MutPtr, lppbuffer: MutPtr): Int
}

public typealias Lpwaballocatemore = LpwaballocatemoreFn?

public fun interface LpwabfreebufferFn {
    public operator fun invoke(lpwabobject: MutPtr, lpbuffer: MutPtr): UInt
}

public typealias Lpwabfreebuffer = LpwabfreebufferFn?

public fun interface LpwabopenFn {
    public operator fun invoke(lppadrbook: MutPtr, lppwabobject: MutPtr, lpwp: MutPtr, reserved2: UInt): Hresult
}

public typealias Lpwabopen = LpwabopenFn?

public fun interface LpwabopenexFn {
    public operator fun invoke(lppadrbook: MutPtr, lppwabobject: MutPtr, lpwp: MutPtr, reserved: UInt, fnallocatebuffer: Lpallocatebuffer, fnallocatemore: Lpallocatemore, fnfreebuffer: Lpfreebuffer): Hresult
}

public typealias Lpwabopenex = LpwabopenexFn?

public fun interface PfnidleFn {
    public operator fun invoke(param0: MutPtr): Bool
}

public typealias Pfnidle = PfnidleFn?
