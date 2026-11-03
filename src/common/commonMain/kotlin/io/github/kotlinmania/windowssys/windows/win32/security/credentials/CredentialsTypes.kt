package io.github.kotlinmania.windowssys.windows.win32.security.credentials

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public typealias CREDSPP_SUBMIT_TYPE = Int

public typealias CREDUIWIN_FLAGS = UInt

public typealias CREDUI_FLAGS = UInt

public typealias CRED_ENUMERATE_FLAGS = UInt

public typealias CRED_FLAGS = UInt

public typealias CRED_MARSHAL_TYPE = Int

public typealias CRED_PACK_FLAGS = UInt

public typealias CRED_PERSIST = UInt

public typealias CRED_PROTECTION_TYPE = Int

public typealias CRED_TYPE = UInt

public typealias KeyCredentialManagerOperationErrorStates = Int

public typealias KeyCredentialManagerOperationType = Int

public fun interface LPOCNCHKPROCFn {
    public operator fun invoke(param0: ULong, param1: ULong, param2: Long): BOOL
}

public typealias LPOCNCHKPROC = LPOCNCHKPROCFn?

public fun interface LPOCNCONNPROCAFn {
    public operator fun invoke(param0: ULong, param1: PCSTR, param2: PCSTR, param3: Long): ULong
}

public typealias LPOCNCONNPROCA = LPOCNCONNPROCAFn?

public fun interface LPOCNCONNPROCWFn {
    public operator fun invoke(param0: ULong, param1: PCWSTR, param2: PCWSTR, param3: Long): ULong
}

public typealias LPOCNCONNPROCW = LPOCNCONNPROCWFn?

public fun interface LPOCNDSCPROCFn {
    public operator fun invoke(param0: ULong, param1: ULong, param2: Long)
}

public typealias LPOCNDSCPROC = LPOCNDSCPROCFn?

public typealias READER_SEL_REQUEST_MATCH_TYPE = Int

public typealias SCARD_SCOPE = UInt

public typealias SCARD_STATE = UInt
