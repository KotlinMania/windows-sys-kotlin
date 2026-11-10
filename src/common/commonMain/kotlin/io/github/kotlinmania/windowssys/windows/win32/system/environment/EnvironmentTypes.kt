package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.windowssys.COpaquePointer

public typealias EnclaveSealingIdentityPolicy = Int

public fun interface VbsBasicEnclaveBasicCallCommitPagesFn {
    public operator fun invoke(enclaveaddress: COpaquePointer?, numberofbytes: ULong, sourceaddress: COpaquePointer?, pageprotection: UInt): Int
}

public typealias VbsBasicEnclaveBasicCallCommitPages = VbsBasicEnclaveBasicCallCommitPagesFn?

public fun interface VbsBasicEnclaveBasicCallCreateThreadFn {
    public operator fun invoke(threaddescriptor: COpaquePointer?): Int
}

public typealias VbsBasicEnclaveBasicCallCreateThread = VbsBasicEnclaveBasicCallCreateThreadFn?

public fun interface VbsBasicEnclaveBasicCallDecommitPagesFn {
    public operator fun invoke(enclaveaddress: COpaquePointer?, numberofbytes: ULong): Int
}

public typealias VbsBasicEnclaveBasicCallDecommitPages = VbsBasicEnclaveBasicCallDecommitPagesFn?

public fun interface VbsBasicEnclaveBasicCallGenerateKeyFn {
    public operator fun invoke(keyrequest: COpaquePointer?, requestedkeysize: UInt, returnedkey: COpaquePointer?): Int
}

public typealias VbsBasicEnclaveBasicCallGenerateKey = VbsBasicEnclaveBasicCallGenerateKeyFn?

public fun interface VbsBasicEnclaveBasicCallGenerateRandomDataFn {
    public operator fun invoke(buffer: COpaquePointer?, numberofbytes: UInt, generation: COpaquePointer?): Int
}

public typealias VbsBasicEnclaveBasicCallGenerateRandomData = VbsBasicEnclaveBasicCallGenerateRandomDataFn?

public fun interface VbsBasicEnclaveBasicCallGenerateReportFn {
    public operator fun invoke(enclavedata: COpaquePointer?, report: COpaquePointer?, buffersize: UInt, outputsize: COpaquePointer?): Int
}

public typealias VbsBasicEnclaveBasicCallGenerateReport = VbsBasicEnclaveBasicCallGenerateReportFn?

public fun interface VbsBasicEnclaveBasicCallGetEnclaveInformationFn {
    public operator fun invoke(enclaveinfo: COpaquePointer?): Int
}

public typealias VbsBasicEnclaveBasicCallGetEnclaveInformation = VbsBasicEnclaveBasicCallGetEnclaveInformationFn?

public fun interface VbsBasicEnclaveBasicCallInterruptThreadFn {
    public operator fun invoke(threaddescriptor: COpaquePointer?): Int
}

public typealias VbsBasicEnclaveBasicCallInterruptThread = VbsBasicEnclaveBasicCallInterruptThreadFn?

public fun interface VbsBasicEnclaveBasicCallProtectPagesFn {
    public operator fun invoke(enclaveaddress: COpaquePointer?, numberofytes: ULong, pageprotection: UInt): Int
}

public typealias VbsBasicEnclaveBasicCallProtectPages = VbsBasicEnclaveBasicCallProtectPagesFn?

public fun interface VbsBasicEnclaveBasicCallReturnFromEnclaveFn {
    public operator fun invoke(returnvalue: ULong)
}

public typealias VbsBasicEnclaveBasicCallReturnFromEnclave = VbsBasicEnclaveBasicCallReturnFromEnclaveFn?

public fun interface VbsBasicEnclaveBasicCallReturnFromExceptionFn {
    public operator fun invoke(exceptionrecord: COpaquePointer?): Int
}

public typealias VbsBasicEnclaveBasicCallReturnFromException = VbsBasicEnclaveBasicCallReturnFromExceptionFn?

public fun interface VbsBasicEnclaveBasicCallTerminateThreadFn {
    public operator fun invoke(threaddescriptor: COpaquePointer?): Int
}

public typealias VbsBasicEnclaveBasicCallTerminateThread = VbsBasicEnclaveBasicCallTerminateThreadFn?

public fun interface VbsBasicEnclaveBasicCallVerifyReportFn {
    public operator fun invoke(report: COpaquePointer?, reportsize: UInt): Int
}

public typealias VbsBasicEnclaveBasicCallVerifyReport = VbsBasicEnclaveBasicCallVerifyReportFn?
