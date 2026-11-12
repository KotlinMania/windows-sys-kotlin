package io.github.kotlinmania.windowssys.windows.win32.system.mapi

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr

public fun interface LpmapiaddressFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, lpszcaption: Pcstr, neditfields: UInt, lpszlabels: Pcstr, nrecips: UInt, lprecips: MutPtr, flflags: UInt, ulreserved: UInt, lpnnewrecips: MutPtr, lppnewrecips: MutPtr): UInt
}

public typealias Lpmapiaddress = LpmapiaddressFn?

public fun interface LpmapideletemailFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, lpszmessageid: Pcstr, flflags: UInt, ulreserved: UInt): UInt
}

public typealias Lpmapideletemail = LpmapideletemailFn?

public fun interface LpmapidetailsFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, lprecip: MutPtr, flflags: UInt, ulreserved: UInt): UInt
}

public typealias Lpmapidetails = LpmapidetailsFn?

public fun interface LpmapifindnextFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, lpszmessagetype: Pcstr, lpszseedmessageid: Pcstr, flflags: UInt, ulreserved: UInt, lpszmessageid: Pcstr): UInt
}

public typealias Lpmapifindnext = LpmapifindnextFn?

public fun interface LpmapifreebufferFn {
    public operator fun invoke(pv: MutPtr): UInt
}

public typealias Lpmapifreebuffer = LpmapifreebufferFn?

public fun interface LpmapilogoffFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, flflags: UInt, ulreserved: UInt): UInt
}

public typealias Lpmapilogoff = LpmapilogoffFn?

public fun interface LpmapilogonFn {
    public operator fun invoke(uluiparam: ULong, lpszprofilename: Pcstr, lpszpassword: Pcstr, flflags: UInt, ulreserved: UInt, lplhsession: MutPtr): UInt
}

public typealias Lpmapilogon = LpmapilogonFn?

public fun interface LpmapireadmailFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, lpszmessageid: Pcstr, flflags: UInt, ulreserved: UInt, lppmessage: MutPtr): UInt
}

public typealias Lpmapireadmail = LpmapireadmailFn?

public fun interface LpmapiresolvenameFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, lpszname: Pcstr, flflags: UInt, ulreserved: UInt, lpprecip: MutPtr): UInt
}

public typealias Lpmapiresolvename = LpmapiresolvenameFn?

public fun interface LpmapisavemailFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, lpmessage: MutPtr, flflags: UInt, ulreserved: UInt, lpszmessageid: Pcstr): UInt
}

public typealias Lpmapisavemail = LpmapisavemailFn?

public fun interface LpmapisenddocumentsFn {
    public operator fun invoke(uluiparam: ULong, lpszdelimchar: Pcstr, lpszfilepaths: Pcstr, lpszfilenames: Pcstr, ulreserved: UInt): UInt
}

public typealias Lpmapisenddocuments = LpmapisenddocumentsFn?

public fun interface LpmapisendmailFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, lpmessage: MutPtr, flflags: UInt, ulreserved: UInt): UInt
}

public typealias Lpmapisendmail = LpmapisendmailFn?

public fun interface LpmapisendmailwFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, lpmessage: ConstPtr, flflags: UInt, ulreserved: UInt): UInt
}

public typealias Lpmapisendmailw = LpmapisendmailwFn?
