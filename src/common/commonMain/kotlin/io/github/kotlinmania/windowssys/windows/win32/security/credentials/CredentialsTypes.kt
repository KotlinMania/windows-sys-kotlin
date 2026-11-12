package io.github.kotlinmania.windowssys.windows.win32.security.credentials

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias CredsppSubmitType = Int

public typealias CreduiwinFlags = UInt

public typealias CreduiFlags = UInt

public typealias CredEnumerateFlags = UInt

public typealias CredFlags = UInt

public typealias CredMarshalType = Int

public typealias CredPackFlags = UInt

public typealias CredPersist = UInt

public typealias CredProtectionType = Int

public typealias CredType = UInt

public typealias KeyCredentialManagerOperationErrorStates = Int

public typealias KeyCredentialManagerOperationType = Int

public fun interface LpocnchkprocFn {
    public operator fun invoke(param0: ULong, param1: ULong, param2: ConstPtr<CVoid>): Bool
}

public typealias Lpocnchkproc = LpocnchkprocFn?

public fun interface LpocnconnprocaFn {
    public operator fun invoke(param0: ULong, param1: Pcstr, param2: Pcstr, param3: ConstPtr<CVoid>): ULong
}

public typealias Lpocnconnproca = LpocnconnprocaFn?

public fun interface LpocnconnprocwFn {
    public operator fun invoke(param0: ULong, param1: Pcwstr, param2: Pcwstr, param3: ConstPtr<CVoid>): ULong
}

public typealias Lpocnconnprocw = LpocnconnprocwFn?

public fun interface LpocndscprocFn {
    public operator fun invoke(param0: ULong, param1: ULong, param2: ConstPtr<CVoid>)
}

public typealias Lpocndscproc = LpocndscprocFn?

public typealias ReaderSelRequestMatchType = Int

public typealias ScardScope = UInt

public typealias ScardState = UInt
