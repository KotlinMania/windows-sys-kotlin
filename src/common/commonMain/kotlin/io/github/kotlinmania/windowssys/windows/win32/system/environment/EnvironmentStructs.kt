@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.environment

public data class ENCLAVE_IDENTITY(
    public var OwnerId: UByteArray = UByteArray(32),
    public var UniqueId: UByteArray = UByteArray(32),
    public var AuthorId: UByteArray = UByteArray(32),
    public var FamilyId: UByteArray = UByteArray(16),
    public var ImageId: UByteArray = UByteArray(16),
    public var EnclaveSvn: UInt = 0u,
    public var SecureKernelSvn: UInt = 0u,
    public var PlatformSvn: UInt = 0u,
    public var Flags: UInt = 0u,
    public var SigningLevel: UInt = 0u,
    public var EnclaveType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ENCLAVE_IDENTITY) return false
        if (!this.OwnerId.contentEquals(other.OwnerId)) return false
        if (!this.UniqueId.contentEquals(other.UniqueId)) return false
        if (!this.AuthorId.contentEquals(other.AuthorId)) return false
        if (!this.FamilyId.contentEquals(other.FamilyId)) return false
        if (!this.ImageId.contentEquals(other.ImageId)) return false
        if (this.EnclaveSvn != other.EnclaveSvn) return false
        if (this.SecureKernelSvn != other.SecureKernelSvn) return false
        if (this.PlatformSvn != other.PlatformSvn) return false
        if (this.Flags != other.Flags) return false
        if (this.SigningLevel != other.SigningLevel) return false
        if (this.EnclaveType != other.EnclaveType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.OwnerId.contentHashCode()
        result = 31 * result + this.UniqueId.contentHashCode()
        result = 31 * result + this.AuthorId.contentHashCode()
        result = 31 * result + this.FamilyId.contentHashCode()
        result = 31 * result + this.ImageId.contentHashCode()
        result = 31 * result + this.EnclaveSvn.hashCode()
        result = 31 * result + this.SecureKernelSvn.hashCode()
        result = 31 * result + this.PlatformSvn.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.SigningLevel.hashCode()
        result = 31 * result + this.EnclaveType.hashCode()
        return result
    }
}

public data class ENCLAVE_INFORMATION(
    public var EnclaveType: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var BaseAddress: Long = 0L,
    public var Size: ULong = 0uL,
    public var Identity: ENCLAVE_IDENTITY = ENCLAVE_IDENTITY(),
)

public data class ENCLAVE_VBS_BASIC_KEY_REQUEST(
    public var RequestSize: UInt = 0u,
    public var Flags: UInt = 0u,
    public var EnclaveSVN: UInt = 0u,
    public var SystemKeyID: UInt = 0u,
    public var CurrentSystemKeyID: UInt = 0u,
)

public data class VBS_BASIC_ENCLAVE_EXCEPTION_AMD64(
    public var ExceptionCode: UInt = 0u,
    public var NumberParameters: UInt = 0u,
    public var ExceptionInformation: ULongArray = ULongArray(3),
    public var ExceptionRAX: ULong = 0uL,
    public var ExceptionRCX: ULong = 0uL,
    public var ExceptionRIP: ULong = 0uL,
    public var ExceptionRFLAGS: ULong = 0uL,
    public var ExceptionRSP: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VBS_BASIC_ENCLAVE_EXCEPTION_AMD64) return false
        if (this.ExceptionCode != other.ExceptionCode) return false
        if (this.NumberParameters != other.NumberParameters) return false
        if (!this.ExceptionInformation.contentEquals(other.ExceptionInformation)) return false
        if (this.ExceptionRAX != other.ExceptionRAX) return false
        if (this.ExceptionRCX != other.ExceptionRCX) return false
        if (this.ExceptionRIP != other.ExceptionRIP) return false
        if (this.ExceptionRFLAGS != other.ExceptionRFLAGS) return false
        if (this.ExceptionRSP != other.ExceptionRSP) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ExceptionCode.hashCode()
        result = 31 * result + this.NumberParameters.hashCode()
        result = 31 * result + this.ExceptionInformation.contentHashCode()
        result = 31 * result + this.ExceptionRAX.hashCode()
        result = 31 * result + this.ExceptionRCX.hashCode()
        result = 31 * result + this.ExceptionRIP.hashCode()
        result = 31 * result + this.ExceptionRFLAGS.hashCode()
        result = 31 * result + this.ExceptionRSP.hashCode()
        return result
    }
}

public data class VBS_BASIC_ENCLAVE_SYSCALL_PAGE(
    public var ReturnFromEnclave: VBS_BASIC_ENCLAVE_BASIC_CALL_RETURN_FROM_ENCLAVE = null,
    public var ReturnFromException: VBS_BASIC_ENCLAVE_BASIC_CALL_RETURN_FROM_EXCEPTION = null,
    public var TerminateThread: VBS_BASIC_ENCLAVE_BASIC_CALL_TERMINATE_THREAD = null,
    public var InterruptThread: VBS_BASIC_ENCLAVE_BASIC_CALL_INTERRUPT_THREAD = null,
    public var CommitPages: VBS_BASIC_ENCLAVE_BASIC_CALL_COMMIT_PAGES = null,
    public var DecommitPages: VBS_BASIC_ENCLAVE_BASIC_CALL_DECOMMIT_PAGES = null,
    public var ProtectPages: VBS_BASIC_ENCLAVE_BASIC_CALL_PROTECT_PAGES = null,
    public var CreateThread: VBS_BASIC_ENCLAVE_BASIC_CALL_CREATE_THREAD = null,
    public var GetEnclaveInformation: VBS_BASIC_ENCLAVE_BASIC_CALL_GET_ENCLAVE_INFORMATION = null,
    public var GenerateKey: VBS_BASIC_ENCLAVE_BASIC_CALL_GENERATE_KEY = null,
    public var GenerateReport: VBS_BASIC_ENCLAVE_BASIC_CALL_GENERATE_REPORT = null,
    public var VerifyReport: VBS_BASIC_ENCLAVE_BASIC_CALL_VERIFY_REPORT = null,
    public var GenerateRandomData: VBS_BASIC_ENCLAVE_BASIC_CALL_GENERATE_RANDOM_DATA = null,
)

public data class VBS_BASIC_ENCLAVE_THREAD_DESCRIPTOR32(
    public var ThreadContext: UIntArray = UIntArray(4),
    public var EntryPoint: UInt = 0u,
    public var StackPointer: UInt = 0u,
    public var ExceptionEntryPoint: UInt = 0u,
    public var ExceptionStack: UInt = 0u,
    public var ExceptionActive: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VBS_BASIC_ENCLAVE_THREAD_DESCRIPTOR32) return false
        if (!this.ThreadContext.contentEquals(other.ThreadContext)) return false
        if (this.EntryPoint != other.EntryPoint) return false
        if (this.StackPointer != other.StackPointer) return false
        if (this.ExceptionEntryPoint != other.ExceptionEntryPoint) return false
        if (this.ExceptionStack != other.ExceptionStack) return false
        if (this.ExceptionActive != other.ExceptionActive) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ThreadContext.contentHashCode()
        result = 31 * result + this.EntryPoint.hashCode()
        result = 31 * result + this.StackPointer.hashCode()
        result = 31 * result + this.ExceptionEntryPoint.hashCode()
        result = 31 * result + this.ExceptionStack.hashCode()
        result = 31 * result + this.ExceptionActive.hashCode()
        return result
    }
}

public data class VBS_BASIC_ENCLAVE_THREAD_DESCRIPTOR64(
    public var ThreadContext: ULongArray = ULongArray(4),
    public var EntryPoint: ULong = 0uL,
    public var StackPointer: ULong = 0uL,
    public var ExceptionEntryPoint: ULong = 0uL,
    public var ExceptionStack: ULong = 0uL,
    public var ExceptionActive: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VBS_BASIC_ENCLAVE_THREAD_DESCRIPTOR64) return false
        if (!this.ThreadContext.contentEquals(other.ThreadContext)) return false
        if (this.EntryPoint != other.EntryPoint) return false
        if (this.StackPointer != other.StackPointer) return false
        if (this.ExceptionEntryPoint != other.ExceptionEntryPoint) return false
        if (this.ExceptionStack != other.ExceptionStack) return false
        if (this.ExceptionActive != other.ExceptionActive) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ThreadContext.contentHashCode()
        result = 31 * result + this.EntryPoint.hashCode()
        result = 31 * result + this.StackPointer.hashCode()
        result = 31 * result + this.ExceptionEntryPoint.hashCode()
        result = 31 * result + this.ExceptionStack.hashCode()
        result = 31 * result + this.ExceptionActive.hashCode()
        return result
    }
}

public data class VBS_ENCLAVE_REPORT(
    public var ReportSize: UInt = 0u,
    public var ReportVersion: UInt = 0u,
    public var EnclaveData: UByteArray = UByteArray(64),
    public var EnclaveIdentity: ENCLAVE_IDENTITY = ENCLAVE_IDENTITY(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VBS_ENCLAVE_REPORT) return false
        if (this.ReportSize != other.ReportSize) return false
        if (this.ReportVersion != other.ReportVersion) return false
        if (!this.EnclaveData.contentEquals(other.EnclaveData)) return false
        if (this.EnclaveIdentity != other.EnclaveIdentity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ReportSize.hashCode()
        result = 31 * result + this.ReportVersion.hashCode()
        result = 31 * result + this.EnclaveData.contentHashCode()
        result = 31 * result + this.EnclaveIdentity.hashCode()
        return result
    }
}

public data class VBS_ENCLAVE_REPORT_MODULE(
    public var Header: VBS_ENCLAVE_REPORT_VARDATA_HEADER = VBS_ENCLAVE_REPORT_VARDATA_HEADER(),
    public var UniqueId: UByteArray = UByteArray(32),
    public var AuthorId: UByteArray = UByteArray(32),
    public var FamilyId: UByteArray = UByteArray(16),
    public var ImageId: UByteArray = UByteArray(16),
    public var Svn: UInt = 0u,
    public var ModuleName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VBS_ENCLAVE_REPORT_MODULE) return false
        if (this.Header != other.Header) return false
        if (!this.UniqueId.contentEquals(other.UniqueId)) return false
        if (!this.AuthorId.contentEquals(other.AuthorId)) return false
        if (!this.FamilyId.contentEquals(other.FamilyId)) return false
        if (!this.ImageId.contentEquals(other.ImageId)) return false
        if (this.Svn != other.Svn) return false
        if (!this.ModuleName.contentEquals(other.ModuleName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.UniqueId.contentHashCode()
        result = 31 * result + this.AuthorId.contentHashCode()
        result = 31 * result + this.FamilyId.contentHashCode()
        result = 31 * result + this.ImageId.contentHashCode()
        result = 31 * result + this.Svn.hashCode()
        result = 31 * result + this.ModuleName.contentHashCode()
        return result
    }
}

public data class VBS_ENCLAVE_REPORT_PKG_HEADER(
    public var PackageSize: UInt = 0u,
    public var Version: UInt = 0u,
    public var SignatureScheme: UInt = 0u,
    public var SignedStatementSize: UInt = 0u,
    public var SignatureSize: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class VBS_ENCLAVE_REPORT_VARDATA_HEADER(public var DataType: UInt = 0u, public var Size: UInt = 0u)
