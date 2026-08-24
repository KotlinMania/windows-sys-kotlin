// port-lint: source Windows/Win32/System/Environment/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.environment

public typealias ENCLAVE_SEALING_IDENTITY_POLICY = Int

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_COMMIT_PAGES {
    public fun invoke(enclaveAddress: Long, numberOfBytes: ULong, sourceAddress: Long, pageProtection: UInt): Int
}

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_CREATE_THREAD {
    public fun invoke(threadDescriptor: Long): Int
}

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_DECOMMIT_PAGES {
    public fun invoke(enclaveAddress: Long, numberOfBytes: ULong): Int
}

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_GENERATE_KEY {
    public fun invoke(keyRequest: Long, requestedKeySize: UInt, returnedKey: Long): Int
}

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_GENERATE_RANDOM_DATA {
    public fun invoke(buffer: Long, numberOfBytes: UInt, generation: Long): Int
}

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_GENERATE_REPORT {
    public fun invoke(enclaveData: Long, report: Long, bufferSize: UInt, outputSize: Long): Int
}

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_GET_ENCLAVE_INFORMATION {
    public fun invoke(enclaveInfo: Long): Int
}

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_INTERRUPT_THREAD {
    public fun invoke(threadDescriptor: Long): Int
}

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_PROTECT_PAGES {
    public fun invoke(enclaveAddress: Long, numberOfBytes: ULong, pageProtection: UInt): Int
}

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_RETURN_FROM_ENCLAVE {
    public fun invoke(returnValue: ULong)
}

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_RETURN_FROM_EXCEPTION {
    public fun invoke(exceptionRecord: Long): Int
}

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_TERMINATE_THREAD {
    public fun invoke(threadDescriptor: Long): Int
}

public fun interface VBS_BASIC_ENCLAVE_BASIC_CALL_VERIFY_REPORT {
    public fun invoke(report: Long, reportSize: UInt): Int
}
