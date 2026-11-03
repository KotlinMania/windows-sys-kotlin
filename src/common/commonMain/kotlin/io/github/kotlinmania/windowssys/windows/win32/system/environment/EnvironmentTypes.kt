package io.github.kotlinmania.windowssys.windows.win32.system.environment

public typealias ENCLAVE_SEALING_IDENTITY_POLICY = Int

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_COMMIT_PAGESFn {
    public operator fun invoke(enclaveaddress: Long, numberofbytes: ULong, sourceaddress: Long, pageprotection: UInt): Int
}

public typealias VBS_BASIC_ENCLAVE_BASIC_CALL_COMMIT_PAGES = VBS_BASIC_ENCLAVE_BASIC_CALL_COMMIT_PAGESFn?

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_CREATE_THREADFn {
    public operator fun invoke(threaddescriptor: Long): Int
}

public typealias VBS_BASIC_ENCLAVE_BASIC_CALL_CREATE_THREAD = VBS_BASIC_ENCLAVE_BASIC_CALL_CREATE_THREADFn?

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_DECOMMIT_PAGESFn {
    public operator fun invoke(enclaveaddress: Long, numberofbytes: ULong): Int
}

public typealias VBS_BASIC_ENCLAVE_BASIC_CALL_DECOMMIT_PAGES = VBS_BASIC_ENCLAVE_BASIC_CALL_DECOMMIT_PAGESFn?

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_GENERATE_KEYFn {
    public operator fun invoke(keyrequest: Long, requestedkeysize: UInt, returnedkey: Long): Int
}

public typealias VBS_BASIC_ENCLAVE_BASIC_CALL_GENERATE_KEY = VBS_BASIC_ENCLAVE_BASIC_CALL_GENERATE_KEYFn?

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_GENERATE_RANDOM_DATAFn {
    public operator fun invoke(buffer: Long, numberofbytes: UInt, generation: Long): Int
}

public typealias VBS_BASIC_ENCLAVE_BASIC_CALL_GENERATE_RANDOM_DATA = VBS_BASIC_ENCLAVE_BASIC_CALL_GENERATE_RANDOM_DATAFn?

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_GENERATE_REPORTFn {
    public operator fun invoke(enclavedata: Long, report: Long, buffersize: UInt, outputsize: Long): Int
}

public typealias VBS_BASIC_ENCLAVE_BASIC_CALL_GENERATE_REPORT = VBS_BASIC_ENCLAVE_BASIC_CALL_GENERATE_REPORTFn?

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_GET_ENCLAVE_INFORMATIONFn {
    public operator fun invoke(enclaveinfo: Long): Int
}

public typealias VBS_BASIC_ENCLAVE_BASIC_CALL_GET_ENCLAVE_INFORMATION = VBS_BASIC_ENCLAVE_BASIC_CALL_GET_ENCLAVE_INFORMATIONFn?

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_INTERRUPT_THREADFn {
    public operator fun invoke(threaddescriptor: Long): Int
}

public typealias VBS_BASIC_ENCLAVE_BASIC_CALL_INTERRUPT_THREAD = VBS_BASIC_ENCLAVE_BASIC_CALL_INTERRUPT_THREADFn?

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_PROTECT_PAGESFn {
    public operator fun invoke(enclaveaddress: Long, numberofytes: ULong, pageprotection: UInt): Int
}

public typealias VBS_BASIC_ENCLAVE_BASIC_CALL_PROTECT_PAGES = VBS_BASIC_ENCLAVE_BASIC_CALL_PROTECT_PAGESFn?

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_RETURN_FROM_ENCLAVEFn {
    public operator fun invoke(returnvalue: ULong)
}

public typealias VBS_BASIC_ENCLAVE_BASIC_CALL_RETURN_FROM_ENCLAVE = VBS_BASIC_ENCLAVE_BASIC_CALL_RETURN_FROM_ENCLAVEFn?

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_RETURN_FROM_EXCEPTIONFn {
    public operator fun invoke(exceptionrecord: Long): Int
}

public typealias VBS_BASIC_ENCLAVE_BASIC_CALL_RETURN_FROM_EXCEPTION = VBS_BASIC_ENCLAVE_BASIC_CALL_RETURN_FROM_EXCEPTIONFn?

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_TERMINATE_THREADFn {
    public operator fun invoke(threaddescriptor: Long): Int
}

public typealias VBS_BASIC_ENCLAVE_BASIC_CALL_TERMINATE_THREAD = VBS_BASIC_ENCLAVE_BASIC_CALL_TERMINATE_THREADFn?

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_VERIFY_REPORTFn {
    public operator fun invoke(report: Long, reportsize: UInt): Int
}

public typealias VBS_BASIC_ENCLAVE_BASIC_CALL_VERIFY_REPORT = VBS_BASIC_ENCLAVE_BASIC_CALL_VERIFY_REPORTFn?
