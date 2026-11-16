package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias EnclaveSealingIdentityPolicy = Int

public fun interface VbsBasicEnclaveBasicCallCommitPagesFn {
    public operator fun invoke(enclaveaddress: ConstPtr, numberofbytes: ULong, sourceaddress: ConstPtr, pageprotection: UInt): Int
}

public typealias VbsBasicEnclaveBasicCallCommitPages = VbsBasicEnclaveBasicCallCommitPagesFn?

public fun interface VbsBasicEnclaveBasicCallCreateThreadFn {
    public operator fun invoke(threaddescriptor: ConstPtr): Int
}

public typealias VbsBasicEnclaveBasicCallCreateThread = VbsBasicEnclaveBasicCallCreateThreadFn?

public fun interface VbsBasicEnclaveBasicCallDecommitPagesFn {
    public operator fun invoke(enclaveaddress: ConstPtr, numberofbytes: ULong): Int
}

public typealias VbsBasicEnclaveBasicCallDecommitPages = VbsBasicEnclaveBasicCallDecommitPagesFn?

public fun interface VbsBasicEnclaveBasicCallGenerateKeyFn {
    public operator fun invoke(keyrequest: MutPtr, requestedkeysize: UInt, returnedkey: MutPtr): Int
}

public typealias VbsBasicEnclaveBasicCallGenerateKey = VbsBasicEnclaveBasicCallGenerateKeyFn?

public fun interface VbsBasicEnclaveBasicCallGenerateRandomDataFn {
    public operator fun invoke(buffer: MutPtr, numberofbytes: UInt, generation: MutPtr): Int
}

public typealias VbsBasicEnclaveBasicCallGenerateRandomData = VbsBasicEnclaveBasicCallGenerateRandomDataFn?

public fun interface VbsBasicEnclaveBasicCallGenerateReportFn {
    public operator fun invoke(enclavedata: ConstPtr, report: MutPtr, buffersize: UInt, outputsize: MutPtr): Int
}

public typealias VbsBasicEnclaveBasicCallGenerateReport = VbsBasicEnclaveBasicCallGenerateReportFn?

public fun interface VbsBasicEnclaveBasicCallGetEnclaveInformationFn {
    public operator fun invoke(enclaveinfo: MutPtr): Int
}

public typealias VbsBasicEnclaveBasicCallGetEnclaveInformation = VbsBasicEnclaveBasicCallGetEnclaveInformationFn?

public fun interface VbsBasicEnclaveBasicCallInterruptThreadFn {
    public operator fun invoke(threaddescriptor: ConstPtr): Int
}

public typealias VbsBasicEnclaveBasicCallInterruptThread = VbsBasicEnclaveBasicCallInterruptThreadFn?

public fun interface VbsBasicEnclaveBasicCallProtectPagesFn {
    public operator fun invoke(enclaveaddress: ConstPtr, numberofytes: ULong, pageprotection: UInt): Int
}

public typealias VbsBasicEnclaveBasicCallProtectPages = VbsBasicEnclaveBasicCallProtectPagesFn?

public fun interface VbsBasicEnclaveBasicCallReturnFromEnclaveFn {
    public operator fun invoke(returnvalue: ULong)
}

public typealias VbsBasicEnclaveBasicCallReturnFromEnclave = VbsBasicEnclaveBasicCallReturnFromEnclaveFn?

public fun interface VbsBasicEnclaveBasicCallReturnFromExceptionFn {
    public operator fun invoke(exceptionrecord: ConstPtr): Int
}

public typealias VbsBasicEnclaveBasicCallReturnFromException = VbsBasicEnclaveBasicCallReturnFromExceptionFn?

public fun interface VbsBasicEnclaveBasicCallTerminateThreadFn {
    public operator fun invoke(threaddescriptor: ConstPtr): Int
}

public typealias VbsBasicEnclaveBasicCallTerminateThread = VbsBasicEnclaveBasicCallTerminateThreadFn?

public fun interface VbsBasicEnclaveBasicCallVerifyReportFn {
    public operator fun invoke(report: ConstPtr, reportsize: UInt): Int
}

public typealias VbsBasicEnclaveBasicCallVerifyReport = VbsBasicEnclaveBasicCallVerifyReportFn?
