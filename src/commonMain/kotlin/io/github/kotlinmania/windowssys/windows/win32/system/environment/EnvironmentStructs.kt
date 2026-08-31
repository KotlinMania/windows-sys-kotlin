// port-lint: source windows-sys/src/Windows/Win32/System/Environment/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.system.environment

public data class ENCLAVE_IDENTITY(
    public var ownerId: ByteArray = ByteArray(32),
    public var uniqueId: ByteArray = ByteArray(32),
    public var authorId: ByteArray = ByteArray(32),
    public var familyId: ByteArray = ByteArray(16),
    public var imageId: ByteArray = ByteArray(16),
    public var enclaveSvn: UInt = 0u,
    public var secureKernelSvn: UInt = 0u,
    public var platformSvn: UInt = 0u,
    public var flags: UInt = 0u,
    public var signingLevel: UInt = 0u,
    public var enclaveType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ENCLAVE_IDENTITY) return false
        if (!ownerId.contentEquals(other.ownerId)) return false
        if (!uniqueId.contentEquals(other.uniqueId)) return false
        if (!authorId.contentEquals(other.authorId)) return false
        if (!familyId.contentEquals(other.familyId)) return false
        if (!imageId.contentEquals(other.imageId)) return false
        if (enclaveSvn != other.enclaveSvn) return false
        if (secureKernelSvn != other.secureKernelSvn) return false
        if (platformSvn != other.platformSvn) return false
        if (flags != other.flags) return false
        if (signingLevel != other.signingLevel) return false
        if (enclaveType != other.enclaveType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = ownerId.contentHashCode()
        result = 31 * result + uniqueId.contentHashCode()
        result = 31 * result + authorId.contentHashCode()
        result = 31 * result + familyId.contentHashCode()
        result = 31 * result + imageId.contentHashCode()
        result = 31 * result + enclaveSvn.hashCode()
        result = 31 * result + secureKernelSvn.hashCode()
        result = 31 * result + platformSvn.hashCode()
        result = 31 * result + flags.hashCode()
        result = 31 * result + signingLevel.hashCode()
        result = 31 * result + enclaveType.hashCode()
        return result
    }
}

public data class ENCLAVE_INFORMATION(
    public var enclaveType: UInt = 0u,
    public var reserved: UInt = 0u,
    public var baseAddress: Long = 0L,
    public var size: ULong = 0uL,
    public var identity: ENCLAVE_IDENTITY = ENCLAVE_IDENTITY(),
)

public data class ENCLAVE_VBS_BASIC_KEY_REQUEST(
    public var requestSize: UInt = 0u,
    public var flags: UInt = 0u,
    public var enclaveSvn: UInt = 0u,
    public var systemKeyId: UInt = 0u,
    public var currentSystemKeyId: UInt = 0u,
)

public data class VBS_BASIC_ENCLAVE_EXCEPTION_AMD64(
    public var exceptionCode: UInt = 0u,
    public var numberParameters: UInt = 0u,
    public var exceptionInformation: ULongArray = ULongArray(3),
    public var exceptionRax: ULong = 0uL,
    public var exceptionRcx: ULong = 0uL,
    public var exceptionRip: ULong = 0uL,
    public var exceptionRflags: ULong = 0uL,
    public var exceptionRsp: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VBS_BASIC_ENCLAVE_EXCEPTION_AMD64) return false
        if (exceptionCode != other.exceptionCode) return false
        if (numberParameters != other.numberParameters) return false
        if (!exceptionInformation.contentEquals(other.exceptionInformation)) return false
        if (exceptionRax != other.exceptionRax) return false
        if (exceptionRcx != other.exceptionRcx) return false
        if (exceptionRip != other.exceptionRip) return false
        if (exceptionRflags != other.exceptionRflags) return false
        if (exceptionRsp != other.exceptionRsp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = exceptionCode.hashCode()
        result = 31 * result + numberParameters.hashCode()
        result = 31 * result + exceptionInformation.contentHashCode()
        result = 31 * result + exceptionRax.hashCode()
        result = 31 * result + exceptionRcx.hashCode()
        result = 31 * result + exceptionRip.hashCode()
        result = 31 * result + exceptionRflags.hashCode()
        result = 31 * result + exceptionRsp.hashCode()
        return result
    }
}

public data class VBS_BASIC_ENCLAVE_SYSCALL_PAGE(
    public var returnFromEnclave: VBS_BASIC_ENCLAVE_BASIC_CALL_RETURN_FROM_ENCLAVE? = null,
    public var returnFromException: VBS_BASIC_ENCLAVE_BASIC_CALL_RETURN_FROM_EXCEPTION? = null,
    public var terminateThread: VBS_BASIC_ENCLAVE_BASIC_CALL_TERMINATE_THREAD? = null,
    public var interruptThread: VBS_BASIC_ENCLAVE_BASIC_CALL_INTERRUPT_THREAD? = null,
    public var commitPages: VBS_BASIC_ENCLAVE_BASIC_CALL_COMMIT_PAGES? = null,
    public var decommitPages: VBS_BASIC_ENCLAVE_BASIC_CALL_DECOMMIT_PAGES? = null,
    public var protectPages: VBS_BASIC_ENCLAVE_BASIC_CALL_PROTECT_PAGES? = null,
    public var createThread: VBS_BASIC_ENCLAVE_BASIC_CALL_CREATE_THREAD? = null,
    public var getEnclaveInformation: VBS_BASIC_ENCLAVE_BASIC_CALL_GET_ENCLAVE_INFORMATION? = null,
    public var generateKey: VBS_BASIC_ENCLAVE_BASIC_CALL_GENERATE_KEY? = null,
    public var generateReport: VBS_BASIC_ENCLAVE_BASIC_CALL_GENERATE_REPORT? = null,
    public var verifyReport: VBS_BASIC_ENCLAVE_BASIC_CALL_VERIFY_REPORT? = null,
    public var generateRandomData: VBS_BASIC_ENCLAVE_BASIC_CALL_GENERATE_RANDOM_DATA? = null,
)

public data class VBS_BASIC_ENCLAVE_THREAD_DESCRIPTOR32(
    public var threadContext: UIntArray = UIntArray(4),
    public var entryPoint: UInt = 0u,
    public var stackPointer: UInt = 0u,
    public var exceptionEntryPoint: UInt = 0u,
    public var exceptionStack: UInt = 0u,
    public var exceptionActive: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VBS_BASIC_ENCLAVE_THREAD_DESCRIPTOR32) return false
        if (!threadContext.contentEquals(other.threadContext)) return false
        if (entryPoint != other.entryPoint) return false
        if (stackPointer != other.stackPointer) return false
        if (exceptionEntryPoint != other.exceptionEntryPoint) return false
        if (exceptionStack != other.exceptionStack) return false
        if (exceptionActive != other.exceptionActive) return false
        return true
    }

    override fun hashCode(): Int {
        var result = threadContext.contentHashCode()
        result = 31 * result + entryPoint.hashCode()
        result = 31 * result + stackPointer.hashCode()
        result = 31 * result + exceptionEntryPoint.hashCode()
        result = 31 * result + exceptionStack.hashCode()
        result = 31 * result + exceptionActive.hashCode()
        return result
    }
}

public data class VBS_BASIC_ENCLAVE_THREAD_DESCRIPTOR64(
    public var threadContext: ULongArray = ULongArray(4),
    public var entryPoint: ULong = 0uL,
    public var stackPointer: ULong = 0uL,
    public var exceptionEntryPoint: ULong = 0uL,
    public var exceptionStack: ULong = 0uL,
    public var exceptionActive: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VBS_BASIC_ENCLAVE_THREAD_DESCRIPTOR64) return false
        if (!threadContext.contentEquals(other.threadContext)) return false
        if (entryPoint != other.entryPoint) return false
        if (stackPointer != other.stackPointer) return false
        if (exceptionEntryPoint != other.exceptionEntryPoint) return false
        if (exceptionStack != other.exceptionStack) return false
        if (exceptionActive != other.exceptionActive) return false
        return true
    }

    override fun hashCode(): Int {
        var result = threadContext.contentHashCode()
        result = 31 * result + entryPoint.hashCode()
        result = 31 * result + stackPointer.hashCode()
        result = 31 * result + exceptionEntryPoint.hashCode()
        result = 31 * result + exceptionStack.hashCode()
        result = 31 * result + exceptionActive.hashCode()
        return result
    }
}

public data class VBS_ENCLAVE_REPORT(
    public var reportSize: UInt = 0u,
    public var reportVersion: UInt = 0u,
    public var enclaveData: ByteArray = ByteArray(64),
    public var enclaveIdentity: ENCLAVE_IDENTITY = ENCLAVE_IDENTITY(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VBS_ENCLAVE_REPORT) return false
        if (reportSize != other.reportSize) return false
        if (reportVersion != other.reportVersion) return false
        if (!enclaveData.contentEquals(other.enclaveData)) return false
        if (enclaveIdentity != other.enclaveIdentity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = reportSize.hashCode()
        result = 31 * result + reportVersion.hashCode()
        result = 31 * result + enclaveData.contentHashCode()
        result = 31 * result + enclaveIdentity.hashCode()
        return result
    }
}

public data class VBS_ENCLAVE_REPORT_VARDATA_HEADER(
    public var dataType: UInt = 0u,
    public var size: UInt = 0u,
)

public data class VBS_ENCLAVE_REPORT_MODULE(
    public var header: VBS_ENCLAVE_REPORT_VARDATA_HEADER = VBS_ENCLAVE_REPORT_VARDATA_HEADER(),
    public var uniqueId: ByteArray = ByteArray(32),
    public var authorId: ByteArray = ByteArray(32),
    public var familyId: ByteArray = ByteArray(16),
    public var imageId: ByteArray = ByteArray(16),
    public var svn: UInt = 0u,
    public var moduleName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VBS_ENCLAVE_REPORT_MODULE) return false
        if (header != other.header) return false
        if (!uniqueId.contentEquals(other.uniqueId)) return false
        if (!authorId.contentEquals(other.authorId)) return false
        if (!familyId.contentEquals(other.familyId)) return false
        if (!imageId.contentEquals(other.imageId)) return false
        if (svn != other.svn) return false
        if (!moduleName.contentEquals(other.moduleName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = header.hashCode()
        result = 31 * result + uniqueId.contentHashCode()
        result = 31 * result + authorId.contentHashCode()
        result = 31 * result + familyId.contentHashCode()
        result = 31 * result + imageId.contentHashCode()
        result = 31 * result + svn.hashCode()
        result = 31 * result + moduleName.contentHashCode()
        return result
    }
}

public data class VBS_ENCLAVE_REPORT_PKG_HEADER(
    public var packageSize: UInt = 0u,
    public var version: UInt = 0u,
    public var signatureScheme: UInt = 0u,
    public var signedStatementSize: UInt = 0u,
    public var signatureSize: UInt = 0u,
    public var reserved: UInt = 0u,
)
