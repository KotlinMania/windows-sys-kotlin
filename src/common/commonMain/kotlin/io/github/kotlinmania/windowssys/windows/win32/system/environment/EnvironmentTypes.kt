package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias EnclaveSealingIdentityPolicy = Int

public fun interface VbsBasicEnclaveBasicCallCommitPagesFn {
    public operator fun invoke(enclaveaddress: ConstPtr<CVoid>, numberofbytes: ULong, sourceaddress: ConstPtr<CVoid>, pageprotection: UInt): Int
}

public typealias VbsBasicEnclaveBasicCallCommitPages = VbsBasicEnclaveBasicCallCommitPagesFn?

public fun interface VbsBasicEnclaveBasicCallCreateThreadFn {
    public operator fun invoke(threaddescriptor: ConstPtr<VbsBasicEnclaveThreadDescriptor64>): Int
}

public typealias VbsBasicEnclaveBasicCallCreateThread = VbsBasicEnclaveBasicCallCreateThreadFn?

public fun interface VbsBasicEnclaveBasicCallDecommitPagesFn {
    public operator fun invoke(enclaveaddress: ConstPtr<CVoid>, numberofbytes: ULong): Int
}

public typealias VbsBasicEnclaveBasicCallDecommitPages = VbsBasicEnclaveBasicCallDecommitPagesFn?

public fun interface VbsBasicEnclaveBasicCallGenerateKeyFn {
    public operator fun invoke(keyrequest: MutPtr<EnclaveVbsBasicKeyRequest>, requestedkeysize: UInt, returnedkey: MutPtr<UByte>): Int
}

public typealias VbsBasicEnclaveBasicCallGenerateKey = VbsBasicEnclaveBasicCallGenerateKeyFn?

public fun interface VbsBasicEnclaveBasicCallGenerateRandomDataFn {
    public operator fun invoke(buffer: MutPtr<UByte>, numberofbytes: UInt, generation: MutPtr<ULong>): Int
}

public typealias VbsBasicEnclaveBasicCallGenerateRandomData = VbsBasicEnclaveBasicCallGenerateRandomDataFn?

public fun interface VbsBasicEnclaveBasicCallGenerateReportFn {
    public operator fun invoke(enclavedata: ConstPtr<UByte>, report: MutPtr<CVoid>, buffersize: UInt, outputsize: MutPtr<UInt>): Int
}

public typealias VbsBasicEnclaveBasicCallGenerateReport = VbsBasicEnclaveBasicCallGenerateReportFn?

public fun interface VbsBasicEnclaveBasicCallGetEnclaveInformationFn {
    public operator fun invoke(enclaveinfo: MutPtr<EnclaveInformation>): Int
}

public typealias VbsBasicEnclaveBasicCallGetEnclaveInformation = VbsBasicEnclaveBasicCallGetEnclaveInformationFn?

public fun interface VbsBasicEnclaveBasicCallInterruptThreadFn {
    public operator fun invoke(threaddescriptor: ConstPtr<VbsBasicEnclaveThreadDescriptor64>): Int
}

public typealias VbsBasicEnclaveBasicCallInterruptThread = VbsBasicEnclaveBasicCallInterruptThreadFn?

public fun interface VbsBasicEnclaveBasicCallProtectPagesFn {
    public operator fun invoke(enclaveaddress: ConstPtr<CVoid>, numberofytes: ULong, pageprotection: UInt): Int
}

public typealias VbsBasicEnclaveBasicCallProtectPages = VbsBasicEnclaveBasicCallProtectPagesFn?

public fun interface VbsBasicEnclaveBasicCallReturnFromEnclaveFn {
    public operator fun invoke(returnvalue: ULong)
}

public typealias VbsBasicEnclaveBasicCallReturnFromEnclave = VbsBasicEnclaveBasicCallReturnFromEnclaveFn?

public fun interface VbsBasicEnclaveBasicCallReturnFromExceptionFn {
    public operator fun invoke(exceptionrecord: ConstPtr<VbsBasicEnclaveExceptionAmd64>): Int
}

public typealias VbsBasicEnclaveBasicCallReturnFromException = VbsBasicEnclaveBasicCallReturnFromExceptionFn?

public fun interface VbsBasicEnclaveBasicCallTerminateThreadFn {
    public operator fun invoke(threaddescriptor: ConstPtr<VbsBasicEnclaveThreadDescriptor64>): Int
}

public typealias VbsBasicEnclaveBasicCallTerminateThread = VbsBasicEnclaveBasicCallTerminateThreadFn?

public fun interface VbsBasicEnclaveBasicCallVerifyReportFn {
    public operator fun invoke(report: ConstPtr<CVoid>, reportsize: UInt): Int
}

public typealias VbsBasicEnclaveBasicCallVerifyReport = VbsBasicEnclaveBasicCallVerifyReportFn?
