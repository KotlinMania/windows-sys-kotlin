package io.github.kotlinmania.windowssys.windows.win32.system.dataexchange

public typealias CONVINFO_CONVERSATION_STATE = UInt

public typealias CONVINFO_STATUS = UInt

public typealias DDE_CLIENT_TRANSACTION_TYPE = UInt

public typealias DDE_ENABLE_CALLBACK_CMD = UInt

public typealias DDE_INITIALIZE_COMMAND = UInt

public typealias DDE_NAME_SERVICE_CMD = UInt

public typealias HCONV = Long

public typealias HCONVLIST = Long

public typealias HDDEDATA = Long

public typealias HSZ = Long

public fun interface PFNCALLBACKFn {
    public operator fun invoke(wtype: UInt, wfmt: UInt, hconv: HCONV, hsz1: HSZ, hsz2: HSZ, hdata: HDDEDATA, dwdata1: ULong, dwdata2: ULong): HDDEDATA
}

public typealias PFNCALLBACK = PFNCALLBACKFn?
