package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult

public fun interface CallerreleaseFn {
    public operator fun invoke(ulcallerdata: UInt, lptbldata: MutPtr<CVoid>, lpvue: MutPtr<CVoid>)
}

public typealias Callerrelease = CallerreleaseFn?

public typealias Gender = Int

public fun interface LpallocatebufferFn {
    public operator fun invoke(cbsize: UInt, lppbuffer: MutPtr<MutPtr<CVoid>>): Int
}

public typealias Lpallocatebuffer = LpallocatebufferFn?

public fun interface LpallocatemoreFn {
    public operator fun invoke(cbsize: UInt, lpobject: MutPtr<CVoid>, lppbuffer: MutPtr<MutPtr<CVoid>>): Int
}

public typealias Lpallocatemore = LpallocatemoreFn?

public fun interface LpcreateconversationindexFn {
    public operator fun invoke(cbparent: UInt, lpbparent: MutPtr<UByte>, lpcbconvindex: MutPtr<UInt>, lppbconvindex: MutPtr<MutPtr<UByte>>): Int
}

public typealias Lpcreateconversationindex = LpcreateconversationindexFn?

public fun interface LpdispatchnotificationsFn {
    public operator fun invoke(ulflags: UInt): Hresult
}

public typealias Lpdispatchnotifications = LpdispatchnotificationsFn?

public fun interface LpfnabsdiFn {
    public operator fun invoke(uluiparam: ULong, lpvmsg: MutPtr<CVoid>): Bool
}

public typealias Lpfnabsdi = LpfnabsdiFn?

public fun interface LpfnbuttonFn {
    public operator fun invoke(uluiparam: ULong, lpvcontext: MutPtr<CVoid>, cbentryid: UInt, lpselection: MutPtr<Entryid>, ulflags: UInt): Int
}

public typealias Lpfnbutton = LpfnbuttonFn?

public fun interface LpfndismissFn {
    public operator fun invoke(uluiparam: ULong, lpvcontext: MutPtr<CVoid>)
}

public typealias Lpfndismiss = LpfndismissFn?

public fun interface LpfreebufferFn {
    public operator fun invoke(lpbuffer: MutPtr<CVoid>): UInt
}

public typealias Lpfreebuffer = LpfreebufferFn?

public fun interface LpnotifcallbackFn {
    public operator fun invoke(lpvcontext: MutPtr<CVoid>, cnotification: UInt, lpnotifications: MutPtr<Notification>): Int
}

public typealias Lpnotifcallback = LpnotifcallbackFn?

public fun interface LpopenstreamonfileFn {
    public operator fun invoke(lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, ulflags: UInt, lpszfilename: ConstPtr<Byte>, lpszprefix: ConstPtr<Byte>, lppstream: MutPtr<MutPtr<CVoid>>): Hresult
}

public typealias Lpopenstreamonfile = LpopenstreamonfileFn?

public typealias Lpwabactionitem = Long

public fun interface LpwaballocatebufferFn {
    public operator fun invoke(lpwabobject: MutPtr<CVoid>, cbsize: UInt, lppbuffer: MutPtr<MutPtr<CVoid>>): Int
}

public typealias Lpwaballocatebuffer = LpwaballocatebufferFn?

public fun interface LpwaballocatemoreFn {
    public operator fun invoke(lpwabobject: MutPtr<CVoid>, cbsize: UInt, lpobject: MutPtr<CVoid>, lppbuffer: MutPtr<MutPtr<CVoid>>): Int
}

public typealias Lpwaballocatemore = LpwaballocatemoreFn?

public fun interface LpwabfreebufferFn {
    public operator fun invoke(lpwabobject: MutPtr<CVoid>, lpbuffer: MutPtr<CVoid>): UInt
}

public typealias Lpwabfreebuffer = LpwabfreebufferFn?

public fun interface LpwabopenFn {
    public operator fun invoke(lppadrbook: MutPtr<MutPtr<CVoid>>, lppwabobject: MutPtr<MutPtr<CVoid>>, lpwp: MutPtr<WabParam>, reserved2: UInt): Hresult
}

public typealias Lpwabopen = LpwabopenFn?

public fun interface LpwabopenexFn {
    public operator fun invoke(lppadrbook: MutPtr<MutPtr<CVoid>>, lppwabobject: MutPtr<MutPtr<CVoid>>, lpwp: MutPtr<WabParam>, reserved: UInt, fnallocatebuffer: Lpallocatebuffer, fnallocatemore: Lpallocatemore, fnfreebuffer: Lpfreebuffer): Hresult
}

public typealias Lpwabopenex = LpwabopenexFn?

public fun interface PfnidleFn {
    public operator fun invoke(param0: MutPtr<CVoid>): Bool
}

public typealias Pfnidle = PfnidleFn?
