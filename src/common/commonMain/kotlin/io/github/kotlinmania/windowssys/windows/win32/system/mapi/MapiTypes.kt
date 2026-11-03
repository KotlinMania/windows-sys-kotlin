package io.github.kotlinmania.windowssys.windows.win32.system.mapi

import io.github.kotlinmania.windowssys.core.PCSTR

public fun interface LPMAPIADDRESSFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, lpszcaption: PCSTR, neditfields: UInt, lpszlabels: PCSTR, nrecips: UInt, lprecips: Long, flflags: UInt, ulreserved: UInt, lpnnewrecips: Long, lppnewrecips: Long): UInt
}

public typealias LPMAPIADDRESS = LPMAPIADDRESSFn?

public fun interface LPMAPIDELETEMAILFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, lpszmessageid: PCSTR, flflags: UInt, ulreserved: UInt): UInt
}

public typealias LPMAPIDELETEMAIL = LPMAPIDELETEMAILFn?

public fun interface LPMAPIDETAILSFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, lprecip: Long, flflags: UInt, ulreserved: UInt): UInt
}

public typealias LPMAPIDETAILS = LPMAPIDETAILSFn?

public fun interface LPMAPIFINDNEXTFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, lpszmessagetype: PCSTR, lpszseedmessageid: PCSTR, flflags: UInt, ulreserved: UInt, lpszmessageid: PCSTR): UInt
}

public typealias LPMAPIFINDNEXT = LPMAPIFINDNEXTFn?

public fun interface LPMAPIFREEBUFFERFn {
    public operator fun invoke(pv: Long): UInt
}

public typealias LPMAPIFREEBUFFER = LPMAPIFREEBUFFERFn?

public fun interface LPMAPILOGOFFFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, flflags: UInt, ulreserved: UInt): UInt
}

public typealias LPMAPILOGOFF = LPMAPILOGOFFFn?

public fun interface LPMAPILOGONFn {
    public operator fun invoke(uluiparam: ULong, lpszprofilename: PCSTR, lpszpassword: PCSTR, flflags: UInt, ulreserved: UInt, lplhsession: Long): UInt
}

public typealias LPMAPILOGON = LPMAPILOGONFn?

public fun interface LPMAPIREADMAILFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, lpszmessageid: PCSTR, flflags: UInt, ulreserved: UInt, lppmessage: Long): UInt
}

public typealias LPMAPIREADMAIL = LPMAPIREADMAILFn?

public fun interface LPMAPIRESOLVENAMEFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, lpszname: PCSTR, flflags: UInt, ulreserved: UInt, lpprecip: Long): UInt
}

public typealias LPMAPIRESOLVENAME = LPMAPIRESOLVENAMEFn?

public fun interface LPMAPISAVEMAILFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, lpmessage: Long, flflags: UInt, ulreserved: UInt, lpszmessageid: PCSTR): UInt
}

public typealias LPMAPISAVEMAIL = LPMAPISAVEMAILFn?

public fun interface LPMAPISENDDOCUMENTSFn {
    public operator fun invoke(uluiparam: ULong, lpszdelimchar: PCSTR, lpszfilepaths: PCSTR, lpszfilenames: PCSTR, ulreserved: UInt): UInt
}

public typealias LPMAPISENDDOCUMENTS = LPMAPISENDDOCUMENTSFn?

public fun interface LPMAPISENDMAILFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, lpmessage: Long, flflags: UInt, ulreserved: UInt): UInt
}

public typealias LPMAPISENDMAIL = LPMAPISENDMAILFn?

public fun interface LPMAPISENDMAILWFn {
    public operator fun invoke(lhsession: ULong, uluiparam: ULong, lpmessage: Long, flflags: UInt, ulreserved: UInt): UInt
}

public typealias LPMAPISENDMAILW = LPMAPISENDMAILWFn?
